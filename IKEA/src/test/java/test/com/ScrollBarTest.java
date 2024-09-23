/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author ericl
 */
public class ScrollBarTest {
    
    WebDriver driver; 
    
    public ScrollBarTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
         System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe"); 
         driver = new ChromeDriver();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
        @Test
        public void testScroll() throws InterruptedException {
            driver.manage().window().maximize();
            driver.get("https://www.ikea.com/us/en/?cid=a1:ps%257Ca2:se%257Ca3:US_ActivateConsumerLed_Behavioural_0_AO_0_en_Search_Brand_HFBMUL_0_EM_IKE-IKE-079_IKEA_FY24_Google_Omni-ROAS_Core_Text_Br_Exact%257Ca4:ikea%257Ca5:e%257Ca6:google%257Ca7:cq%257Cid:IKEA%2520Branded%2520GM%257Ccc:915&gad_source=1");
               JavascriptExecutor js = (JavascriptExecutor) driver;
              js.executeScript("window.scrollBy(0,10000)", "");

               Thread.sleep(5000);
               driver.close();
        }
}
