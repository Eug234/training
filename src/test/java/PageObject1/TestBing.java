package PageObject1;

import PageObject1.Pages.BingHomePage;
import PageObject1.Pages.BingResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBing extends TestInit{
    @Test
    public void checkTrending(){
        BingHomePage bingHomePage = new BingHomePage(driver);
        bingHomePage.navigateBing();

        Assert.assertTrue(bingHomePage.getTrending().isDisplayed());
        Assert.assertTrue(bingHomePage.getSearchField().isDisplayed());

    }
    @Test
    public void checkSearch(){
        PageObject1.Pages.BingHomePage bingHomePage = new BingHomePage(driver);
        bingHomePage.navigateBing();

        bingHomePage.getSearchField().sendKeys("where`s my car dude");
        bingHomePage.getSearchButton().click();

        BingResultsPage bingResultsPage = new BingResultsPage(driver);
        Assert.assertTrue(bingResultsPage.getResults().isDisplayed());
    }
}
