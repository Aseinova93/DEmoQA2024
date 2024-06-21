package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.helper1.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.demoqa.elements.BaseTest.driver;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public WebElementActions webElementActions = new WebElementActions();

    public void elementIframe(){
        WebElement iframeElement = driver.findElement(By.id("(\"google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0\""));
        driver.switchTo().defaultContent();
    }





}
