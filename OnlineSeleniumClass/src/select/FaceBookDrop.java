package select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDrop {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement month=driver.findElement(By.id("month"));
	Select sel=new Select(month);
	List<WebElement> alloptions=sel.getOptions();
	ArrayList<WebElement> al=new ArrayList<>(alloptions);
	for(WebElement ele: al)
	{
		System.out.println(ele.getText());
	}
	
	TreeSet<WebElement> ts=new TreeSet<>(alloptions);
	System.out.println(ts);
	
}
}
