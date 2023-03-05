package com.example.produktapi;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Selenium {
    @Test
    public void cheakTitle(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://java22.netlify.app/");

        WebElement h1Text = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/h1"));

        assertEquals("Testdriven utveckling - projekt",h1Text.getText(),"Test FAILD");

        driver.quit();
    }


    @Test
    public void numberOfProductsShouldBeTwenty(){
        // WebDriver driver;
        // System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\bin\\chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://java22.netlify.app/");


        List<WebElement> product = driver.findElements(By.className("productItem"));

        assertEquals(20,product.size());

        driver.quit();
    }

    @Test
    public void priceForThreeProducts(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://java22.netlify.app/");

        // //*[@id="productsContainer"]/div/div[1]/div/div/p/text()[1]
        // //*[@id="productsContainer"]/div/div[1]/div/div/p/text()[2]


        WebElement pText = driver.findElement(By.xpath("//*[@id=\"productsContainer\"]/div/div[1]/div/div/p/text()[2]"));
        //WebElement h1Text = driver.findElement(By.className("card-text"));
        //List<WebElement> product = driver.findElements(By.className("card-text"));
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(pText.getText());
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        // assertEquals("109.95",product.get(0));

        driver.quit();
    }
}

// Kolla på detta sen
/*
   @Test
    public void imageShouldBeVisible() {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://java22.netlify.app/");

        WebElement waiter = new WebDriverWait(driver, java.time.Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[6]/div/div/div/div[1]/div/img")));

        assertTrue(waiter.isDisplayed(), "bilden verkar inte läsas in");

        //WebElement productImage = driver.findElement(By.xpath("/html/body/div/div/div[6]/div/div/div/div[1]/div/img"));
        driver.quit();
    }
 */
