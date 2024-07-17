import Calculator.CalculatorFinal;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;



public class CalculatorOldTest // ниже тесты с использованием TestNG
{
    @Test
    public void testPlus() {
        double num1 = 10.0;
        char operator = '+';
        double num2 = 3.0;
        double expected = 13.0;

        double actual = CalculatorFinal.calculate(num1, operator, num2);

        assertEquals(actual, expected);
    }

    @Test
    public void testMinus() {
        double num1 = 5.0;
        char operator = '-';
        double num2 = 3.0;
        double expected = 2.0;

        double actual = CalculatorFinal.calculate(num1, operator, num2);

        assertEquals(actual, expected);
    }

    @Test
    public void testMultiplication() {
        double num1 = 6.0;
        char operator = '*';
        double num2 = 3.0;
        double expected = 18.0;

        double actual = CalculatorFinal.calculate(num1, operator, num2);

        assertEquals(actual, expected);
    }

    @Test
    public void testDivision() {
        double num1 = 6.0;
        char operator = '/';
        double num2 = 3.0;
        double expected = 2.0;

        double actual = CalculatorFinal.calculate(num1, operator, num2);

        assertEquals(actual, expected);
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
