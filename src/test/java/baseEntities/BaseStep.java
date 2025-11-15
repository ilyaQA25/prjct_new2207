package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.MotoPage;


public class BaseStep {
    protected WebDriver driver;
    //protected LoginStep loginStep;
    protected MotoPage motoPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;

        //loginStep = new LoginStep(driver);
        motoPage = new MotoPage(driver);

    }
}
