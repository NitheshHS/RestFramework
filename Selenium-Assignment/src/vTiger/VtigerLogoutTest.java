package vTiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerLogoutTest {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("manager",Keys.ENTER);
	Point account = driver.findElement(By.xpath("//img[contains(@src,'user.PNG')]")).getLocation();
	System.out.println("Moved to elemenent");
	Actions ac = new Actions(driver);
	ac.moveByOffset(account.getX(), account.getY()).click().build().perform();
	driver.findElement(By.xpath("//a[.='Sign Out']")).click();

	System.out.println("clicked on signout");
}
}
