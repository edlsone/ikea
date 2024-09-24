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
public class DeleteItemTest {
    private WebDriver driver;
     private WebDriverWait wait;
    public DeleteItemTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public  void setUpClass() throws Exception {
         //System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize(); // Maximize the browser window
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
         if (driver != null) {
            //driver.close();// Use quit() instead of close() to close all windows
    }
    }
    
        //  @Test
    public void testAddProductTestCase() throws Exception {
    driver.get("https://www.ikea.com/us/en/");
    driver.findElement(By.xpath("//div[@id='hnf-carousel__tabs-navigation-products']/div[8]/a/span")).click();
    driver.findElement(By.linkText("Rugs")).click();
    driver.findElement(By.xpath("//div[@id='hnf-carousel__tabs-navigation-products']/div[2]/a/span")).click();
    driver.findElement(By.xpath("//img[contains(@src,'https://www.ikea.com/us/en/images/products/nickgraes-rug-flatwoven-multicolor-handmade__1262918_pe927148_s5.jpg?f=xxs')]")).click();
    driver.findElement(By.xpath("//div[@id='pip-buy-module-content']/div[8]/div/div/div/button/span/span")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NICKGRÄS was added to your shopping bag.'])[1]/following::span[1]")).click();
  }

  //  @Test
public void testDeleteItemTestCase() throws Exception {
    //driver.get("https://www.ikea.com/us/en/");

    // Wait for and click on the Favorites button
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Favorites'])[1]/following::span[1]"))).click();

    // Wait for and click on the first favorite item
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Favorites'])[1]/following::a[1]"))).click();

    // Wait for the cart button to be clickable
    WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='flexi-cart']//button/span")));
    cartButton.click();

    // Wait for the modal to be visible and close it if necessary
    try {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cart-agent-modal-body")));
        WebElement closeModalButton = driver.findElement(By.xpath("//div[contains(@class, 'cart-agent-modal-body')]//button[contains(@class, 'close')]"));
        if (closeModalButton.isDisplayed()) {
            closeModalButton.click();
        }
    } catch (Exception e) {
        // If the modal is not found, do nothing
    }

    // Wait for the cart modal to disappear
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cart-agent-modal-body")));

    // Wait for the checkout button to be clickable and click it
    WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//main[@id='one-checkout']//button[contains(@class, 'checkout')]")));
    checkoutButton.click();

    // Confirm deletion
    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//main[@id='one-checkout']//button[contains(@class, 'confirm-delete')]")));
    confirmDeleteButton.click();

    // Click to continue checkout
    WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Continue to checkout'])[1]//following::*[name()='svg'][1]")));
    continueButton.click();
}
}