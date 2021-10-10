package com.test.modulr.stepdefs;

import com.test.modulr.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignInTestStepdef {

    @Given("^User is on sign in page$")
    public void userIsOnSignInPage() {
    }

    @When("^User enter username \"([^\"]*)\"$")
    public void userEnterUsername(String username) {
        new SignInPage().enterUsername(username);
    }

    @And("^User left password field empty \"([^\"]*)\"$")
    public void userLeftPasswordFieldEmpty(String password) {
        new SignInPage().enterPassword(password);
    }

    @And("^User click on sign in button$")
    public void userClickOnSignInButton() {
        new SignInPage().clickOnSignInButton();
    }

    @Then("^User should see the field empty error message \"([^\"]*)\"$")
    public void userShouldSeeTheFieldEmptyErrorMessage(String errormessage)  {
        Assert.assertEquals(errormessage, new SignInPage().getErrorMessageForFieldEmpty());
       Assert.assertTrue(errormessage, new SignInPage().getErrorMessageForFieldEmpty().contains(errormessage));
    }

    @When("^User left username field empty \"([^\"]*)\"$")
    public void userLeftUsernameFieldEmpty(String username) {
        new SignInPage().enterUsername(username);
    }

    @And("^User enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password) {
        new SignInPage().enterUsername(password);
    }

    @When("^User enter valid username \"([^\"]*)\"$")
    public void userEnterValidUsername(String username) {
        new SignInPage().enterUsername(username);
    }

    @And("^User enter invalid password \"([^\"]*)\"$")
    public void userEnterInvalidPassword(String password) {
        new SignInPage().getErrorMessageForInvalidCredentials();
    }

    @Then("^User should see the error message \"([^\"]*)\"$")
    public void userShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(errorMessage, new SignInPage().getErrorMessageForInvalidCredentials());
        Assert.assertTrue(errorMessage, new SignInPage().getErrorMessageForFieldEmpty().contains(errorMessage));
    }

    @When("^User enter invalid username \"([^\"]*)\"$")
    public void userEnterInvalidUsername(String username) {
        new SignInPage().getErrorMessageForInvalidCredentials();
    }

    @And("^User enter valid password \"([^\"]*)\"$")
    public void userEnterValidPassword(String password) {
        new SignInPage().enterUsername(password);
    }

    @Then("^User should sign in successfully to the account overview page$")
    public void userShouldSignInSuccessfullyToTheAccountOverviewPage() {
    }

    @And("^User click on Fogotten password button$")
    public void userClickOnFogottenPasswordButton() {
    }

    @Then("^User should navigate to Reset access page$")
    public void userShouldNavigateToResetAccessPage() {
    }


}
