import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserHelperTest extends BaseTest {

    @Test
    void test123() throws InterruptedException {
        browserHelper.open("https://demoqa.com/browser-windows");
//        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
//        Thread.sleep(2000);
//        browserHelper.goBack();
//        Thread.sleep(2000);
//        browserHelper.goForward();
//        Thread.sleep(2000);
//        browserHelper.refreshThePage();

        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Thread.sleep(1000);
        browserHelper.switchToWindow(0);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Thread.sleep(1000);
        browserHelper.switchToWindow(0);
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Thread.sleep(1000);
        browserHelper.switchToWindow(0);
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Thread.sleep(1000);
        browserHelper.switchToWindow(3);
        Thread.sleep(4000);
        browserHelper.switchToParentWithChildClose();
        Thread.sleep(4000);
       




    }

}
