package multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class multiBracketValidationTest {
    @Test
    public void testSimplePassingCases() {
        assertTrue(MultiBracketValidation.multiBracketValidation("()"));
        assertTrue(MultiBracketValidation.multiBracketValidation("[]"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{}"));
        assertTrue(MultiBracketValidation.multiBracketValidation(""));
    }

    @Test
    public void testSimpleFailingCases() {
        assertFalse(MultiBracketValidation.multiBracketValidation(null));
        assertFalse(MultiBracketValidation.multiBracketValidation("("));
        assertFalse(MultiBracketValidation.multiBracketValidation("["));
        assertFalse(MultiBracketValidation.multiBracketValidation("{"));
        assertFalse(MultiBracketValidation.multiBracketValidation("(]"));
        assertFalse(MultiBracketValidation.multiBracketValidation("[}"));
        assertFalse(MultiBracketValidation.multiBracketValidation("{)"));
        assertFalse(MultiBracketValidation.multiBracketValidation("]"));
        assertFalse(MultiBracketValidation.multiBracketValidation("}"));
        assertFalse(MultiBracketValidation.multiBracketValidation(")"));
    }

    @Test
    public void testSimpleNestedPassingCases() {
        assertTrue(MultiBracketValidation.multiBracketValidation("(()[])"));
        assertTrue(MultiBracketValidation.multiBracketValidation("[{()}]"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{(())}"));
        assertTrue(MultiBracketValidation.multiBracketValidation("[{()()()}]"));
    }

    @Test
    public void testSimpleNestedFailingCases() {
        assertFalse(MultiBracketValidation.multiBracketValidation("({)"));
        assertFalse(MultiBracketValidation.multiBracketValidation("[)]"));
        assertFalse(MultiBracketValidation.multiBracketValidation("{[)"));
        assertFalse(MultiBracketValidation.multiBracketValidation("([]]"));
        assertFalse(MultiBracketValidation.multiBracketValidation("[[]}"));
        assertFalse(MultiBracketValidation.multiBracketValidation("{{})"));
    }

    @Test
    public void testIntricateNestedPassingCases() {
        assertTrue(MultiBracketValidation.multiBracketValidation("({[[]({})]}[])"));
        assertTrue(MultiBracketValidation.multiBracketValidation("[{{}()}]"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{([]({[][]}))}"));
        assertTrue(MultiBracketValidation.multiBracketValidation("[{([][][][][])([[[[][][][]][][]]])()}]"));
    }

    @Test
    public void testExtraCharactersdPassingCases() {
        assertTrue(MultiBracketValidation.multiBracketValidation("({[a  teatawteawfastash[f]({gafdgav})]}[])"));
        assertTrue(MultiBracketValidation.multiBracketValidation("[{{}()}]"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{([]({yajkm[][]}))}"));
        assertTrue(MultiBracketValidation.multiBracketValidation("[{([][][]gdsag[][])([adsgtasb[gadsfg[[][ay][]gag[]][][]]])()}]"));
    }

    @Test
    public void testExtraCharactersFailingCases() {
        assertFalse(MultiBracketValidation.multiBracketValidation("({26)"));
        assertFalse(MultiBracketValidation.multiBracketValidation("[)AHDH]"));
        assertFalse(MultiBracketValidation.multiBracketValidation("{fadsfgA[)"));
        assertFalse(MultiBracketValidation.multiBracketValidation("([vafgharhba]]"));
        assertFalse(MultiBracketValidation.multiBracketValidation("[[6q27ayg]}"));
        assertFalse(MultiBracketValidation.multiBracketValidation("{{AT^$AWYH})"));
    }
}