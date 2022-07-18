package PageObject1;

import PageObject1.Pages.SinoptikHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSinoptik extends TestInit{
@Test
    public void checkWedWeather(){

    }
    @Test
    public void checkLangChange(){
        SinoptikHomePage sinoptikHomePage = new SinoptikHomePage(driver);
        sinoptikHomePage.navigateSinoptik();
        sinoptikHomePage.getLangButton().click();

        Assert.assertTrue(sinoptikHomePage.getLangButton().isDisplayed());
    }
    @Test
    public void checkCityChange(){


    }
}
