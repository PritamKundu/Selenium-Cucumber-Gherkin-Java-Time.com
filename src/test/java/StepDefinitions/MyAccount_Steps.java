package StepDefinitions;

import Pages.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccount_Steps extends Page {

    @When("put valid email and password")
    public void putValidEmailAndPassword() throws InterruptedException {
        getSigninPage().signInValidData("wedalir339@vapaka.com", "M&pc9eNr*2C@96c");

    }

    @When("click my account")
    public void clickMyAccount() {
        getMyAccount().myAccount();
    }


    @Given("click manage account")
    public void clickManageAccount() {
        getMyAccount().manageAccount();
        getMyAccount().scrollDown();
    }

    @And("click print account")
    public void clickPrintAccount() throws InterruptedException {
        getMyAccount().printClick();
    }

    @And("click subscription account")
    public void clickSubscriptionAccount() {
        getMyAccount().subscriptionAccount();
    }

    @And("select country")
    public void selectCountry() {
        getMyAccount().countryFind();
    }

    @Then("link subscription click")
    public void linkSubscriptionClick() {
        getMyAccount().linkSubscriptionClick();
    }

    @Given("click help center")
    public void clickHelpCenter() {
        getMyAccount().helpCenter();
        getMyAccount().scrollDown();
    }

    @And("your account all link click")
    public void yourAccountAllLinkClick() throws InterruptedException {
        getMyAccount().YourAccountAllClick();
        Thread.sleep(5000);
    }

    @Then("subscription management all link click")
    public void subscriptionManagementAllLinkClick() {
        getMyAccount().s_ManagementClick();
    }

    @Given("click sign out")
    public void clickSignOut() {
        getMyAccount().signout();
    }

    @Given("click search icon")
    public void clickSearchIcon() {
        getMyAccount().clickIcon();
    }

    @When("put search data")
    public void putSearchData() {
        getMyAccount().setSearchData("a");
    }

    @And("click search button")
    public void clickSearchButton() {
        getMyAccount().clickSearchButton();
    }

    @Then("search post click")
    public void searchPostClick() {
        getMyAccount().postClick();
    }

    @When("click time page")
    public void clickTimePage() {
        getMyAccount().time100();
        getMyAccount().scrollDown();
    }

    @Then("click entertainment page")
    public void clickEntertainmentPage() {
        getMyAccount().Entertainment();
    }
}
