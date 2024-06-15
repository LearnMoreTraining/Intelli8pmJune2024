package stepdefininiton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.TestContext;

public class LearnMoreSteps {

    TestContext context;

    public LearnMoreSteps(TestContext context){
        this.context = context;
    }

    @When("user clicks on login button")
    public void clicLoginButton(){
       context.pageObjectManager.getLearnMoreLoginPage().clickLogin();
    }

    @Given("user enter the user name and password")
    public void userEnterTheUserNameAndPassword() {
        context.pageObjectManager.getLearnMoreLoginPage().enterUserName();
        context.pageObjectManager.getLearnMoreLoginPage().enterPassword();
    }

    @Then("user validate the error message")
    public void userValidateTheErrorMessage() {

        Assert.assertEquals("Invalid Credentials.Please Check",  context.pageObjectManager.getLearnMoreLoginPage().getErrorMessage());
    }
}
