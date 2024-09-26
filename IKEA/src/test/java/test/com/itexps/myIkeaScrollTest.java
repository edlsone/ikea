/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
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
public class myIkeaScrollTest {
    private WebDriver driver;
    public myIkeaScrollTest() {
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
         driver = new ChromeDriver(); // Initialize the WebDriver here
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
          if (driver != null) {
            try {
                 driver.close(); // Close the current window
            } catch (Exception e) {
                System.out.println("Error while quitting driver: " + e.getMessage());
            }
        }
    }
     @Test
        public void testScroll() throws InterruptedException {
            driver.manage().window().maximize();
            driver.get("https://www.ikea.com/us/en/");
               JavascriptExecutor js = (JavascriptExecutor) driver;
              js.executeScript("window.scrollBy(0,250)", "");

               Thread.sleep(5000);
              
        }
}
