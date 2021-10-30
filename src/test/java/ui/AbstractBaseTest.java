package ui;

import org.testng.annotations.BeforeMethod;
import pages.google.actions.GoogleSearchPageActions;
import pages.google.actions.GoogleSearchResultPageActions;

public abstract class AbstractBaseTest {
    public GoogleSearchPageActions googleSearchPage = new GoogleSearchPageActions();
    public GoogleSearchResultPageActions googleSearchResultPage = new GoogleSearchResultPageActions();

    @BeforeMethod
    public void setUp() {
        System.out.println("Before method");
    }
}
