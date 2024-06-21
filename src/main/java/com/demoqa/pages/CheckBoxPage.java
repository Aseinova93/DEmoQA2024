package com.demoqa.pages;

import com.demoqa.entities.TextBoxEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage{

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/span/button")
    public WebElement homeStrelkaVniz;

   @FindBy(xpath = "//*[@class=\"rct-checkbox\"]")
    public WebElement inputKvadrat;

    public  CheckBoxPage checkBoxes() throws InterruptedException {
        webElementActions.click(homeStrelkaVniz)
                .click(inputKvadrat);
        return this;
    }


}
