package com.demoqa.pages;

import com.demoqa.entities.PFormPageAlertEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PFormPageAlert extends BasePage {

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement firstNameInput;

    @FindBy(css = "[placeholder='Last Name']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//div[@class=\"col-md-9 col-sm-12\"]/input[@placeholder=\"name@example.com\"]")
    public WebElement emailInput;

    @FindBy(xpath = "//label[text()='Male']")
    public WebElement genderMaleCheckBox;

    @FindBy(xpath = "//label[text()='Female']")
    public WebElement genderFemaleCheckBox;

    @FindBy(xpath = "//label[text()='Other']")
    public WebElement genderOtherCheckBox;

    @FindBy(xpath = "//label[contains(@for, 'gender-radio')]")
    public static List<WebElement> genderList;

    @FindBy(id = "userNumber")
    public WebElement userNumberInput;

    @FindBy(id = "subjectsInput")
    public WebElement subjectInput;

    @FindBy(xpath = "//label[contains(text(), 'Sports')]")
    public WebElement hobbiesSportCheckBox;

    @FindBy(xpath = "//label[contains(text(), 'Music')]")
    public WebElement hobbiesMusicCheckBox;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement selectPictureCheckBox;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "react-select-3-input")
    public WebElement selectStateInput;

    @FindBy(id = "react-select-4-input")
    public WebElement selectCityInput;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitBtn;

    public PFormPageAlert fillUpPFormpageAlert(PFormPageAlertEntity pFormPageAlertEntity) throws InterruptedException {
        webElementActions.sendKeys(firstNameInput, pFormPageAlertEntity.getFirstName())
                .sendKeys(lastNameInput, pFormPageAlertEntity.getLastName())
                .sendKeys(emailInput, pFormPageAlertEntity.getEmail())
                .click(pFormPageAlertEntity.getGender())
                .sendKeys(userNumberInput, String.valueOf(pFormPageAlertEntity.getMobileNumber()))
                .sendKeysWithEnter(subjectInput, pFormPageAlertEntity.getSubjects())
                .click(hobbiesSportCheckBox)
                .click(hobbiesMusicCheckBox)
                .sendKeys(selectPictureCheckBox, pFormPageAlertEntity.getUploadPicture())
                .sendKeys(currentAddressInput, pFormPageAlertEntity.getCurrentAddress())
                .scrollToElementAndWait(selectStateInput)
                .sendKeysWithEnter(selectStateInput, pFormPageAlertEntity.getSelectState())
                .scrollToElementAndWait(selectCityInput)
                .sendKeysWithEnter(selectCityInput, pFormPageAlertEntity.getSelectCity())
                .click(submitBtn);
        return this;
    }

}
