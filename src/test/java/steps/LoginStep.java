package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CatalogPage;

public class LoginStep extends BaseStep {

    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String psw){
        loginPage.getUsername().sendKeys(username);
        loginPage.getPswInput().sendKeys(psw);
        loginPage.getLogInButton().click();

    }

    public CatalogPage successLogin(String email, String psw) {
        login(email, psw);

        return catalogPage;
    }

}
