package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	Actions act=new Actions(driver);
	act.moveToElement(source).clickAndHold(source).moveToElement(target).release().build().perform();
	
	
}
}
