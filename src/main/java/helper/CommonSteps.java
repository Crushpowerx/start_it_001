package helper;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import logger.CustomLogger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;

public class CommonSteps {
    private static final SelenideElement bodyOfPageWithIP = $(byXpath("//body"));

    @Step
    public static String getCountryCodeByIp() {
        open("https://ipinfo.io/json");
        sleep(1000);
        String response = bodyOfPageWithIP.getText();
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject responseAsJsonObject = (JSONObject) jsonParser.parse(response);
            String countryCode = responseAsJsonObject.get("country").toString();
            CustomLogger.logger.info(countryCode);
            return countryCode;
        } catch (ParseException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
        return null;
    }

    @Step
    public static void checkGeoLocationInBrowser(String country) {
        String countryCode = "";
        for (int i = 0; i < 20; i++) {
            try {
                countryCode = getCountryCodeByIp();
                if (countryCode != null) {
                    break;
                }
            } catch (WebDriverException e) {
                Selenide.closeWebDriver();
                sleep(5000);
                countryCode = getCountryCodeByIp();
            }
        }
        getAndAttachScreenshot();
        if (countryCode != null && countryCode.equals(country)) {
            CustomLogger.logger.info("Test geolocation by ip passed: " + countryCode + " equals " + country);
        } else {
            if (country != null && !country.isEmpty()) {
                Assert.fail("Test geolocation by ip failed: " + countryCode + " not equals " + country + "\n" +
                        bodyOfPageWithIP.getText());
            } else {
                CustomLogger.logger.info(bodyOfPageWithIP.getText());
            }
        }
    }

    @Step
    public static void checkUrl(String mustContains, int timeOutSec) {
        boolean testPassed = false;
        for (int i = 0; i < timeOutSec * 2; i++) {
            if (url().contains(mustContains)) {
                testPassed = true;
                getAndAttachScreenshot();
                break;
            } else {
                sleep(500);
            }
        }
        if (!testPassed) {
            getAndAttachScreenshot();
            Assert.fail("Actual URL: " + url() + "\n" + "Expected URL: " + mustContains);
        }
    }

    @SuppressWarnings("UnusedReturnValue")
    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] getAndAttachScreenshot() {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
