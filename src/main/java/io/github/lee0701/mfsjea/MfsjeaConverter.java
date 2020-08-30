package io.github.lee0701.mfsjea;

import io.github.lee0701.kiturami.converter.Converter;
import io.github.lee0701.mfsjea.decoder.Decoder;
import io.github.lee0701.mfsjea.encoder.Encoder;

public class MfsjeaConverter implements Converter<String, ConversionResult> {
    private final Decoder decoder;
    private final Encoder encoder;

    public MfsjeaConverter(Decoder decoder, Encoder encoder) {
        this.decoder = decoder;
        this.encoder = encoder;
    }

    @Override
    public ConversionResult convert(String input) {
        return new ConversionResult(
                decoder.getName(),
                encoder.getName(),
                input,
                encoder.convert(decoder.convert(input))
        );
    }
}
