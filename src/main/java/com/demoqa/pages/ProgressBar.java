package com.demoqa.pages;

import com.demoqa.helper1.WebElementActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgressBar extends BasePage {

    @FindBy(id = "startStopButton")
    public WebElement startStopBtn;

    @FindBy(id = "progressBar")
    public  WebElement progressBar;

    @FindBy(xpath = "//div[@aria-valuenow]")
    public  WebElement aria_valueNow;

    @Step("Get progress bar value")
    public int getProgressBarValue(){
        String value = aria_valueNow.getAttribute("aria-valuenow");
        return Integer.parseInt(value);
    }
}






