package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.CatalogPage;
import pages.LoginPage;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected CatalogPage catalogPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage(driver);
        catalogPage = new CatalogPage(driver);

    }
}
