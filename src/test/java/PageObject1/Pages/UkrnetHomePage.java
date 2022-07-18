package PageObject1.Pages;

import PageObject1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UkrnetHomePage extends BasePage {
    public UkrnetHomePage(WebDriver driver){
        super(driver);
    }
    public void navigateUkrnet(){
        driver.get("https://www.ukr.net");
    }
    public WebElement getLogoImage(){
        return driver.findElement(By.xpath("//img[@alt='новини']"));
    }
    public WebElement getLang(){
        return driver.findElement(By.xpath("//span[@id='act-lang']"));
    }
    public WebElement getLangChange(){
        return driver.findElement(By.xpath("//*[@id='main']/div[3]/div/section[1]/nav/div/a"));
    }
}
