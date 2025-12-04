package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {
    private final SelenideElement homeLogo = $x("//*[@class='header__logo-wrap']");
    private final SelenideElement advertisement = $x("//span[text()='Объявления']");
    private final SelenideElement motoClass = $x("//a[text()='Мототехника']");

    @Override
    protected SelenideElement getPageIdentifier() {
        return homeLogo;
    }

    public HomePage open() {
        open();
        return this;
    }

    public MotoPage findMotocycle() {
        motoClass.hover().click();
        return new MotoPage();
    }

    public void selectVolvo() {
        $x("//button[@title='Марка']").click();
        $x("//*[@class='dropdown__input']").setValue("Volvo");
        $x("//button[text()='Volvo']").click();
        $x("//div/a[@href='https://cars.av.by/volvo']").click();
    }
}
