package tests;


import org.testng.annotations.Test;
import pages.LoginPage;

public class FullTest {
    LoginPage loginPage;
    @Test
    public void login(){
        loginPage.open("https://www.saucedemo.com/");
    }
    }


