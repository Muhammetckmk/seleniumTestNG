package techproed.tests.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.CarRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExtentReportsListener;

public class C01_PositiveLoginTest {
    //Name: US100201_Customer_Login
    //Description:Login with Customer information
    //Acceptance Criteria: As Customer, I should be able to log in to the application
    //email: johnson@cars.com
    //password: Deneme1?
    //https://www.speedyli.com/


    @Test(description = "As Customer, I should be able to log in to the application")
    public void positiveLoginTest() {

        //Ad: US100201_Customer_Login
        //Açıklama:Müşteri bilgileri ile giriş yapın
        //Kabul Kriterleri: Müşteri olarak uygulamaya giriş yapabilmem gerekiyor
        //e-posta: johnson@cars.com
        //şifre: Deneme1?
        //https://www.speedyli.com/
        Driver.getDriver().get(ConfigReader.getProperty("carRentalUrl"));
        ExtentReportsListener.extentTestInfo("car rental sayfasına gidilir");

        CarRentalPage carRentalPage= new CarRentalPage();

        carRentalPage.loginRegisterButton.click();
        ExtentReportsListener.extentTestInfo("login register tıklanır");

        carRentalPage.emailTextBox.sendKeys(ConfigReader.getProperty("fakeEmail"));
        carRentalPage.passwordTextBox.sendKeys(ConfigReader.getProperty("carRentalPassword"));
        carRentalPage.loginButton.click();
        ExtentReportsListener.extentTestInfo("geçerli userName ve password girilir");
        ExtentReportsListener.addScreenShotToReport();


//        Assert.assertTrue(carRentalPage.loginVerify.getText().contains("Suzanne"));
//        Assert.assertEquals(carRentalPage.loginVerify.getText(),"Suzanne Dare");
//
        carRentalPage.loginVerify.click();
        ExtentReportsListener.extentTestInfo("Login butonuna tıklanır");

        ExtentReportsListener.extentTestInfo("başarılı bir şekilde login olduğu test edilir");
        Assert.assertTrue(carRentalPage.profile.isDisplayed());
        Assert.assertTrue(carRentalPage.logout.isDisplayed());

        Driver.closeDriver();

    }
}
