import com.demoqa.entities.Employee;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablePageTest extends BaseTest{

    @Test(description = "WebTablePage")
    public void webTableTest() throws Exception {
        driver.get("https://demoqa.com/webtables");
        demoQAPages.webTablePage.addNewEmployee(randomUtils.createMockEmployee());
        Thread.sleep(6000);
        demoQAPages.webTablePage.deleteEmployee("alden@example.com");
        Thread.sleep(5000);
        demoQAPages.webTablePage.editEmployee("cierra@example.com");
        Thread.sleep(2000);

        List<Employee> employees = demoQAPages.webTablePage.getEmployeesFromTable();
        for (Employee employee : employees){
            System.out.println(employee);
        }

    }
}
