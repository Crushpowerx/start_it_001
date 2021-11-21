package pages.google.actions;

import io.qameta.allure.Step;
import logger.CustomLogger;
import org.openqa.selenium.Keys;
import pages.google.locators.GoogleSearchPageLocators;

public class GoogleSearchPageActions extends GoogleSearchPageLocators {

    @Step
    public void fillInputSearch(String text) {
        inputSearch.sendKeys(text, Keys.ENTER);
        CustomLogger.logger.info(text);
    }

    @Step
    public void clickButtonAcceptCookies() {
        if (buttonAcceptCookies.isDisplayed()) {
            buttonAcceptCookies.click();
        }

    }
}
