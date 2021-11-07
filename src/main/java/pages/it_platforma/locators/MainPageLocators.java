package pages.it_platforma.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPageLocators {
    protected final SelenideElement buttonSignIn = $(byXpath("//span[text()='Sign in']"));
}
