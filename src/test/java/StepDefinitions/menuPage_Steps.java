package StepDefinitions;
import Pages.Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class menuPage_Steps extends Page {

    @When("click global center")
    public void clickGlobalCenter() {
        getMenuPage().globalCenter();
    }

    @When("digital subscription")
    public void digitalSubscription() {
        getMenuPage().digitalSubscription();
    }

    @Then("click all links")
    public void clickAllLinks() {
        getMenuPage().allLinks();
    }

    @When("click press room")
    public void clickPressRoom() {
        getMenuPage().PressRoom();
    }

    @Then("any post click")
    public void anyPostClick() {
        getMenuPage().postClick();
    }

    @When("click california")
    public void clickCalifornia() throws InterruptedException {
        getMenuPage().California();
        getMenuPage().scrollDown5();
        Thread.sleep(3000);
    }

    @Then("click top to back click")
    public void clickTopToBackClick() {
        getMenuPage().topToBack();
    }

    @Then("click social icon")
    public void clickSocialIcon() {
        getMenuPage().socialIconClick();
    }
}
