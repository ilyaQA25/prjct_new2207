package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MotoCycleTest extends BaseTest {


    @Test
    public void openMotoPart(){
        Assert.assertTrue(homePage.findMotocycle().isPageOpened());
    }
}
