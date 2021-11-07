package pages.it_platforma.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MyAccountLocators {
    protected final SelenideElement dashboardGreeting = $(byXpath("//p[@class='tml-dashboard-greeting' " +
            "and text()='Привет, AutotestUser']"));
}
