package techproed.tests.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.CarRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExtentReportsListener;
import techproed.utilities.ReusableMethods;

public class C03_NegativeLoginTest {
    //Name:
    //US100208_Negative_Login
    //Description:
    //Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamalDr
    //Acceptance Criteria
    //Customer email: fake@rentalcars.com
    //Customer password: fakepass
    //Error:
    //User with email fake@rentalcars.com not found



    @Test(description = "US001 - AC-02 - - Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamalDr")
    public void negativeLoginTest() {
        //https://www.speedyli.com/ sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("carRentalUrl"));
        ExtentReportsListener.extentTestInfo("car rental sayfasına gidilir");


        //Login buttonuna tıklayalım
        CarRentalPage carRentalPage=new CarRentalPage();
        carRentalPage.loginRegisterButton.click();
        ExtentReportsListener.extentTestInfo("login register tıklanır");

        //Properties dosyasındaki kullanımda olmayan email ve password bilgileri il login olamadığını test edelim
       carRentalPage.emailTextBox.sendKeys(ConfigReader.getProperty("fakeEmail"));
       carRentalPage.passwordTextBox.sendKeys(ConfigReader.getProperty("fakePassword"));
       carRentalPage.loginButton.click();
        ExtentReportsListener.extentTestInfo("Geçersiz userName ve password girilir");



        ExtentReportsListener.extentTestInfo("geçersiz userName ve password ile login olunamadığı test edilir");
        ReusableMethods.visibleWait(carRentalPage.negativeLoginVeryfy,10);
        Assert.assertTrue(carRentalPage.negativeLoginVeryfy.isDisplayed());



        //sayfayı kapatınız
        Driver.closeDriver();
    }
}
