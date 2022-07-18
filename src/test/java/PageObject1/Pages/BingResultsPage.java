package PageObject1.Pages;

import PageObject1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingResultsPage extends BasePage {
public BingResultsPage (WebDriver driver){
    super(driver);
}
    public WebElement getResults(){
        return driver.findElement(By.xpath("//*[@id='b_tween']/span"));
    }

}

