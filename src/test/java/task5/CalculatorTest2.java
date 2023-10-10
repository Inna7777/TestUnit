package task5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import task4.Calculator;

public class CalculatorTest2 {
    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @BeforeAll
    public static void initAll() {
        System.out.printf("Ok!!");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.printf("END!");    }

    @AfterEach
    public void tearDown() {
        calculator = null; // Очистка после каждого теста
    }

    @Test
    @DisplayName("Проверка равенства значений")
    void testAssertEquals() {
        assertEquals(90.0, calculator.calculateDiscount(100.0, 10.0));
    }

    @Test
    @DisplayName("Проверка неравенства значений")
    void testAssertNotEquals() {
        assertNotEquals(50, calculator.calculateDiscount(100.0, 10));
    }
    @Test
    @DisplayName("Проверка с сообщением")
    void testAssertWithMessage() {
        assertEquals(90, calculator.calculateDiscount(100, 10), "Сумма покупки должна быть 90.0 рублей");
    }

    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue(calculator.calculateDiscount(20, 10) == 18);
    }

    @Test
    @DisplayName("Проверка ложного условия")
    void testAssertFalse() {
        assertFalse(calculator.add(20, 10) == 17);
    }



}
