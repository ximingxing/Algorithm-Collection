package sort.merge;

import org.junit.Test;
import sort.primary.InsertionSort;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {
        Integer[] a = new Integer[]{8, 6, 7, 1, 2, 3, 3, 9, 0, 8, 4, 5};
        MergeSort.sort(a);
        assert MergeSort.isSorted(a);
        MergeSort.show(a);
    }
}