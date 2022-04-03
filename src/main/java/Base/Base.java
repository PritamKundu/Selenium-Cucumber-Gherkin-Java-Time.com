package Base;


import core.WebConnector;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import Pages.Page;


public class Base extends Page{

    @Before("@baseURL")
    public void startTest() throws InterruptedException {
            WebConnector connector = new WebConnector();
            driver = connector.openBrowser();
            driver.get(myProp.getProperty("webUrl"));
            driver.manage().window().maximize();
            Thread.sleep(5000);
        }



    @Before("@worldPage")
    public void worldPageSetup() throws Exception {
        WebConnector connector = new WebConnector();
        driver = connector.openBrowser();
        driver.get(myProp.getProperty("worldUrl"));
        driver.manage().window().maximize();
        Thread.sleep(10000);
    }

    @Before("@businessPage")
    public void businessPageSetup() throws InterruptedException {
        WebConnector connector = new WebConnector();
        driver = connector.openBrowser();
        driver.get(myProp.getProperty("businessPage"));
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }


    @Before("@sciencePage")
    public void sciencePageSetup()  {
        WebConnector connector = new WebConnector();
        driver = connector.openBrowser();
        driver.get(myProp.getProperty("sciencePage"));
        driver.manage().window().maximize();
    }

/*    @After
    public void afterTest() {
        if (driver != null) {
            driver.quit();
        }

    }*/
    }

