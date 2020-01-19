package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test 1
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Test 2
    @Test
    public void noBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

//    //Test 3
    @Test
    public void onlyOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

//    //Test 4
    @Test
    public void onlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

//    //Test 5
    @Test
    public void balancedBracketStartingStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

//    //Test 6
    @Test
    public void balancedBracketInStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[]Code"));
    }

//    //Test 7
    @Test
    public void balancedBracketEndingStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

//    //Test 8
    @Test
    public void randomBracketsInStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Lau[nchCo]de"));
    }

    //Test 9
    @Test
    public void nestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code [LaunchCode] Launch]Code"));
    }

//    //Test 10
    @Test
    public void mismatchedOpeningBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Lau[nch[Cod]e"));
    }

//    //Test 11
    @Test
    public void mismatchedClosingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Lau[nch]Cod]e"));
    }

//    //Test 12
    @Test
    public void onlyNestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ [ [][][] ] [ [][][] ] ]"));
    }

}
