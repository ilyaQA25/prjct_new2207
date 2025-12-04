package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import services.SelenideConfig;

import static com.codeborne.selenide.Selenide.*;

public class MotoCycleTest {

    @BeforeMethod
    public void setup() {
        SelenideConfig.setup();
        open("/");
    }

    @Test
    public void openMotoPart() {
        new HomePage().open().findMotocycle().isPageOpened();
    }

    @Test
    public void selectCar() {
        new HomePage().open().selectVolvo();
    }
}
