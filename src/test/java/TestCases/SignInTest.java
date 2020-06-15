package TestCases;

import Listener.Listener;
import TestCaseFunctions.SignInFunc;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Listener.class})
public class SignInTest extends BaseTest {

    @Test
    public void signIn() {
        SignInFunc signInFunc = new SignInFunc(driver);
        signInFunc.signIn();
    }
}
