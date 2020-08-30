package io.github.lee0701.mfsjea;

public class ConversionResult {
    private final String source;
    private final String destination;
    private final String input;
    private final String output;

    public ConversionResult(String source, String destination, String input, String output) {
        this.source = source;
        this.destination = destination;
        this.input = input;
        this.output = output;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }
}
