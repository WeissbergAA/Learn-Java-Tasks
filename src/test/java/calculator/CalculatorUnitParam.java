import Calculator.CalculatorFinal;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CalculatorUnitParam {

    @Test(dataProvider = "calculationData")
    public void testCalculation(double num1, char operator, double num2, double expected) {
        double actual = CalculatorFinal.calculate(num1, operator, num2);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "calculationData")
    public Object[][] calculationData() {
        return new Object[][] {
                {10.0, '+', 3.0, 13.0},
                {5.0, '-', 3.0, 2.0},
                {6.0, '*', 3.0, 18.0},
                {6.0, '/', 3.0, 2.0}
        };
    }

    @Test
    public void testInvalidTwoOperatorZero() {
        double num1 = 6.0;
        char operator = '/';
        double num2 = 0.0;

        assertThrows(ArithmeticException.class, () -> CalculatorFinal.calculate(num1, operator, num2));
    }

    @Test
    public void testInvalidFirstOperatorZero() {
        double num1 = 0.0;
        char operator = '%';
        double num2 = 3.0;

        assertThrows(IllegalArgumentException.class, () -> CalculatorFinal.calculate(num1, operator, num2));
    }
}
