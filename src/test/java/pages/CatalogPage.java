package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage extends BasePage {
    // Блок описания локаторов для элементов
    private final By backPack = By.id("name");


    // Блок иницализации
    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return backPack;
    }

    public WebElement getBackPack() {
        return waitServices.waitForExists(backPack);
    }
}
