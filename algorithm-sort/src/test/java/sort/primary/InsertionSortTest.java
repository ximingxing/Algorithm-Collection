package sort.primary;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void sort() {
        Integer[] a = new Integer[]{8, 6, 7, 1, 2, 3, 9, 0, 8, 4, 5};
        InsertionSort.sort(a);
        assert InsertionSort.isSorted(a);
        InsertionSort.show(a);
    }
}