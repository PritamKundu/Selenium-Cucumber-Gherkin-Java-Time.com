package StepDefinitions;

import Pages.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignIn_Steps extends Page {
    

    @Given("click sign in google")
    public void clickSignInGoogle() throws InterruptedException{
        getSigninPage().signIn();
        getSigninPage().createOne();
        getSigninPage().Google();

    }

    @Then("click sign in facebook")
    public void clickSignInFacebook() throws InterruptedException {
        getSigninPage().signIn();
        getSigninPage().createOne();
        getSigninPage().Facebook();
    }

    @Given("click mail sign in")
    public void clickMailSignIn() throws InterruptedException {
        getSigninPage().signIn();
    }
}
