package io.github.lee0701.mfsjea.encoder;

import io.github.lee0701.kiturami.converter.Converter;
import io.github.lee0701.kiturami.converter.hangul.Han2;
import io.github.lee0701.kiturami.converter.string.Combine;
import io.github.lee0701.kiturami.converter.string.Normalize;

import java.util.List;
import java.util.Map;

public class Hangul2Encoder extends HangulEncoder {
    private final Converter<String, String> postprocessor;

    public Hangul2Encoder(String name, Map<Integer, Character> layout, Map<String, Character> combinations) {
        super(name, layout, combinations);
        this.postprocessor = new Han2()
                .then(new Combine(combinations))
                .then(new Normalize("NFC"));
    }

    public Hangul2Encoder(String name, String layout, Map<String, Character> combinations) {
        this(name, generateLayout(layout), combinations);
    }

    @Override
    public String convert(List<Integer> input) {
        return postprocessor.convert(super.convert(input));
    }
}
