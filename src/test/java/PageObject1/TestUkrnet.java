package PageObject1;

import PageObject1.Pages.UkrnetHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUkrnet extends TestInit {
    @Test
    public void checkHeader(){
        UkrnetHomePage ukrnetHomePage = new UkrnetHomePage(driver);
        ukrnetHomePage.navigateUkrnet();

        Assert.assertTrue(ukrnetHomePage.getLogoImage().isDisplayed());
        Assert.assertTrue(ukrnetHomePage.getLang().isDisplayed());
        Assert.assertTrue(ukrnetHomePage.getLangChange().isDisplayed());

    }
    @Test
    public void checkLang(){
        UkrnetHomePage ukrnetHomePage = new UkrnetHomePage(driver);
        ukrnetHomePage.navigateUkrnet();

        ukrnetHomePage.getLang().click();
        ukrnetHomePage.getLangChange().click();
        }
}
