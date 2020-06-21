import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class WorkHomeTest {
    WorkHome wh = new WorkHome();
   FibonacciSequence fs = new FibonacciSequence();

    @Test
    public void testIsSumTwoNumbers() {
        int[] ar = {1, 3, 5, 6, 7, 9, 11, 12, 13, 14, 15, 16, 17, 18};
        int numberThoSum = 11;
        boolean test = wh.findNumberLess(ar,numberThoSum);
        assertThat(test, is(true));
    }

    @Test
    public void testCreateFibonacciSequenceRecursion () {
        int index = 7;
        assertThat(fs.createFibonacciSequenceRecursion(index), is (13));
    }

    @Test
    public void testCreateFibonacciSequenceNotRecursion () {
        int index = 7;
        assertThat(fs.createFibonacciSequenceNotRecursion(index), is (13));
    }

    @Test
    public void testSelectionSorter () {
        int[] ar1 = {111, 131, 19, 61, 71, 78, 18};
        int[] ar2 = {111, 131, 19, 61, 71, 78, 11, 112, 13, 16, 15, 16, 89, 18};
        int operation1 = wh.selectionSorter(ar1);
        int operation2 = wh.selectionSorter(ar2);
        System.out.println("ar1.length = " + ar1.length + ", operation = " + operation1);
        System.out.println("ar2.length = " + ar2.length + ", operation = " + operation2);
    }


}
