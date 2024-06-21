package com.demoqa.helper1;

import com.demoqa.drivers.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    public WebDriver driver = DriverManager.getDriver();

    // создаем конструктор
    public AlertHelper(WebDriver driver){
        this.driver=driver;
    }

    // переход от http к алерту, всплывающему окну, ждет пока алерт не появится в течение 10 секунд
    public Alert getAlert(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert();
    }

    // // нажимаем на кнопку ok алерта
    public void acceptAlert(){
        getAlert().accept();
    }

    // нажимаем на кнопку cancel алерта
    public void dismissAlert(){
        getAlert().dismiss();
    }

    // вытаскиваем текс алерта
    public String getAlertText(){
        return getAlert().getText();
    }

    // есть ли такой алерт? проверяет существует ли всплывающее окно?
    public boolean isAlertPresent(){
        try{
            driver.switchTo().alert();
            return true;
        }catch (NoAlertPresentException e){
            return false;
        }
    }

    // если алерта нет, то выйди из метода, остановись, если есть нажми на ок, то есть прими
    public void acceptAlertIfPresented(){
        if (!isAlertPresent())
            return;
        acceptAlert();
    }

    // если есть алерт, нажми на cancel
    public void dismissAlertIfPresented(){
        if (!isAlertPresent())
            return;
        dismissAlert();
    }

    // если есть алерт, то мы передаем текст и нажимаем ок
    public void acceptPrompt(String txt){
        if (!isAlertPresent())
            return;
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.accept();
    }

    // если есть алерт, то мы передаем текст и нажимаем cancel
    public void dismissPrompt(String txt){
        if (!isAlertPresent())
            return;
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.dismiss();
    }















}
