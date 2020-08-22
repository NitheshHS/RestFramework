package visibilityOfElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabled {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Automation%20class/Practice.html");
	WebElement name = driver.findElement(By.id("username"));
	boolean enable = name.isEnabled();
	System.out.println(enable);
	if(enable) {
		System.out.println("Text box is enabled");
	}else {
		System.out.println("text box is disabled");
	}
}
}
