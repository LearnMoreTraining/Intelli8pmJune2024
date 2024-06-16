package utils;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

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

    public LearnMoreAlertPage getLearnMoreAlertPage(){
        LearnMoreAlertPage learnMoreAlertPage = new LearnMoreAlertPage(driver);
        return learnMoreAlertPage;
    }

    public WikiPage getWikiPage(){
        WikiPage wikiPage = new WikiPage(driver);
        return wikiPage;
    }

    public LearnMoreExplictWaitPage getLearnMoreExplictPage(){
        LearnMoreExplictWaitPage learnMoreExplictWaitPage= new LearnMoreExplictWaitPage(driver);
        return learnMoreExplictWaitPage;
    }
}
