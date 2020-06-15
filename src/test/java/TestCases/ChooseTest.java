package TestCases;

import Listener.Listener;
import TestCaseFunctions.ChooseFunc;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Listener.class})
public class ChooseTest extends BaseTest {

    @Test
    public void chooseOne(){
        ChooseFunc chooseFunc = new ChooseFunc(driver);
        chooseFunc.chooseOne();
    }

}
