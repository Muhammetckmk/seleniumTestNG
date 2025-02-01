package techproed.tests.day22_paralleltests_listeners;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_ParallelTest {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("carRentalUrl"));
        Driver.closeDriver();
    }

    @Test
    public void test02() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("carRentalUrl"));
        Driver.closeDriver();
    }
}
