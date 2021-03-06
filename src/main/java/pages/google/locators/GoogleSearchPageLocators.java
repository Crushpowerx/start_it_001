package pages.google.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPageLocators {
    protected final SelenideElement inputSearch = $(byXpath("//input[@name='q']"));
    protected final SelenideElement buttonAcceptCookies = $(byXpath("//button[@id='L2AGLb']"));
}
