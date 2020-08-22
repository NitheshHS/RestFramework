package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker4 {
public static void main(String[] args) {
	String monthyear="May 2021";
	String date="20";
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://jqueryui.com/datepicker/");
	 driver.switchTo().frame(0);
	 driver.findElement(By.id("datepicker")).click();
	 //String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	// System.out.println(monthyear);
	 while(true) {
		 String text = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		 if(text.equalsIgnoreCase(monthyear))
		 {
			 driver.findElement(By.xpath("//a[.='"+date+"']")).click();
			 break;
		 }
		 else
		 {
			 driver.findElement(By.xpath("//span[.='Next']")).click();
		 }
	 }
	 
	 
	 
}
}
