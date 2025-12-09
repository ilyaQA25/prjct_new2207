package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.page;

public class FullTest {
    @Test
    void login() {
        // создаёт и инициализирует PageObject
        LoginPage loginPage = page(LoginPage.class);

        loginPage.openPage().login("standard_user", "secret_sauce");
    }
    }


