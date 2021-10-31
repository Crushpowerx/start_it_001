package ui;

import config.Config;
import org.testng.annotations.BeforeClass;
import pages.google.actions.GoogleSearchPageActions;
import pages.google.actions.GoogleSearchResultPageActions;

public abstract class AbstractBaseTest {
    private final Config config = new Config();
    public GoogleSearchPageActions googleSearchPage = new GoogleSearchPageActions();
    public GoogleSearchResultPageActions googleSearchResultPage = new GoogleSearchResultPageActions();

    @BeforeClass
    public void setUp() {
        config.setUpConfig();
    }
}
