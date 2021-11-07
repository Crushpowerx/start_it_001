package learning.excel;

import org.testng.annotations.Test;

import java.io.IOException;

import static helper.ExcelHelper.*;

public class ExcelExample {
    private final String excelPath = "src/test/resources/users.xls";
    private final String userName = "AutotestUser";
    private final String userPassword = "Autotest777.test";

    @Test
    public void writeToExcelExample() throws IOException {
        prepareExcelFile(excelPath, "Sheet", "User name", "User password");
        writeToExistingExcelFile(excelPath, new Object[]{userName, userPassword});
    }

    @Test
    public void readFromExcelExample() throws IOException {
        for (Object object : parseExcel(excelPath)) {
            System.out.println(object);
        }
    }
}
