/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
public class GiftCardTest {
     private WebDriver driver;

    public GiftCardTest() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        // Any class-level setup can go here
    }

    @AfterClass
    public void tearDownClass() throws Exception {
        // Any class-level cleanup can go here
    }

     @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver(); 
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize(); // Maximize the browser window
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        if (driver != null) {
            driver.quit(); // Use quit() instead of close()
        }
    }

   @Test
public void testGiftCardTestCase() throws Exception {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    // Navigate to IKEA
    driver.get("https://www.ikea.com/us/en/");
    
    // Wait and handle cookie consent if present
    try {
        WebElement consentButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
        consentButton.click();
    } catch (Exception e) {
        System.out.println("Consent button not found, continuing with the test.");
    }

    // Search for "gift card"
    WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("ikea-search-input")));
    searchInput.click();
    searchInput.clear();
    searchInput.sendKeys("gift card");
    driver.findElement(By.cssSelector(".search-box")).submit();

    // Wait for the SVG element to be clickable
    WebElement svgElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Skip listing'])[3]/following::*[name()='svg'][3]")));
    svgElement.click();

    // Wait for the gift card element to be clickable
    WebElement giftCardElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='4aa831c0-f689-11e9-8d70-e356865c8f6e']/pub-hide-empty-link/div/a/span")));
    giftCardElement.click();

    // Navigate to Frizbee Solutions page
    driver.get("https://ikeaus.frizbee-solutions.com/");

    // Wait for and click the first offer label
    WebElement offerLabel1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']/div[2]/div/div/form/div/div[2]/offers/div[3]/label")));
    offerLabel1.click();

    // Wait for and click the second label
    WebElement offerLabel2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div[2]/div/label")));
    offerLabel2.click();

    // Input first name
    WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(By.id("desfirstname")));
    firstName.clear();
    firstName.sendKeys("Ana");

    // Input last name
    WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(By.id("deslastname")));
    lastName.clear();
    lastName.sendKeys("Mirza");

    // Click submit button
    WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
    submitButton.click();
}

    
}

  


