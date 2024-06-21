package com.demoqa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsDemo {
    public static Actions actions;

    @Test
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\bmb49\\IdeaProjects\\DemoQAWinter24\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();
        actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter"))).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait1.until(ExpectedConditions.attributeToBe(By.id("colorChange"), "class", "mt-4 text-danger btn btn-primary"));
        String classValue = driver.findElement(By.id("colorChange")).getAttribute("class");
        System.out.println(classValue);

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter"));

    }




}
