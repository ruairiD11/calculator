package ie.gmit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator myCalculator;

    @BeforeAll
    static void startingTests() { System.out.println("Starting Tests"); }

    @BeforeEach
    void createInstance(TestInfo testInfo, TestReporter testReporter)
    {
        testReporter.publishEntry(testInfo.getDisplayName());
        myCalculator = new Calculator();
    }

    @AfterAll
    static void testingComplete() { System.out.println("Testing Complete"); }

    @DisplayName("Testing add method")
    @Test
    void testAdd() { assertEquals(2, myCalculator.add(1,1)); }

    @DisplayName("Testing subtract method")
    @Test
    void testSubtract() { assertEquals(2, myCalculator.subtract(4,2)); }

    @DisplayName("Testing multiply method")
    @Test
    void testMultiply() { assertEquals(10, myCalculator.multiply(2,5)); }

    @DisplayName("Testing divide method")
    @Test
    void testDivide() { assertEquals(2, myCalculator.divide(4,2)); }

    @DisplayName("Testing divide by 0 error")
    @Test
    void testDivideByZero1() { assertThrows(ArithmeticException.class, ()-> { myCalculator.divide(2,0); }); }

    @DisplayName("Testing divide by 0 error")
    @Test
    void testDivideByZero2() { assertThrows(ArithmeticException.class, ()-> { myCalculator.divide(0,2); }); }
}
