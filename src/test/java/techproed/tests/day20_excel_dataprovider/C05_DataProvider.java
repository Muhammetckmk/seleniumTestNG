package techproed.tests.day20_excel_dataprovider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C05_DataProvider {

    @DataProvider
    public static Object[][] products() {
        return new Object[][]{
                {"laptop"},{"mouse"},{"keyboard"}
        };
    }

    @Test(dataProvider = "products")
    public void test01(String data) {

        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        //DataProvider ile istediğimiz ürünleri aratalım
        GooglePage googlePage=new GooglePage();
        googlePage.searchBox.sendKeys(data, Keys.ENTER);


        //sayfayı kapatalım



    }
}
