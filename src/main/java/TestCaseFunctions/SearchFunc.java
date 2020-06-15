package TestCaseFunctions;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFunc extends BasePage {
    public SearchFunc(WebDriver driver) {
        super(driver);
    }

    public By searchText = By.xpath("//*[@class='form-control product-search__input js-product-search-input js-illegal-characters']");
    public By showAllButton = By.linkText("Show All");


    public void search(){
        closePopUp();

        sendKeys(searchText, "rose");
        element(showAllButton).click();

    }
}