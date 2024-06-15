package utils;

import org.openqa.selenium.WebDriver;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonSearchResultPage;
import pageobjects.LearnMoreLoginPage;

public class PageObjectManager {
   WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }
    public AmazonHomePage getAmazonHomePage(){
        AmazonHomePage amazonHomePage =new AmazonHomePage(driver);
        return amazonHomePage;
    }

    public AmazonSearchResultPage getAmazonSearchResultPage(){

        AmazonSearchResultPage amazonSearchResultPage = new AmazonSearchResultPage(driver);
           return amazonSearchResultPage;

    }

    public LearnMoreLoginPage getLearnMoreLoginPage(){
        LearnMoreLoginPage learnMoreLoginPage = new LearnMoreLoginPage(driver);
        return learnMoreLoginPage;
    }
}
