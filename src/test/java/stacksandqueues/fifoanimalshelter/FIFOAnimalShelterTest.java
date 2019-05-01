package stacksandqueues.fifoanimalshelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class FIFOAnimalShelterTest {

    @Test
    public void testCatsOnly() {
        FIFOAnimalShelter testo = new FIFOAnimalShelter();

        testo.enqueue(new Cat("Pickles"));
        testo.enqueue(new Cat("Sir Clawsalot"));
        testo.enqueue(new Cat("Fluffbutt"));

        assertEquals("Pickles", testo.dequeue("cat").getName());
        assertEquals("Sir Clawsalot", testo.dequeue("cAT").getName());
        assertEquals("Fluffbutt", testo.dequeue("cAt").getName());
    }

    @Test
    public void testDogsOnly() {
        FIFOAnimalShelter testo = new FIFOAnimalShelter();

        testo.enqueue(new Dog("Buffin")); // Combination of Banana and Muffin
        testo.enqueue(new Dog("BARKO WHOM BARK MUCH"));
        testo.enqueue(new Dog("Woof")); // We asked, he answered.

        assertEquals("Buffin", testo.dequeue("dog").getName());
        assertEquals("BARKO WHOM BARK MUCH", testo.dequeue("dOg").getName());
        assertEquals("Woof", testo.dequeue("DOG").getName());
    }

    @Test
    public void testBothTypes() {
        FIFOAnimalShelter testo = new FIFOAnimalShelter();

        testo.enqueue(new Cat("Pickles"));
        testo.enqueue(new Dog("Buffin")); // Combination of Banana and Muffin
        testo.enqueue(new Cat("Sir Clawsalot"));
        testo.enqueue(new Dog("BARKO WHOM BARK MUCH"));
        testo.enqueue(new Dog("Woof")); // We asked, he answered.
        testo.enqueue(new Cat("Fluffbutt"));

        assertEquals("Pickles", testo.dequeue("cat").getName());
        assertEquals("Sir Clawsalot", testo.dequeue("cAT").getName());
        assertEquals("Fluffbutt", testo.dequeue("cAt").getName());

        assertEquals("Buffin", testo.dequeue("dog").getName());
        assertEquals("BARKO WHOM BARK MUCH", testo.dequeue("dOg").getName());
        assertEquals("Woof", testo.dequeue("DOG").getName());
    }

    @Test
    public void testGenericGrabs() {
        FIFOAnimalShelter testo = new FIFOAnimalShelter();

        testo.enqueue(new Cat("Pickles"));
        testo.enqueue(new Dog("Buffin")); // Combination of Banana and Muffin
        testo.enqueue(new Cat("Sir Clawsalot"));
        testo.enqueue(new Dog("BARKO WHOM BARK MUCH"));
        testo.enqueue(new Dog("Woof")); // We asked, he answered.
        testo.enqueue(new Cat("Fluffbutt"));

        assertEquals("Pickles", testo.dequeue("cat").getName());
        assertEquals("Buffin", testo.dequeue("dog").getName());
        assertEquals("Sir Clawsalot", testo.dequeue(null).getName());
        assertEquals("BARKO WHOM BARK MUCH", testo.dequeue("dOg").getName());
        assertEquals("Woof", testo.dequeue("DOG").getName());
        assertEquals("Fluffbutt", testo.dequeue("cAt").getName());
    }

    @Test
    public void testReset() {
        FIFOAnimalShelter testo = new FIFOAnimalShelter();

        testo.enqueue(new Dog("Buffin")); // Combination of Banana and Muffin
        testo.enqueue(new Dog("BARKO WHOM BARK MUCH"));
        testo.enqueue(new Dog("Woof")); // We asked, he answered.

        assertEquals("Buffin", testo.dequeue("dog").getName());
        assertEquals("BARKO WHOM BARK MUCH", testo.dequeue("dOg").getName());
        assertEquals("Woof", testo.dequeue("DOG").getName());

        testo.enqueue(new Cat("Pickles"));
        testo.enqueue(new Cat("Sir Clawsalot"));
        testo.enqueue(new Cat("Fluffbutt"));

        assertEquals("Pickles", testo.dequeue("cat").getName());
        assertEquals("Sir Clawsalot", testo.dequeue("cAT").getName());
        assertEquals("Fluffbutt", testo.dequeue("cAt").getName());
    }
}