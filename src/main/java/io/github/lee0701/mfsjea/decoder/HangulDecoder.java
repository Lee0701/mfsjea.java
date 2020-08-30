package io.github.lee0701.mfsjea.decoder;

import java.util.Map;

public abstract class HangulDecoder extends AlphabetDecoder {
    private final Map<Character, String> decombinations;

    public HangulDecoder(String name, Map<Character, Integer> layout, Map<Character, String> decombinations) {
        super(name, layout);
        this.decombinations = decombinations;
    }

    public Map<Character, String> getDecombinations() {
        return decombinations;
    }
}
