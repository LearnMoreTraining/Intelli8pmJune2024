package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserBase {

    public WebDriver driver; //null

    public WebDriver getWebDriver(){

        if(driver == null) {
            driver = new ChromeDriver();
            driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        }
        return driver;
    }
}
