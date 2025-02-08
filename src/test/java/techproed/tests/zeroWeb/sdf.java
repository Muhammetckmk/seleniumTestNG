package techproed.tests.zeroWeb;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class sdf {
    @Test
    public void testName() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }
}
