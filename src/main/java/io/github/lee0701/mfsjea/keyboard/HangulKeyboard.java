package io.github.lee0701.mfsjea.keyboard;

import io.github.lee0701.mfsjea.decoder.Decoder;
import io.github.lee0701.mfsjea.decoder.Hangul2Decoder;
import io.github.lee0701.mfsjea.decoder.Hangul3Decoder;
import io.github.lee0701.mfsjea.encoder.Encoder;
import io.github.lee0701.mfsjea.encoder.Hangul2Encoder;
import io.github.lee0701.mfsjea.encoder.Hangul3Encoder;

import java.util.HashMap;
import java.util.Map;

public class HangulKeyboard extends Keyboard {
    private final int set;
    private final Map<String, Character> combinations;
    private final Map<Character, String> decombinations;

    public HangulKeyboard(int set, String name, String layout, Map<String, Character> combinations) {
        super(name, layout);
        this.set = set;
        this.combinations = combinations;
        this.decombinations = new HashMap<>();
        for(String key : combinations.keySet()) {
            this.decombinations.put(combinations.get(key), key);
        }
    }

    @Override
    public Decoder toDecoder() {
        return set == 2 ? new Hangul2Decoder(name, layout, decombinations) : new Hangul3Decoder(name, layout, decombinations);
    }

    @Override
    public Encoder toEncoder() {
        return set == 2 ? new Hangul2Encoder(name, layout, combinations) : new Hangul3Encoder(name, layout, combinations);
    }

    public Map<String, Character> getCombinations() {
        return combinations;
    }
}
