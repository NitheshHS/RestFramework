package day_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	WebElement ele = driver.findElement(By.xpath("//span[.='Men']"));
	Actions ac = new Actions(driver);
	ac.moveToElement(ele).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='T-Shirts']")).click();
}
}
