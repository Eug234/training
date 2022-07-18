package PageObject1;

import PageObject1.Pages.CloudflareHomePage;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;

public class TestCloudflare extends TestInit{
public void checkPrices(){
    CloudflareHomePage cloudflareHomePage = new CloudflareHomePage(driver);
    cloudflareHomePage.getPricing();
    cloudflareHomePage.getPricing().click();
    Assert.assertTrue(cloudflareHomePage.getPricing().isDisplayed();

}
public void checkSales(){
    CloudflareHomePage cloudflareHomePage = new CloudflareHomePage(driver);
    cloudflareHomePage.getContactSales();
    cloudflareHomePage.getContactSales().click();
    Assert.assertTrue(cloudflareHomePage.getContactSales().isDisplayed());
}
public void checkCookies(){
    CloudflareHomePage cloudflareHomePage = new CloudflareHomePage(driver);
    cloudflareHomePage.navigateCloudflare();
    cloudflareHomePage.getAcceptCookies().click();

    Assert.assertTrue(cloudflareHomePage.getAcceptCookies().isDisplayed());

}
}
