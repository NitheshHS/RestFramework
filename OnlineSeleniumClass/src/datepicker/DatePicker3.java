package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DatePicker3 {
public static void main(String[] args) {
	String monthyear="May 2021";
	String day="4";
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.expedia.ca/?pwaLob=wizard-hotel-pwa-v2");
	driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
	while(true) {
		String text = driver.findElement(By.xpath("//h2[@class='uitk-new-date-picker-month-name uitk-type-medium']")).getText();
		if(text.equals(monthyear))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
		}
	driver.findElement(By.xpath("//button[@data-day='"+day+"']")).click();
	
	
	}
}
}
