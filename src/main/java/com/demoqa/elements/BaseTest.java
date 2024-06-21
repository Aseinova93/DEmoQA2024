package com.demoqa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {
    public static WebDriver driver;
    public static Actions actions;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://nambafood.kg/");
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }

//    @AfterClass
//    public void afterClass(){
//        if (driver != null){
//            driver.close();
//            driver.quit();
//        }
//    }
}
