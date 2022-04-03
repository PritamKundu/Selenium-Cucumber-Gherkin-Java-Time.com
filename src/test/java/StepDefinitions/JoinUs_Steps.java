package StepDefinitions;

import Pages.Page;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class JoinUs_Steps extends Page {

    @When("newsletter menu click")
    public void newsletterMenuClick() {
        getJoinUs().news();
    }

    @And("any post click & scroll-down")
    public void anyPostClickScrollDown() throws InterruptedException {
        getJoinUs().newsclick();
        Thread.sleep(2000);
        getJoinUs().scrollDown();

    }
    @And("all check box click")
    public void allCheckBoxClick() {
        getJoinUs().checkboxClick1();
        getJoinUs().checkboxClick2();
        getJoinUs().checkboxClick3();
    }

    @When("click select all button")
    public void clickSelectAllButton() throws InterruptedException {
        getJoinUs().selectAll();
        Thread.sleep(5000);
    }

    @And("click facebook icon")
    public void clickFacebookIcon() {
        getJoinUs().FB();
    }

    @And("click instagram icon")
    public void clickInstagramIcon() {
        getJoinUs().IG();
    }

    @And("click twitter icon")
    public void clickTwitterIcon() {
        getJoinUs().TW();
    }

    @And("click pinterest icon")
    public void clickPinterestIcon() {
        getJoinUs().PT();
    }

    @When("click shop time sub menu")
    public void clickShopTimeSubMenu() {
        getJoinUs().shopTime();
    }

    @When("scroll down & featured click")
    public void scrollDownFeaturedClick() {
        getJoinUs().scrollDown4();
        getJoinUs().featuredClick();
    }

    @And("click cover")
    public void clickCover() {
        getJoinUs().coverClick();
    }


    @And("click price box and scroll down")
    public void clickPriceBoxAndScrollDown() {
        getJoinUs().priceBoxClick();
        getJoinUs().scrollDown2();
    }

    @And("click print")
    public void clickPrint() {
        getJoinUs().printClick();
    }

    @And("click print size")
    public void clickPrintSize() {
        getJoinUs().printSizeClick();
    }

    @And("canvas wrap")
    public void canvasWrap() {
        getJoinUs().canvasWrap();
    }

    @And("canvas wrap click")
    public void canvasWrapClick() {
        getJoinUs().canvasWrapClick();
    }

    @And("canvas type")
    public void canvasType() {
        getJoinUs().canvasType();
    }

    @And("canvas type click")
    public void canvasTypeClick() {
        getJoinUs().canvasTypeClick();
    }

    @And("frame menu click")
    public void frameMenuClick() {
        getJoinUs().frameMenuClick();
    }

    @And("frame color")
    public void frameColor() {
        getJoinUs().frameColor();
    }

    @And("frame color click")
    public void frameColorClick() {
        getJoinUs().frameColorClick();
    }

    @When("frame click")
    public void frameClick() {
        getJoinUs().frameClick();
    }

    @Then("add to curt click")
    public void addToCurtClick() {
        getJoinUs().scrollUP();
        getJoinUs().addToCurt();
    }



}
