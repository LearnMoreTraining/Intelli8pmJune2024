package utils;

import org.openqa.selenium.WebDriver;

public class TestContext {

    //check for con

   public BrowserBase browserBase;
   public PageObjectManager pageObjectManager;
    public TestContext(){
         browserBase = new BrowserBase();
         pageObjectManager = new PageObjectManager(browserBase.getWebDriver());
    }

}
