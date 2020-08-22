package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DatePicker1 {
public static void main(String[] args) {
	String month="May,\n2021";
	String date="4";		
	WebDriver driver=new OperaDriver();
	driver.manage().window().maximize();
	driver.get("https://phptravels.net/home");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("checkin")).click();
	
	while(true) {
		String text=driver.findElement(By.xpath("//div[@class='datepicker--nav-title']")).getText();
		if(text.equals(month))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//div[@data-action='next']")).click();
		}
		
	}
	driver.findElement(By.xpath("//div[contains(@class,'datepicker') and text()='"+date+"']")).click();
}

}
