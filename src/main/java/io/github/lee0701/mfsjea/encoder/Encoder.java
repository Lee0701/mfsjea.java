package io.github.lee0701.mfsjea.encoder;

import io.github.lee0701.kiturami.converter.Converter;

import java.util.List;

public abstract class Encoder implements Converter<List<Integer>, String> {
    private final String name;

    public Encoder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
