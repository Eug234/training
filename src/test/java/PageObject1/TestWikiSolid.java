package PageObject1;

import PageObject1.Pages.WikiSolidHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWikiSolid extends TestInit{
@Test
    public void checkLogin(){
    WikiSolidHomePage wikiSolidHomePage = new WikiSolidHomePage(driver);
    wikiSolidHomePage.navigateWikiSolid();
    wikiSolidHomePage.getLogin().click();
    Assert.assertTrue(wikiSolidHomePage.getLogin().isDisplayed());


    }
    @Test
    public void checkNumberPrinciples(){

    }
}

//List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='seats']/ul[@class='row_12 leftOfAisle']//span"));
//for(WebElement price: allprice)