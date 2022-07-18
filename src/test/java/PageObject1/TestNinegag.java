package PageObject1;

import PageObject1.Pages.NinegagHomePage;
import PageObject1.Pages.UkrnetHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNinegag extends TestInit{
    @Test
    public void checkUkraineMemes(){
        NinegagHomePage ninegagHomePage = new NinegagHomePage(driver);
        ninegagHomePage.navigateNinegag();
ninegagHomePage.getUkraineButton().click();

        Assert.assertTrue(ninegagHomePage.getUkraineButton().isDisplayed());

    }
}
