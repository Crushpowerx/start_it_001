package ui.google;

import org.testng.annotations.Test;
import ui.AbstractBaseTest;

import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTest extends AbstractBaseTest {
    private final String googleSearchUrl = "https://www.google.com/";
    private final String textForGoogleSearch = "Юрий Смирнов бильярд видео";
    private final String textForGoogleSearchResult = "Кубок Киева. Финал. Павел Радионов - Юрий Смирнов";

    @Test
    public void checkGoogleSearchResults() {
        open(googleSearchUrl);
        googleSearchPage.fillInputSearch(textForGoogleSearch);
        googleSearchPage.clickButtonSearch();
        googleSearchResultPage.countSearchResults();
    }

}
