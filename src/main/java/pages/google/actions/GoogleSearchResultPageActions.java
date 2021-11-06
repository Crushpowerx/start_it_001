package pages.google.actions;

import io.qameta.allure.Step;
import org.testng.Assert;
import pages.google.locators.GoogleSearchResultPageLocators;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchResultPageActions extends GoogleSearchResultPageLocators {
    private int amountOfResults = 0;
    private boolean testPassed = false;

    @Step
    public void countSearchResults() {
        amountOfResults = $$(byXpath(resultTitle)).size();
    }

    @Step
    public void checkEachResultForText(String text) {
        for (int i = 1; i <= amountOfResults; i++) {
            if ($(byXpath(resultTitle + "[" + i + "]")).getText().equals(text)) {
                testPassed = true;
                break;
            }
        }
        Assert.assertTrue(testPassed, "Text not found");
    }
}
