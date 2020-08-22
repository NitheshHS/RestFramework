package visibilityOfElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Automation%20class/Practice.html");
	WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
	
	boolean select = check.isSelected();
	System.out.println(select);
	if(select) {
		System.out.println("check box is selected");
	}else {
		System.out.println("check box is not selected");
	}
	
}
}
