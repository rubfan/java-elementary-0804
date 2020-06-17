import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.equalTo;

public class MainTest {
    Main main = new Main();

    @Test
    public void testPrintPairSumsIfNegativeNumbersResultTrue() {
        Integer[] sortedArray = {-7, -5, -3, -2, -1};
        int sum = -10;
        assertThat(main.printPairSums(sortedArray, sum), equalTo(true));
    }

    @Test
    public void testPrintPairSumsIfPositiveNumbersResultTrue() {
        Integer[] sortedArray = {1, 2, 3, 5, 7};
        int sum = 10;
        assertThat(main.printPairSums(sortedArray, sum), equalTo(true));
    }

    @Test
    public void testPrintPairSumsForResultFalse() {
        Integer[] sortedArray = {1, 2, 3, 5, 7};
        int sum = 11;
        assertThat(main.printPairSums(sortedArray, sum), equalTo(false));
    }

    @Test
    public void testPrintPairSumsIfSameNumbersResultTrue() {
        Integer[] sortedArray = {1, 1, 3, 3, 7, 7};
        int sum = 4;
        assertThat(main.printPairSums(sortedArray, sum), equalTo(true));
    }

    @Test
    public void testPrintPairSumsIfSameAllNumbersResultTrue() {
        Integer[] sortedArray = {1, 1, 1, 1, 1, 1};
        int sum = 2;
        assertThat(main.printPairSums(sortedArray, sum), equalTo(true));
    }

    @Test
    public void testSelectionSortIfPositiveNumbers() {
        Integer[] array = {10, 3, 2, 5, 7, 9, 8, 1, 4, 6};
        assertThat(main.selectionSort(array), arrayContaining(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    @Test
    public void testSelectionSortIfPositiveNumbersArrayDoubleSize() {
        Integer[] array = {10, 3, 2, 5, 7, 9, 8, 1, 4, 6, 0, 3, 2, 5, 7, 9, 8, 1, 4, 6};
        assertThat(main.selectionSort(array),
                arrayContaining(0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10));
    }

    @Test
    public void testSelectionSortIfNegativeNumbers() {
        Integer[] array = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        assertThat(main.selectionSort(array), arrayContaining(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1));
    }

    @Test
    public void testSelectionSortIfSameNumbers() {
        Integer[] array = {-1, -1, -3, 4, 5, 6, 7, 8, 8, -10};
        assertThat(main.selectionSort(array), arrayContaining(-10, -3, -1, -1, 4, 5, 6, 7, 8, 8));
    }

    @Test
    public void testPrintFibonacciSequenceMemberWithOutRecursion() {
        assertThat(main.printFibonacciSequenceMemberWithOutRecursion(10), equalTo(55));
    }

    @Test
    public void testPrintFibonacciFirstMemberWithOutRecursionMustBe1() {
        assertThat(main.printFibonacciSequenceMemberWithOutRecursion(1), equalTo(1));
    }

    @Test
    public void testPrintFibonacciSecondMemberWithOutRecursionMustBe1() {
        assertThat(main.printFibonacciSequenceMemberWithOutRecursion(2), equalTo(1));
    }

    @Test
    public void testPrintFibonacciSequenceMemberWithRecursion() {
        assertThat(main.printFibonacciSequenceMemberByRecursion(3), equalTo(2));
    }

    @Test
    public void testPrintFibonacciFirstMemberByRecursionMustBe1() {
        assertThat(main.printFibonacciSequenceMemberByRecursion(1), equalTo(1));
    }

    @Test
    public void testPrintFibonacciSecondMemberByRecursionMustBe1() {
        assertThat(main.printFibonacciSequenceMemberByRecursion(2), equalTo(1));
    }
}