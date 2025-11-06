package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class Xpath {

    private WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void xpathTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        //Assert.assertTrue(driver.findElement(By.xpath("(//input[@name='user-name']")).isDisplayed());
        WebElement name = driver.findElement(By.xpath("//input[@name='user-name']"));
        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        name.clear();
        pass.clear();

        name.sendKeys("standard_user");
        pass.sendKeys("secret_sauce");
        loginButton.click();
        Thread.sleep(5000);



    }
}
