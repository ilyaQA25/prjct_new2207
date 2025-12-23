package tests;


import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;

public class CarsTest {


    @BeforeClass
    public void setUp() { // <--- Добавьте название метода и скобку {
        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    } // <--- Не забудьте закрыть скобку

    @Test
    public void findFordPickup() {

        MainPage mainPage = new MainPage();
        mainPage.openPage();
        mainPage.selectPickUpF150();

    }

    @Test
    public void selctingAllPickUps(){
        MainPage mainPage = new MainPage();
        mainPage.openPage().selectJustPickUps();
    }
}
