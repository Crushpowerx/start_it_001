package learning.unit;

import calc.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void checkGetSum() {
        int a = 2;
        int b = 3;
        int expectedResult = 5;
        double actualResult = calculator.getSum(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(expectedExceptions = {java.lang.AssertionError.class})
    public void checkExceptionInGetSum() {
        int a = 2;
        int b = 3;
        int expectedResult = 6;
        double actualResult = calculator.getSum(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkGetSubtraction() {
        int a = 2;
        int b = 3;
        int expectedResult = -1;
        double actualResult = calculator.getSubtraction(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkGetMultiple() {
        int a = 2;
        int b = 3;
        int expectedResult = 6;
        double actualResult = calculator.getMultiple(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkGetDivision() {
        int a = 2;
        int b = 3;
        double expectedResult = 0.6666666666666666;
        double actualResult = calculator.getDivision(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
