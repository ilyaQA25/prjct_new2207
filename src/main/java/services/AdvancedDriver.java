package services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdvancedDriver {

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        return new ChromeDriver(getChromeOptions());
    }

    public ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--silent");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-plugins");
        chromeOptions.addArguments("--disable-features=AutofillServerCommunication");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-extensions");
        //chromeOptions.addArguments("--user-data-dir=/path/to/new/temp/profile");
        //chromeOptions.addArguments("--headless");

        return chromeOptions;
    }
}