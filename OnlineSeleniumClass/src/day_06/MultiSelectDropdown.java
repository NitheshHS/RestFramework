package day_06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Automation%20class/DropDown.html");
	WebElement ele = driver.findElement(By.id("D1"));
	Select s=new Select(ele);
	
	s.selectByIndex(2);
	s.selectByValue("5");
	s.selectByVisibleText("kabab");
	
	List<WebElement> options = s.getOptions();
	for(WebElement we:options) {
		System.out.println(we.getText());
	}
	if(s.isMultiple()) {
		System.out.println("Multiple dropdown");
		s.deselectAll();
	}
	else
	{
	System.out.println("single select");	
	}
}
}
