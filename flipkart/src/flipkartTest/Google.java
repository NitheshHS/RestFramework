package flipkartTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	
	WebElement images= driver.findElement(By.linkText("Images"));
	Actions act=new Actions(driver);
	act.contextClick(images).build().perform();
	
	Robot rc=new Robot();
	rc.keyPress(KeyEvent.VK_T);
	rc.keyRelease(KeyEvent.VK_T);
	Set<String> tabs = driver.getWindowHandles();
	Iterator<String> itr=tabs.iterator();
	String pid = itr.next();
	String cid = itr.next();
	Thread.sleep(5000);
	driver.switchTo().window(cid);
	System.out.println(driver.getTitle());
	driver.close();
	driver.switchTo().window(pid);
	
	
	}
}
