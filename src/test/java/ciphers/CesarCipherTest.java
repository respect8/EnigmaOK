package ciphers;

import ciphers.impl.CesarCipherMarek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CesarCipherTest {
    protected final String textWithNoAlphabeticLetters = "124356890-=}{:";
    protected final String textWithAlphabeticLettters = "abcdd";
    protected final String expectedTextForAlphabeticLetters = "defgg";
    protected final String mixedText = "123ac//";
    protected final String expectedTextForMixedText = "123df//";
    protected Cipher cesarCipher = new CesarCipherMarek();

    @DisplayName("Testing correction of encoding text with no alphabetic letters")
    @Test
    public void testIfOnlyAlphabeticLettersAreEncoded() {
        String decode = cesarCipher.decode(textWithNoAlphabeticLetters);
        Assertions.assertEquals(textWithNoAlphabeticLetters, decode);
    }

    @Test
    public void testIfEncodedCorrectly() {
        String encode = cesarCipher.encode(textWithAlphabeticLettters);
        Assertions.assertEquals(expectedTextForAlphabeticLetters, encode);
    }
    @Test
    public void TestIfDecodedCorectly() {
        String decode = cesarCipher.decode(expectedTextForAlphabeticLetters);
        Assertions.assertEquals(textWithAlphabeticLettters, decode);
    }

    @Test
    public void testIfMixedDecodeIsCorrect() {
        String decode = cesarCipher.decode(expectedTextForMixedText);
        Assertions.assertEquals(mixedText, decode);
    }
    @Test
    public void testIfMixedEncodeIsCorrect() {
        String encode = cesarCipher.encode(mixedText);
        Assertions.assertEquals(expectedTextForMixedText, encode);
    }

}
