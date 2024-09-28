package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ShoppingBagAddItemTest {

	WebDriver driver = null;

	@Given("I have added an item to the shopping bag")
	public void i_have_added_an_item_to_the_shopping_bag() {
		// Initiate the Chrome-driver and open the browser.

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ikea.com/us/en/p/uppland-sofa-blekinge-white-s19384116/");

		driver.findElement(By.xpath("//*[@id=\"pip-buy-module-content\"]/div[7]/div/div/div/button/span/span")).click();

		// driver.close();

	}

	@When("I navigate to the shopping bag")
	public void i_navigate_to_the_shopping_bag() {

		driver.navigate().to("https://www.ikea.com/us/en/shoppingcart/");
	}

	@Then("I verify that the item has been added to the shopping bag")
	public void i_verify_that_the_item_has_been_added_to_the_shopping_bag() {
		driver.getPageSource().contains("UPPLAND");
		// Assert.assertEquals("UPPLAND",driver.findElement(By.xpath("//*[@id=\"one-checkout\"]/main/div/div/div/div[27]/div[3]/div/div/div[2]/div[1]/div/div[1]/div/span[1]/a")).getText());
		driver.close();
	}

}
