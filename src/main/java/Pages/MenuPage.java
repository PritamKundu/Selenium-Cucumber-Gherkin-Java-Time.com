package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static core.WebConnector.driver;

public class MenuPage {

    public By digitalSubscription = By.xpath("/html/body/main/div[2]/div/section/ul/li[1]/a");
    public By globalCenter = By.xpath("/html/body/header/nav[2]/section/section[3]/ul/li[2]");


    public MenuPage(Page page)
    {
        PageFactory.initElements(driver, this);
    }


    public void scrollDown1() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
    }


    public void globalCenter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Global = driver.findElement(globalCenter);
        js.executeScript("arguments[0].scrollIntoView();", Global);
        Global.click();
    }


    public void digitalSubscription(){
        driver.findElement(digitalSubscription).click();
    }


    public void allLinks(){
        List<WebElement> alllinks = driver.findElements(By.xpath("/html/body/main/div[2]/div/section/ul/li"));
        WebElement q;
        for (int i =0; i<alllinks.size();i++){
            q = alllinks.get(i);
            q.click();
            driver.navigate().back();
        }
    }


    //Reach Room
    public By pressroom = By.xpath("/html/body/header/nav[2]/section/section[4]/ul/li[2]/a");
    public By post = By.xpath("/html/body/main/div/section[1]/div[2]/div[1]/a/div[2]/h2");

    public void PressRoom(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement PressRoom = driver.findElement(pressroom);
        js.executeScript("arguments[0].scrollIntoView();", PressRoom);
        PressRoom.click();
    }

    public void postClick(){
        driver.findElement(post).click();
    }


    //California page
    public By california = By.xpath("/html/body/header/nav[2]/section/section[5]/ul/li[2]/a");
    public By toptoback = By.xpath("/html/body/ol[13]/p[7]/a");

    public void California(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement California = driver.findElement(california);
        js.executeScript("arguments[0].scrollIntoView();", California);
        California.click();
    }

    public void scrollDown5() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,7000)");
    }

    public void topToBack(){
        driver.findElement(toptoback).click();
    }

    public void socialIconClick() {
        List<WebElement> allsociallink = driver.findElements(By.xpath("/html/body/header/nav[2]/section/section[6]/ul/li"));
        for (WebElement allLink : allsociallink) {
            allLink.click();
        }
    }
}
