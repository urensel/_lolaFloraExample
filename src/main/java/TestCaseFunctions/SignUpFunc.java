package TestCaseFunctions;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class SignUpFunc extends BasePage {
    public SignUpFunc(WebDriver driver) {
        super(driver);
    }

    public By signMenu = By.linkText("Sign in");
    public By signUpButton = By.xpath("//*[@class='users-process-list__icon icon-register']");
    public By nameText = By.id("NameIndivual");
    public By mail = By.id("EmailIndivual");
    public By passwordText = By.id("PasswordIndivual");
    public By register = By.xpath("//*[@class='btn btn-primary btn-lg membership__btn js-individual-register-button']");

    public void signUp(){
        closePopUp();
        element(signMenu).click();
        element(signUpButton).click();

        GenerateMailAddressFunc generateMailAddressFunc = new GenerateMailAddressFunc(driver);
        generateMailAddressFunc.generateMailAddress();

        sendKeys(nameText, name);
        sendKeys(mail, id + mailCom);
        sendKeys(passwordText, password);
        element(register).click();
        assertEquals(element(By.className("membership-thanks__heading-text")).getAttribute("outerText"), "Your account has been successfully created.");
    }
}
