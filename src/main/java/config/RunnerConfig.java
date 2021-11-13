package config;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

public class RunnerConfig {

    @Step
    public void setUpConfig(String projectId, String country, boolean useSelenoid) {
        System.out.println("projectId: " + projectId);
        System.out.println("country: " + country);
        Configuration.pageLoadTimeout = 20000;
        Configuration.downloadsFolder = "target/build/downloads";
        Configuration.reportsFolder = "target/screenshots";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "Chrome";
        Configuration.browserVersion = "95";
        if (useSelenoid) {
            Configuration.remote = "http://localhost:4444/wd/hub";
            Configuration.browserCapabilities.setCapability("enableVNC", false);
            Configuration.browserCapabilities.setCapability("enableVideo", false);
        }
    }
}
