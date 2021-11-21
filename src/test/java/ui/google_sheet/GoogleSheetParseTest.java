package ui.google_sheet;

import helper.GoogleSheetParser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.AbstractBaseTest;

import static com.codeborne.selenide.Selenide.open;

public class GoogleSheetParseTest extends AbstractBaseTest {
    private final String googleSearchUrl = "https://www.google.com/";
    private final String textForGoogleSearch = "";
    private final String textForGoogleSearchResult = "";
    private final String sheetId = "";
    private final String range = "";

    @BeforeMethod
    public void openUrl() {
        GoogleSheetParser.getGoogleSheetValue(sheetId, range);
        open(googleSearchUrl);
        googleSearchPage.clickButtonAcceptCookies();
    }

    @Test
    public void checkGoogleSearchResults() {
        googleSearchPage.fillInputSearch(textForGoogleSearch);
        googleSearchPage.clickButtonSearch();
        googleSearchResultPage.countSearchResults();
        googleSearchResultPage.checkEachResultForText(textForGoogleSearchResult);
    }
}
