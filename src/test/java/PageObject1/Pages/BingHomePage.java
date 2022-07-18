package PageObject1.Pages;

import PageObject1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingHomePage extends BasePage{
    public BingHomePage(WebDriver driver) {
        super(driver);
    }
    public void navigateBing(){
        driver.get("https://www.bing.com/");
    }
    public WebElement getTrending(){
        return driver.findElement(By.xpath("//*[@id='trending_now_tile']"));
    }
    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@id='sb_form_q']"));
    }
    public WebElement getSearchButton(){
        return driver.findElement(By.xpath("//*[@id='search_icon']"));
    }
}
