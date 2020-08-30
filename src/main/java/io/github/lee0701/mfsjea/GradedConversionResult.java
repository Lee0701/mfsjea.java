package io.github.lee0701.mfsjea;

public class GradedConversionResult extends ConversionResult {
    private final double score;

    public GradedConversionResult(String source, String destination, String input, String output, double score) {
        super(source, destination, input, output);
        this.score = score;
    }

    public GradedConversionResult(ConversionResult conversionResult, double score) {
        this(
                conversionResult.getSource(),
                conversionResult.getDestination(),
                conversionResult.getInput(),
                conversionResult.getOutput(),
                score
        );
    }

    public double getScore() {
        return score;
    }
}
