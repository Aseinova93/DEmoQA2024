package com.demoqa.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicLocators {

    @Test(description = "Find by ID")
    void  findByidTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

//        String texteBoxText = driver.findElement(By.tagName("h1")).getText();
//        System.out.println(texteBoxText);

//        WebElement homeLink = driver.findElement(By.linkText("Home"));
//        homeLink.click();

//        WebElement emailInput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/input"));
//        emailInput.sendKeys("maseinova@mail.ru");

//        WebElement element = driver.findElement(By.xpath("(//textarea[@class='form-control'])[2]"));
//        element.sendKeys("Hello");
//
//        String permanent = driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
//        System.out.println(permanent);

        String perm = driver.findElement(By.xpath("//label[contains(text(), 'Current')]")).getText();
        System.out.println(perm);

    }
}
