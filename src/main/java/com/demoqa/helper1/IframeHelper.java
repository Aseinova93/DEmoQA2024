package com.demoqa.helper1;

import org.openqa.selenium.WebDriver;

public class IframeHelper {

    private static WebDriver driver;

    public IframeHelper(WebDriver driver){
        this.driver = driver;
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public void switchToFrame(String nameOrID){
        driver.switchTo().frame(nameOrID);
    }
    
}
