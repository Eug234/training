package PageObject1.Pages;

import PageObject1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiSolidHomePage extends BasePage{
    public WikiSolidHomePage (WebDriver driver){
        super(driver);
    }
    public void navigateWikiSolid(){
        driver.get("https://en.wikipedia.org/wiki/SOLID");
    }
    public WebElement getLogin() {
        return driver.findElement(By.xpath("//*[@id='pt-login']/a/span"));
}
