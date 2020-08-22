package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TicketfutureBooking {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	ChromeOptions op1 = op.addArguments("---disable-notification");
	WebDriver driver = new ChromeDriver(op1);
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.findElement(By.id("DepartDate")).click();
	int time=1;
	int maxtime=60;
	driver.findElement(By.xpath("//i[@class='icon ir datePicker']")).click();
	//WebElement pickDate = driver.findElement(By.xpath("//td[@data-month='4' and @data-year='2021']/a[.=1]"));
	WebElement expecteddate = null;
	while(time<=maxtime)
	{
		try
		{
			expecteddate = driver.findElement(By.xpath("//td[@data-month='4' and @data-year='2021']/a[.=1]"));
			break;
		}
		catch (Exception e)
		{
			System.out.println(time);
			driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
			Thread.sleep(50);
			time++;
		}
		
		
	}
	expecteddate.click();
	
	
	
}
}
