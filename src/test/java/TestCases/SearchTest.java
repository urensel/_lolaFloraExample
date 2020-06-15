package TestCases;

import Listener.Listener;
import TestCaseFunctions.SearchFunc;
import Utils.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({Listener.class})
public class SearchTest extends BaseTest {

    @Test
    public void searchText(){
        SearchFunc searchFunc = new SearchFunc(driver);
        searchFunc.search();
    }

}
