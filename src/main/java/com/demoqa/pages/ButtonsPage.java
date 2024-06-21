package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage extends BasePage{

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickBtn;

    @FindBy(id = "doubleClickMessage")
    public WebElement getDoubleClickMessage;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButton;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickMessage;


}
