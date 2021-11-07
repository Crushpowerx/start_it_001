package pages.it_platforma.actions;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import logger.CustomLogger;
import pages.it_platforma.locators.MyAccountLocators;

import static helper.CommonSteps.getAndAttachScreenshot;

public class MyAccountActions extends MyAccountLocators {
    @Step
    public void checkDashboardGreeting() {
        dashboardGreeting.shouldBe(Condition.visible);
        getAndAttachScreenshot();
        CustomLogger.logger.info("OK");
    }
}
