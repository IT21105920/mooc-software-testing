package tudelft.caesarshift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {
    @Test
    void testValidMessagePositiveShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def", cipher.CaesarShiftCipher("abc", 3));
    }

    @Test
    void testValidMessageNegativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.CaesarShiftCipher("abc", -3));
    }

    @Test
    void testShiftWithSpaces() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def ghi", cipher.CaesarShiftCipher("abc def", 3));
    }

    @Test
    void testShiftZero() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("abc", cipher.CaesarShiftCipher("abc", 0));
    }


    @Test
    void testInvalidCharacters() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.CaesarShiftCipher("abc123", 3));
        assertEquals("invalid", cipher.CaesarShiftCipher("hello!", 5));
        assertEquals("invalid", cipher.CaesarShiftCipher("Caesar", 3));
    }

    @Test
    void testEmptyMessage() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("", cipher.CaesarShiftCipher("", 5));
    }

    @Test
    void testOnlySpaces() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("   ", cipher.CaesarShiftCipher("   ", 3));
    }

}
