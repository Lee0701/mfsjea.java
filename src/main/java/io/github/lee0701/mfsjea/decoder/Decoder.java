package io.github.lee0701.mfsjea.decoder;

import io.github.lee0701.kiturami.converter.Converter;

import java.util.List;

public abstract class Decoder implements Converter<String, List<Integer>> {
    private final String name;

    public Decoder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
