package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class IkeaLanguageTest {
	
	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() {
		
		// Initiate the Chrome-driver and open the browser.

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
	}
	@When("I naviagate to url {string}")
	public void i_naviagate_to_url(String string) {
		driver.navigate().to(string);
	}
	@Then("I verify that the IKEA home page language {string} is correct")
	public void i_verify_that_the_ikea_home_page_language_is_correct(String string) {
		Assert.assertEquals(string , driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/a/span/span")).getText());
		//driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[3]/button/span/span")).getText().equalsIgnoreCase("aa");
		driver.close();
	}

}
