import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.TextBoxEntity;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{

    @Test
    public void textBoxTest() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        TextBoxEntity textBoxEntity = randomUtils.generateRandomTextBoxEntity();
        demoQAPages.getTextBoxPage().fillUpTextBoxForm(textBoxEntity);
        Assert.assertTrue(true);
    }
}
