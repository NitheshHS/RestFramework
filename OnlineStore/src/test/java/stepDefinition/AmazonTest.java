package stepDefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import gherkin.formatter.Reporter;
import hooks.Hooks;

public class AmazonTest {
	WebDriver driver;
	@Given("^User in Amazon Home page$")
	public void user_in_Amazon_Home_page() throws Throwable {
		driver=Hooks.staticDriver;
		driver.get("https://www.amazon.in/");
	}

	@When("^user search for \"([^\"]*)\"$")
	public void user_search_for(String mobile) throws Throwable {
		Assert.assertTrue(false);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobile,Keys.ENTER);
	}

	@When("^add first product to cart$")
	public void add_first_product_to_cart() throws Throwable {
		List<WebElement> mobileList = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
		System.out.println(mobileList.get(0).getText());
		mobileList.get(0).click();
	}

	@When("^click on cart and get product price$")
	public void click_on_cart_and_get_product_price() throws Throwable {
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> tab = tabs.iterator();
		
		String pid = tab.next();
		String cid=tab.next();
		driver.switchTo().window(cid);
		String price=driver.findElement(By.id("priceblock_ourprice")).getText();
		System.out.println(price);
		driver.switchTo().window(pid);
		driver.quit();
	}

}
