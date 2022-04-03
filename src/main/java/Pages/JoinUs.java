package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static core.WebConnector.driver;

public class JoinUs {

    public JoinUs(Page page) {
        PageFactory.initElements(driver, this);
    }

    //Join Us Page Elements

    public By checkbox1 = By.xpath("//input[@id='inside-newsletter']");
    public By checkbox2 = By.xpath("//input[@id='thebrief-newsletter']");
    public By checkbox3 = By.xpath("//input[@id='health-newsletter']");
    public By selectAll = By.xpath("//body/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]");

    public By FB = By.xpath("//body/div[1]/footer[1]/div[2]/span[1]/a[1]/*[1]");
    public By IG = By.xpath("//body/div[1]/footer[1]/div[2]/span[2]/a[1]/*[1]");
    public By TW = By.xpath("//body/div[1]/footer[1]/div[2]/span[3]/a[1]/*[1]");
    public By PT = By.xpath("//body/div[1]/footer[1]/div[2]/span[4]/a[1]/*[1]");


    //Shop The Page Elements & Methods
    public By featured = By.xpath("//body/div[3]/div[2]/div[1]/div[1]/a[1]/img[1]");
    public By cover = By.xpath("//body/div[3]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/a[1]/img[1]");
    public By pricebox = By.xpath("/html/body/main/div[3]/div[1]/div[6]/a[1]/div[2]/span");
    public By printclick = By.xpath("/html/body/main/div[3]/div[8]/div/div[1]/div[1]/button");
    public By printsizeclick = By.xpath("/html/body/main/div[3]/div[8]/div/div[1]/div[3]/button[4]");
    public By canvaswrap = By.xpath("//button[@id='buttonSimpleSelectedCanvasWrap']");
    public By rolledcanvasclick = By.xpath("/html/body/main/div[3]/div[8]/div/div[2]/div/button[5]");
    public By canvastype = By.xpath("//button[@id='buttonSimpleSelectedPaper']");
    public By canvastypeclick = By.xpath("//button[@id='buttonSimplePaper_paper13cx']");
    public By framemenuclick = By.xpath("//button[@id='buttonSimpleSelectedFrame']");
    public By framecolor = By.xpath("//button[@id='buttonSimpleSelectedFrameColor']");
    public By colorclick = By.xpath("//button[@id='buttonSimpleFrameColor_Silver']");
    public By frameclick = By.xpath("/html/body/main/div[3]/div[8]/div/div[4]/div/button[1]/img");
    public By addtocurt = By.xpath("/html/body/main/div[3]/div[6]/div[1]/div[2]/button");


    //Join Us page methods
    public By newsletter = By.xpath("//header/nav[2]/section[1]/section[2]/ul[1]/li[1]/a[1]");

    public void scrollDown3() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3000)");
    }


    public void news() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement new1 = driver.findElement(newsletter);
        js.executeScript("arguments[0].scrollIntoView();", new1);
    }


    public void newsclick() {
        driver.findElement(newsletter).click();
    }


    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
    }


    public void checkboxClick1() {
        driver.findElement(checkbox1).click();
    }


    public void checkboxClick2() {
        driver.findElement(checkbox2).click();
    }


    public void checkboxClick3() {
        driver.findElement(checkbox3).click();
    }


    public void selectAll() {
        driver.findElement(selectAll).click();
    }


    public void scrollDown1() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,5000)");

    }

    public void FB() {
        driver.findElement(FB).click();
    }

    public void IG() {
        driver.findElement(IG).click();
    }


    public void TW() {
        driver.findElement(TW).click();
    }

    public void PT() {
        driver.findElement(PT).click();
    }


    public void scrollDown2() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
    }


    public By ShopTime = By.xpath("//header/nav[2]/section[1]/section[2]/ul[1]/li[5]");

    public void shopTime() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Shoptime = driver.findElement(ShopTime);
        js.executeScript("arguments[0].scrollIntoView();", Shoptime);
        Shoptime.click();
    }


    public void scrollDown4() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,800)");
    }

    public void featuredClick() {
        driver.findElement(featured).click();
    }

    public void coverClick() {
        driver.findElement(cover).click();
    }

    public void priceBoxClick() {
        driver.findElement(pricebox).click();
    }

    public void printClick() {
        driver.findElement(printclick).click();
    }

    public void printSizeClick() {
        driver.findElement(printsizeclick).click();
    }

    public void canvasWrap() {
        driver.findElement(canvaswrap).click();
    }

    public void canvasWrapClick() {
        driver.findElement(rolledcanvasclick).click();
    }

    public void canvasType() {
        driver.findElement(canvastype).click();
    }

    public void canvasTypeClick() {
        driver.findElement(canvastypeclick).click();
    }

    public void frameMenuClick() {
        driver.findElement(framemenuclick).click();
    }

    public void frameColor() {
        driver.findElement(framecolor).click();
    }

    public void frameColorClick() {
        driver.findElement(colorclick).click();
    }

    public void frameClick() {
        driver.findElement(frameclick).click();
    }

    public void addToCurt() {
        driver.findElement(addtocurt).click();
    }

    public void scrollUP() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-300)");
    }
}


