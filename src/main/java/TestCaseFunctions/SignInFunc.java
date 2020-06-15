package TestCaseFunctions;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;


public class SignInFunc extends BasePage {

    public WebDriverWait wait = new WebDriverWait(driver, 10);
    public By signMenu = By.linkText("Sign in");
    public By singIn = By.xpath("//*[@class='users-process-list__item']");
    public By emailLogin = By.id("EmailLogin");
    public By passwordText = By.id("Password");
    public By login = By.xpath("//*[@class='btn btn-primary btn-lg pull-right login__btn js-login-button']");
    private By myAccount = By.linkText("My Account");

    public SignInFunc(WebDriver driver) {
        super(driver);
    }

    public void signIn() {

        closePopUp();
        element(signMenu).click();
        element(singIn).click();
        sendKeys(emailLogin, id + mailCom);
        sendKeys(passwordText, password);
        element(login).click();
        assertEquals(element(myAccount).getAttribute("outerText"), "My Account");
    }
}
