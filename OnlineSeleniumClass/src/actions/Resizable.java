package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/resizable/");
	driver.switchTo().frame(0);
	WebElement resize = driver.findElement(By.xpath("//h3[.='Resizable']/following-sibling::div[last()]"));
	Actions act=new Actions(driver);
	act.moveToElement(resize).dragAndDropBy(resize, 150, 150).build().perform();
	
	
	
}
}
