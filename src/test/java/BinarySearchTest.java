import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 4));
    }

    @Test
    public void binarySearchStart() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1));
    }

    @Test
    public void binarySearchEnd() {
        assertEquals(9, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
    }

    @Test
    public void binarySearchOddLength() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 4));
    }

    @Test
    public void binarySearchOddLengthStart() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1));
    }

    @Test
    public void binarySearchOddLengthEnd() {
        assertEquals(8, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
    }

    @Test
    public void binarySearchNotFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10, 11}, 4));
    }

    @Test
    public void binarySearchNotFoundStart() {
        assertEquals(0 - 1, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, -1));
    }

    @Test
    public void binarySearchNotFoundEnd() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 11));
    }

    @Test
    public void binarySearchOddLengthNotFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 2, 5, 6, 7, 8, 9}, 4));
    }

    @Test
    public void binarySearchOddLengthNotFoundStart() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 0));
    }

    @Test
    public void binarySearchOddLengthEndNotFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
    }

    @Test
    public void binarySearchEmpty() {
        assertEquals(-1, BinarySearch.binarySearch(new int[0], 5));
    }

    @Test
    public void binarySearchNull() {
        assertEquals(-1, BinarySearch.binarySearch(null, 5));
    }
}