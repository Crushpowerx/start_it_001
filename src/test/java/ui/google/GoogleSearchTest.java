package ui.google;

import listener.CustomListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.AbstractBaseTest;

import static com.codeborne.selenide.Selenide.open;

@Listeners(CustomListener.class)
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
        googleSearchResultPage.checkEachResultForText(textForGoogleSearchResult);
    }

}
