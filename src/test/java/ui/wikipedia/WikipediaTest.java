package ui.wikipedia;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.AbstractBaseTest;

import static com.codeborne.selenide.Selenide.open;

public class WikipediaTest extends AbstractBaseTest {
    private final String url = "https://www.wikipedia.org/";

    @DataProvider
    public Object[][] languageCodes() {
        return new Object[][]{
                {"EN"}, {"JA"}, {"RU"}, {"IT"}, {"PT"}, {"ES"}, {"DE"}, {"ZH"}, {"FR"}, {"PL"}
        };
    }

    @BeforeMethod
    public void openUrl() {
        open(url);
    }

    @Test(dataProvider = "languageCodes")
    public void checkLanguages(String languageCode) {

    }

}
