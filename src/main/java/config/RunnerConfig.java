package config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import logger.CustomLogger;

import static global.Global.globalModeDebug;

public class RunnerConfig {

    @Step
    public void setUpConfig(
            String projectId,
            String browser,
            String browserVersion
    ) {
        System.out.println("projectId: " + projectId);
        Configuration.pageLoadTimeout = 20000;
        Configuration.downloadsFolder = "target/build/downloads";
        Configuration.reportsFolder = "target/screenshots";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = browser;
        Configuration.browserVersion = browserVersion;
        if (!globalModeDebug) {
            Configuration.remote = "http://localhost:4444/wd/hub";
            Configuration.browserCapabilities.setCapability("enableVNC", false);
            Configuration.browserCapabilities.setCapability("enableVideo", false);
        }
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        CustomLogger.logger.info("ok");
    }
}
