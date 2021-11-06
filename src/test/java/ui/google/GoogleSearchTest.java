package ui.google;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.google.selenide_example.GoogleResultsPage;
import pages.google.selenide_example.GoogleSearchPage;
import ui.AbstractBaseTest;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTest extends AbstractBaseTest {
    private final String googleSearchUrl = "https://www.google.com/";
    private final String textForGoogleSearch = "Юрий Смирнов бильярд видео";
    private final String textForGoogleSearchResult = "Кубок Киева. Финал. Павел Радионов - Юрий Смирнов";

    @BeforeMethod
    public void openUrl() {
        open(googleSearchUrl);
    }

    @Test
    public void checkGoogleSearchResults() {
        googleSearchPage.fillInputSearch(textForGoogleSearch);
        googleSearchPage.clickButtonSearch();
        googleSearchResultPage.countSearchResults();
        googleSearchResultPage.checkEachResultForText(textForGoogleSearchResult);
    }

    @Test
    public void testWithPageObjectSelenideExample() {
        GoogleSearchPage searchPage = open(googleSearchUrl, GoogleSearchPage.class);
        GoogleResultsPage resultsPage = searchPage.search("selenide");
        resultsPage.results().shouldHave(size(13));
        resultsPage.results().get(1).shouldHave(text("Selenide: Concise UI Tests in Java"));
    }

}
