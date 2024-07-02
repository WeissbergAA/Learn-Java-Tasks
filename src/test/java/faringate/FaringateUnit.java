import FaringateCelsia.FaringateCelsia;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;


public class FaringateUnit {

    @Test
    public void testCelsiusToFahrenheit() { // тест для минимальных значений
        double celsius = 0;
        double expectedFahrenheit = 32;
        double actualFahrenheit = FaringateCelsia.celsiusToFahrenheit(celsius);
        Assert.assertEquals(actualFahrenheit, expectedFahrenheit); // c помощью TestNG
    }

    @Test
    public void testFahrenheitToCelsius() { // тест для минимальных значений
        double fahrenheit = 32;
        double expectedCelsius = 0;
        double actualCelsius = FaringateCelsia.fahrenheitToCelsius(fahrenheit);
        Assert.assertEquals(actualCelsius, expectedCelsius); // с помощью TestNG

    }
    @Test
    public void testCelsiusToFahrenheitConversion() { //тест для максимального значения
        double celsius = 100.0; // температура в градусах Цельсия
        double expectedFahrenheit = 212.0; // ожидаемое значение в градусах Фаренгейта
        double actualFahrenheit = FaringateCelsia.celsiusToFahrenheit(celsius); // вызов метода для преобразования
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.0001); // проверка результата
    }

    @Test
    public void testFahrenheitToCelsiusConversion() { // тест для максимального значения
        double fahrenheit = 212.0; // температура в градусах Фаренгейта
        double expectedCelsius = 100.0; // ожидаемое значение в градусах Цельсия
        double actualCelsius = FaringateCelsia.fahrenheitToCelsius(fahrenheit); // вызов метода для преобразования
        assertEquals(expectedCelsius, actualCelsius, 0.0001); // проверка результата
    }
}

