package day_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextMethod {
public static void main(String[] args) {
	//printing the facebook link text
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement link = driver.findElement(By.xpath("//a[.='Forgotten account?']"));
	//using getText
	String text = link.getText();
	System.out.println(text);
	
}
}
