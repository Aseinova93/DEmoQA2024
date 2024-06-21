package com.demoqa.drivers;

import com.opera.core.systems.OperaDriver;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class OperaWebDriver {
        public static WebDriver loadOperaDriver(){
            System.setProperty("opera.path\"","\"C:\\drivers\\OperaSetup.exe\"");
            WebDriver driver = new OperaDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            return driver;
        }

    }
