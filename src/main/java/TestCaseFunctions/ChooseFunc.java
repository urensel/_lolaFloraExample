package TestCaseFunctions;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseFunc extends BasePage {
    public ChooseFunc(WebDriver driver) {
        super(driver);
    }

    public By firstPick = By.xpath("//*[@class='products__item js-category-item-hover products__item--featured-xlg']");


    public void chooseOne() {

        closePopUp();

        if (driver.getCurrentUrl().equals("https://www.lolaflora.com/Search?query=rose")) {
            element(firstPick).click();
        } else {
            SearchFunc searchFunc = new SearchFunc(driver);
            searchFunc.search();
        }
        element(firstPick).click();
    }
}
