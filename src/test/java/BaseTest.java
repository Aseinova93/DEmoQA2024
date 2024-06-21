import com.demoqa.drivers.DriverManager;
import com.demoqa.helper1.AlertHelper;
import com.demoqa.helper1.BrowserHelper;
import com.demoqa.helper1.IframeHelper;
import com.demoqa.helper1.WebElementActions;
import com.demoqa.pages.*;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected RandomUtils randomUtils;
    protected WebElementActions webElementActions;
    protected AlertHelper alertHelper;
    protected BrowserHelper browserHelper;
    protected Actions actions;
    protected DemoQAPages demoQAPages;
    protected IframeHelper iframeHelper;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
    driver = DriverManager.getDriver();
    randomUtils = new RandomUtils();
    webElementActions = new WebElementActions();
    alertHelper = new AlertHelper(driver);
    browserHelper = new BrowserHelper(driver);
    actions = new Actions(driver);
    demoQAPages = new DemoQAPages();
    iframeHelper = new IframeHelper(driver);
    }



//    @AfterClass(alwaysRun = true)
//    public void tearDown(){
//        DriverManager.closeDriver();
//    }

}
