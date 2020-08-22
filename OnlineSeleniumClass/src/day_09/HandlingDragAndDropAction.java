package day_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDropAction {
public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.dhtml.com/submitted.scripts/i-google-like-drag-drop/");
	WebElement b1= driver.findElement(By.xpath("[.args= 'Block1']"));
	WebElement b2= driver.findElement(By.xpath("[.args= 'Block2']"));
	Actions ac = new Actions(driver);
	ac.dragAndDrop(b1, b2).perform();
	
}
}
