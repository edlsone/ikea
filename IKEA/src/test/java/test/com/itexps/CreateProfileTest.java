/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
public class CreateProfileTest {
     private WebDriver driver;
     private WebDriverWait wait;
    public CreateProfileTest() {
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
        //System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize(); // Maximize the browser window
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
         if (driver != null) {
            //driver.close();// Use quit() instead of close() to close all windows
    }
    }
    @Test
    public void testCreateProfileTestCase() throws Exception {
        driver.get("https://www.ikea.com/us/en/");
        
        // Click on profile
        driver.findElement(By.xpath("//li[@id='hnf-header-profile']/a/span")).click();
        
        // Click on sign up
        driver.findElement(By.xpath("//div[@id='little-man-slider']/div/section/ul/li/a/div/button/span")).click();

        // Navigate to sign-up page
       // driver.get("https://us.accounts.ikea.com/login?state=hKFo2SBKTXV0UWxodFNxMFUwS3lnbC15MzFVWmZSZ0dlWjRNcqFupWxvZ2luo3RpZNkgV2VjTWF4REthNk5QQnBXZjBZZC1qTC13dUU0eGlBekWjY2lk2SBBRHpFb3NGaUZiOXY5SHVqSDc4RTVrVjIyNjdVMXZONA&client=ADzEosFiFb9v9HujH78E5kV2267U1vN4&protocol=oauth2&page=family_signup&redirect_uri=https%3A%2F%2Fwww.ikea.com%2Fus%2Fen%2Fprofile%2Flogin%2F&response_type=code&ui_locales=en-US&code_challenge=YjmwOYGSfuIILMidZHsvUkILF3cYT2DxksYcmUigXiE&code_challenge_method=S256&scope=openid%20profile%20email%20offline_access&itm_source=wlo-user-slider-logged-out%7Chomepage%7Csignup&audience=https%3A%2F%2Fretail.api.ikea.com&consumer=OWF&auth0Client=eyJuYW1lIjoiYXV0aDAuanMiLCJ2ZXJzaW9uIjoiOS4yMS4wIn0%3D&gasid=GA1.2.1658415878.1725908174&sessId=c0956700-e55c-4423-84c1-c58f79cd3d9a&expUserId=b3fc267619658588c0e76a9edb39587d91cac757b18815f3e01773481f85ba26&episodId=1725908174483.2gsjzsb&episodSessId=1726977571613.wyp231ct.3.1726982012968&dt=D");

        // Wait for the first name input field and fill it
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("family-signup-form-firstName")));
        driver.findElement(By.id("family-signup-form-firstName")).sendKeys("Chris");
        
        // Fill in last name
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("family-signup-form-lastName")));
        driver.findElement(By.id("family-signup-form-lastName")).sendKeys("Lee");
        
        // Fill in birth date
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("family-signup-form-birthDate")));
        driver.findElement(By.id("family-signup-form-birthDate")).sendKeys("09-07-1999");
        
        // Fill in email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("family-signup-form-email")));
        driver.findElement(By.id("family-signup-form-email")).sendKeys("chris@leegmail.com");
        
        // Fill in password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("family-signup-form-password")));
        driver.findElement(By.id("family-signup-form-password")).sendKeys("chrislee123!");
        
        // Fill in address
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("family-signup-form-address")));
        driver.findElement(By.id("family-signup-form-address")).sendKeys("123 Main Street IL 69585");
        
        // Additional steps can be added here as necessary
    }
}