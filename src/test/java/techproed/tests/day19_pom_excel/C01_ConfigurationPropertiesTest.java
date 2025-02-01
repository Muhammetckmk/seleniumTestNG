package techproed.tests.day19_pom_excel;

import org.openqa.selenium.devtools.v130.page.Page;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.pages.TestCenter;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_ConfigurationPropertiesTest {


    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.closeDriver();
    }

    //Go to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    //Log in by locating the UserName, UserPassword, submitButton elements
    //user=Admin
    //userPassword=admin123
    //Test that the Login Test is successful
    //close the page

    @Test
    public void test02() {

        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));
        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim login olalım
        OpenSourcePage openSourcePage=new OpenSourcePage();
        openSourcePage.username.sendKeys(ConfigReader.getProperty("openSourceUserName"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("openSourcePassword"));
        ReusableMethods.takeScreenShot();
        openSourcePage.loginButton.click();

        //Login Testinin basarili oldugunu test edelim
        ReusableMethods.waitForSecond(2);
        ReusableMethods.visibleWait(openSourcePage.dashboard,10);
        ReusableMethods.takeScreenShot();

        Assert.assertTrue(openSourcePage.dashboard.isDisplayed());

        //sayfayi kapatalim
        Driver.closeDriver();
    }

     /*
    Homework
    //https://testcenter.techproeducation.com/index.php?page=form-authentication
    //Page object Model kullanarak sayfaya giriş yapildigini test edin
    //Sayfadan cikis yap ve cikis yapildigini test et
    //sayfayı kapatınız
     */

    @Test
    public void testName() {
        /*
    Homework
    */
    //https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("testcenterTechProUrl"));
    //Page object Model kullanarak sayfaya giriş yapildigini test edin
        TestCenter openSourcePage=new TestCenter();
        openSourcePage.userName.sendKeys(ConfigReader.getProperty("testcenterTechProUserName"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("testcenterTechProPassword"));
        openSourcePage.submit.click();
        Assert.assertTrue(openSourcePage.text.isDisplayed());

        ReusableMethods.waitForSecond(2);
    //Sayfadan cikis yap ve cikis yapildigini test et
        openSourcePage.logout.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("testcenterTechProUrl"));
    //sayfayı kapatınız
        Driver.closeDriver();

    }
}
