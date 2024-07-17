package calculator;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import сalculator.CalculatorFinal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;



@Feature("Вычсиления калькулятора")
public class CalculatorNewTest {

    @Test (dataProvider = "calculationData")
    @Story("Проверка базовых вычислений")
    public void testCalculation(double num1, char operator, double num2, double expected) {
        double actual = CalculatorFinal.calculate(num1, operator, num2);
        assertEquals(actual, expected);
    }
    @DataProvider(name = "calculationData")
    public Object[][] testcalculationData() {
        return new Object[][] {
                {10.0, '+', 3.0, 13.0},
                {5.0, '-', 3.0, 2.0},
                {6.0, '*', 3.0, 18.0},
                {6.0, '/', 3.0, 2.0}
        };
    }

    @Test
    @Story("Проверка число делить на ноль")
    public void testInvalidTwoOperatorZero() {
        double num1 = 6.0;
        char operator = '/';
        double num2 = 0.0;

        assertThrows(ArithmeticException.class, () -> CalculatorFinal.calculate(num1, operator, num2));
    }

    @Test
    @Story("Проверка ноль делить на число")
    public void testInvalidFirstOperatorZero() {
        double num1 = 0.0;
        char operator = '%';
        double num2 = 3.0;

        assertThrows(IllegalArgumentException.class, () -> CalculatorFinal.calculate(num1, operator, num2));
    }
}
