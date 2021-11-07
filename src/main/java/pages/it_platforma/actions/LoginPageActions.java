package pages.it_platforma.actions;

import io.qameta.allure.Step;
import logger.CustomLogger;
import pages.it_platforma.locators.LoginPageLocators;

public class LoginPageActions extends LoginPageLocators {
    @Step
    public void fillInputLogin(String text) {
        fieldLogin.sendKeys(text);
        CustomLogger.logger.info(text);
    }

    @Step
    public void fillInputPassword(String text) {
        fieldPassword.sendKeys(text);
        CustomLogger.logger.info(text);
    }

    @Step
    public void clickButtonSubmit() {
        buttonSubmit.click();
        CustomLogger.logger.info("OK");
    }
}
