package faringate;

import faringateCelsia.FaringateCelsiaFinal;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Feature("Проверка работы программы конвертации Цельсий/Фарингейт")
public class FarCelFinalTest {

    @DataProvider(name = "temperatureData")
    public Object[][] temperatureData() {
        return new Object[][] {
                {"cToF", 0.0, 32.0},
                {"cToF", 100.0, 212.0},
                {"cToF", -12.0, 10.4},
                {"fToC", 32.0, 0.0},
                {"fToC", 212.0, 100.0},
                {"fToC", -52.0, -46.7}
        };
    }

    @Test(dataProvider = "temperatureData")
    @Story("Проверка перевода температур")
    public void testTemperatureConversion(String conversionType, double input, double expected) {
        FaringateCelsiaFinal FaringateCelsia;
        if (conversionType.equals("cToF")) {
            double actual = FaringateCelsiaFinal.celsiusToFahrenheit(input);
            Assert.assertEquals(actual, expected, 0.1);
        } else if (conversionType.equals("fToC")) {
            double actual = FaringateCelsiaFinal.fahrenheitToCelsius(input);
            Assert.assertEquals(actual, expected, 0.1);
        }
    }
}
/* Использовал дополнительный параметр, чтобы определить, какой тест запускать.
1. Data Provider:
    - temperatureData возвращает массив объектов, где первый элемент указывает тип конверсии (`"cToF"` или `"fToC"`),
    второй элемент — входное значение, и третий элемент — ожидаемое значение.


2. Объединенный тестовый метод:
    - testTemperatureConversion принимает тип конверсии и входные/ожидаемые значения.
    - В зависимости от значения conversionType, выполняется соответствующая конверсия и проверка результата.
 */

