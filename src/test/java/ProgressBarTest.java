import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest{

    @Test(description = "ariaValueNow")
    public void progressBarTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/progress-bar");
        webElementActions.click(demoQAPages.getProgressBar().startStopBtn);
        Thread.sleep(2000);

        String valueNow;
        while (true){
            valueNow = demoQAPages.getProgressBar().aria_valueNow.getAttribute("aria-valuenow");
            if (valueNow.equals("52")){
                webElementActions.click(demoQAPages.getProgressBar().startStopBtn);
                break;
            }
        }
        Assert.assertEquals(valueNow, "52");


    }
}
