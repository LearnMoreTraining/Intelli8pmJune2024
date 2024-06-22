package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.TestContext;

public class Hooks {

    TestContext context;
    public Hooks(TestContext context){
        this.context = context;
    }

    @After()
    public void closeBrowser(){
        context.browserBase.getWebDriver().quit();
    }

    @AfterStep()
    public void takeScreenshot(Scenario s){

        TakesScreenshot ts = (TakesScreenshot)context.browserBase.getWebDriver() ;
        byte []  b =ts.getScreenshotAs(OutputType.BYTES);
        s.attach(b,"image/png","test");


    }

}
