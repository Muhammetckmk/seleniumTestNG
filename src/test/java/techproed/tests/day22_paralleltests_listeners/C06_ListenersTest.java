package techproed.tests.day22_paralleltests_listeners;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class C06_ListenersTest {

    @Test(retryAnalyzer = techproed.utilities.Listeners.class)
    public void test01() {
        System.out.println("test01 PASS");
        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer = techproed.utilities.Listeners.class)
    public void test02() {
        System.out.println("test02 FAIL");
        Assert.assertTrue(false);
    }


}
