package day_03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectAllCheckBox {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Automation%20class/CheckBox.html");
	List<WebElement> cbox=driver.findElements(By.tagName("input"));
	for(WebElement we:cbox) {
		we.click();
	}
	
}
}
