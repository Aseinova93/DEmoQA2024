package com.demoqa.utils;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.Employee;
import com.demoqa.entities.PFormPageAlertEntity;
import com.demoqa.entities.PracticeFormEntity;
import com.demoqa.entities.TextBoxEntity;
import com.demoqa.helper1.WebElementActions;
import com.demoqa.pages.PFormPageAlert;
import com.demoqa.pages.WebTablePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RandomUtils {

    Faker faker = new Faker();
    PFormPageAlertEntity pFormPageAlertEntity = new PFormPageAlertEntity();


    public TextBoxEntity generateRandomTextBoxEntity() {
        TextBoxEntity textBoxEntity = new TextBoxEntity();
        textBoxEntity.setFullName(faker.name().fullName());
        textBoxEntity.setEmail(faker.internet().emailAddress());
        textBoxEntity.setCurrentAddress(faker.address().fullAddress());
        textBoxEntity.setPermanentAddress(faker.address().secondaryAddress());
        return textBoxEntity;
    }

    public PracticeFormEntity generateRandomPracticeFormEntity() {
        PracticeFormEntity practiceFormEntity = new PracticeFormEntity();
        practiceFormEntity.setFirstName(faker.name().firstName());
        practiceFormEntity.setLastName(faker.name().lastName());
        practiceFormEntity.setEmail(faker.internet().emailAddress());
        practiceFormEntity.setMobileNumber("1425572527");
        practiceFormEntity.setSubjects(faker.random().toString());
        practiceFormEntity.setCurrentAddress(faker.address().fullAddress());
        return practiceFormEntity;
    }

    public PFormPageAlertEntity generateRandomPFormEntityAlert() {
        pFormPageAlertEntity.setFirstName(faker.name().firstName());
        pFormPageAlertEntity.setLastName(faker.name().lastName());
        pFormPageAlertEntity.setEmail(faker.internet().emailAddress());
        pFormPageAlertEntity.setGender(WebElementActions.returnRandomElement(PFormPageAlert.genderList));
        pFormPageAlertEntity.setMobileNumber(1234567890);
        pFormPageAlertEntity.setSubjects("English");
        pFormPageAlertEntity.setSubjects("Chemistry");
        pFormPageAlertEntity.setUploadPicture("C:\\Users\\bmb49\\OneDrive\\Изображения\\dobroe utro.jpg");
        pFormPageAlertEntity.setCurrentAddress(faker.address().fullAddress());
        pFormPageAlertEntity.setSelectState("Uttar Pradesh");
        pFormPageAlertEntity.setSelectCity("Agra");
        return pFormPageAlertEntity;
    }

    public Employee createMockEmployee(){
        Employee employee = new Employee();

        employee.setFirstname(faker.name().firstName());
        employee.setLastname(faker.name().lastName());
        employee.setAge(faker.number().numberBetween(18, 100));
        employee.setEmail(faker.internet().emailAddress());
        employee.setSalary(faker.number().numberBetween(100000000L, 20000000L));
        employee.setDepartment(faker.job().position());
        return employee;
    }




}
