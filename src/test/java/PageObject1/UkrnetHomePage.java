package PageObject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UkrnetHomePage extends BasePage{
    public UkrnetHomePage(WebDriver driver){
        super(driver);
    }
    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@name'q']"));
    }

//    public WebElement getEnterBtn() {
//        return driver.findElement(By.xpath("//a[text()='Увійти']"));
//    }
}
