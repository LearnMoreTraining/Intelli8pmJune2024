package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

public class LearnMoreExplictWaitPage {

    WebDriver driver;
    public LearnMoreExplictWaitPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickChangeTextButton(){
        driver.findElement(By.id("quote")).click();
    }

    public String getChangeTextValue(){

        String error ;

        try{
          error =  driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText();
        }
        catch (NoSuchElementException e){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.pollingEvery(Duration.ofSeconds(5));
            wait.ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Hello, Learn More Aspirants']")));
          error=  driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).getText();
        }



       return error;
    }

}
