package config;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

public class Config {

    @Step
    public void setUpConfig(String projectId, String country) {
        System.out.println("projectId: " + projectId);
        System.out.println("country: " + country);
        Configuration.pageLoadTimeout = 20000;
        Configuration.downloadsFolder = "target/build/downloads";
        Configuration.reportsFolder = "target/screenshots";
        Configuration.browserSize = "1920x1080";
    }
}
