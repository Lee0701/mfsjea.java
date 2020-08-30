package io.github.lee0701.mfsjea.keyboard;

import io.github.lee0701.mfsjea.decoder.Decoder;
import io.github.lee0701.mfsjea.encoder.Encoder;

public abstract class Keyboard {
    protected final String name;
    protected final String layout;

    public Keyboard(String name, String layout) {
        this.name = name;
        this.layout = layout;
    }

    public abstract Decoder toDecoder();
    public abstract Encoder toEncoder();
}
