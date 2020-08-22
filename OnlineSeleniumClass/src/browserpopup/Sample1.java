package browserpopup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/tabs/#default");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	Set<String> tabs = driver.getWindowHandles();
	for(String tab:tabs) {
		String title = driver.switchTo().window(tab).getTitle();
		System.out.println(title);
	}
	
}
}
