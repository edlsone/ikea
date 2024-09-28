package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ShoppingBagDeleteItemTest {

	WebDriver driver = null;

	@Given("I  added an item to the shopping bag")
	public void i_added_an_item_to_the_shopping_bag() {
		// Initiate the Chrome-driver and open the browser.

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.ikea.com/us/en/p/uppland-sofa-blekinge-white-s19384116/");

		driver.findElement(By.xpath("//*[@id=\"pip-buy-module-content\"]/div[7]/div/div/div/button/span/span")).click();

		// driver.close();

		// driver.navigate().to("https://www.ikea.com/us/en/p/uppland-sofa-blekinge-white-s19384116/");

		// driver.findElement(By.xpath("//*[@id=\"pip-buy-module-content\"]/div[7]/div/div/div/button/span/span")).click();

	}
	
	@When("I delete the item from the shopping bag")
	public void i_delete_the_item_from_the_shopping_bag() {
		driver.navigate().to("https://www.ikea.com/us/en/shoppingcart/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		//driver.findElement(By.xpath("//*[@id=\"one-checkout\"]/main/div/div/div/div[27]/div[3]/div/div/div[2]/div[3]/div/button[2]")).click();
		//driver.findElement(By.xpath("//main[@id='one-checkout']/main/div/div/div/div[27]/div[3]/div/div/div[2]/div[3]/div/button[2]/span"));
		//driver.findElement(By.className("cart-ingka-btn cart-ingka-btn--xsmall cart-ingka-btn--icon-tertiary cart-ingka-quantity-stepper__decrease")); 
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	driver.findElement(By.className("cart-ingka-quantity-stepper__decrease")).click();  

	}

	@Then("I verify the item is removed from the shopping bag")
	public void i_verify_the_item_is_removed_from_the_shopping_bag() throws Throwable {
		
		Thread.sleep(10000);	
		Assert.assertEquals(true , driver.getPageSource().contains("Your shopping bag is empty"));
		//.assertEquals("Your shopping bag is empty" , driver.findElement(By.className("cart-ingka-text cart-ingka-text--heading-l")).getText());
		driver.close();

	}
		
}

//*[@id="one-checkout"]/main/div/div/div/div[27]/div[3]/div/div/div[2]/div[3]/div/button[2]