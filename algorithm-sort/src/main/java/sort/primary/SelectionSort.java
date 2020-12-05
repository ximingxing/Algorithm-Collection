package sort.primary;

import sort.Sort;

public class SelectionSort extends Sort {

    @Override
    public void sortMethod(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (less(a[j], a[min])) min = j;
            exch(a, i, min);
        }
    }

    public static void sort(Comparable[] a) {
        SelectionSort sort = new SelectionSort();
        sort.sortMethod(a);
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[]{8, 6, 7, 1, 2, 3, 9, 0, 8, 4, 5};
        SelectionSort.sort(a);
        assert SelectionSort.isSorted(a);
        SelectionSort.show(a);
    }
}
