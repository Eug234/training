package PageObject1.Pages;

import PageObject1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloudflareHomePage extends BasePage{
    public CloudflareHomePage (WebDriver driver){
        super(driver);
    }
    public void navigateCloudflare(){
        driver.get("https://www.cloudflare.com/");
    }
    public WebElement getAcceptCookies(){
        return driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']"));
        }
    public WebElement getPricing(){
        return driver.findElement(By.xpath("//*[@id='navmenu']/button[5]/span[1]"))
    }
    public WebElement getContactSales(){
        return driver.findElement(By.xpath("//*[@id='modal-sidenav']/div[4]/div[2]/a"))
    }
}
