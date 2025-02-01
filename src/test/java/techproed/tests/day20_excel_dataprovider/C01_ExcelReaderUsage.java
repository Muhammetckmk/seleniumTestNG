package techproed.tests.day20_excel_dataprovider;

import org.testng.annotations.Test;
import techproed.utilities.ExcelReader;

public class C01_ExcelReaderUsage {

    @Test
    public void testName() {
        String dosyaYolu="src/test/java/techproed/resources/smoketestdata.xlsx";
        String sayfaIsmi="Sayfa1";
        ExcelReader excelReader=new ExcelReader(dosyaYolu,sayfaIsmi);
        String email = excelReader.getCellData(3, 0);
        String password = excelReader.getCellData(3, 1);
        System.out.println("email = " + email);
        System.out.println("password = " + password);
    }
}
