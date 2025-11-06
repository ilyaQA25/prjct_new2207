package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    public void Checkout() throws InterruptedException {
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

        //Thread.sleep(6000);

        WebElement labsBackPack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        labsBackPack.click();
        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart']"));

        WebElement cart = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        addToCart.click();
        cart.click();
        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));

        checkout.click();
        WebElement firstN = driver.findElement(By.xpath("//input[@id='first-name']"));
        WebElement lastN = driver.findElement(By.xpath("//input[@id='last-name']"));
        WebElement zip = driver.findElement(By.xpath("//input[@id='postal-code']"));
        firstN.sendKeys("Name");
        lastN.sendKeys("SurName");
        zip.sendKeys("2220345");

        WebElement continua = driver.findElement(By.xpath("//input[@id='continue']"));

        continua.click();

        WebElement finita = driver.findElement(By.xpath("//button[@id='finish']"));

        finita.click();
        WebElement backtoProducts = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backtoProducts.click();
        Thread.sleep(5000);
    }
}
