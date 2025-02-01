package techproed.tests.day20_excel_dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.CarRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;

public class C02_CarRentalExcelTest {
    @Test
    public void test01() throws InterruptedException {

        //RentalCar sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("carRentalUrl"));

        //Login buttonuna tıklayalım
        CarRentalPage carRentalPage=new CarRentalPage();
        carRentalPage.loginRegisterButton.click();
        //Excel dosyasındaki herhangi bir email ve password ile login olalım
        ExcelReader excelReader=new ExcelReader("src/test/java/techproed/resources/smoketestdata.xlsx","Sayfa1");
        String email = excelReader.getCellData(2, 0);
        String password = excelReader.getCellData(2, 1);

        carRentalPage.emailTextBox.sendKeys(email);
        carRentalPage.passwordTextBox.sendKeys(password);
        carRentalPage.loginButton.click();
        //Girilen email ile giriş yapıldığını doğrulayın
        carRentalPage.loginVerify.click();
        carRentalPage.profile.click();
        String actualProfileText = carRentalPage.profileEmail.getText();
        Assert.assertEquals(actualProfileText,email);

        //sayfayı kapatalım
        Driver.closeDriver();

    }
}
