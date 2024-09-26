/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
public class myIkeaDropdownTest {
     private WebDriver driver;
    
    public myIkeaDropdownTest() {
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
        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize(); // Maximize the browser window
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        if (driver != null) {
            driver.close(); // Use quit() to close all windows
        }
    }
     @Test
  public void testDropDownTestCase() throws Exception {
    driver.get("https://www.ikea.com/us/en/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Products'])[2]/following::button[1]")).click();
    driver.findElement(By.xpath("//div[@id='hnf-carousel__tabs-navigation-rooms']/div/a/span[2]")).click();
    driver.findElement(By.xpath("//div[@id='hnf-carousel__tabs-navigation-rooms']/div[3]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='hnf-carousel__tabs-navigation-products']/div[6]/a/span")).click();
    driver.findElement(By.xpath("//img[contains(@src,'https://www.ikea.com/us/en/images/products/humlemott-throw-off-white__1204156_ph192207_s5.jpg?f=xxs')]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Off-white'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//div[@id='range-modal-mount-node']/div/div[3]/div/div[2]/div/div/div/a/div/div/span/img")).click();
  }
    
}
   


