package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.CatalogPage;
import pages.LoginPage;


public class BaseStep {
    protected WebDriver driver;
    //protected LoginStep loginStep;
    protected CatalogPage catalogPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;

        //loginStep = new LoginStep(driver);
        catalogPage = new CatalogPage(driver);

    }
}
