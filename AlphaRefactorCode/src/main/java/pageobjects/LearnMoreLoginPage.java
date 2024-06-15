package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnMoreLoginPage {

    WebDriver driver;
    public LearnMoreLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUserName(){
        driver.findElement(By.cssSelector("#username")).sendKeys("lmti");
    }

    public void enterPassword(){
        driver.findElement(By.id("password")).sendKeys("123");
    }

    public void clickLogin(){

        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    public String getErrorMessage(){

       String error = driver.findElement(By.id("errorMessage")).getText();
       return error;
    }
}
