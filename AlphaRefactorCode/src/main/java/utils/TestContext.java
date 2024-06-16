package utils;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {

    //check for con

   public BrowserBase browserBase;
   public PageObjectManager pageObjectManager;
    public TestContext() throws IOException {
         browserBase = new BrowserBase();
         pageObjectManager = new PageObjectManager(browserBase.getWebDriver());
    }

}
