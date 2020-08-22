package FlipkartMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class PerformAction {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions ac=null;
		ac=new Actions(driver);
		ac.moveToElement(electronics).perform();
		driver.findElement(By.xpath("//a[@title='Gaming Laptops']")).click();
		
	}
}
