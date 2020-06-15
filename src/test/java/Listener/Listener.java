package Listener;

import Utils.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseTest implements ITestListener {
    public void onTestStart(ITestResult result) {
        driver.get(baseUrl);
    }

    public void onTestSuccess(ITestResult result) {

    }

    public void onTestFailure(ITestResult result) {

    }

    public void onStart(ITestContext context) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void onFinish(ITestContext context) {
        driver.quit();
    }
}
