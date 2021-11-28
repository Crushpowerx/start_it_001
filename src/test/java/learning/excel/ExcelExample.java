package learning.excel;

import helper.ExcelHelper;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelExample {
    private final String excelPath = "src/test/resources/users/users.xlsx";
    private final String userName = "AutotestUser";
    private final String userPassword = "Autotest777.test";

    @Test
    public void writeToExcelExample() throws IOException {
        ExcelHelper.prepareExcelFile(excelPath, "Sheet", "User name", "User password");
        ExcelHelper.writeToExistingExcelFile(excelPath, new Object[]{userName, userPassword});
    }

    @Test
    public void readFromExcelExample() throws IOException {
        for (Object object : ExcelHelper.parseExcel(excelPath)) {
            System.out.println(object);
        }
    }
}
