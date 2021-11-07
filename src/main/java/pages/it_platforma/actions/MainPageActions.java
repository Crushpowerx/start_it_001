package pages.it_platforma.actions;

import io.qameta.allure.Step;
import logger.CustomLogger;
import pages.it_platforma.locators.MainPageLocators;

public class MainPageActions extends MainPageLocators {
    @Step
    public void clickButtonSignIn() {
        buttonSignIn.click();
        CustomLogger.logger.info("OK");
    }
}
