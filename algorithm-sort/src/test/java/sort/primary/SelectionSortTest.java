package sort.primary;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void sort() {
        Integer[] a = new Integer[]{8, 6, 7, 1, 2, 3, 9, 0, 8, 4, 5};
        SelectionSort.sort(a);
        assert SelectionSort.isSorted(a);
        SelectionSort.show(a);
    }
}