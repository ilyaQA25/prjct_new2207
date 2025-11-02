package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class CssSelectors {
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
    public void cssSelectorTest(){
        driver.get("https://sst.by/");
        WebElement search = driver.findElement(By.cssSelector("input[placeholder='Поиск товаров']"));
        search.clear();
        search.sendKeys("грифы");
        WebElement loopa = driver.findElement(By.cssSelector("button[class='header-search-btn']"));
        loopa.click();

    }
}
