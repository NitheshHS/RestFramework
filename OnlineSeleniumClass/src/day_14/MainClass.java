package day_14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	WebElement signup = driver.findElement(By.xpath("//button[.='Sign Up' and @id='u_0_13']"));
	//JavaScriptUtil.flash(signup, driver);
	
	JavaScriptUtil.drawBorder(signup, driver);
}
}
