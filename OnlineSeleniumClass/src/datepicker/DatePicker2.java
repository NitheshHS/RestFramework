package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DatePicker2 {
public static void main(String[] args) {
	String monthyear="June 2021";
	String date="4";
	WebDriver driver=new OperaDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("DepartDate")).click();
	while(true) {
		String text=driver.findElement(By.xpath("//div[@class='title']")).getText();
		if(text.equals(monthyear))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
		}
	}
	driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
}
}
