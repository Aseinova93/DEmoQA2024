package com.demoqa.locators;

import com.demoqa.elements.BaseTest;
import com.demoqa.helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NambaHomeWork extends BaseTest {

    final String name = "Aida";
    final String userAddress = "Bokonbayeva 52";
    final String kvartiraEtaj = "3, 1";
    final String numberOfPhone = "0555888888";
    final String anyInformation = "No";
    final String sda4a = "10000";

    @Test
    public void orderFoodAndRegistration() throws InterruptedException {
        WebElement foodLink = driver.findElement(By.xpath("(//a[@href=\"/food\"])[1]"));
        foodLink.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nambafood.kg/food", "Invalid URL");
        goToTheNationalFoods();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nambafood.kg/cafe/national", "Invalid URL");
        setAlligatorGreen();
        Assert.assertEquals(driver.getCurrentUrl(), "https://nambafood.kg/alligator");
        clickButtonOfAddShefSalads();
        clickToOrderShefSalad();
        goClickBasketButton();
        clickOrder();
        fullName();
        setAddress();
        setKvartiraEtaj();
        setNumberOfPhone();
        setAnyInformation();
        setSda4a();
        clickLastOrder();
    }


    public void goToTheNationalFoods() {
        WebElement nationalFood = driver.findElement(By.xpath("//div[text()='Национальная кухня']"));
        nationalFood.click();
    }

    public void setAlligatorGreen() {
        WebElement alligatorGreen = driver.findElement(By.xpath("//div[normalize-space(text())='Кафе Alligator Green']"));
        alligatorGreen.click();
    }

    public void clickButtonOfAddShefSalads(){
        WebElement shefSalat = driver.findElement(By.xpath("(//div[@class='count-button count-up'])[1]"));
        actions.moveToElement(shefSalat).click().perform();
   }

   public void clickToOrderShefSalad(){
        WebElement orderShefSalad = driver.findElement(By.xpath("(//button[@class='status active bay_item'])[1]"));
        orderShefSalad.click();
   }

   public void goClickBasketButton(){
        WebElement basket = driver.findElement(By.xpath("//span[@class='count']"));
        Helper.clickAnywhere(basket);
  }

    public void clickOrder(){
        WebElement order = driver.findElement(By.xpath("/html/body/main/section/div[1]/div[5]/div[11]/a/button"));
        order.click();
    }

    public void fullName(){
        WebElement fieldOfName = driver.findElement(By.xpath("//*[@id=\"food_order_client_name\"]"));
        fieldOfName.sendKeys(name);
    }

    public void setAddress(){
        WebElement address = driver.findElement(By.xpath("//input[@placeholder='Введите адрес доставки']"));
        address.sendKeys(userAddress);
    }

    public void setKvartiraEtaj(){
        WebElement kvEtaj = driver.findElement(By.xpath("//input[@name='food_order[door_code]']"));
        kvEtaj.sendKeys(kvartiraEtaj);
    }

    public void setNumberOfPhone(){
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"food_order_phone\"]"));
        phone.sendKeys(numberOfPhone);
    }

    public void setAnyInformation(){
        WebElement info = driver.findElement(By.xpath("//*[@id=\"food_order_additional_info\"]"));
        info.sendKeys(anyInformation);
    }

    public void setSda4a(){
        WebElement sda4aOfCash = driver.findElement(By.xpath("//*[@id=\"food_order_money_change\"]"));
        sda4aOfCash.sendKeys(sda4a);
    }

    public void clickLastOrder(){
        WebElement order = driver.findElement(By.xpath("//*[@id=\"payment_cash\"]"));
        order.click();
    }
}
