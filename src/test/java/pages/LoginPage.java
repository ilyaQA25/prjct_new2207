package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By username = By.id("user-name");
    private By passw = By.id("password");
    private By logButton = By.id("login-button");

    public LoginPage(WebDriver driver){
        super(driver);
    }



}
