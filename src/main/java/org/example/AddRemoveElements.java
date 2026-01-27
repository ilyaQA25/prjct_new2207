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

public class AddRemoveElements {
    private WebDriver driver;
    private final By addButton = By.xpath("//div/button");
    private final By deleteButton = By.xpath("//button[@onclick='deleteElement()']");


    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    @Test
    public void addRemoveTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement addElementButton = driver.findElement(addButton);

        addElementButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(deleteButton, 1));

        addElementButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(deleteButton, 2));

        List<WebElement> deleteButtonsList = driver.findElements(deleteButton);
        Assert.assertEquals(deleteButtonsList.size(), 2, "must be 2 delete buttons");

        deleteButtonsList.get(1).click();
        wait.until(ExpectedConditions.numberOfElementsToBe(deleteButton,1));

        List<WebElement> remainingDeleteButtons = driver.findElements(deleteButton);
        Assert.assertEquals(remainingDeleteButtons.size(), 1, "1 delete button");
    }

    @AfterTest
    public void close(){
        driver.quit();
    }
}