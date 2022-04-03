package Pages;
import core.ConfigUtil;
import core.WebConnector;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Page{

    public static Properties myProp = ConfigUtil.getConfig("config");
    public WebDriver driver = WebConnector.driver;

    Sections sections = new Sections(this);
    protected Sections getSections() { return sections; }

    JoinUs joinus = new JoinUs(this);
    protected JoinUs getJoinUs() { return joinus; }

    MenuPage menuPage = new MenuPage(this);
    protected MenuPage getMenuPage(){return menuPage;}

    SigninPage signinpage = new SigninPage(this);
    protected SigninPage getSigninPage(){return signinpage;}

    MyAccount myaccount = new MyAccount(this);
    protected MyAccount getMyAccount(){return myaccount;}

}
