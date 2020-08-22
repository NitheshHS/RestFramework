package day_09;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinimizeTheBrowser {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver = new FirefoxDriver();
	
	Thread.sleep(3000);
	Robot rc = new Robot();
	
	//to hold the keys all at once
	rc.keyPress(KeyEvent.VK_ALT);
	rc.keyPress(KeyEvent.VK_SPACE);
	rc.keyPress(KeyEvent.VK_N);
	
	//to release keys we use KeyRelease method
	rc.keyRelease(KeyEvent.VK_ALT);
	rc.keyRelease(KeyEvent.VK_SPACE);
	rc.keyRelease(KeyEvent.VK_N);
}
}
