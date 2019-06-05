package graph;

import org.junit.Before;
import org.junit.Test;
import util.Pair;

import static org.junit.Assert.*;

public class GetEdgesTest {
    Graph<String> testo;

    @Before
    public void setup() {
        testo = new Graph<>();

        testo.addNode("Pandora");
        testo.addNode("Arendelle");
        testo.addNode("Metroville");
        testo.addNode("Monstropolis");
        testo.addNode("Narnia");
        testo.addNode("Naboo");

        testo.addEdge("Pandora", "Arendelle", 150);
        testo.addEdge("Pandora", "Metroville", 82);
        testo.addEdge("Metroville", "Arendelle", 99);
        testo.addEdge("Monstropolis", "Arendelle", 42);
        testo.addEdge("Monstropolis", "Naboo", 73);
        testo.addEdge("Metroville", "Monstropolis", 105);
        testo.addEdge("Metroville", "Narnia", 37);
        testo.addEdge("Metroville", "Naboo", 26);
        testo.addEdge("Narnia", "Naboo", 250);
    }

    @Test
    public void providedTests() {
        String[] testOneCities = {"Metroville", "Pandora"};
        Pair<Boolean, Integer> testOneResult = new Pair<>(Boolean.TRUE, 82);
        String[] testTwoCities = {"Arendelle", "Monstropolis", "Naboo"};
        Pair<Boolean, Integer> testTwoResult = new Pair<>(Boolean.TRUE, 115);
        String[] testThreeCities = {"Naboo", "Pandora"};
        Pair<Boolean, Integer> testThreeResult = new Pair<>(Boolean.FALSE, 0);
        String[] testFourCities = {"Narnia", "Arendelle", "Naboo"};
        Pair<Boolean, Integer> testFourResult = new Pair<>(Boolean.FALSE, 0);

        assertEquals(testOneResult, GetEdges.getEdges(testo, testOneCities));
        assertEquals(testTwoResult, GetEdges.getEdges(testo, testTwoCities));
        assertEquals(testThreeResult, GetEdges.getEdges(testo, testThreeCities));
        assertEquals(testFourResult, GetEdges.getEdges(testo, testFourCities));
    }
}