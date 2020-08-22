package flipkartTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IphoneTest {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[contains(@title,'Search for ')]")).sendKeys("iphone", Keys.ENTER);
		List<WebElement> phone = driver.findElements(By.xpath("//a[contains(@title,'Apple iPhone')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_1vC4OE']"));

		for(int i=0;i<=5;i++) {
			System.out.println(phone.get(i).getText());
			phone.get(i).click();
			System.out.println(price.get(i).getText());
		}

		//	for(String tabs:driver.getWindowHandles()) {
		//		 driver.switchTo().window(tabs).close();
		////		WebDriverWait wait=new WebDriverWait(driver, 20);
		////		WebElement cart = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		////		wait.until(ExpectedConditions.visibilityOf(cart));
		////		cart.click();
		//	}

		Set<String> tab = driver.getWindowHandles();
		Iterator<String> tabs=tab.iterator();
		
		String tab0 = tabs.next();
		String tab1 = tabs.next();
		String tab2 = tabs.next();
		String tab3 = tabs.next();
		String tab4 = tabs.next();
		String tab5 = tabs.next();
		String tab6 = tabs.next();
		
		driver.switchTo().window(tab1);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.close();
		
		
		driver.switchTo().window(tab2);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.close();
	
		
		driver.switchTo().window(tab3);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.close();
		
		
		driver.switchTo().window(tab4);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.close();
		
		
		driver.switchTo().window(tab5);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.close();
		
		driver.switchTo().window(tab6);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.close();
		

	}
}
