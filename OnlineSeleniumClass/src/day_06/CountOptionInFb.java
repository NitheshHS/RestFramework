package day_06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CountOptionInFb {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);
	List<WebElement> option = s.getOptions();
	int count = option.size();
	System.out.println(count);
	//to print text in dropdown
	for(WebElement we:option) {
		System.out.println(we.getText());
	}
}
}
