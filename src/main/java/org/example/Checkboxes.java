package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Checkboxes {
    private WebDriver driver;
    private final By checkboxes = By.xpath("//form[@id='checkboxes']/input[@type='checkbox']");


    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }


    @Test
    public void checkUnCheck() throws InterruptedException {

        List<WebElement> groupOfcheckboxes = driver.findElements(checkboxes);

        WebElement firstCheckbox = groupOfcheckboxes.get(0);
        WebElement secondCheckbox = groupOfcheckboxes.get(1);

        Assert.assertFalse(firstCheckbox.isSelected());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(firstCheckbox));
        firstCheckbox.click();
        Assert.assertTrue(firstCheckbox.isSelected(),  "Первый чекбокс должен быть отмечен после клика.");

        Assert.assertTrue(secondCheckbox.isSelected());
        wait.until(ExpectedConditions.elementToBeClickable(secondCheckbox));
        secondCheckbox.click();
        Assert.assertFalse(secondCheckbox.isSelected());


       /* Assert.assertTrue(groupOfcheckboxes.get(1).isSelected());
        groupOfcheckboxes.get(1).click();

        Assert.assertFalse(groupOfcheckboxes.get(1).isSelected());*/

    }


    @AfterTest
    public void close(){
        driver.quit();
    }
}
