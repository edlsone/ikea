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
 * @author edls3
 */
public class LoginTest {
    
    private WebDriver driver;
    public LoginTest() {
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
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
      //driver.close();
    }

    @Test
  public void testLoginTestCase() throws Exception {
    driver.get("chrome://newtab/");
    driver.manage().window().maximize();
    driver.get("https://www.ikea.com/us/en/");
    driver.findElement(By.xpath("//li[@id='hnf-header-profile']/a/span")).click();
    driver.findElement(By.xpath("//a[@id='header__button']/span")).click();
    //driver.get("https://us.accounts.ikea.com/login?state=hKFo2SBhWWJaNFoxbWdBVnlZMllFVWkxUUtkZ3ZPTm5uSlQzeqFupWxvZ2luo3RpZNkgUC1vUzc4NzliTDdwU0NpaVRGbDdCTjI1NTNTY1BBd1OjY2lk2SBBRHpFb3NGaUZiOXY5SHVqSDc4RTVrVjIyNjdVMXZONA&client=ADzEosFiFb9v9HujH78E5kV2267U1vN4&protocol=oauth2&redirect_uri=https%3A%2F%2Fwww.ikea.com%2Fus%2Fen%2Fprofile%2Flogin%2F&response_type=code&ui_locales=en-US&code_challenge=ndzRWuV4eL4fkUm2aqunC6ItJWS_aqv4xLRJY0Il5Ko&code_challenge_method=S256&scope=openid%20profile%20email%20offline_access&audience=https%3A%2F%2Fretail.api.ikea.com&itm_source=wlo-user-slider-logged-out%7Chomepage%7Clogin&registration=%7B%7D&consumer=OWF&auth0Client=eyJuYW1lIjoiYXV0aDAuanMiLCJ2ZXJzaW9uIjoiOS4yMS4wIn0%3D&gasid=GA1.1.264117438.1726001353&sessId=ec6833ff-fbd7-4279-9024-e34231d6fd64&expUserId=50cdc03237fd40f9396a5a5bcb91cf26efc04aee8ba59e15a48f31d9b88b4088&episodId=1726001352767.g0yhmc&episodSessId=1726240085868.mlfot3a.8.1726241025618");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("edls@comcast.net");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div/form/div[7]/div/div/button/span")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("30Gardeniasparati#");
    driver.findElement(By.xpath("//button[@id='submitButton']/span/span")).click();
    //driver.get("https://www.ikea.com/us/en/profile/login/?code=GHMfCjnj4f9jyn8WyXmFpvh66SYEZEpOjSB6H1cEBMuAb&state=riPZEyaEXlOu8~XCJfu0P6AvlTukZPrY");
    //driver.get("https://www.ikea.com/us/en/loyalty-hub/");
  }
}
