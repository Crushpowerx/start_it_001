package pages.google.actions;

import io.qameta.allure.Step;
import logger.CustomLogger;
import org.testng.Assert;
import pages.google.locators.GoogleSearchResultPageLocators;

import java.util.Objects;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static global.Global.globalCountryCode;
import static helper.CommonSteps.getAndAttachScreenshot;

public class GoogleSearchResultPageActions extends GoogleSearchResultPageLocators {
    private int amountOfResults = 0;

    @Step
    public void countSearchResults() {
        amountOfResults = $$(byXpath(resultTitleH3)).size();
        CustomLogger.logger.info(amountOfResults);
    }

    @Step
    public void checkEachResultForText(String text) {
        boolean testPassed = false;
        String resultTitle = "";
        switch (Objects.requireNonNull(globalCountryCode)) {
            case "UA":
            case "PL":
                resultTitle = resultTitleH3;
                break;
            case "RU":
                resultTitle = resultTitleDiv;
                break;
            default:
                Assert.fail("Country code " + globalCountryCode + " not found!");
        }
        for (int i = 1; i <= amountOfResults; i++) {
            if ($(byXpath(resultTitle + "[" + i + "]")).getText().equals(text)) {
                testPassed = true;
                CustomLogger.logger.info("'" + text + "' - text present in title with index " + i);
                break;
            }
        }
        getAndAttachScreenshot();
        Assert.assertTrue(testPassed, "Text '" + text + "' not found");
    }
}
