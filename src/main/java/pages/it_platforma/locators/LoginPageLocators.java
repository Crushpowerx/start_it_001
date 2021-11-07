package pages.it_platforma.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPageLocators {
    protected final SelenideElement fieldLogin = $(byXpath("//input[@id='user_login']"));
    protected final SelenideElement fieldPassword = $(byXpath("//input[@id='user_pass']"));
    protected final SelenideElement buttonSubmit = $(byXpath("//button[text()='Войти']"));




}
