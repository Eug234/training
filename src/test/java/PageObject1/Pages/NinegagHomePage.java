package PageObject1.Pages;

import PageObject1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NinegagHomePage extends BasePage{
    public NinegagHomePage(WebDriver driver){
        super(driver);
    }
    public void navigateNinegag(){
        driver.get("https://9gag.com/");
    }
    public WebElement getUkraineButton() {
        return driver.findElement(By.xpath("//*[@id='modal-sidenav']/div[4]/div[2]/a"));
    }
//    public WebElement getUkraineButton(){
//        return driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//    }
}
