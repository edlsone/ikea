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
public class SearchTest {
    private WebDriver driver;
    public SearchTest() {
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
    driver.close(); // Close the browser after each test method
    }
    @Test
  public void testSearchTestCase() throws Exception {
    driver.get("https://www.ikea.com/us/en/");
    driver.findElement(By.id("ikea-search-input")).click();
    driver.findElement(By.id("ikea-search-input")).clear();
    driver.findElement(By.id("ikea-search-input")).sendKeys("sofa");
    driver.findElement(By.cssSelector(".search-box")).submit();
    driver.findElement(By.id("clear-input")).click();
    driver.findElement(By.id("ikea-search-input")).click();
    driver.findElement(By.id("ikea-search-input")).clear();
    driver.findElement(By.id("ikea-search-input")).sendKeys("picture");
    driver.findElement(By.cssSelector(".search-box")).submit();
    driver.findElement(By.id("ikea-search-input")).click();
    driver.findElement(By.id("clear-input")).click();
    driver.findElement(By.id("ikea-search-input")).click();
    driver.findElement(By.id("ikea-search-input")).clear();
    driver.findElement(By.id("ikea-search-input")).sendKeys("candle");
    driver.findElement(By.cssSelector(".search-box")).submit();
  }


}
