package yurkovskiy.com;

import junit.framework.TestCase;

public class StringGamesTest  extends TestCase {

    public void testRemoveVowelsSmallLetters() {
        StringGames str = new StringGames("Hello World");
        assertEquals("Hll Wrld", str.removeVowels());
    }

    public void testRemoveVowelsCapitalLetters() {
        StringGames str = new StringGames("SRAKA");
        assertEquals("SRK", str.removeVowels());
    }
}
