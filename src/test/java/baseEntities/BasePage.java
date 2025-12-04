package baseEntities;
import com.codeborne.selenide.SelenideElement;
import configuration.ReadProperties;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage {
    protected abstract SelenideElement getPageIdentifier();

    public boolean isPageOpened() {
        return getPageIdentifier().shouldBe(visible).isDisplayed();
    }

    public void openPageByUrl(String pagePath) {
        open(pagePath);
    }
}
