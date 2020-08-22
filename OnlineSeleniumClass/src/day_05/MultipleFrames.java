package day_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleFrames {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Automation%20class/frame.html");
	WebElement p1 = driver.findElement(By.id("t1"));
	
	p1.sendKeys("abc");
	driver.switchTo().frame(0);
	WebElement p2 = driver.findElement(By.id("t2"));
	p2.sendKeys("mno");
	driver.switchTo().frame(0);
	WebElement p3 = driver.findElement(By.id("t3"));
	p3.sendKeys("xyz");
	
	
	//traversing back to parent one by one
	p3.sendKeys("789");
	driver.switchTo().parentFrame();
	//p2.sendKeys("456");
	driver.switchTo().parentFrame();
	p1.sendKeys("123");
}
}
