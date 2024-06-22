package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        driver.findElement(By.id("password")).sendKeys(ReadPropertyFile.getValueFromPropertyFile("password"));
    }

    public void clickLogin(){

        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    public String getErrorMessage(){

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
