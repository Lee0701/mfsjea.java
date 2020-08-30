package io.github.lee0701.mfsjea.encoder;

import io.github.lee0701.kiturami.converter.Converter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlphabetEncoder extends Encoder {
    private final Map<Integer, Character> layout;

    public AlphabetEncoder(String name, Map<Integer, Character> layout) {
        super(name);
        this.layout = layout;
    }

    public AlphabetEncoder(String name, String layout) {
        this(name, generateLayout(layout));
    }

    @Override
    public String convert(List<Integer> input) {
        StringBuilder result = new StringBuilder();
        for(Integer i : input) {
            if(layout.containsKey(i)) result.append(layout.get(i));
        }
        return result.toString();
    }

    public Map<Integer, Character> getLayout() {
        return layout;
    }

    protected static Map<Integer, Character> generateLayout(String layout) {
        Map<Integer, Character> result = new HashMap<>();
        for(int i = 0 ; i < layout.length() ; i++) {
            result.put(i, layout.charAt(i));
        }
        return result;
    }
}
