package day_02;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailPageLinksImages {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://mail.google.com/");
	List<WebElement> ele = driver.findElements(By.xpath("//a|//img|//table"));
	int count = ele.size();
	System.out.println(count);
	TreeSet<String> set = new TreeSet<String>();
	for(int i=0;i<count;i++) {
		set.add(ele.get(i).getText());
		
	}
	System.out.println(set);
}
}
