package sorts;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class InsertionSortTest {

    @Test
    public void insertionSort() {
        int[] testArray = new int[]{2, 6, 1, 5, 1, 5, 234, 62, 63};

        int[] testOutput = InsertionSort.insertionSort(testArray);
        Arrays.sort(testArray);

        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(testOutput));

        assertEquals(1, testOutput[0]);
        assertEquals(234, testOutput[8]);
        assertEquals(Arrays.toString(testArray), Arrays.toString(testOutput));
    }

    @Test
    public void testUndersizedArray() {
        int[] testArrayNull = null;
        int[] testArrayEmpty = new int[]{};
        int[] testArrayOne = new int[]{2};

        assertNull(InsertionSort.insertionSort(testArrayNull));
        assertSame(testArrayEmpty, InsertionSort.insertionSort(testArrayEmpty));
        assertSame(testArrayOne, InsertionSort.insertionSort(testArrayOne));
    }
}