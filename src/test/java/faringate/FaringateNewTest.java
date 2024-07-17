package faringate;

import faringateCelsia.FaringateCelsiaFinal;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


@Feature("Проверка работы программы конвертации Цельия/Фарингейт")
public class FaringateNewTest {

    @DataProvider(name = "temperatureDataCelsia")
    public Object[][] temperatureData1() {
        return new Object[][] {
                {0.0, 32.0},
                {100.0, 212.0},
                {-12.0, 10.39},
        };
    }

    @DataProvider(name = "temperatureDataFahrenheit")
    public Object[][] temperatureData2() {
        return new Object[][] {
                {32.0, 0.0},
                {212.0, 100.0},
                {-52.0, -46.6}
        };
    }

    @Test(dataProvider = "temperatureDataCelsia")
    @Story("Проверка перевода Цельсий в Фарингейт")
    public void testCelsiusToFahrenheit(double celsius, double expectedFahrenheit) {
        double actualFahrenheit = FaringateCelsiaFinal.celsiusToFahrenheit(celsius);
        Assert.assertEquals(actualFahrenheit, expectedFahrenheit, 0.1);
    }

    @Test(dataProvider = "temperatureDataFahrenheit")
    @Story("Проверка перевода Фарингейт в Цельсий")
    public void testFahrenheitToCelsius(double fahrenheit, double expectedCelsius) {
        double actualCelsius = FaringateCelsiaFinal.fahrenheitToCelsius(fahrenheit);
        Assert.assertEquals(actualCelsius, expectedCelsius, 0.1);
    }
}
