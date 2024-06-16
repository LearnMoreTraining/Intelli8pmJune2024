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

    @Given("user switch to alert and get the text")
    public void userSwitchToAlertAndGetTheText() {
        context.pageObjectManager.getLearnMoreAlertPage().clickConfirmBox();
      Assert.assertEquals("Press a Button !",  context.pageObjectManager.getLearnMoreAlertPage().getAlertMessage());
    }

    @When("user clic on cancel button")
    public void userClicOnCancelButton() {

        context.pageObjectManager.getLearnMoreAlertPage().clickAlertCancel();

    }

    @Then("user validate the message in UI")
    public void userValidateTheMessageInUI() {

        Assert.assertEquals("You Pressed Cancel",context.pageObjectManager.getLearnMoreAlertPage().getUiText());
    }

    @Given("user clicks on change text button")
    public void userClicksOnChangeTextButton() {

        context.pageObjectManager.getLearnMoreExplictPage().clickChangeTextButton();
    }

    @Then("verify the text")
    public void verifyTheText() {
        Assert.assertEquals("Hello, Learn More Aspirants",context.pageObjectManager.getLearnMoreExplictPage().getChangeTextValue());
    }
}
