package homeWorkThreeTask2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberInIntervalTest {
    // создаем экземпляр класса
    NumberInInterval testNumber = new NumberInInterval();

    // проверяем входит число в диапозон значений с помощью числа входящего в диапозон
    @Test
    void testNumberInInterval() {
        assertTrue(testNumber.numberInInterval(30));


// проверяем входит число в диапозон значений с помощью числа не входящего в диапозон


    }
    @Test
    void testNumberBeyondInterval() {
        boolean result = testNumber.numberInInterval(15);
        assertFalse( result);
    }
    // проверяем входит число в диапозон значений с помощью числа нижней границы  диапозона
    @Test
    void testNumberLowerBorder() {
        boolean result = testNumber.numberInInterval(25);
        assertTrue( result);
    }
    // проверяем входит число в диапозон значений с помощью числа верхней границы  диапозона
    @Test
    void testNumberUpperBorder() {
        boolean result = testNumber.numberInInterval(100);
        assertFalse( result);
    }
}
