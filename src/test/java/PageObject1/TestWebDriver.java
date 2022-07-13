package PageObject1;

import org.testng.annotations.Test;

public class TestWebDriver extends TestInit {

    @Test
    public void runUkrnet(){
        goToUkrnet();
        UkrnetHomePage ukrnetHomePage = new UkrnetHomePage(driver);
        ukrnetHomePage.getSearchField().sendKeys("notebook\n");
        ukrnetHomePage.getSearchField().click();

    }

//    @Test
//    public void clickEnterBtn(){
//        goToUkrnet();
//        UkrnetHomePage ukrnetHomePage = new UkrnetHomePage(driver);
//        ukrnetHomePage.getEnterBtn().click();
//
//    }
}
