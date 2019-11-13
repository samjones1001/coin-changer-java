package coin.changer;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CoinChangerTest {
    private CoinChanger changer;

    @Before
    public void init() {
        changer = new CoinChanger();
    }

    @Test public void testReturnsASinglePennyForOne() {
        List<Integer> expectedOutput = new ArrayList<>(List.of(1));
        assertEquals("should return a single penny for one", expectedOutput, changer.change(1));
    }

    @Test public void testReturnsASingle2pForTwo() {
        List<Integer> expectedOutput = new ArrayList<>(List.of(2));
        assertEquals("should return a single 2p for two", expectedOutput, changer.change(2));
    }

    @Test public void testReturns2pAndAPennyForThree() {
        List<Integer> expectedOutput = new ArrayList<>(List.of(2, 1));
        assertEquals("should return 2p and a penny for three", expectedOutput, changer.change(3));
    }

    @Test public void testReturnsTwo2psForFour() {
        List<Integer> expectedOutput = new ArrayList<>(List.of(2, 2));
        assertEquals("should return two 2ps for four", expectedOutput, changer.change(4));
    }

    @Test public void testReturnsASingle5pForTen() {
        List<Integer> expectedOutput = new ArrayList<>(List.of(5));
        assertEquals("should return a single 5p for five", expectedOutput, changer.change(5));
    }

    @Test public void testReturn5pAndAPennyForSix() {
        List<Integer> expectedOutput = new ArrayList<>(List.of(5, 1));
        assertEquals("should return 5p and a penny for six", expectedOutput, changer.change(6));
    }
}
