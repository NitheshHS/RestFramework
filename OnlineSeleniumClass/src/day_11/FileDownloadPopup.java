package day_11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopup {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//td[.='Java']//following-sibling::td[5]/a[1]")).click();
	Thread.sleep(3000);
	Robot rc = new Robot();
	rc.keyPress(KeyEvent.VK_ALT);
	rc.keyPress(KeyEvent.VK_S);
	
	rc.keyRelease(KeyEvent.VK_ALT);
	rc.keyRelease(KeyEvent.VK_S);
	
	rc.keyPress(KeyEvent.VK_ENTER);
	rc.keyRelease(KeyEvent.VK_ENTER);
}
}
