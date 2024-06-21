package com.demoqa.helper1;

import org.openqa.selenium.WebDriver;

import java.util.LinkedList;
import java.util.Set;

public class BrowserHelper {

    public WebDriver driver;

    public BrowserHelper(WebDriver driver) {
        this.driver = driver;
    }

    // открывает страницу с указанным url адресом
    public void open(String url){
        driver.navigate().to(url);
    }

    // нажимает на кнопку назад
    public void goBack(){
        driver.navigate().back();
    }

    // идет вперед
    public void goForward(){
        driver.navigate().forward();
    }

    // обновить страницу
    public void refreshThePage(){
        driver.navigate().refresh();
    }

    // открываем новые вкладки и кладем в сет
    public Set<String> getWindowHandles(){
        return driver.getWindowHandles();
    }

    // переход к определенной вкладке по индексу
    public void switchToWindow(int index){
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());
        if (index < 0 || index > windowsId.size())
            throw new IllegalArgumentException("Invalid index: " + index);
        driver.switchTo().window(windowsId.get(index));
    }

    public void switchToParentWindow(){
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());
        driver.switchTo().window(windowsId.get(0));
    }

    public void switchToParentWithChildClose(){
        switchToParentWindow();
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());
        for (int i = 1; i < windowsId.size(); i++) {
            driver.switchTo().window(windowsId.get(i));
            driver.close();
        }
        switchToParentWindow();
    }


}
