package sorts;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        int[] input = {5, 2, 3, 1, 7};

        int[] output = MergeSort.mergeSort(input);
        Arrays.sort(input);

        assertArrayEquals("Expected sorted input to equal output of merge sort",
                input, output);
    }
}