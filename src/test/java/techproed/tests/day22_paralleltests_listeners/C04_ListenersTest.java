package techproed.tests.day22_paralleltests_listeners;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(techproed.utilities.Listeners.class)
public class C04_ListenersTest {
    @Test
    public void test01() {
        System.out.println("test01 PASS");
        Assert.assertTrue(true);
    }

    @Test
    public void test02() {
        System.out.println("test02 FAIL");
        Assert.assertTrue(false);
    }

    @Test
    public void test03() {
        System.out.println("test03 SKIP");
        throw new SkipException(" Test atlandi ");
    }

    @Test
    public void test04() {
        System.out.println("test04 EXCEPTION");
        throw new NoSuchElementException("No Such Element");
    }
}
