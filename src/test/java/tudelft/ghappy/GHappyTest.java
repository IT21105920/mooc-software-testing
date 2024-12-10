package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void testGHappy_AllGsAreHappy() {
        GHappy gHappy = new GHappy();
        String input = "xxggxx";
        boolean result = gHappy.gHappy(input);
        Assertions.assertTrue(result);
    }

    @Test
    public void testGHappy_UnhappyG() {
        GHappy gHappy = new GHappy();
        String input = "xxgxx";
        boolean result = gHappy.gHappy(input);
        Assertions.assertFalse(result);
    }

    @Test
    public void testGHappy_MixedGs() {
        GHappy gHappy = new GHappy();
        String input = "xxggyygxx";
        boolean result = gHappy.gHappy(input);
        Assertions.assertFalse(result);
    }

    @Test
    public void testGHappy_AllHappyGs() {
        GHappy gHappy = new GHappy();
        String input = "gggg";
        boolean result = gHappy.gHappy(input);
        Assertions.assertTrue(result);
    }

    @Test
    public void testGHappy_SingleG() {
        GHappy gHappy = new GHappy();
        String input = "g";
        boolean result = gHappy.gHappy(input);
        Assertions.assertFalse(result);
    }

    @Test
    public void testGHappy_EmptyString() {
        GHappy gHappy = new GHappy();
        String input = "";
        boolean result = gHappy.gHappy(input);
        Assertions.assertTrue(result);
    }
}
