/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class FilterSearchTest {
    private WebDriver driver;
    private WebDriverWait wait;
    public FilterSearchTest() {
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
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
         if (driver != null) {
            driver.close();// Use quit() instead of close() to close all windows
    }
    }
   @Test
    public void testFilterSearchTestCase() throws Exception {
        driver.get("https://www.ikea.com/us/en/");

        // Wait for and dismiss the cookie consent popup if it appears
        try {
            WebElement consentButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
            consentButton.click();
        } catch (Exception e) {
            System.out.println("Consent button not found, continuing with the test.");
        }

        // Proceed with the test steps
        clickWhenVisible(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Products'])[2]/following::button[1]"));
        clickWhenVisible(By.xpath("//div[@id='hnf-carousel__tabs-navigation-rooms']/div/a/span[2]"));
        clickWhenVisible(By.xpath("//div[@id='hnf-carousel__tabs-navigation-rooms']/div[3]/a/span"));
        clickWhenVisible(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Material'])[1]/following::button[1]"));
        clickWhenVisible(By.xpath("//fieldset[@id='filter-TYPE']/label[3]/span[2]/span"));
    }

    private void clickWhenVisible(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        try {
            element.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }
}