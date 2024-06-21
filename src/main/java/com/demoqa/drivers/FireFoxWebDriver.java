package com.demoqa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;


import java.time.Duration;

public class FireFoxWebDriver {
    public static WebDriver loadFireFoxDriver(){
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }



}

