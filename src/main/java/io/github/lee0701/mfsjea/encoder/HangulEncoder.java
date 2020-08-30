package io.github.lee0701.mfsjea.encoder;

import java.util.Map;

public abstract class HangulEncoder extends AlphabetEncoder {
    private final Map<String, Character> combinations;

    public HangulEncoder(String name, Map<Integer, Character> layout, Map<String, Character> combinations) {
        super(name, layout);
        this.combinations = combinations;
    }

    public Map<String, Character> getCombinations() {
        return combinations;
    }
}
