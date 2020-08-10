package lesson11Test;

import lesson11.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.arrayContaining;

public class SelectionSortTest {

    @Test
    public void checkSortingArrayIfSetPositiveNumbers() {
        Integer[] n = {45, 23, 87, 6, 98, 54, 32, 22, 55, 58};
        Assert.assertThat(SelectionSort.getMinElementWithSelectionSort(n),
                arrayContaining(6, 22, 23, 32, 45, 54, 55, 58, 87, 98));
    }

    @Test
    public void checkSortingArrayIfSetNegativeNumbers() {
        Integer[] n = {-45, -23, -87, -6, -98, -54, -32, -22, -55, -58};
        Assert.assertThat(SelectionSort.getMinElementWithSelectionSort(n),
                arrayContaining(-98, -87, -58, -55, -54, -45, -32, -23, -22, -6));
    }

    @Test
    public void checkSortingArrayIfSetPosAndNegNumbers() {
        Integer[] n = {45, -23, 87, -6, 98, -54, 32, -22, 55, -58};
        Assert.assertThat(SelectionSort.getMinElementWithSelectionSort(n),
                arrayContaining(-58, -54, -23, -22, -6, 32, 45, 55, 87, 98));
    }
}
