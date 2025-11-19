package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    private final By homeLogo = By.xpath("//*[@class='header__logo-wrap']");
    private final By advertisement = By.xpath("//span[text()='Объявления']");
    private final By motoClass = By.xpath("//a[text()='Мототехника']");
    private MotoPage motoPage;
    //
    private final By marksDropdown = By.xpath("//button[@title='Марка']");
    private final By searchInDropdown = By.xpath("//*[@class='dropdown__input']");
    private final By dropdownModels = By.xpath("//span[text()='Модель']");
    private final By volvoInDropDown = By.xpath("//button[text()='Volvo']");
    private final By showButton = By.xpath("//div/a[@href='https://cars.av.by/volvo']");




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

    public WebElement getShowButton(){
        return waitServices.waitForExists(showButton);
    }

    public WebElement getVolvoInDropDown(){
        return waitServices.waitForExists(volvoInDropDown);
    }

    public WebElement getDropdownModels(){
        return waitServices.waitForExists(dropdownModels);
    }

    public WebElement getSearchInDropdown(){
        return waitServices.waitForExists(searchInDropdown);
    }

    public WebElement getMarksDropdown(){
        return waitServices.waitForExists(marksDropdown);
    }

    public WebElement getAdvertisement(){
        return waitServices.waitForExists(advertisement);
    }

    public WebElement getMotoClass(){
        return waitServices.waitForExists(motoClass);
    }

    public MotoPage findMotocycle(){
        WebElement moto = getMotoClass();
        new Actions(driver).moveToElement(moto).perform();
        moto.click();
        motoPage = new MotoPage(driver);
        return motoPage;
    }

    public void selectVolvo() throws InterruptedException {
        WebElement markDropdown = getMarksDropdown();
        markDropdown.click();
        getSearchInDropdown().sendKeys("Volvo");
        getVolvoInDropDown().click();
        getShowButton().click();
        Thread.sleep(5000);
        /*getDropdownModels().click();
        getSearchInDropdown().sendKeys("S90");*/
    }
}
