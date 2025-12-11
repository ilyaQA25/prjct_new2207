package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage {
    private final SelenideElement marksDropdown = $("#p-6-0-2-brand");
    private final SelenideElement modelsDropdown = $(byTitle("Модель"));
    private final SelenideElement yearsDropdown = $("[title='Год от']");
    private final SelenideElement buttonShow = $("a.button--primary");
    private final SelenideElement cookieButton = $(byText("Отказаться"));


    @Override
    protected SelenideElement getPageIdentifier() {
        return marksDropdown;
    }

    public MainPage openPage() {
        open("https://cars.av.by/");
        closeCookieBanner(); // Закрываем куки сразу при открытии
        return this;
    }

    // Метод для закрытия куки (если она есть)
    public void closeCookieBanner() {
        if (cookieButton.exists()) {
            cookieButton.click();

        }
    }


    public void selectPickUp() {
        marksDropdown.click();
        $(byText("Ford")).click();

        // 2. Ждем, пока список моделей "оживет" после выбора марки.
        // Selenide будет ждать (по умолчанию 4 сек), пока атрибут disabled исчезнет.
        $("#p-6-0-3-model")
                .shouldBe(enabled, Duration.ofSeconds(10))
                .click();

        $(byText("F-150")).click();

        //$("a.button--primary")
         //       .shouldHave(text("Показать"), Duration.ofSeconds(10))
          //      .click();
    }
}
/*private final SelenideElement homeLogo = $x("//*[@class='header__logo-wrap']");
    private final SelenideElement advertisement = $x("//span[text()='Объявления']");
    private final SelenideElement motoClass = $x("//a[text()='Мототехника']");*/

/*yearsDropdown.click();
        $(byText("2024")).click();

        buttonShow.click();*/