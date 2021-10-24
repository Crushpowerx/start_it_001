package calc;

import logger.CustomLogger;

public class Calculator {

    public Double getSum(double a, double b) {
        double sum = a + b;
        CustomLogger.logger.info(String.valueOf(sum));
        return sum;
    }

    public Double getSubtraction(double a, double b) {
        double subtraction = a - b;
        CustomLogger.logger.info(String.valueOf(subtraction));
        return subtraction;
    }

    public Double getMultiple(double a, double b) {
        double multiple = a * b;
        CustomLogger.logger.info(String.valueOf(multiple));
        return multiple;
    }

    public Double getDivision(double a, double b) {
        double division = a / b;
        CustomLogger.logger.info(String.valueOf(division));
        return division;
    }
}
