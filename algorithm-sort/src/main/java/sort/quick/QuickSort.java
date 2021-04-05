package sort.quick;

import sort.Sort;

public class QuickSort extends Sort {

    public void sortMethod(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        // base case
        if (hi <= lo) return;
        // split
        int j = partition(a, lo, hi);
        // sort a[lo .. j-1]
        sort(a, lo, j - 1);
        // sort a[j+1 .. hi]
        sort(a, j + 1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

}
