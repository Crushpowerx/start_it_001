package pages.google.actions;

import io.qameta.allure.Step;
import pages.google.locators.GoogleSearchResultPageLocators;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchResultPageActions extends GoogleSearchResultPageLocators {
    private int amountOfResults = 0;

    @Step
    public void countSearchResults() {
        amountOfResults = $$(byXpath(resultTitle)).size();
    }

    @Step
    public void checkEachResultForText(String text) {
        for (int i = 1; i <= amountOfResults; i++) {
            if ($(byXpath(resultTitle + "[" + i + "]")).getText().equals(text)) {
                break;
            }
        }
    }
}
