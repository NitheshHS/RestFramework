package select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/hide/");
	driver.switchTo().frame(0);
	WebElement drop = driver.findElement(By.id("effectTypes"));
	Select sel=new Select(drop);
	List<WebElement> allopt = sel.getOptions();
	ArrayList<WebElement> al=new ArrayList<>(allopt);
	
	Iterator<WebElement> itr = al.iterator();
	while(itr.hasNext()) {
		
		System.out.println(itr.next().getText());
	}
	
	
	sel.selectByVisibleText("Bounce");
	driver.findElement(By.xpath("//button[.='Run Effect']")).click();
	
	
	
}
}
