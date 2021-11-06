package pages.wikipedia.actions;

import io.qameta.allure.Step;
import logger.CustomLogger;
import pages.wikipedia.locators.WikipediaMainPageLocators;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class WikipediaMainPageActions extends WikipediaMainPageLocators {

    @Step
    public void pressButtonWithLanguage(String languageCode) {
        $(byXpath(prepareLanguageButtonXPath + transformLanguageCodeToLanguage(languageCode) + "']")).click();
        CustomLogger.logger.info(languageCode + " - ok");
    }

    @Step
    private String transformLanguageCodeToLanguage(String languageCode) {
        switch (languageCode) {
            case "EN":
                return "English";
            case "JA":
                return "日本語";
            case "RU":
                return "Русский";
            case "IT":
                return "Italiano";
            case "PT":
                return "Português";
            case "ES":
                return "Español";
            case "DE":
                return "Deutsch";
            case "ZH":
                return "中文";
            case "FR":
                return "Français";
            case "PL":
                return "Polski";
        }
        return null;
    }

}
