package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void testAllFizz() {
        List<Object> contents = new ArrayList<>();
        contents.add(6);
        contents.add(3);
        contents.add(9);
        contents.add(12);
        contents.add(18);

        FizzBuzzTree testo = new FizzBuzzTree(contents);
        testo.fizzbuzz();

        List<Object> expected = new ArrayList<>();
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("Fizz");
        expected.add("Fizz");

        assertEquals(expected, testo.preOrderTraversal());
        assertEquals(expected.size(), testo.preOrderTraversal().size());
        assertEquals("Fizz", testo.root.getVal());
    }

    @Test
    public void testAllBuzz() {
        List<Object> contents = new ArrayList<>();
        contents.add(5);
        contents.add(10);
        contents.add(20);
        contents.add(25);
        contents.add(80);

        FizzBuzzTree testo = new FizzBuzzTree(contents);
        testo.fizzbuzz();

        List<Object> expected = new ArrayList<>();
        expected.add("Buzz");
        expected.add("Buzz");
        expected.add("Buzz");
        expected.add("Buzz");
        expected.add("Buzz");

        assertEquals(expected, testo.preOrderTraversal());
        assertEquals(expected.size(), testo.preOrderTraversal().size());
        assertEquals("Buzz", testo.root.getVal());
    }

    @Test
    public void testAllFizzBuzz() {
        List<Object> contents = new ArrayList<>();
        contents.add(15);
        contents.add(30);
        contents.add(60);
        contents.add(75);
        contents.add(90);

        FizzBuzzTree testo = new FizzBuzzTree(contents);
        testo.fizzbuzz();

        List<Object> expected = new ArrayList<>();
        expected.add("FizzBuzz");
        expected.add("FizzBuzz");
        expected.add("FizzBuzz");
        expected.add("FizzBuzz");
        expected.add("FizzBuzz");

        assertEquals(expected, testo.preOrderTraversal());
        assertEquals(expected.size(), testo.preOrderTraversal().size());
        assertEquals("FizzBuzz", testo.root.getVal());
    }

    @Test
    public void testNoMatches() {
        List<Object> contents = new ArrayList<>();
        contents.add(68);
        contents.add(31);
        contents.add(68);
        contents.add(74);
        contents.add(97);

        FizzBuzzTree testo = new FizzBuzzTree(contents);
        testo.fizzbuzz();

        List<Object> expected = new ArrayList<>();
        expected.add(68);
        expected.add(31);
        expected.add(74);
        expected.add(97);
        expected.add(68);

        assertEquals(expected, testo.preOrderTraversal());
        assertEquals(expected.size(), testo.inOrderTraversal().size());
        assertEquals(68, (int) testo.root.getVal());
    }

    @Test
    public void testMixedMatches() {
        List<Object> contents = new ArrayList<>();
        contents.add(63);
        contents.add(30);
        contents.add(68);
        contents.add(75);
        contents.add(40);

        FizzBuzzTree testo = new FizzBuzzTree(contents);
        testo.fizzbuzz();

        List<Object> expected = new ArrayList<>();
        expected.add("Fizz");
        expected.add("FizzBuzz");
        expected.add("FizzBuzz");
        expected.add("Buzz");
        expected.add(68);

        assertEquals(expected, testo.preOrderTraversal());
        assertEquals(expected.size(), testo.inOrderTraversal().size());
        assertEquals("Fizz", testo.root.getVal());

        testo.fizzbuzz();

        assertEquals(expected, testo.preOrderTraversal());
        assertEquals(expected.size(), testo.inOrderTraversal().size());
        assertEquals("Fizz", testo.root.getVal());
    }
}