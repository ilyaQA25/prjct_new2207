package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;

public class JustStuff {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
