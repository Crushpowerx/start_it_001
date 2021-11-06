package ui;

import config.Config;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.google.actions.GoogleSearchPageActions;
import pages.google.actions.GoogleSearchResultPageActions;
import pages.wikipedia.actions.WikipediaMainPageActions;

public abstract class AbstractBaseTest {
    private final Config config = new Config();
    public GoogleSearchPageActions googleSearchPage = new GoogleSearchPageActions();
    public GoogleSearchResultPageActions googleSearchResultPage = new GoogleSearchResultPageActions();
    public WikipediaMainPageActions wikipediaMainPage = new WikipediaMainPageActions();

    @BeforeClass
    @Parameters({"projectId", "country"})
    public void setUp(@Optional("2") String projectId, @Optional("UA") String country) {
        config.setUpConfig(projectId, country);
    }
}
