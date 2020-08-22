package stepDefinition1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import hooks.Hooks;

public class AmazonCartTest {
	WebDriver driver;
	@Given("^user in home page$")
	public void user_in_home_page() throws Throwable {
	    driver=Hooks.staticDriver;
	    
	}

	@When("^user search for \"([^\"]*)\"$")
	public void user_search_for(String laptop) throws Throwable {
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(laptop,Keys.ENTER);
	    List<WebElement> listprod = driver.findElements(By.xpath("//span[contains(.,'Apple ')]/ancestor::div[@class='a-section a-spacing-none']"));
	   System.out.println(listprod.get(0).getText());
	    listprod.get(0).click();
	}

	@When("^add first product to cart$")
	public void add_first_product_to_cart() throws Throwable {
	   Set<String> tabs = driver.getWindowHandles();
	   Iterator<String> tab = tabs.iterator();
	   String pid = tab.next();
	  String cid= tab.next();
	  driver.switchTo().window(cid);
	  driver.findElement(By.id("add-to-cart-button")).click();
	  driver.close();
	  driver.switchTo().window(pid);
	}

	@When("^move to cart by clicking on cart icon$")
	public void move_to_cart_by_clicking_on_cart_icon() throws Throwable {
	    driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
	}

}
