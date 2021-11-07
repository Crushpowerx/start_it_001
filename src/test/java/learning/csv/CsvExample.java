package learning.csv;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Iterator;

import static helper.CsvHelper.parseCsv;
import static helper.CsvHelper.writeToCsv;

public class CsvExample {
    private final String csvPath = "src/test/resources/users.csv";
    private final String userName = "AutotestUser";
    private final String userPassword = "Autotest777.test";

    @DataProvider
    public Iterator<Object[]> users() throws IOException {
        return parseCsv(csvPath);
    }

    @Test
    public void writeToCsvExample() throws IOException {
        writeToCsv(csvPath, userName, userPassword);
    }

    @Test(dataProvider = "users")
    public void readCsvExample(String var1, String var2) {
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
    }
}
