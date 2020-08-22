package day_02;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartTablenDropdownCount {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	 List<WebElement> ele = driver.findElements(By.xpath("//table | //select"));
	 int count = ele.size();
	 System.out.println(count);
}
}
