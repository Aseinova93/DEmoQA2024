//package com.demoqa.pages;
//
//import com.demoqa.drivers.DriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class PracticeFormPage2 extends BasePage{
//
//    @FindBy(className = "react-datepicker__input-container")
//    public WebElement datePickerBtn;
//
//    public PracticeFormPage selectDateMonthYear(String dateMonthYear){ // 04 Jun 2024
//
//        // строчное значение 04 Jun 2024, делим на три части, с помощью метода split(regex: " ")-пробел разделяет на элементы
//        String [] dateMonthYearParts = dateMonthYear.split(" ");
//        String date = dateMonthYearParts[0];
//        String month = dateMonthYearParts[1];
//        String year = dateMonthYearParts[2];
//
//        webElementActions.click(datePickerBtn);
//
//        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
//
//    }
//}
