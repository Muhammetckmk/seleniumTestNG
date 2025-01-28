package techproed.tests.day18_pom;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.Driver;

public class C02_PageClassUsage {
    @Test
    public void test01() {

        //amazon sayfasina gidelim
        Driver.getDriver().get("https://amazon.com");

        //arama kutusunda selenium aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("selenium"+ Keys.ENTER);

    }
}
