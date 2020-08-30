package io.github.lee0701.mfsjea.decoder;

import io.github.lee0701.kiturami.converter.Converter;
import io.github.lee0701.kiturami.converter.string.Expand;
import io.github.lee0701.kiturami.converter.string.Normalize;

import java.util.List;
import java.util.Map;

public class Hangul3Decoder extends HangulDecoder {
    private final Converter<String, String> preprocessor;

    public Hangul3Decoder(String name, Map<Character, Integer> layout, Map<Character, String> decombinations) {
        super(name, layout, decombinations);
        this.preprocessor = new Normalize("NFD")
                .then(new Expand(decombinations));
    }

    public Hangul3Decoder(String name, String layout, Map<Character, String> decombinations) {
        this(name, generateLayout(layout), decombinations);
    }

    @Override
    public List<Integer> convert(String input) {
        return super.convert(preprocessor.convert(input));
    }
}
