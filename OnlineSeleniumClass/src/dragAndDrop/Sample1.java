package dragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement tar = driver.findElement(By.id("droppable"));
	Point loc= tar.getLocation();
	int x=loc.getX();
	int y=loc.getY();
	//JavascriptExecutor js=((JavascriptExecutor)driver);
	//js.executeScript("window.scrollBy("+x+","+y+")");
	
	Actions act=new Actions(driver);
	act.clickAndHold(src).moveToElement(tar).release(src).build().perform();
	
	
	
	
}
}
