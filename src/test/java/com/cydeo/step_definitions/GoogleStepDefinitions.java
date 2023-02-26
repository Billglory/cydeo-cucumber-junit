package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitions {



    @When("user a is on Google search page")
    public void userAIsOnGoogleSearchPage() { Driver.getDriver().get("https://www.google.com");
    }

    @Then("user b should see title is Google")
    public void userBShouldSeeTitleIsGoogle() {
        String expectedTitle = "Google ";
       String actualTitle=Driver.getDriver().getTitle();

       Assert.assertEquals(actualTitle, expectedTitle);

       Driver.closeDriver();

    }

}
