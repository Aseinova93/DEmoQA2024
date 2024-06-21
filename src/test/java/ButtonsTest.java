import com.demoqa.helper1.BrowserHelper;
import com.demoqa.helper1.WebElementActions;
import com.demoqa.pages.ButtonsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{

    @Test(description = "Verify double click button is working propertly")
    public void doubleClickTest(){
        browserHelper.open("https://demoqa.com/buttons");
        webElementActions.doubleClick(demoQAPages.getButtonsPage().doubleClickBtn);
        Assert.assertEquals(demoQAPages.getButtonsPage().getDoubleClickMessage.getText(), "You have done a double click");
    }

    @Test(description = "Verify right click button is working propertly")
    public void rightClickBtn(){
        browserHelper.open("https://demoqa.com/buttons");
        webElementActions.rightClick(demoQAPages.getButtonsPage().rightClickButton);
        Assert.assertEquals(demoQAPages.getButtonsPage().rightClickMessage.getText(), "You have done a right click");
    }
}
