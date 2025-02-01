package techproed.tests.day20_excel_dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C04_DataProvider {

    @DataProvider
    public static Object[][] isimler() {
        return new Object[][]{
                {"Tuba",90,true},
                {"Mustafa",80,true},
                {"Muhammed",100,true},
                {"Evren",80,false}
        };
    }
    @Test(dataProvider ="isimler" )
    public void test01(String data,Integer point,Boolean isSucces) {
        System.out.print(data+" ");
        System.out.print(point+" ");
        System.out.println(isSucces);

    }





}
