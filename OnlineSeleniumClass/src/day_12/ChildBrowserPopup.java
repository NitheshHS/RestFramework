package day_12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserPopup {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://webtime.mercuriusit.com/login.do");
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	
	driver.findElement(By.xpath("//a[.='License for using this software']")).click();
	Set<String> allwin = driver.getWindowHandles();
	int count=allwin.size();
	System.out.println(count);
	
	for(String win:allwin) {
		driver.switchTo().window(win);
		String text = driver.getTitle();
		System.out.println(text);
		if(!text.equals("actiTIME - Login")) 
		{
		driver.close();
		}
	}
}
}
