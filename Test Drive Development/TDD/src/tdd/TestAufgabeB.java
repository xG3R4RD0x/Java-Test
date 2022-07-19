package tdd;

import org.junit.Test;

import junit.framework.TestCase;


public class TestAufgabeB extends TestCase {

    @Test
    public void testFragezeichenUNDHash() throws Exception {
        assertOutcome("qmamphash", "?&#");
    }

    @Test
    public void testEmptyToMinus() throws Exception {
        assertOutcome("abc-def", "abc def");
    }

    @Test
    public void testSpecialToMinus() throws Exception {
        assertOutcome("a-bc-d-e-f-g-h-i-j-k-a-b-c-d-e-f-g-h-i-j-h-k-a-b-c-d-e", "a!bc§d$e%f/g(h)i=j;k+a*b:c_d<e>f@g€h{i}j[h]k~a.b,c^d°e");
    }

    @Test
    public void testDoubleMinus1() throws Exception {
        assertOutcome("abc-ef", "abc!-ef");
    }

    @Test
    public void testDoubleMinus2() throws Exception {
        assertOutcome("abc-ef", "abc$$ef");
    }

    @Test
    public void testDoubleMinus3() throws Exception {
        assertOutcome("abc-ef", "abc! ef");
    }

    @Test
    public void testUpperToLower() throws Exception {
        assertOutcome("abcdefg", "ABCDEFG");
    }

    @Test
    public void testIfEmpty() throws Exception {
        assertOutcome(null, "");
    }

    @Test
    public void testIfNull() throws Exception {
        assertOutcome(null, null);
    }

    @Test
    public void testMinusAt() throws Exception {
        assertOutcome("abcdefg", "-abcdefg");
    }

    @Test
    public void testMinusAtEnd() throws Exception {
        assertOutcome("abcdefg", "abcdefg-");
    }
    private void assertOutcome(String expectedOutcome, String input){
        String out = Utilities.prepareStringForUrl(input);
        if(out!=null||expectedOutcome!=null) {
            assertTrue("Incorrect output: " + out, out.contains(expectedOutcome));
        }
    }
}
