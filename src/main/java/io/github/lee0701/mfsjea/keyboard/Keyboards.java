package io.github.lee0701.mfsjea.keyboard;

import java.util.HashMap;
import java.util.Map;

public class Keyboards {
    public static final AlphabetKeyboard ALPHABET_QWERTY = new AlphabetKeyboard("Qwerty", " `~1!2@3#4$5%6^7&8*9(0)-_=+\\|qQwWeErRtTyYuUiIoOpP[{]}aAsSdDfFgGhHjJkKlL;:'\"zZxXcCvVbBnNmM,<.>/?");
    public static final AlphabetKeyboard ALPHABET_DVORAK = new AlphabetKeyboard("Dvorak", " `~1!2@3#4$5%6^7&8*9(0)[{]}\\|'\",<.>pPyYfFgGcCrRlL/?=+aAoOeEuUiIdDhHtTnNsS\\-_;:qQjJkKxXbBmMwWvVzZ");
    public static final AlphabetKeyboard ALPHABET_COLEMAK = new AlphabetKeyboard("Colemak", " `~1!2@3#4$5%6^7&8*9(0)-_=+\\|qQwWfFpPgGjJlLuUyY;:[{]}aArRsStTdDhHnNeEiIoO'\"zZxXcCvVbBkKmM,<.>/?");

    public static final Map<String, Character> COMBINATION_DUBEOLSIK = new HashMap<>() {{
        put("ᅩᅡ", 'ᅪ'); put("ᅩᅢ", 'ᅫ'); put("ᅩᅵ", 'ᅬ'); put("ᅮᅥ", 'ᅯ'); put("ᅮᅦ", 'ᅰ'); put("ᅮᅵ", 'ᅱ'); put("ᅳᅵ", 'ᅴ');
        put("ᆨᆺ", 'ᆪ'); put("ᆫᇂ", 'ᆭ'); put("ᆫᆽ", 'ᆬ'); put("ᆯᆨ", 'ᆰ'); put("ᆯᆷ", 'ᆱ'); put("ᆯᆸ", 'ᆲ'); put("ᆯᆺ", 'ᆳ'); put("ᆯᇀ", 'ᆴ'); put("ᆯᇁ", 'ᆵ'); put("ᆯᇂ", 'ᆶ');
    }};
    public static final Map<String, Character> COMBINATION_SEBEOLSIK = new HashMap<>() {{
        put("ᄀᄀ", 'ᄁ'); put("ᄃᄃ", 'ᄄ'); put("ᄇᄇ", 'ᄈ'); put("ᄉᄉ", 'ᄊ'); put("ᄌᄌ", 'ᄍ');
        put("ᅩᅡ", 'ᅪ'); put("ᅩᅢ", 'ᅫ'); put("ᅩᅵ", 'ᅬ'); put("ᅮᅥ", 'ᅯ'); put("ᅮᅦ", 'ᅰ'); put("ᅮᅵ", 'ᅱ'); put("ᅳᅵ", 'ᅴ');
        put("ᆨᆨ", 'ᆩ'); put("ᆨᆺ", 'ᆪ'); put("ᆫᇂ", 'ᆭ'); put("ᆫᆽ", 'ᆬ'); put("ᆯᆨ", 'ᆰ'); put("ᆯᆷ", 'ᆱ'); put("ᆯᆸ", 'ᆲ'); put("ᆯᆺ", 'ᆳ'); put("ᆯᇀ", 'ᆴ'); put("ᆯᇁ", 'ᆵ'); put("ᆯᇂ", 'ᆶ'); put("ᆺᆺ", 'ᆻ');
    }};

    public static final HangulKeyboard HANGUL_DUBEOLSIK_STANDARD = new HangulKeyboard(
            2, "두벌식 표준",
            " `~1!2@3#4$5%6^7&8*9(0)-_=+\\|ㅂㅃㅈㅉㄷㄸㄱㄲㅅㅆㅛㅛㅕㅕㅑㅑㅐㅒㅔㅖ[{]}ㅁㅁㄴㄴㅇㅇㄹㄹㅎㅎㅗㅗㅓㅓㅏㅏㅣㅣ;:'\"ㅋㅋㅌㅌㅊㅊㅍㅍㅠㅠㅜㅜㅡㅡ,<.>/?",
            COMBINATION_DUBEOLSIK
    );
    public static final HangulKeyboard HANGUL_SEBEOLSIK_390 = new HangulKeyboard(
            3, "세벌식 390",
            " `~ᇂᆽᆻ@ᆸ#ᅭ$ᅲ%ᅣ^ᅨ&ᅴ*ᅮ(ᄏ)-_=+\\|ᆺᇁᆯᇀᅧᆿᅢᅤᅥ;ᄅ<ᄃ7ᄆ8ᄎ9ᄑ>[{]}ᆼᆮᆫᆭᅵᆰᅡᆩᅳ/ᄂ'ᄋ4ᄀ5ᄌ6ᄇ:ᄐ\"ᆷᆾᆨᆹᅦᆱᅩᆶᅮ!ᄉ0ᄒ1,2.3ᅩ?",
            COMBINATION_SEBEOLSIK
    );
    public static final HangulKeyboard HANGUL_SEBEOLSIK_FINAL = new HangulKeyboard(
            3, "세벌식 최종",
            " *※ᇂᆩᆻᆰᆸᆽᅭᆵᅲᆴᅣ=ᅨ“ᅴ”ᅮ'ᄏ~);>+:\\ᆺᇁᆯᇀᅧᆬᅢᆶᅥᆳᄅ5ᄃ6ᄆ7ᄎ8ᄑ9(%</ᆼᆮᆫᆭᅵᆲᅡᆱᅳᅤᄂ0ᄋ1ᄀ2ᄌ3ᄇ4ᄐ·ᆷᆾᆨᆹᅦᆿᅩᆪᅮ?ᄉ-ᄒ\",,..ᅩ!",
            COMBINATION_SEBEOLSIK
    );
}
