package io.github.lee0701.mfsjea;

import io.github.lee0701.kiturami.converter.Converter;
import io.github.lee0701.kiturami.converter.Each;
import io.github.lee0701.kiturami.converter.Parallel;
import io.github.lee0701.mfsjea.keyboard.Keyboard;
import io.github.lee0701.mfsjea.keyboard.Keyboards;
import io.github.lee0701.mfsjea.scorer.ConversionResultGrader;
import io.github.lee0701.mfsjea.scorer.HangulRangeGrader;
import io.github.lee0701.mfsjea.scorer.MfsjeaGrader;

import java.util.LinkedList;
import java.util.List;

public class Mfsjea {

    public static final Mfsjea DEFAULT_ENKO = new Mfsjea(
            new Keyboard[] {Keyboards.ALPHABET_QWERTY, Keyboards.ALPHABET_DVORAK, Keyboards.ALPHABET_COLEMAK},
            new Keyboard[] {Keyboards.HANGUL_DUBEOLSIK_STANDARD, Keyboards.HANGUL_SEBEOLSIK_390, Keyboards.HANGUL_SEBEOLSIK_FINAL},
            HangulRangeGrader.DEFAULT_2350
    );

    private final Converter<String, ? extends List<? extends ConversionResult>> converter;

    public Mfsjea(Keyboard[] inputKeyboards, Keyboard[] outputKeyboards, MfsjeaGrader grader) {
        List<MfsjeaConverter> converters = new LinkedList<>();
        for(Keyboard inputKeyboard : inputKeyboards) {
            for(Keyboard outputKeyboard : outputKeyboards) {
                converters.add(new MfsjeaConverter(inputKeyboard.toDecoder(), outputKeyboard.toEncoder()));
            }
        }
        MfsjeaConverter[] array = new MfsjeaConverter[converters.size()];
        this.converter = new Parallel<>(converters.toArray(array)).then(new Each<>(new ConversionResultGrader(grader)));
    }

    public ConversionResult bestGrade(String input) {
        List<? extends ConversionResult> conversionResults = converter.convert(input);
        GradedConversionResult result = null;
        for(ConversionResult conversionResult : conversionResults) {
            if(conversionResult instanceof GradedConversionResult) {
                GradedConversionResult graded = (GradedConversionResult) conversionResult;
                if(result == null || graded.getScore() > result.getScore()) result = graded;
            }
        }
        return result;
    }

    public List<String> outputs(String input) {
        List<? extends ConversionResult> conversionResults = converter.convert(input);
        List<String> result = new LinkedList<>();
        for(ConversionResult conversionResult : conversionResults) {
            result.add(conversionResult.getOutput());
        }
        return result;
    }

}
