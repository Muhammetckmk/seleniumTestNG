package techproed.tests.day20_excel_dataprovider;

import org.testng.annotations.Test;
import techproed.pages.CarRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;

public class C03_ExcelDataDrivenTest {
    //BlueRentalCar Sayfasına gidelim
    //Excel dosyamızdaki tüm email ve passwordler ile login olalım ve login olduğumuzu doğrulayalım



    @Test
    public void test01() {
        ExcelReader excelReader=new ExcelReader("src/test/java/techproed/resources/smoketestdata.xlsx","Sayfa1");

        for (int i = 1; i <= excelReader.rowCount(); i++) {
            String email = excelReader.getCellData(i, 0);
            String password = excelReader.getCellData(i, 1);
            System.out.println(email + " " + password);
        }




    }

    //BlueRentalCar Sayfasına gidelim
    //Excel dosyamızdaki tüm email ve passwordler ile login olalım ve login olduğumuzu doğrulayalım


    @Test
    public void testName() {
        Driver.getDriver().get(ConfigReader.getProperty("carRentalUrl"));
        CarRentalPage carRentalPage=new CarRentalPage();
        ExcelReader excelReader=new ExcelReader("src/test/java/techproed/resources/smoketestdata.xlsx","Sayfa1");

        for (int i = 1; i <=excelReader.rowCount() ; i++) {
            carRentalPage.loginRegisterButton.click();
            carRentalPage.emailTextBox.sendKeys(excelReader.getCellData(i,0));
            carRentalPage.passwordTextBox.sendKeys(excelReader.getCellData(i,1));
            carRentalPage.loginButton.click();
            carRentalPage.loginVerify.click();
            carRentalPage.logout.click();
            carRentalPage.yesButton.click();
        }

        Driver.closeDriver();


    }

}
