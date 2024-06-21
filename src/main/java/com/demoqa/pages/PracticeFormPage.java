package com.demoqa.pages;

import com.demoqa.entities.PracticeFormEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPage extends BasePage {

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id="lastName")
    public WebElement lastNameInput;

    @FindBy(id="userEmail")
    public WebElement emailInput;

    @FindBy (xpath = "//label[contains(text(),'Male')]")
    public WebElement genderMaleCheckBox;

//    @FindBy (id = "gender-radio-2")
//    public WebElement genderFemaleCheckBox;
//
//    @FindBy (id = "gender-radio-3")
//    public WebElement genderOtherCheckBox;

    @FindBy(id="userNumber")
    public WebElement mobileNumberInput;

    @FindBy(id="subjectsInput")
    public WebElement subjectsInput;

    @FindBy (xpath = "//label[contains(text(), 'Sports')]")
    public WebElement hobbiesSportsCheckBox;

//    @FindBy (id = "hobbies-checkbox-2")
//    public WebElement hobbiesReadingCheckBox;

    @FindBy (xpath = "//label[text()='Music']")
    public WebElement hobbiesMusicCheckBox;

    @FindBy(id="currentAddress")
    public WebElement currentAddressInput;

    @FindBy(xpath = "//button[contains(text(), 'Submit')]")
    public WebElement submitBtn;

    public  PracticeFormPage fillUpPracticeBoxForm(PracticeFormEntity practiceFormEntity) throws InterruptedException {
        webElementActions.sendKeys(firstNameInput, practiceFormEntity.getFirstName())
                .sendKeys(lastNameInput, practiceFormEntity.getLastName())
                .sendKeys(emailInput, practiceFormEntity.getEmail())
                .scrollToElement(genderMaleCheckBox)
                .click(genderMaleCheckBox)
                .sendKeys(mobileNumberInput, practiceFormEntity.getMobileNumber())
                .sendKeys(subjectsInput, practiceFormEntity.getSubjects())
                .click(hobbiesSportsCheckBox)
                .click(hobbiesMusicCheckBox)
                .sendKeys(currentAddressInput, practiceFormEntity.getCurrentAddress())
                .click(submitBtn);
        return this;
    }



}
