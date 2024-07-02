import FaringateCelsia.FaringateCelsia;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FaringateUnitParam {

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
    public void testCelsiusToFahrenheit(double celsius, double expectedFahrenheit) {
        double actualFahrenheit = FaringateCelsia.celsiusToFahrenheit(celsius);
        Assert.assertEquals(actualFahrenheit, expectedFahrenheit, 0.1);
    }

    @Test(dataProvider = "temperatureDataFahrenheit")
    public void testFahrenheitToCelsius(double fahrenheit, double expectedCelsius) {
        double actualCelsius = FaringateCelsia.fahrenheitToCelsius(fahrenheit);
        Assert.assertEquals(actualCelsius, expectedCelsius, 0.1);
    }
}
