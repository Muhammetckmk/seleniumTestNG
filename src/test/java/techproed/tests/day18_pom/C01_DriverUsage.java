package techproed.tests.day18_pom;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C01_DriverUsage {
    @Test(groups = "smoke")
    public void test01() {


        Driver.getDriver().get("https://techproeducation.com");
        System.out.println(Driver.getDriver().getTitle());
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.closeDriver();

        Driver.getDriver().get("https://techproeducation.com");
        System.out.println(Driver.getDriver().getTitle());
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.closeDriver();

//        Driver driver= new Driver();
//        driver.getDriver().get("https://google.com");





    }
}
