package com.demoqa.pages;

import com.demoqa.entities.TextBoxEntity;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id="userEmail")
    public WebElement emailInput;

    @FindBy(id="currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id="permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id="submit")
    public WebElement submitBtn;

    public TextBoxPage fillUpTextBoxForm(String fullName, String email, String currentAddress, String permanentAddress) throws InterruptedException {
    webElementActions.sendKeys(fullNameInput, fullName)
            .sendKeys(emailInput, email)
            .sendKeys(currentAddressInput, currentAddress)
            .sendKeys(permanentAddressInput, permanentAddress)
            .click(submitBtn);
    return this;
    }

    @Step("Fill up text box form {0}")
    public  TextBoxPage fillUpTextBoxForm(TextBoxEntity textBoxEntity) throws InterruptedException {
        webElementActions.sendKeys(fullNameInput, textBoxEntity.getFullName())
                .sendKeys(emailInput, textBoxEntity.getEmail())
                .sendKeys(currentAddressInput, textBoxEntity.getCurrentAddress())
                .sendKeys(permanentAddressInput, textBoxEntity.getPermanentAddress())
                .click(submitBtn);
        return this;
    }


}
