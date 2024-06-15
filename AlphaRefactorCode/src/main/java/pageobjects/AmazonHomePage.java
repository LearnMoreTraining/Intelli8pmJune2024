package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v125.page.model.WebAppManifest;

public class AmazonHomePage {
    WebDriver driver;
    public AmazonHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void selectCategorgyDropdown(){

    }

    public void enterProductName(String productName){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }


    public void clickSearchIcon(){

        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
    }

    public void clickBabyWishList(){

    }
}
