package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.Employee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WebTablePage extends BasePage {

    @FindBy(id = "addNewRecordButton")
    public WebElement addNewBtn;

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "age")
    public WebElement ageInput;

    @FindBy(id = "salary")
    public WebElement salaryInput;

    @FindBy(id = "department")
    public WebElement departmentInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(css = "[title='Delete']")
    public WebElement deleteBtn;

    @FindBy(css = "[title=\"Edit\"]")
    public WebElement editBtn;

    public WebTablePage addNewEmployee(Employee employee) throws Exception {

        String email = employee.getEmail();
        checkEmail(email);

        webElementActions.click(addNewBtn)
                .sendKeys(firstNameInput, employee.getFirstname())
                .sendKeys(lastNameInput, employee.getLastname())
                .sendKeys(ageInput, String.valueOf(employee.getAge()))
                .sendKeys(emailInput, employee.getEmail())
                .sendKeys(salaryInput, String.valueOf(employee.getSalary()))
                .sendKeys(departmentInput, employee.getDepartment())
                .click(submitBtn);
        return this;
    }

    public WebTablePage checkEmail(String email) throws Exception {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            String currentEmail = cells.get(3).getText();
            if (currentEmail.equals(email)) {
                throw new Exception("This email already exist");
            }
        }
        return this;
    }

    public WebTablePage deleteEmployee(String email) {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            String currentEmail = cells.get(3).getText();
            if (currentEmail.equals(email)) {
                WebElement deleteBtn = row.findElement(By.cssSelector("[title='Delete']"));
                deleteBtn.click();
                break;
            }
        }
        return this;
    }

    public WebTablePage editEmployee(String email){
        Employee employee = new Employee();
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            String currentEmail = cells.get(3).getText();
            if (currentEmail.equals(email)) {
                WebElement rowEditBtn = row.findElement(By.cssSelector("[title='Edit']"));
                rowEditBtn.click();
                wait.until(ExpectedConditions.visibilityOf(firstNameInput));
                wait.until(ExpectedConditions.visibilityOf(lastNameInput));
                wait.until(ExpectedConditions.visibilityOf(ageInput));
                wait.until(ExpectedConditions.visibilityOf(emailInput));
                wait.until(ExpectedConditions.visibilityOf(salaryInput));
                wait.until(ExpectedConditions.visibilityOf(departmentInput));

                    webElementActions.clearAndSendKeys(firstNameInput, employee.getFirstname());
                    webElementActions.clearAndSendKeys(lastNameInput, employee.getLastname());
                    webElementActions.clearAndSendKeys(ageInput, String.valueOf(employee.getAge()));
                    webElementActions.clearAndSendKeys(emailInput, employee.getEmail());
                    webElementActions.clearAndSendKeys(salaryInput, String.valueOf(employee.getSalary()));
                    webElementActions.clearAndSendKeys(departmentInput, employee.getDepartment());
                    webElementActions.click(submitBtn);
                     break;
                }
            }
        return this;
        }

        public ArrayList<Employee> getEmployeesFromTable() throws Exception {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        ArrayList<Employee> employees = new ArrayList<>();

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            if (cells.size() < 6) {
                // Пропускаем строки, которые не содержат достаточно ячеек
                continue;
            }

            try {
                String firstName = cells.get(0).getText();
                String lastName = cells.get(1).getText();
                String ageText = cells.get(2).getText().replaceAll("[^0-9]", "");
                String email = cells.get(3).getText();
                String salaryText = cells.get(4).getText().replaceAll("[^0-9]", "");
                String department = cells.get(5).getText();

                if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || email.isEmpty() || salaryText.isEmpty() || department.isEmpty()) {
                    continue;
                }

                int age = Integer.parseInt(ageText.trim());
                long salary = Long.parseLong(salaryText.trim());

                employees.add(new Employee(firstName, lastName, age, email, salary, department));
            } catch (NumberFormatException e) {
                // Логируем ошибку или обрабатываем её соответствующим образом
                continue;
            }
        }

        return employees;
    }
}