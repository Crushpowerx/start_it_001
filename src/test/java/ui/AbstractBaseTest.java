package ui;

import org.testng.annotations.BeforeMethod;
import pages.google.actions.GoogleSearchPageActions;

public abstract class AbstractBaseTest {
    public GoogleSearchPageActions googleSearchPage = new GoogleSearchPageActions();

    @BeforeMethod
    public void setUp() {
        System.out.println("Before method");
    }
}
