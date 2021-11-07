package ui.it_platforma;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.AbstractBaseTest;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends AbstractBaseTest {
    private final String itPlatformaUrl = "https://it-platforma.website/";
    private final String userName = "AutotestUser";
    private final String userPassword = "Autotest777.test";


    @BeforeMethod
    public void openUrl() {
        open(itPlatformaUrl);
    }

    @Test
    public void checkLoginHappyPass() {
        mainPage.clickButtonSignIn();
        loginPage.fillInputLogin(userName);
        loginPage.fillInputPassword(userPassword);
        loginPage.clickButtonSubmit();
        myAccount.checkDashboardGreeting();
    }

}
