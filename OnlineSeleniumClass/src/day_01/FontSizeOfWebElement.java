package day_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FontSizeOfWebElement {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	//inspect element
	WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
	//pass Css name as arg
	String fontSize = fName.getCssValue("font-size");
	//by passing css name we get css value
	System.out.println(fontSize);
}
}
