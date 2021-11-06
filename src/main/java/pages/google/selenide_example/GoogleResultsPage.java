package pages.google.selenide_example;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleResultsPage {
    public ElementsCollection results() {
        return $$(byXpath("(//h3)"));
    }
}
