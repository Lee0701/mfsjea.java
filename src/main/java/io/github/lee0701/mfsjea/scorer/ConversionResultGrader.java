package io.github.lee0701.mfsjea.scorer;

import io.github.lee0701.kiturami.converter.Converter;
import io.github.lee0701.mfsjea.ConversionResult;
import io.github.lee0701.mfsjea.GradedConversionResult;

public class ConversionResultGrader implements Converter<ConversionResult, GradedConversionResult> {
    private final MfsjeaGrader scorer;

    public ConversionResultGrader(MfsjeaGrader scorer) {
        this.scorer = scorer;
    }

    @Override
    public GradedConversionResult convert(ConversionResult conversionResult) {
        return new GradedConversionResult(conversionResult, scorer.convert(conversionResult));
    }
}
