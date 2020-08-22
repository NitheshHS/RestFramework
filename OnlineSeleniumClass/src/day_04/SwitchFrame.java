package day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/user/Desktop/Automation%20class/frame.html");
		WebElement p = driver.findElement(By.id("t1"));
		p.sendKeys("Abc");
		
		//type-1 by passsing index value as arg
		//driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		//type-2 by passing id or name attribute value as argument
		//driver.switchTo().frame("ad");

		//type-3 by passing webElement address as arg
		WebElement frame = driver.findElement(By.id("f1"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("t2")).sendKeys("Abc");
		
		//switching from frame to parent page
		driver.switchTo().defaultContent();
		p.sendKeys("xyz");

	}

}
