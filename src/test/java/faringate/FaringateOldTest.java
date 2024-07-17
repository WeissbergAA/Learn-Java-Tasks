package faringate;

import faringateCelsia.FaringateCelsiaFinal;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



@Feature("Проверка работы программы конвертации Цельия/Фарингейт")
public class FaringateOldTest {

    @Test
    @Story("Проверка перевода Цельсий в Фарингейт")
    public void testCelsiusToFahrenheit() { // тест для минимальных значений
        double celsius = 0;
        double expectedFahrenheit = 32;
        double actualFahrenheit = FaringateCelsiaFinal.celsiusToFahrenheit(celsius);
        assertEquals(actualFahrenheit, expectedFahrenheit); // c помощью TestNG
    }

    @Test
    @Story("Проверка перевода Фарингейт в Цельсий")
    public void testFahrenheitToCelsius() { // тест для минимальных значений
        double fahrenheit = 32;
        double expectedCelsius = 0;
        double actualCelsius = FaringateCelsiaFinal.fahrenheitToCelsius(fahrenheit);
        assertEquals(actualCelsius, expectedCelsius); // с помощью TestNG

    }
    @Test
    @Story("Проверка перевода Цельсий в Фарингейт")
    public void testCelsiusToFahrenheitConversion() { //тест для максимального значения
        double celsius = 100.0; // температура в градусах Цельсия
        double expectedFahrenheit = 212.0; // ожидаемое значение в градусах Фаренгейта
        double actualFahrenheit = FaringateCelsiaFinal.celsiusToFahrenheit(celsius); // вызов метода для преобразования
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.0001); // проверка результата
    }

    @Test
    @Story("Проверка перевода Фарингейт в Цельсий")
    public void testFahrenheitToCelsiusConversion() { // тест для максимального значения
        double fahrenheit = 212.0; // температура в градусах Фаренгейта
        double expectedCelsius = 100.0; // ожидаемое значение в градусах Цельсия
        double actualCelsius = FaringateCelsiaFinal.fahrenheitToCelsius(fahrenheit); // вызов метода для преобразования
        assertEquals(expectedCelsius, actualCelsius, 0.0001); // проверка результата
    }

    @Test
    @Story("Проверка перевода Цельсий в Фарингейт при Цельсий минус")
    public void testIfCelsiuseMinus() {
        double celsius = -12.0;
        double expectedFahrenheit = 10.39;
        double actualFahrenheit = FaringateCelsiaFinal.celsiusToFahrenheit(celsius);// вызов метода для преобразования
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.01);
    }

    @Test
    @Story("Проверка перевода Фарингейт в Цельсий при Фарингейт минус")
    public void testIfFahrenheitMinus() { // тест для максимального значения
        double fahrenheit = -52.0; // температура в градусах Фаренгейта
        double expectedCelsius = -46.66; // ожидаемое значение в градусах Цельсия
        double actualCelsius = FaringateCelsiaFinal.fahrenheitToCelsius(fahrenheit); // вызов метода для преобразования
        assertEquals(expectedCelsius, actualCelsius, 0.01); // проверка результата

}
}
//нведрить параметризацию с помощью TestNG
