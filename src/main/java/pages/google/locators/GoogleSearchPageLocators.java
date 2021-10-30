package pages.google.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPageLocators {
    public final SelenideElement inputSearch = $(byXpath("//input[@title='Поиск']"));
    public final String buttonSearch = "(//input[@value='Поиск в Google'])";
}
