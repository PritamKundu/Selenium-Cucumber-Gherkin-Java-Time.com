package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static core.WebConnector.driver;


public class Sections {

    public Sections(Page page)
    {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class='menu-btn-inner']")
    public WebElement menu;

    @FindBy(xpath = "//li[@class='menu-item']//a[normalize-space()='World']")
    public WebElement worldMenu;

    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/section[1]/div[2]/div[1]/a[1]/div[2]/h2[1]")
    public WebElement postClick;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[1]/div[2]/a")
    public WebElement subscribe;

    @FindBy(xpath = "//body/main[1]/section[1]/ul[1]/li[1]/a[1]")
    public WebElement digital;


    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "/html/body/main/div/section[1]/div[2]/div[1]/a/div[2]/h2")
    public WebElement businessPost;

    @FindBy(xpath = "/html/body/footer/nav/section[4]/ul/li[4]/a")
    public WebElement contact;

    @FindBy(xpath = "/html/body/main/div/section[1]/div[2]/div[1]/a/div[2]/h2")
    public WebElement sciencePost;


    /*public By fb = By.cssSelector("#article-body > div > div.article-bottom > div.padding-32-bottom > div > div > span.icon.icon-facebook-circle-solid.social-icon.padding-8-right.color-white > a");
    public By tw = By.cssSelector("#article-body > div > div.article-bottom > div.padding-32-bottom > div > div > span.icon.icon-twitter-circle-solid.social-icon.padding-8-right.color-white > a");
    public By mail = By.cssSelector("#article-body > div > div.article-bottom > div.padding-32-bottom > div > div > span.icon.icon-email-circle-solid.social-icon.padding-8-right.color-white > a");
    public By ln = By.cssSelector("#article-body > div > div.article-bottom > div.padding-32-bottom > div > div > span.icon.icon-linkedin-circle-solid.social-icon.padding-8-right.color-white > a");
*/
    public void setMenu() {
        menu.click();
    }

    public void setWorldMenu() {
        worldMenu.click();
    }


    public void setScrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,700)");
    }

    public void setPostClick(){
        postClick.click();
    }

    public void setSubscribeClick(){
        subscribe.click();
    }

    public void setDigital() {
        digital.click();
    }


    public void setEmail(String Email){
        WebElement iframe = driver.findElement(By.xpath("//iframe [@src=\"https://time.com/iframe/create-account?sub-checkout=true\"]"));
        driver.switchTo().frame(iframe);
        email.sendKeys(Email);
    }

    public void setPassword(String Password){
        password.sendKeys(Password);
    }


    public void setBusinessMenuClick() {
        List<WebElement> business = driver.findElements(By.xpath("/html/body/header/nav[2]/section/section[1]/ul/li"));
        for (WebElement allSubMenu : business) {
            if (allSubMenu.getText().trim().equals("Business")) {
                allSubMenu.click();
                break;
            }
        }
    }

    public void scrollDown2() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,700)");
    }

    public void scrollDown3() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,8000)");
    }

    public void setBusinessPost(){
        businessPost.click();
    }

    public void setContact(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement contactMail = contact;
        js.executeScript("arguments[0].scrollIntoView();", contactMail);
        contactMail.click();
    }


    public void setScienceMenuClick() {
        List<WebElement> science = driver.findElements(By.xpath("/html/body/header/nav[2]/section/section[1]/ul/li"));
        for (WebElement allSubMenu : science) {
            if (allSubMenu.getText().trim().equals("Science")) {
                allSubMenu.click();
                break;
            }
        }
    }

    public void setSciencePost(){
        sciencePost.click();
    }

    public void scrollDown1Science2() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,9700)");
        Thread.sleep(3000);
    }

        public void socialMediaIcons(){
            //List<WebElement> mediaIcons = driver.findElements(By.xpath("/html/body/div[2]/div/main/div[2]/div[1]/div[3]/div/div[6]/div[2]/div/div/span"));
            List<WebElement> mediaIcons = driver.findElements(By.xpath("/html/body/div[2]/div/main/div[2]/div[1]/div[3]/div/div[19]/div[2]/div/div/span"));
            int noOfIcons = mediaIcons.size();
            //String path = "(/html/body/div[2]/div/main/div[2]/div[1]/div[3]/div/div[6]/div[2]/div/div/span)";
            String path = "(/html/body/div[2]/div/main/div[2]/div[1]/div[3]/div/div[19]/div[2]/div/div/span)";
            for (int i=1; i<noOfIcons; i++){
               String elementPath = path+"["+i+"]";
               driver.findElement(By.xpath(elementPath)).click();
           }
        }

}

