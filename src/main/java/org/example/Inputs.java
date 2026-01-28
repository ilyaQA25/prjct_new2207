package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Inputs {
    private WebDriver driver;
    private final By input = By.xpath("//input[@type='number']");



    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/inputs");
    }

    @Test
    public void inputs() throws InterruptedException {
        WebElement inputEl = driver.findElement(input);
        inputEl.sendKeys("12");
        inputEl.sendKeys(Keys.ARROW_UP);

        String actualValue = inputEl.getAttribute("value");
        String expectedValue = "13";


        Assert.assertEquals(expectedValue, actualValue);
    }

    @AfterTest
    public void close(){
        driver.quit();
    }
}
