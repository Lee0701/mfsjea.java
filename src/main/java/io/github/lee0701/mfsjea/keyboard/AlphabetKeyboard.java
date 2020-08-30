package io.github.lee0701.mfsjea.keyboard;

import io.github.lee0701.mfsjea.decoder.AlphabetDecoder;
import io.github.lee0701.mfsjea.decoder.Decoder;
import io.github.lee0701.mfsjea.encoder.AlphabetEncoder;
import io.github.lee0701.mfsjea.encoder.Encoder;

public class AlphabetKeyboard extends Keyboard {
    public AlphabetKeyboard(String name, String layout) {
        super(name, layout);
    }

    @Override
    public Decoder toDecoder() {
        return new AlphabetDecoder(name, layout);
    }

    @Override
    public Encoder toEncoder() {
        return new AlphabetEncoder(name, layout);
    }
}
