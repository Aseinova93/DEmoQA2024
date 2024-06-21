import com.demoqa.entities.TextBoxEntity;
import com.opera.core.systems.OperaWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxPageTest extends BaseTest{

    @Test
    public void checkBoxTest() throws InterruptedException {
        driver.get("https://demoqa.com/checkbox");
        demoQAPages.getCheckBoxPage().checkBoxes();
        WebElement checkBox = driver.findElement(By.xpath("//div[@id='result']"));
        Assert.assertTrue(checkBox.isDisplayed());

      
    }

}
