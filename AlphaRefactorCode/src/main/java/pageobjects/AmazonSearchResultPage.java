package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchResultPage {

    WebDriver driver;

    public AmazonSearchResultPage(WebDriver driver){
        this.driver = driver;
    }


    public void selectProduct(int resultIndex){

        driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+resultIndex+"']")).click();
    }

    public void selectToCity(String cityName){
        driver.findElement(By.xpath("//a[@value='"+cityName+"']")).click();
    }
}
