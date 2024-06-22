package stepdefininiton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContext;

public class AmazonSteps {

    //check for the constructor
    TestContext context;

    public AmazonSteps(TestContext context){

        this.context = context;
    }

    @Given("user selects the dropdown value")
    public void selectDropdown(){

        context.pageObjectManager.getAmazonHomePage().enterProductName("iphone");

        context.pageObjectManager.getAmazonHomePage().clickSearchIcon();
    }

    @When("enter the product name")
    public void enterTheProductName() {
        context.pageObjectManager.getAmazonHomePage().enterProductName("xyz",0,1);
    }

    @Then("validate the page navigation")
    public void validateThePageNavigation() {

        context.pageObjectManager.getAmazonSearchResultPage().selectProduct(5);
    }
}
