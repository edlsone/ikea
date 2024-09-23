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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
public class SignUpTest {
    private WebDriver driver;
    private WebDriverWait wait;
    public SignUpTest() {
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
  public void testSignUpTestCase() throws Exception {
    driver.get("chrome://newtab/");
    driver.manage().window().maximize();
    driver.get("https://www.ikea.com/us/en/");
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='hnf-header-profile']/a/span"))); 
    
    driver.findElement(By.xpath("//li[@id='hnf-header-profile']/a/span")).click();
    driver.findElement(By.xpath("//div[@id='little-man-slider']/div/section/ul/li/a/div/button/span")).click();
    //driver.get("https://us.accounts.ikea.com/login?state=hKFo2SBPbXBWbzJUcjhnd2NkRnI3RnhjLVBla0xpdHQtVHktVKFupWxvZ2luo3RpZNkgQzdVcEM2NlZROGhfM3RXbGt2YUNSSzd4eFFwSGdHMUyjY2lk2SBBRHpFb3NGaUZiOXY5SHVqSDc4RTVrVjIyNjdVMXZONA&client=ADzEosFiFb9v9HujH78E5kV2267U1vN4&protocol=oauth2&page=family_signup&redirect_uri=https%3A%2F%2Fwww.ikea.com%2Fus%2Fen%2Fprofile%2Flogin%2F&response_type=code&ui_locales=en-US&code_challenge=CNqho1SHM0T0KYWeohzLbr0mIibHrgYnh-ZNYCh_26c&code_challenge_method=S256&scope=openid%20profile%20email%20offline_access&itm_source=wlo-user-slider-logged-out%7Chomepage%7Csignup&audience=https%3A%2F%2Fretail.api.ikea.com&consumer=OWF&auth0Client=eyJuYW1lIjoiYXV0aDAuanMiLCJ2ZXJzaW9uIjoiOS4yMS4wIn0%3D&gasid=GA1.2.264117438.1726001353&sessId=1a45145d-5fad-47bc-9eef-3e114b3f8035&expUserId=50cdc03237fd40f9396a5a5bcb91cf26efc04aee8ba59e15a48f31d9b88b4088&episodId=1726001352767.g0yhmc&episodSessId=1726069640898.f1yzi8xp.2.1726073526246");
    driver.findElement(By.id("family-signup-form-firstName")).click();
    driver.findElement(By.id("family-signup-form-firstName")).clear();
    driver.findElement(By.id("family-signup-form-firstName")).sendKeys(FileUtil.getData().getFirstName());
    
    driver.findElement(By.id("family-signup-form-lastName")).click();
    driver.findElement(By.id("family-signup-form-lastName")).clear();
    driver.findElement(By.id("family-signup-form-lastName")).sendKeys(FileUtil.getData().getLastName());
    
    driver.findElement(By.id("family-signup-form-birthDate")).click();
    driver.findElement(By.id("family-signup-form-birthDate")).clear();
    driver.findElement(By.id("family-signup-form-birthDate")).sendKeys(FileUtil.getData().getBirthDate());
    
    driver.findElement(By.id("family-signup-form-addressCountryCode")).click();
    driver.findElement(By.id("family-signup-form-address")).click();
    driver.findElement(By.linkText("Enter address manually")).click();
    driver.findElement(By.id("family-signup-form-address")).click();
    driver.findElement(By.id("family-signup-form-address")).clear();
    driver.findElement(By.id("family-signup-form-address")).sendKeys(FileUtil.getData().getAddress());
    
    //driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.name("family-signup-form")).click();
//new Select(driver.findElement(By.id("family-signup-form-address"))).selectByVisibleText("102 William St Jamesburg NJ 08831-1639");
    driver.findElement(By.id("family-signup-form-address1")).click();
    driver.findElement(By.id("family-signup-form-address1")).clear();
    driver.findElement(By.id("family-signup-form-address1")).sendKeys(FileUtil.getData().getAddress1());
    
    driver.findElement(By.id("family-signup-form-cityName")).click();
    driver.findElement(By.id("family-signup-form-cityName")).clear();
    driver.findElement(By.id("family-signup-form-cityName")).sendKeys(FileUtil.getData().getCityName());
    
    driver.findElement(By.id("family-signup-form-zipCode")).click();
    driver.findElement(By.id("family-signup-form-zipCode")).clear();
    driver.findElement(By.id("family-signup-form-zipCode")).sendKeys(FileUtil.getData().getZipCode());
    
    driver.findElement(By.id("family-signup-form-province")).click();
    new Select(driver.findElement(By.id("family-signup-form-province"))).selectByVisibleText("NJ");
    driver.findElement(By.name("family-signup-form")).click();
    new Select(driver.findElement(By.id("family-signup-form-preferredStore"))).selectByVisibleText("Paramus, NJ");
    driver.findElement(By.id("family-signup-form-email")).click();
    driver.findElement(By.id("family-signup-form-email")).clear();
    driver.findElement(By.id("family-signup-form-email")).sendKeys(FileUtil.getData().getEmail());
    
    driver.findElement(By.id("family-signup-form-password")).click();
    driver.findElement(By.xpath("//div[@id='root']/div/div[3]/div/form/div[17]/div/div/button/span")).click();
    driver.findElement(By.id("family-signup-form-password")).click();
    driver.findElement(By.id("family-signup-form-password")).clear();
    driver.findElement(By.id("family-signup-form-password")).sendKeys(FileUtil.getData().getPassword());
   
   // driver.findElement(By.id("family-signup-form-double-consent")).click();
   // driver.findElement(By.xpath("//button[@id='singup-form-submit-button']/span/span")).click();
    
/*
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.findElement(By.id("email-verification-single-otp-input-0")).click();
    driver.findElement(By.id("email-verification-single-otp-input-0")).clear();
    driver.findElement(By.id("email-verification-single-otp-input-0")).sendKeys(FileUtil.getData().getOtpInput0()+"");
    
    driver.findElement(By.id("email-verification-single-otp-input-1")).click();
    driver.findElement(By.id("email-verification-single-otp-input-1")).clear();
    driver.findElement(By.id("email-verification-single-otp-input-1")).sendKeys(FileUtil.getData().getOtpInput1()+"");
    
    driver.findElement(By.id("email-verification-single-otp-input-2")).click();
    driver.findElement(By.id("email-verification-single-otp-input-2")).clear();
    driver.findElement(By.id("email-verification-single-otp-input-2")).sendKeys(FileUtil.getData().getOtpInput2()+"");
    
    driver.findElement(By.id("email-verification-single-otp-input-3")).click();
    driver.findElement(By.id("email-verification-single-otp-input-3")).clear();
    driver.findElement(By.id("email-verification-single-otp-input-3")).sendKeys(FileUtil.getData().getOtpInput3()+"");
    
    driver.findElement(By.id("email-verification-single-otp-input-4")).click();
    driver.findElement(By.id("email-verification-single-otp-input-4")).clear();
    driver.findElement(By.id("email-verification-single-otp-input-4")).sendKeys(FileUtil.getData().getOtpInput4()+"");
    
    driver.findElement(By.id("email-verification-single-otp-input-5")).click();
    driver.findElement(By.id("email-verification-single-otp-input-5")).clear();
    driver.findElement(By.id("email-verification-single-otp-input-5")).sendKeys(FileUtil.getData().getOtpInput5()+"");
    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Sign up'])[1]/following::*[name()='svg'][1]")).click();
*/   
  }
}
