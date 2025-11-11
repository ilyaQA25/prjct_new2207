package baseEntities;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import services.WaitService;
import services.WaitService;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WaitService waitServices;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        waitServices = new WaitService(driver, Duration.ofSeconds(ReadProperties.timeout()));
    }

    protected abstract By getPageIdentifier();

    public boolean isPageOpened() {
        return waitServices.waitForExists(getPageIdentifier()).isDisplayed();
    }

    public void openPageByUrl(String pagePath)  {
        driver.get(ReadProperties.getUrl() + pagePath);
    }
}
