/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
public class myIkeaMouseTest {
    private WebDriver driver;
    public myIkeaMouseTest() {
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
    public void testMouseHoverTestCase() throws Exception {
        driver.get("https://www.ikea.com/us/en/");
        
        // Click on the specific product category
        driver.findElement(By.xpath("//div[@id='hnf-carousel__tabs-navigation-products']/div[4]/a/span")).click();
        
        // Wait for the "Tables & desks" element to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement tablesAndDesksElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Tables & desks')]"))); // Adjust if necessary

        // Mouse hover on the "Tables & desks" element
        Actions actions = new Actions(driver);
        actions.moveToElement(tablesAndDesksElement).perform();
        
        // Additional actions can be added here if needed after hovering
    }
}


