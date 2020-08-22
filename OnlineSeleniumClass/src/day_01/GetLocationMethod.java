package day_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement phone = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	Point loc = phone.getLocation();
	//it will print x,y in px
	System.out.println(loc);
	//methods to get x value
	int x = loc.getX();
	System.out.println(x);
	//method to get y value
	int y=loc.getY();
	System.out.println(y);
}
}
