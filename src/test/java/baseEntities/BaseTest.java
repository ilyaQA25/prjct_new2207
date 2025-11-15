package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import services.BrowsersService;


public class BaseTest {
    protected WebDriver driver;

    protected HomePage homePage;


    @BeforeMethod
    public void setup() {
        driver = new BrowsersService().getDriver();


        homePage = new HomePage(driver);

        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

