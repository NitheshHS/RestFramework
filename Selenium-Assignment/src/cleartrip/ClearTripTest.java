package cleartrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.drive", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.cleartrip.com/");
}
}
