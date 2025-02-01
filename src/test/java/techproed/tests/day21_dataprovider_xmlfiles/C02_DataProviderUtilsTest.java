package techproed.tests.day21_dataprovider_xmlfiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.DataProviderPage;
import techproed.utilities.DataProviderUtils;
import techproed.utilities.Driver;

import java.security.Key;

public class C02_DataProviderUtilsTest {
    //BlackBoxTesting techniques ile Data Driven Test yapalim
    @Test(dataProvider = "positiveTestData", dataProviderClass = DataProviderUtils.class)
    public void test01(String age) {

        Driver.getDriver().get(System.getProperty("user.dir")+ "\\src\\test\\java\\techproed\\resources\\dataprovider.html");
        DataProviderPage dataProviderPage = new DataProviderPage();
        dataProviderPage.textbox.sendKeys(age+ Keys.TAB + Keys.ENTER);

        Assert.assertTrue(dataProviderPage.positiveVerifyMessage.isDisplayed());

        Driver.closeDriver();
    }

}
