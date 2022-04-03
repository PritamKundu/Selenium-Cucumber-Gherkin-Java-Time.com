package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static core.WebConnector.driver;

public class SigninPage {

    public By signin = By.xpath("/html/body/header/nav[1]/div[1]/div[3]/div/a[1]");
    public By createone = By.xpath("/html/body/div[2]/div/h3/a");
    public By google = By.xpath("//*[@id=\"sign-up-google\"]");
    public By facebook = By.xpath("//*[@id=\"sign-up-facebook\"]");
    public By Email = By.xpath("//input[@id='email']");
    public By Password = By.xpath("//input[@id='password']");
    public By login = By.id("login");


public SigninPage(Page page){
    PageFactory.initElements(driver, this);
}

    public void signIn(){

        driver.findElement(signin).click();
    }
    public void signInValidData(String email, String password) throws InterruptedException {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src=\"/iframe/login\"]"));
        driver.switchTo().frame(iframe);
        driver.findElement(Email).sendKeys(email);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(login).click();
    }

    public void createOne() throws InterruptedException {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src=\"/iframe/login\"]"));
        driver.switchTo().frame(iframe);
        driver.findElement(createone).click();
    }

    public void Google(){
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src=\"/iframe/create-account\"]"));
        driver.switchTo().frame(iframe);
        driver.findElement(google).click();
        driver.navigate().back();
    }
    public void Facebook(){
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src=\"/iframe/create-account\"]"));
        driver.switchTo().frame(iframe);
        driver.findElement(facebook).click();
    }

    public void gmailLoginData(String email, String password){
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src=\"/iframe/create-account\"]"));
        driver.switchTo().frame(iframe);
        driver.findElement(Email).sendKeys(email);
        driver.findElement(Password).sendKeys(password);
    }
}
