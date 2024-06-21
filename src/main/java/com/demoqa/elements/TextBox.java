package com.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class TextBox {

    private WebDriver driver;
    @BeforeClass
    private void setUp1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\bmb49\\IdeaProjects\\DemoQAWinter24\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        //  Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Test
    void fillBlank(){
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Aida");
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("aida.aseinovich@gmail.com");
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Chokmorova street 58");
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("selo Koy-Tash 58");
        WebElement submitButton = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        scrollToElement(submitButton).click();
    }

    public WebElement scrollToElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        return element;
    }

}

