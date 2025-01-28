package techproed.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
    Driver i her cagirdigimizda yeni bir pencere acmammasi icin bir if bloğu ile ayarlama yaptik
    if(driver==null) ile eger driver a deger atanmamis ise driver i baslat dedik, driver acik iken tekrar cagrilirsa
    driver a deger atanmis oldugu icin if block calismayacak ve dolayisiyla bu method mevcut driver i tekar return edecek
    Böylece ayni driver uzerinden test senaryolarimiza devam edebileceğiz
    */
    static WebDriver driver;

    private Driver(){
        //Singleton Pattern (Tekli kullanim) icin default constructoru
        // private yaparak object olusturulmasini engelledik
    }

    public static WebDriver getDriver(){
        if(driver==null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }

    }


}
