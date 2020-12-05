package sort;

/**
 * Example of sort algorithm.
 */
public abstract class Sort {

    /**
     * sort algorithm need to be implement.
     *
     * @param a array of list need to sort.
     */
    public abstract void sortMethod(Comparable[] a);

    /**
     * if v less than w then return true.
     */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * exchange two item in array.
     */
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * print method.
     */
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    /**
     * if a is sorted, then return true.
     */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }
}
