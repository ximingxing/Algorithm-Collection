package sort.quick;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description:
 * Created By xxm
 */
public class Quick3WayTest {

    @Test
    public void sortMethod() {
        Integer[] a = new Integer[]{8, 6, 7, 1, 2, 3, 9, 0, 8, 4, 5};
        Quick3Way quick3Way = new Quick3Way();
        quick3Way.sortMethod(a);
        assert quick3Way.isSorted(a);
        quick3Way.show(a);
    }
}