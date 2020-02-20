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
}
