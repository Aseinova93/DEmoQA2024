import com.demoqa.entities.PFormPageAlertEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PFormAlertTest extends BaseTest{

    @Test
    public void textBoxTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/automation-practice-form");
        PFormPageAlertEntity pFormPageAlertEntity = randomUtils.generateRandomPFormEntityAlert();
        demoQAPages.getPFormPageAlert().fillUpPFormpageAlert(pFormPageAlertEntity);
        Assert.assertTrue(true);
    }

}
