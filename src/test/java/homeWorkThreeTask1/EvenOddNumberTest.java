package homeWorkThreeTask1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddNumberTest {

    @BeforeEach
    void setUp() {
        EvenOddNumber test = new EvenOddNumber();
    }

// проверка четного или не четного числа  с помошью четного числа
    @Test
    void EvenOddNumberWithEvenNumber( ) {
         EvenOddNumber test = new EvenOddNumber();
        boolean result = test.evenOddNumber(4);
        assertTrue(result);
    }
    // проверка четного или не четного числа  с помошью нечетного числа
    @Test
    void EvenOddNumberWithOddNumber() {
        EvenOddNumber test = new EvenOddNumber();
        boolean result = test.evenOddNumber(5);
        assertFalse(result);
    }
    // проверка четного или не четного числа  с помошью  числа 0
    @Test
    void testEvenOddNumberWithZero() {
        EvenOddNumber test = new EvenOddNumber();
        boolean result = test.evenOddNumber(0);
        assertTrue(result);
    }

}