package com.demoqa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsDemoHomeWork {

    @Test
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='rct-text']/button[@class='rct-collapse rct-collapse-btn']")));
        WebElement knopkaVniz = driver.findElement(By.xpath("//span[@class='rct-text']/button[@class='rct-collapse rct-collapse-btn']"));
        knopkaVniz.click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")));
        WebElement strelkaDeskTop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
        strelkaDeskTop.click();

    }




}



