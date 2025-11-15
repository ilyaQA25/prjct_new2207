package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private final By homeLogo = By.xpath("//*[@class='header__logo-wrap']");
    private final By advertisement = By.xpath("//span[text()='Объявления']");
    private final By motoClass = By.xpath("//span[text()='Мототехника']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return homeLogo;
    }

    public WebElement getHomeLogo() {
        return waitServices.waitForExists(homeLogo);
    }

    public WebElement getAdvertisement(){
        return waitServices.waitForExists(advertisement);
    }

    public WebElement getMotoClass(){
        return waitServices.waitForExists(motoClass);
    }

    public MotoPage findMotocycle(){
        getAdvertisement().hover
    }
}
