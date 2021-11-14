package pages.google.actions;

import io.qameta.allure.Step;
import logger.CustomLogger;
import pages.google.locators.GoogleSearchPageLocators;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class GoogleSearchPageActions extends GoogleSearchPageLocators {

    @Step
    public void fillInputSearch(String text) {
        inputSearch.sendKeys(text);
        CustomLogger.logger.info(text);
    }

    @Step
    public void clickButtonSearch() {
        for (int i = 0; i < 4; i++) {
            if ($(byXpath(buttonSearch)).isDisplayed()) {
                $(byXpath(buttonSearch)).click();
                break;
            } else if ($(byXpath(buttonSearch + "[2]")).isDisplayed()) {
                $(byXpath(buttonSearch + "[2]")).click();
                break;
            } else {
                sleep(1000);
            }
        }
        CustomLogger.logger.info("ok");
    }

    @Step
    public void clickButtonAcceptCookies() {
        if (buttonAcceptCookies.isDisplayed()) {
            buttonAcceptCookies.click();
        }

    }
}
