package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

import java.time.Duration;

import static configuration.ReadProperties.password;

public class ErrorTest {

    private WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }



    @Test()
    public void xpathErrorTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        WebElement uname = driver.findElement(By.id("user-name"));
        WebElement pass = driver.findElement(By.id("password"));
        WebElement loginButt = driver.findElement(By.id("login-button"));

        uname.sendKeys("username()");
        pass.sendKeys(password());
        loginButt.click();
        Thread.sleep(5000);

        WebElement errorMess = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3"))));




    }
}
