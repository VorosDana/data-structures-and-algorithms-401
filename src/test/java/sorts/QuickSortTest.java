package sorts;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSort() {
        int[] testing = {3, 6, 1, 2, 4, 7, 2};

        int[] actual = QuickSort.quickSort(testing.clone());
        Arrays.sort(testing);

        assertArrayEquals(testing, actual);
    }
}