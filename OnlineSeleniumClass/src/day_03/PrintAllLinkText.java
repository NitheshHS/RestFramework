package day_03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllLinkText {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[.='✕']"));
	 List<WebElement> link = driver.findElements(By.tagName("a"));
	for (WebElement we : link) {
		String text = we.getText();
		System.out.println(text);
	}
}
}
