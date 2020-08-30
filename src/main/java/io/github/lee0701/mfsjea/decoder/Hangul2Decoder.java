package io.github.lee0701.mfsjea.decoder;

import io.github.lee0701.kiturami.converter.Converter;
import io.github.lee0701.kiturami.converter.hangul.JamosToCompatibility;
import io.github.lee0701.kiturami.converter.string.Expand;
import io.github.lee0701.kiturami.converter.string.Normalize;

import java.util.List;
import java.util.Map;

public class Hangul2Decoder extends HangulDecoder {
    private final Converter<String, String> preprocessor;

    public Hangul2Decoder(String name, Map<Character, Integer> layout, Map<Character, String> decombinations) {
        super(name, layout, decombinations);
        this.preprocessor = new Normalize("NFD")
                .then(new Expand(decombinations))
                .then(new JamosToCompatibility());
    }

    public Hangul2Decoder(String name, String layout, Map<Character, String> decombinations) {
        this(name, generateLayout(layout), decombinations);
    }

    @Override
    public List<Integer> convert(String input) {
        return super.convert(preprocessor.convert(input));
    }
}
