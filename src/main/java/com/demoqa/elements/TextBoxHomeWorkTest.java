package com.demoqa.elements;

import com.demoqa.helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxHomeWorkTest extends BaseTest {

    private String name = "Aida";
    private String userEmail = "berbetb@sasa.com";
    private String userCurrentAddress = "Ibraimova 56";
    private String userPermanentAddress = "\"Tolomushova 45\"";

    @Test(description = "Users registration")
    public void registrationTest() {
        WebElement searchInput = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        WebElement currentAddressInput = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement permanentAddressInput = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        WebElement profileButton = driver.findElement(By.xpath("//button[@id='submit']"));

        searchInput.sendKeys(name);
        emailInput.sendKeys(userEmail);
        currentAddressInput.sendKeys(userCurrentAddress);
        permanentAddressInput.sendKeys(userPermanentAddress);
        Helper.scrollToElement(profileButton).click();

        String fullName = driver.findElement(By.xpath("//p[@id='name']")).getText();
        Assert.assertEquals(fullName.substring(fullName.indexOf(':')+1), name);

        String email = driver.findElement(By.xpath("//p[@id='email']")).getText();
        Assert.assertEquals(email.substring(email.indexOf(':')+1), userEmail);

       String currentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
       Assert.assertEquals(currentAddress.substring(currentAddress.indexOf(":")+1), userCurrentAddress);

       String permanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
       Assert.assertEquals(permanentAddress.substring(permanentAddress.indexOf(":")+1), userPermanentAddress);

       Assert.assertTrue(profileButton.isDisplayed(), "Profile button should be displayed.");
       Assert.assertTrue(profileButton.isEnabled(), "Profile button should be enabled.");

    }

}
