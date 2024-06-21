package com.demoqa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeWebDriver {
    public static WebDriver loadEdgeWebDriver(){
        System.setProperty("webdriver.edge.driver","C:\\drivers\\edgedriver_arm64");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }

    }

