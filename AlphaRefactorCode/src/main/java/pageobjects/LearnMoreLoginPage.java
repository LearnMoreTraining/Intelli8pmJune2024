package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DecoderUtility;
import utils.ReadPropertyFile;

import java.util.Iterator;
import java.util.Set;

public class LearnMoreLoginPage {

    WebDriver driver;
    public LearnMoreLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(){
        driver.findElement(By.cssSelector("#username")).sendKeys(ReadPropertyFile.getValueFromPropertyFile("username"));
    }

    public void enterPassword(){
       WebElement element= driver.findElement(By.id("password"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].setAttribute('value','learnmore@123')",element);
    }

    public void clickLogin(){

      WebElement element = driver.findElement(By.xpath("//button[text()='Login']"));

        JavascriptExecutor jse = (JavascriptExecutor)driver;
      //  jse.executeScript("arguments[0].scrollIntoView();",element);
        jse.executeScript("arguments[0].click()",element);

    }

    public String getErrorMessage(){

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,600)","");
       String error = driver.findElement(By.id("errorMessage")).getText();
       return error;
    }

    public String getChildWindowTitle(){
     Set<String> windowsProperty =   driver.getWindowHandles();
        System.out.println(windowsProperty);
        Iterator <String> i = windowsProperty.iterator();
       String parentWindow = i.next();
       String childWindow = i.next();
        driver.switchTo().window(childWindow);

      return  driver.getTitle();

    }
}
