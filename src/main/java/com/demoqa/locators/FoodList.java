package com.demoqa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class FoodList {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bmb49\\IdeaProjects\\DemoQAWinter24\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://dostavka312.kg/");
        driver.manage().window().maximize();
    }

    @Test
    public void openLinks() {
        WebElement mainmenu = driver.findElement(By.xpath("//*[@id='tab-01']/div/p/a/img"));
        mainmenu.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://dostavka312.kg/category/11");
        findByRestaurantName("KFC Московская");
        Assert.assertTrue(driver.getTitle().contains("KFC Московская в Бишкеке - заказ и доставка"));
        Assert.assertTrue(driver.getCurrentUrl().contains("https://dostavka312.kg/garnirygpt/kfc-moskovskaja"));
        listOfKombo();
    }

    public void findByRestaurantName(String name) {
        List<WebElement> allRestaurants = driver.findElements(By.xpath("//div[@class='panel-heading']"));
        for (WebElement restaurant : allRestaurants) {
            System.out.println(restaurant.getText());

        }
        for (WebElement restaurant : allRestaurants) {
            if (restaurant.getText().contains(name)) {
                WebElement link = restaurant.findElement(By.xpath("./following-sibling::div/div/a[contains(@onclick,'ViewContent')]"));
                link.click();
                break;
            }
        }
    }

    public void listOfKombo(){
        List<WebElement>kombo = driver.findElements(By.xpath("//div[@class='food-title']"));
        for (WebElement komboFood : kombo){
            System.out.println(komboFood.getText());
        }
    }



//    public static WebElement pishpek;
//    public static void makeListOfRestaurants(){
//        List<WebElement> allRestaurants = driver.findElements(By.xpath("//div[@class='panel panel-default ']"));
//        for (WebElement restaurants : allRestaurants){
//            WebElement restaurant = restaurants.findElement(By.xpath(".//div[@class='panel-heading']/p"));
//            System.out.println(restaurant.getText());
//            if (restaurant.getText().equals("Ресторан Пишпек")){
//                pishpek = restaurants.findElement(By.xpath(".//a[@class='btn btn-success pull-right']"));
//            }
//        }
//        goToThePishpekRestaurant();
//    }
//
//    public static void goToThePishpekRestaurant(){
//        pishpek.click();
//
//    }

    }



