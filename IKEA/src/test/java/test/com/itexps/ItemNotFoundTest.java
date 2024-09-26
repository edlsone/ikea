/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class ItemNotFoundTest {
     private WebDriver driver;
     private String baseUrl;
    public ItemNotFoundTest() {
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
            driver.close();// Use quit() instead of close() to close all windows
    }
    }
       @Test
    public void testItemNotFoundTestCase() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.ikea.com/us/en/");
    driver.findElement(By.id("ikea-search-input")).click();
    driver.findElement(By.id("ikea-search-input")).clear();
    driver.findElement(By.id("ikea-search-input")).sendKeys("blush");
    driver.findElement(By.cssSelector(".search-box")).submit();
  }
    }
