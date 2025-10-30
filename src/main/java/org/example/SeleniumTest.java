package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    void openSauce() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");


        WebElement name = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement button = driver.findElement(By.id("login-button"));
        name.sendKeys("standard_user");
        password.sendKeys("secret_sauce");

        button.click();
        Thread.sleep(5000);

        driver.quit();


    }
}


