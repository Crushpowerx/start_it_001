package pages.google.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPageLocators {
    protected final SelenideElement inputSearch = $(byXpath("//input[@title='Поиск']"));
    protected final String buttonSearch = "(//input[@value='Поиск в Google'])";
}
