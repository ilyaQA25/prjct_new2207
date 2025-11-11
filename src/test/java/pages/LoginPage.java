package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    // Блок описания локаторов для элементов
    private final By username = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");
    //private By errorTextLocator = By.className("error-text");

    // Блок иницализации
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return username;
    }

    // Блок атомарных методов
    public WebElement getUsername() {
        return waitServices.waitForExists(username);
    }

    public WebElement getPswInput() {
        return waitServices.waitForExists(pswInputLocator);
    }

    public WebElement getLogInButton() {
        return waitServices.waitForExists(logInButtonLocator);
    }

    /*public WebElement getErrorTextElement() {
        return waitServices.waitForExists(errorTextLocator);
    }*/

    //методы



}
