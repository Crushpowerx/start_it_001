package ui;

import config.RunnerConfig;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.google.actions.GoogleSearchPageActions;
import pages.google.actions.GoogleSearchResultPageActions;
import pages.it_platforma.actions.LoginPageActions;
import pages.it_platforma.actions.MainPageActions;
import pages.it_platforma.actions.MyAccountActions;
import pages.wikipedia.actions.WikipediaMainPageActions;

import static global.Global.globalCountryCode;
import static helper.CommonSteps.getCountryCodeByIp;

public abstract class AbstractBaseTest {
    private final RunnerConfig config = new RunnerConfig();
    public GoogleSearchPageActions googleSearchPage = new GoogleSearchPageActions();
    public GoogleSearchResultPageActions googleSearchResultPage = new GoogleSearchResultPageActions();
    public WikipediaMainPageActions wikipediaMainPage = new WikipediaMainPageActions();
    public LoginPageActions loginPage = new LoginPageActions();
    public MainPageActions mainPage = new MainPageActions();
    public MyAccountActions myAccount = new MyAccountActions();

    @BeforeClass
    @Parameters({"projectId", "browser", "browserVersion"})
    public void setUp(
            @Optional("2") String projectId,
            @Optional("Firefox") String browser,
            @Optional("94") String browserVersion
    ) {
        config.setUpConfig(projectId, browser, browserVersion, true);
        globalCountryCode = getCountryCodeByIp(browser);
    }
}
