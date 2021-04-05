package sort.quick;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Description:
 * Created By xxm
 */
public class QuickSortTest extends TestCase {

    @Test
    public void testSortMethod() {
        Integer[] a = new Integer[]{8, 6, 7, 1, 2, 3, 9, 0, 8, 4, 5};
        QuickSort quickSort = new QuickSort();
        quickSort.sortMethod(a);
        assert quickSort.isSorted(a);
        quickSort.show(a);
    }
}