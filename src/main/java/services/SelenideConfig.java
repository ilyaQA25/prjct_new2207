package services;

import com.codeborne.selenide.Configuration;
import configuration.ReadProperties;


public class SelenideConfig {

    public static void setup() {
        Configuration.browser = ReadProperties.browserName();
        Configuration.baseUrl = ReadProperties.getUrl();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1366x768";

    }

}
