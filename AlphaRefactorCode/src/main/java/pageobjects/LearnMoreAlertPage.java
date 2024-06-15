package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnMoreAlertPage {

    WebDriver driver;
    public LearnMoreAlertPage(WebDriver driver){

       this.driver = driver;
    }

    public void clickConfirmBox(){

        driver.findElement(By.id("CancelTab")).click();
    }

    public String getAlertMessage(){

       return driver.switchTo().alert().getText();
    }

    public void clickAlertCancel(){

        driver.switchTo().alert().dismiss();
    }

    public String getUiText(){

      return  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).getText();
    }
}
