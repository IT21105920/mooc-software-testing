package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void testSameLengthNoCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(2, 4, 3)); // 342
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(5, 6, 4)); // 465
        ArrayList<Integer> result = sum.addTwoNumbers(first, second); // 342 + 465 = 807
        Assertions.assertEquals(Arrays.asList(8, 0, 7), result);
    }

    @Test
    public void testDifferentLengthWithCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9)); // 99
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));   // 1
        ArrayList<Integer> result = sum.addTwoNumbers(first, second); // 99 + 1 = 100
        Assertions.assertEquals(Arrays.asList(1, 0, 0), result);
    }

    @Test
    public void testAllCarry() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9, 9)); // 999
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));     // 1
        ArrayList<Integer> result = sum.addTwoNumbers(first, second); // 999 + 1 = 1000
        Assertions.assertEquals(Arrays.asList(1, 0, 0, 0), result);
    }

    @Test
    public void testEmptyFirstList() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 2, 3)); // 123
        ArrayList<Integer> result = sum.addTwoNumbers(first, second); // 0 + 123 = 123
        Assertions.assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testEmptySecondList() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(4, 5, 6)); // 456
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> result = sum.addTwoNumbers(first, second); // 456 + 0 = 456
        Assertions.assertEquals(Arrays.asList(4, 5, 6), result);
    }

    @Test
    public void testBothListsEmpty() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> result = sum.addTwoNumbers(first, second); // 0 + 0 = 0
        Assertions.assertEquals(new ArrayList<>(), result);
    }
}
