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
public class FindStoreTest {
    private WebDriver driver;
    public FindStoreTest() {
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
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize(); // Maximize the browser window
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    driver.close(); // Close the browser after each test method
    }
      @Test
  public void testFindStoreTestCase() throws Exception {
   
    driver.get("https://www.ikea.com/us/en/");
    driver.findElement(By.xpath("//div[@id='geo-ingka-navigation-desktop']/div/div/div/span")).click();
    driver.findElement(By.xpath("//div[@id='geo-ingka-navigation-desktop']/div[2]/div[3]/div/div/button")).click();
    driver.findElement(By.xpath("//div[@id='geo-ingka-navigation-desktop']/div/div/div/span")).click();
    driver.findElement(By.xpath("//button[@id='geo-market']/span/span")).click();
  }

}
