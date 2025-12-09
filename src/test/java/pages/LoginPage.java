package pages;

import com.codeborne.selenide.SelenideElement;
import configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private SelenideElement usernameInput = $("#user-name");
    private SelenideElement passwordInput = $("#password");
    private SelenideElement loginButton   = $("#login-button");

    public LoginPage openPage() {
        open("https://www.saucedemo.com/");
        return this;
    }

    public void login(String username, String password) {
        usernameInput.setValue(username);
        passwordInput.setValue(password);
        loginButton.click();
    }
}
