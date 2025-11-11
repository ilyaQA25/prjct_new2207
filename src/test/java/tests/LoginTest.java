package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void succLogin(){
        Assert.assertTrue(loginStep.successLogin(ReadProperties.username(),ReadProperties.password()).isPageOpened());
    }
}
