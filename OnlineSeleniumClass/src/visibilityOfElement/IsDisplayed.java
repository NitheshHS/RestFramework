package visibilityOfElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Automation%20class/Practice.html");
	WebElement user = driver.findElement(By.id("username"));
	boolean display = user.isDisplayed();
	System.out.println(display);
	if(display) {
		System.out.println("Text Box is displayed");
	}else {
		System.out.println("Text Box is not displayed");
	}
}
}
