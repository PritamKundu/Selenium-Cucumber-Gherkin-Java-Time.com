package StepDefinitions;

import Pages.Page;
import io.cucumber.java.en.*;


public class Sections_Steps extends Page {


    @Given("Click on menu bar")
    public void click_on_menu_bar() throws InterruptedException {
        getSections().setMenu();
        Thread.sleep(3000);
    }
    @When("Click on world")
    public void click_on_world() throws InterruptedException {
        getSections().setWorldMenu();
        getSections().setScrollDown();
        Thread.sleep(2000);

    }
    @When("Post Click")
    public void post_click() throws InterruptedException {
        getSections().setPostClick();
        Thread.sleep(2000);

    }
    @When("Click on subscribe time")
    public void click_on_subscribe_time() throws InterruptedException {
        getSections().setSubscribeClick();
        Thread.sleep(5000);

    }
    @When("Click on select in digital")
    public void click_on_select_in_digital() throws InterruptedException {
        getSections().setDigital();
        Thread.sleep(3000);

    }
    @Then("Type Email")
    public void type_email() {
        getSections().setEmail("pritam@gmail.com");
    }
    @Then("Type Password")
    public void type_password() {
        getSections().setPassword("123456789");
    }


    @When("Click on Business")
    public void click_on_business() throws InterruptedException {
        getSections().setBusinessMenuClick();
        getSections().scrollDown2();
        getSections().setBusinessPost();
        Thread.sleep(8000);
        getSections().setContact();
    }


    @When("Click on Science")
    public void click_on_science() throws InterruptedException {
        getSections().setScienceMenuClick();
        Thread.sleep(3000);
        getSections().scrollDown2();
        Thread.sleep(2000);
    }
    @When("Click Any Science Page Post")
    public void click_any_science_page_post() throws InterruptedException {
        getSections().setSciencePost();
        Thread.sleep(5000);
        getSections().scrollDown1Science2();
        Thread.sleep(5000);
    }
    @Then("Click Social Medias icon")
    public void click_social_medias_icon() {
        getSections().socialMediaIcons();
    }

}
