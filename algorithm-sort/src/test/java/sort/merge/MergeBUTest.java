package sort.merge;

import junit.framework.TestCase;

/**
 * Description:
 * Created By xxm
 */
public class MergeBUTest extends TestCase {

    public void testSort() {
//        Integer[] a = new Integer[]{8, 6, 7, 1, 2, 3, 3, 9, 0, 8, 4, 5};
//        MergeBU.sort(a);
//        assert MergeBU.isSorted(a);
//        MergeBU.show(a);

        Integer[] b = new Integer[]{4, 7, 5, 3, 6, 1, 0, 2, 9, 8};
        MergeBU.sort(b);
        assert MergeBU.isSorted(b);
        MergeBU.show(b);
    }
}