package io.github.lee0701.mfsjea.decoder;

import io.github.lee0701.mfsjea.encoder.Encoder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AlphabetDecoder extends Decoder {
    private final Map<Character, Integer> layout;

    public AlphabetDecoder(String name, Map<Character, Integer> layout) {
        super(name);
        this.layout = layout;
    }

    public AlphabetDecoder(String name, String layout) {
        this(name, generateLayout(layout));
    }

    @Override
    public List<Integer> convert(String input) {
        List<Integer> result = new LinkedList<>();
        char[] chars = input.toCharArray();
        for(char c : chars) {
            result.add(layout.getOrDefault(c, -1));
        }
        return result;
    }

    public Map<Character, Integer> getLayout() {
        return layout;
    }

    protected static Map<Character, Integer> generateLayout(String layout) {
        Map<Character, Integer> result = new HashMap<>();
        for(int i = 0 ; i < layout.length() ; i++) {
            result.put(layout.charAt(i), i);
        }
        return result;
    }
}
