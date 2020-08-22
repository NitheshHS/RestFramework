package facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	WebElement month=driver.findElement(By.id("month"));
	Select sel=new Select(month);
	List<WebElement> alloptions = sel.getOptions();
	for(int i=0;i<alloptions.size();i++) {
		System.out.println(alloptions.get(i).getText());
	}
	System.out.println("alphabetical order");
	TreeSet<WebElement> ts=new TreeSet<>(alloptions);
	//ts.addAll(alloptions);
	for(WebElement ele:ts)
	{
		System.out.println(ele.getText());
	}
	
	
	
	
	
}
}
