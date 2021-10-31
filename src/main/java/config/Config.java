package config;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

public class Config {

    @Step
    public void setUpConfig() {
        Configuration.timeout = 20000;
        Configuration.pageLoadTimeout = 20000;
        Configuration.downloadsFolder = "target/build/downloads";
        Configuration.reportsFolder = "target/screenshots";
    }
}
