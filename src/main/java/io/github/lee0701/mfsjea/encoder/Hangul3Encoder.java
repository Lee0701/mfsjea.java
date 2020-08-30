package io.github.lee0701.mfsjea.encoder;

import io.github.lee0701.kiturami.converter.Converter;
import io.github.lee0701.kiturami.converter.Sequential;
import io.github.lee0701.kiturami.converter.string.Combine;
import io.github.lee0701.kiturami.converter.string.Normalize;

import java.util.List;
import java.util.Map;

public class Hangul3Encoder extends HangulEncoder {
    private final Converter<String, String> postprocessor;

    public Hangul3Encoder(String name, Map<Integer, Character> layout, Map<String, Character> combinations) {
        super(name, layout, combinations);
        this.postprocessor = new Combine(combinations)
                .then(new Normalize("NFC"));
    }

    public Hangul3Encoder(String name, String layout, Map<String, Character> combinations) {
        this(name, generateLayout(layout), combinations);
    }

    @Override
    public String convert(List<Integer> input) {
        return postprocessor.convert(super.convert(input));
    }
}
