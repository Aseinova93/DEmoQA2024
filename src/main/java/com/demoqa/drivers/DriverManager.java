package com.demoqa.drivers;

import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static WebDriver driver;

    public  static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getValue("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxDriver();
                    break;
                case "edge" :
                    driver = EdgeWebDriver.loadEdgeWebDriver();
                case "opera" :
                    driver = OperaWebDriver.loadOperaDriver();
                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
                if (driver != null){
                    driver.close();
                    driver.quit();
                    driver=null;
                }
        }catch (Exception e){
            System.out.println("Error while closing driver");
        }
    }
}
