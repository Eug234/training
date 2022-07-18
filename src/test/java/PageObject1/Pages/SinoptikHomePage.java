package PageObject1.Pages;

import PageObject1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SinoptikHomePage extends BasePage{
    public SinoptikHomePage (WebDriver driver){
        super(driver);
    }
    public void navigateSinoptik(){
        driver.get("https://sinoptik.ua/");
    }
    public WebElement getCitySearch() {
        return driver.findElement(By.xpath("//*[@id='search_city']"));
    }

    public WebElement getLangButton() {
        return driver.findElement(By.xpath("//*[@hreflang='uk']"));
    }

}
