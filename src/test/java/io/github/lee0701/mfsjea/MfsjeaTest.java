package io.github.lee0701.mfsjea;

import org.junit.Test;

import static org.junit.Assert.*;

public class MfsjeaTest {
    @Test
    public void testEnko() {
        Mfsjea mfsjea = Mfsjea.DEFAULT_ENKO;
        assertTrue(mfsjea.outputs("dkssudgktpdy").contains("안녕하세요"));
        assertEquals(mfsjea.bestGrade("dkssudgktpdy").getOutput(), "안녕하세요");
        assertEquals(mfsjea.bestGrade("jfsheamfncj4").getOutput(), "안녕하세요");
        assertEquals(mfsjea.bestGrade("kf@jfitxuf").getDestination(), "세벌식 최종");
        assertEquals(mfsjea.bestGrade("0vwupxndjv kcogwksx").getSource(), "Colemak");
        assertEquals(mfsjea.bestGrade("She gives super cider").getOutput(), "와 시팡 야간 치한");
    }
}
