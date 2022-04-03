package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static core.WebConnector.driver;

public class MyAccount {
    public MyAccount(Page page)
    {
        PageFactory.initElements(driver, this);
    }

    public By myaccount = By.xpath("/html/body/header/nav[1]/div[1]/div[3]/div/div/button");
    public By manageaccount = By.xpath("/html/body/header/nav[1]/div[1]/div[3]/div/div/div/a[1]");
    public By subscriptionnumber = By.xpath("/html/body/div[1]/div[7]/input[1]");
    public By country = By.xpath("/html/body/div[1]/div[7]/select/option");
    public By linksubscription = By.xpath("/html/body/div[1]/div[7]/input[2]");


    public void myAccount(){
        driver.findElement(myaccount).click();
    }


    public void manageAccount(){
        driver.findElement(manageaccount).click();
    }


    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
    }


    public void printClick() throws InterruptedException {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@scrolling=\"no\"]"));
        Thread.sleep(2000);
        driver.switchTo().frame(iframe);
        driver.findElement(By.id("link-subscription")).click();
        Thread.sleep(3000);
    }


    public void subscriptionAccount(){
        driver.findElement(subscriptionnumber).sendKeys("1234567");
    }


    public void countryFind() {
        List<WebElement> countryName = driver.findElements(country);
        for (WebElement allCountry : countryName) {
            if (allCountry.getText().trim().equals("Bangladesh")) {
                allCountry.click();
                break;
            }
        }
    }


    public void linkSubscriptionClick(){
        driver.findElement(linksubscription).click();
    }

    //HelpCenter
    public By helpcenter = By.xpath("/html/body/header/nav[1]/div[1]/div[3]/div/div/div/a[4]");

    public void helpCenter(){
        driver.findElement(helpcenter).click();
    }

    public void YourAccountAllClick() {
        List<WebElement> alllink = driver.findElements(By.xpath("/html/body/main/div[2]/section/div[1]/ul[1]/li"));
        for (WebElement AllLink : alllink) {
            AllLink.click();
        }
    }

    public void s_ManagementClick() {
        List<WebElement> alllink = driver.findElements(By.xpath("/html/body/main/div[2]/section/div[1]/ul[2]/li"));
        for (WebElement AllLink : alllink) {
            AllLink.click();
        }
    }

    // Sign out
    public By signOut = By.xpath("/html/body/header/nav[1]/div[1]/div[3]/div/div/div/a[5]");

    public void signout() {
        driver.findElement(signOut).click();
    }


    //Search
    public By searchIcon = By.xpath("//header/nav[1]/div[2]/div[2]/div[3]/button[1]/span[1]/*[1]");
    public By searchBox = By.xpath("//header/nav[1]/div[2]/div[2]/div[3]/div[1]/form[1]/input[1]");
    public By postClick = By.xpath("/html/body/div[1]/div[1]/div/main/div[2]/div[2]/article[1]/div/div/a");


    public void clickIcon(){
        driver.findElement(searchIcon).click();
    }
    public void setSearchData(String text){
        driver.findElement(searchBox).sendKeys(text);
    }
    public void clickSearchButton(){
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }


    public void postClick(){
        driver.findElement(postClick).sendKeys(Keys.ENTER);
    }


    //Time100
    public By time= By.xpath("/html/body/header/nav[2]/section/section[1]/ul/li[19]/a");
    public By video = By.xpath("/html/body/div[2]/section/div[1]/div[6]/div/div[1]/div[1]/div[3]/div[1]/div/div");



    public void time100(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement time100 = driver.findElement(time);
        js.executeScript("arguments[0].scrollIntoView();", time100);
        time100.click();
    }


    public void Entertainment() {
        List<WebElement> entertainment = driver.findElements(By.xpath("/html/body/div[2]/section/div[1]/div[2]/ul/li"));
        for (WebElement allentertainment : entertainment) {
            if (allentertainment.getText().trim().equals("ENTERTAINMENT")) {
                allentertainment.click();
                break;
            }
        }
    }
}
