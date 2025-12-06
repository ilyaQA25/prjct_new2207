package pages;

import com.codeborne.selenide.SelenideElement;
import configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement usernameInput = $("#user-name");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginButton   = $("#login-button");

    public void open(String url){
        open("https://www.saucedemo.com/");
        usernameInput.setValue(ReadProperties.username());
        passwordInput.setValue(ReadProperties.password());
        loginButton.click();
    }
}
