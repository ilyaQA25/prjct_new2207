package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MotoPage extends BasePage {
    private final By motocycle = By.xpath("//a[@href='/bike']");

    public MotoPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return motocycle;
    }


}
