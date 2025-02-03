package techproed.tests.zeroWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed.pages.ZeroPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExtentReportsListener;
import techproed.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Listeners()
public class ZeroWeb {
    //=======Homework 1=======

    @Test
    public void zeroPositiveTest() {
        ExtentReportsListener extentReportsListener=new ExtentReportsListener();
        SoftAssert softAssert=new SoftAssert();

//1."http://zero.webappsecurity.com/" Adresine gidin başlığın Personal içerdiğini test edin
        ExtentReportsListener.extentTestInfo("\"http://zero.webappsecurity.com/\" Adresine gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));
        ExtentReportsListener.extentTestInfo("başlığın Personal içerdiğini test edilir");
        softAssert.assertTrue(Driver.getDriver().getTitle().contains("Personel"));

//2. Sign in butonuna basin
        ExtentReportsListener.extentTestInfo("Sign in butonuna basinlır");

        ZeroPage zeroPage= new ZeroPage();
        zeroPage.signin1.click();
//3. Login kutusuna "username" yazin
        ExtentReportsListener.extentTestInfo("Login kutusuna \"username\" yazilir");

        zeroPage.userName.sendKeys(ConfigReader.getProperty("userName"));
//4. Password kutusuna "password" yazin
        ExtentReportsListener.extentTestInfo("Password kutusuna \"password\" yazilir");

        zeroPage.password.sendKeys(ConfigReader.getProperty("password"));
//5. Sign in tusuna basin
        ExtentReportsListener.extentTestInfo("Sign in tusuna basilir");

        zeroPage.singinButton.click();
        Driver.getDriver().navigate().back();
//6. Online banking menusu icinde Pay Bills sayfasina gidin başlığın Zero içerdiğini test edin
        ExtentReportsListener.extentTestInfo("Online banking menusu gidilir");


        zeroPage.onlineBanking.click();
        ExtentReportsListener.extentTestInfo("Pay Bills sayfasina gidilir");
        zeroPage.payBills.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Zero"));

//7. "Purchase Foreign Currency" tusuna basin
        ExtentReportsListener.extentTestInfo("\"Purchase Foreign Currency\" tusuna basilir");

        zeroPage.PurchaseForeignCurrency.click();
ReusableMethods.waitForSecond(3);
//8. "Currency" drop down menusunden Eurozone'u secin
        ExtentReportsListener.extentTestInfo("\"Currency\" drop down menusunden Eurozone seçilir");

        ReusableMethods.ddmVisibleText(zeroPage.currency,"Eurozone (euro)");
//9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        ExtentReportsListener.extentTestInfo("\"Eurozone (Euro)\" secildigini test edilir");

        Assert.assertTrue(zeroPage.currency.getText().contains("Eurozone (euro)"));
        
//10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test

        Select select=new Select(zeroPage.currency);
        List<WebElement> options = select.getOptions();
        List<String> dde= new ArrayList<>(Arrays.asList("Select One", "Australia (dollar)", "Canada (dollar)","Switzerland",
                "(franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain",
                "(pound)","Hong Kong (dollar)","Japan (yen)","Measdxico (peso)","Norway",
                "(krone)","New Zealand (dollar)","Swede (krona)","Singapore",
                "(dollar)","Thailand (baht)"));
     List<String> a=new ArrayList<>();
        options.stream().map(t->t.getText()).forEach(t-> a.add(t));
      //  dde.stream().forEach(t-> System.out.println(t));

       // System.out.println(" a  : "+ a);

        for (String w:a){
            for (String y:dde){
         softAssert.assertTrue(w.contains(y),y+" elementi listede yok...");
        }}


        ExtentReportsListener.extentTestPass("Test geçti");

        //edin ("Select One", "Australia (dollar)", "Canada (dollar)","Switzerland
//(franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain
//(pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway
//(krone)","New Zealand (dollar)","Sweden (krona)","Singapore
//(dollar)","Thailand (baht)")


    }

}
