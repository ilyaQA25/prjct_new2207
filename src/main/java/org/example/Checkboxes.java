package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
        driver.get("https://the-internet.herokuapp.com/dropdown");
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


    }

    @Test
    public void dropdown() throws InterruptedException {
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(dropdownElement);
        select.selectByVisibleText("Option 1");
        select.selectByVisibleText("Option 2");
        Thread.sleep(5000);

        WebElement selectedOption = select.getFirstSelectedOption();


        // 3. Ассерт на то, что выбрана именно "Option 1"
        Assert.assertEquals(selectedOption.getText(), "Option 2", "Опция 'Option 1' не была выбрана или не отображается!");
        System.out.println("Тест пройден: Успешно выбрана и проверена опция: '" + selectedOption.getText() + "'");

    }


    @AfterTest
    public void close(){
        driver.quit();
    }
}
