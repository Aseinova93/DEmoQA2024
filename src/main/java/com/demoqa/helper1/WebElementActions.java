package com.demoqa.helper1;

import com.demoqa.drivers.DriverManager;
import com.demoqa.pages.ProgressBar;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class WebElementActions {

    public Actions actions = new Actions(DriverManager.getDriver());

     public  WebElementActions click(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        waitElementToBeVisible(element);
        highLightElement(element);
        element.click();
        return this;
    }

    public WebElementActions sendKeys(WebElement element, String txt){
        waitElementToBeVisible(element);
        highLightElement(element);
        element.sendKeys(txt);
        return this;
    }

    public WebElementActions sendKeysForPicture(WebElement element, String txt){
        waitElementToBeVisible(element);
        scrollToElement(element);
        element.click();
        element.sendKeys(txt);
        return this;
    }



    // в инпут дает текстовое значение и нажимает энтер
    public WebElementActions sendKeysWithEnter(WebElement element, String txt){
        waitElementToBeVisible(element);
        scrollToElement(element);
        element.sendKeys(txt);
        element.sendKeys(Keys.ENTER);
        return this;
    }

    public WebElementActions enterWithSendKeys(WebElement element, String txt){
        waitElementToBeVisible(element);
        scrollToElement(element);
        element.sendKeys(Keys.ENTER);
        element.sendKeys(txt);
        return this;
    }


    public WebElementActions waitElementToBeClickAble(WebElement element){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
        .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public  WebElementActions waitElementToBeVisible(WebElement element){
        new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public WebElementActions scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public WebElementActions scrollToElementAndWait(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        waitElementToBeVisible(element);
        return this;
    }


    // два раза кликает на элемент, перформ означает выполнить
    public WebElementActions doubleClick(WebElement element){
        waitElementToBeVisible(element);
        waitElementToBeClickAble(element);
        actions.doubleClick(element).perform();
        return this;
    }

    public WebElementActions rightClick(WebElement element){
        waitElementToBeVisible(element);
        waitElementToBeClickAble(element);
        actions.contextClick(element).perform();
        return this;
    }

    public static void clickToRandomElement(List<WebElement> genderList) {
        if (genderList.isEmpty()) {
            System.out.println("Список пустой. Не могу выбрать случайный элемент.");
            return;
        }

        int randomIndex = new Random().nextInt(genderList.size());
        System.out.println(genderList.get(randomIndex).getText());
        genderList.get(randomIndex).click();
    }

    public static WebElement returnRandomElement(List<WebElement> genderList) {
        if (genderList.isEmpty()) {
            System.out.println("Список пустой. Не могу выбрать случайный элемент.");
        }
        int randomIndex = new Random().nextInt(genderList.size());
        return genderList.get(randomIndex);
    }

    public WebElementActions jsClick (WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
        js.executeScript("arguments[0].click();", element);
        return this;
    }

    // делает красным цветом элементы
    public WebElementActions highLightElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
        js.executeScript("arguments[0].style.border='3px solid red'", element);
        return this;
    }

    public WebElementActions moveToElement(WebElement element){
        waitElementToBeVisible(element);
        scrollToElement(element);
        actions.moveToElement(element).perform();
        return this;
    }

    public WebElementActions clearAndSendKeys(WebElement element, String txt) {
        element.clear();
        element.sendKeys(txt);
        return this;
    }

    public void pause(Integer milliseconds){
        try{
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }










}
