import org.junit.Test;

import static org.junit.Assert.*;

public class InsertShiftArrayTest {

    @Test
    public void TestEvenArrayInsertShiftArray() {
        assertArrayEquals(new int[] {1, 3, 5}, InsertShiftArray.insertShiftArray(new int[] {1, 5}, 3));
    }

    @Test
    public void TestOddArrayInsertShiftArray() {
        assertArrayEquals(new int[] {2, 7, 5, 8}, InsertShiftArray.insertShiftArray(new int[] {2, 7, 8}, 5));
    }

    @Test
    public void TestEmptyArrayInsertShiftArray() {
        assertArrayEquals(new int[] {3}, InsertShiftArray.insertShiftArray(new int[] {}, 3));
    }
}