import com.demoqa.entities.PracticeFormEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {

    @Test
    public void textBoxTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        PracticeFormEntity practiceFormEntity = randomUtils.generateRandomPracticeFormEntity();
        demoQAPages.getPracticeFormPage().fillUpPracticeBoxForm(practiceFormEntity);
        Assert.assertTrue(true);
    }



}
