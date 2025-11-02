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

public class TestsfromPresentation5 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }

    @Test
    public void weightTest(){
        driver.get("https://calc.by/weight-and-calories/body-mass-index-calculator.html");
        WebElement height = driver.findElement(By.id("bmiVar1"));
        /*WebElement buttonCalc = driver.findElement(By.className("calc-btn"));
        WebElement bodymass  = driver.findElement(By.id("bmiVar2"));*/
        height.sendKeys("123");
        /*bodymass.sendKeys("345");
        buttonCalc.click();*/

    }

    @Test
    public void gymEqipment(){
        driver.get("https://sst.by/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement bannerImage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='banner-image-low-04']")));
        bannerImage.click();
    }
}
