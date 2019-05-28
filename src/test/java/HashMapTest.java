import hashes.HashMap;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashMapTest {
    HashMap<Integer> testo;
// the before was not working properly
//    @Before
//    public void setup() {
//        testo = new hashes.HashMap<>();
//        testo.add("Test One", 15);
//        testo.add("Test Two", 678);
//        testo.add("Test Three", 48);
//    }

    @Test
    public void testGetting() {
        testo = new HashMap<>();
        testo.add("Test One", 15);
        testo.add("Test Two", 678);
        testo.add("Test Three", 48);

        assertEquals(15, (int) testo.get("Test One"));
        assertEquals(678, (int) testo.get("Test Two"));
        assertEquals(48, (int) testo.get("Test Three"));
    }

    @Test
    public void testKeyCollision() {
        testo = new HashMap<>();
        testo.add("Test One", 15);
        testo.add("Test Two", 678);
        testo.add("Test Three", 48);

        assertFalse(testo.add("Test One", 15));
        assertFalse(testo.add("Test One", 37));
        assertTrue(testo.add("Test one", 37));
    }

    @Test
    public void testContains() {
        testo = new HashMap<>();
        testo.add("Test One", 15);
        testo.add("Test Two", 678);
        testo.add("Test Three", 48);

        assertTrue(testo.contains("Test One"));
        assertFalse(testo.contains("Test one"));
        assertTrue(testo.contains("Test Three"));
    }
}