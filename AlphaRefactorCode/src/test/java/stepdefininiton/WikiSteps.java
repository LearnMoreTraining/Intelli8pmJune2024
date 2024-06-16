package stepdefininiton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import utils.TestContext;

public class WikiSteps {

    TestContext context;

    public WikiSteps(TestContext context){
        this.context = context;
    }
    
    @Given("user extracts the column one value")
    public void columnOne(){

        context.pageObjectManager.getWikiPage().getCoulmnOneValues();
    }

    @When("user extracts the column two value")
    public void userExtractsTheColumnTwoValue() {
        context.pageObjectManager.getWikiPage().getCoulumnTwoValues();
    }

    @Then("user validate the column one and two")
    public void userValidateTheColumnOneAndTwo() {

        Assert.assertEquals("Company type",context.pageObjectManager.getWikiPage().getCoulmnOneValues().get(2));
        Assert.assertEquals("Public",context.pageObjectManager.getWikiPage().getCoulumnTwoValues().get(2));
    }

    @Then("user validates the mapping of share holder to share holding")
    public void userValidatesTheMappingOfShareHolderToShareHolding() {

        Assert.assertEquals("16.44",context.pageObjectManager.getWikiPage().getShareHolderAndHoldingValue().get("Public"));
    }
}
