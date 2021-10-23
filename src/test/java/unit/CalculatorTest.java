package unit;

import calc.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void checkGetSum() {
        int a = 2;
        int b = 3;
        int expectedResult = 5;
        double actualResult = calculator.getSum(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
