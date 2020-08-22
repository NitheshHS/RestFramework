package flipkartTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoomail {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("login-username")).sendKeys("nitheshhs123@yahoo.com",Keys.ENTER);
		driver.findElement(By.id("login-passwd")).sendKeys("8310342653@1998", Keys.ENTER);
		driver.findElement(By.xpath("//span[.='Mail']")).click();
		driver.findElement(By.linkText("Compose")).click();
		driver.findElement(By.id("message-to-field")).sendKeys("nitheshhs123@yahoo.com");
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("This is demo yahoo mail");
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hi, concern\n\tThis is my first yahoo mail"
				+ "\nsending documents\n--\n--\nThank you;regards");
		driver.findElement(By.xpath("//button[@title='Attach files']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Attach files from computer']")).click();
		
		Thread.sleep(10000);
		
		StringSelection path=new StringSelection("‪‪‪C:\\Users\\user\\word.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
