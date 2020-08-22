package day_09;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClickAction {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.xpath("//a[.='Forgotten account?']"));
	Thread.sleep(3000);
	Actions ac = new Actions(driver);
	//to right click on specific element
	ac.contextClick(ele).perform();
	
	//to open link in new tab we use robot class
	Robot rc= new Robot();
	rc.keyPress(KeyEvent.VK_T);
	rc.keyRelease(KeyEvent.VK_T);
	
	
}
}
