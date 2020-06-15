package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {


    public WebDriver driver;
    public WebDriverWait wait;
    public final String baseUrl = "https://www.lolaflora.com";
    public String name = "automationTest";
    public String password = "Q1w2e3.";
    public String mailCom = "@test.com";
    public static String id = "testAuto";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,5);
    }

    public WebElement element(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public List<WebElement> list (By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElements(locator);
    }

    public void closePopUp (){
        if (driver.switchTo().activeElement().isEnabled()) {
            driver.switchTo().activeElement().click();
        }
    }

    public void sendKeys(By locator, String value){
        element(locator).sendKeys(value);
    }

}
