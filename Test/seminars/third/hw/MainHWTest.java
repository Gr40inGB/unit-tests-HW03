package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    MainHW mainHW = new MainHW();

    @Test
    void evenOddNumberTest() {
        assertTrue(mainHW.evenOddNumber(100));
        assertFalse(mainHW.evenOddNumber(1001));
    }
    @Test
    void numberInIntervalTest() {
        assertTrue(mainHW.numberInInterval(100));
        assertFalse(mainHW.numberInInterval(1001));
        assertTrue(mainHW.numberInInterval(27));
    }
}