package ui.google_sheet;

import helper.GoogleSheetParser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.AbstractBaseTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;

public class GoogleSheetParseTest extends AbstractBaseTest {
    private final String googleSearchUrl = "https://www.google.com/";
    private final String sheetId = "1MdJVmsI1BAQUllLVX8lu4g4uPjbgrFOUN8AcccWvp3U";
    private final String range = "Sheet1!A2:B10";

    @DataProvider
    public Iterator<Object[]> testData() {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        List<List<Object>> lists = GoogleSheetParser.getGoogleSheetValue(sheetId, range);
        for (List<Object> list : Objects.requireNonNull(lists)) {
            Object[] objects = list.toArray();
            arrayList.add(objects);
        }
        return arrayList.iterator();
    }

    @BeforeMethod
    public void openUrl() {
        open(googleSearchUrl);
        googleSearchPage.clickButtonAcceptCookies();
    }

    @Test(dataProvider = "testData")
    public void checkGoogleSearchResults(String googleSearchText, String googleSearchResultText) {
        googleSearchPage.fillInputSearch(googleSearchText);
        googleSearchResultPage.countSearchResults();
        googleSearchResultPage.checkEachResultForText(googleSearchResultText);
    }
}
