package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class MotoPage extends BasePage {
    private final SelenideElement motocycle = $x("//a[@href='/bike']");

    @Override
    protected SelenideElement getPageIdentifier() {
        return motocycle;
    }


}
