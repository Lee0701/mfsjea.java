package io.github.lee0701.mfsjea;

public class GradedResult extends ConversionResult {
    private final double score;

    public GradedResult(String source, String destination, String input, String output, double score) {
        super(source, destination, input, output);
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}
