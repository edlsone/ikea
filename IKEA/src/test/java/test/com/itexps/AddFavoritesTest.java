/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ana
 */
public class AddFavoritesTest {
    private WebDriver driver;
     
    public AddFavoritesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize(); // Maximize the browser window
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
          if (driver != null) {
            driver.close();// Use quit() instead of close() to close all windows
    }
    }
     @Test
  public void testAddFavoritesTestCase() throws Exception {
    driver.get("https://www.ikea.com/us/en/");
    driver.findElement(By.xpath("//div[@id='hnf-carousel__tabs-navigation-products']/div[8]/a/span")).click();
    driver.findElement(By.linkText("Outdoor cushions")).click();
    driver.findElement(By.xpath("//div[@id='hnf-carousel__tabs-navigation-products']/div[2]/a/span")).click();
    driver.findElement(By.xpath("//img[contains(@src,'https://www.ikea.com/us/en/images/products/gullbergsoe-cushion-cover-yellow-white-stripe-outdoor-indoor__1180711_pe896420_s5.jpg?f=xxs')]")).click();
    driver.findElement(By.xpath("//div[@id='pip-buy-module-content']/div/div/div/div/span/h1/div/div[2]/button/span")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='GULLBERGSÖ was saved to My list.'])[1]/following::span[1]")).click();
  }
}
