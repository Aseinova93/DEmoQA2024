import com.demoqa.enums.Endpoints;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

import static com.demoqa.enums.Endpoints.ALERT;

public class AlertPageTest extends BaseTest{

    @Test(groups = {"Smoke", "UI", "1721"}, description = "Alert test")
    void alertTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL")+ ALERT.getEndpoint());
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        alertHelper.acceptAlert();
        webElementActions.pause(5000);

    }

    @Test(groups = {"Regression", "API", "1722"}, description = "Alert test 1")
    void alertTest1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        Thread.sleep(3000);
    }

    @Test(groups = {"E2E", "SQL", "1723"}, description = "Alert test 2")
    void alertTest2() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        Thread.sleep(3000);
    }
}
