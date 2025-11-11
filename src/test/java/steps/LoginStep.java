package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginStep extends BaseStep {
    public LoginStep(WebDriver driver) {
        super(driver);
    }

    @Test
    public void login(){
        loginPage.getEmailInput().sendKeys("");
    }


}
