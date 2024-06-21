package com.demoqa.helper;

import com.demoqa.elements.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Helper extends BaseTest{
    public static WebElement scrollToElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        return element;
    }

    public static WebElement scrollToElementAndClick(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        return element;
    }

    public static WebElement clickAnywhere(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        return element;
    }
}
