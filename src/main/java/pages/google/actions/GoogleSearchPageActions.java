package pages.google.actions;

import io.qameta.allure.Step;
import logger.CustomLogger;
import pages.google.locators.GoogleSearchPageLocators;

public class GoogleSearchPageActions extends GoogleSearchPageLocators {

    @Step
    public void fillInputSearch(String text) {
        inputSearch.sendKeys(text);
        CustomLogger.logger.info(text);
    }

    @Step
    public void clickButtonSearch() {
        buttonSearch.click();
        CustomLogger.logger.info("ok");
    }
}
