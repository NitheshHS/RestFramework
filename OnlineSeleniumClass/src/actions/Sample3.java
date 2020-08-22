package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample3 {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement it1=driver.findElement(By.xpath("//li[.='Item 1']"));
	WebElement it2=driver.findElement(By.xpath("//li[.='Item 2']"));
	WebElement it3=driver.findElement(By.xpath("//li[.='Item 3']"));
	WebElement it4=driver.findElement(By.xpath("//li[.='Item 4']"));
	WebElement it5=driver.findElement(By.xpath("//li[.='Item 5']"));
	Actions act=new Actions(driver);
	act.clickAndHold(it1).moveToElement(it2).moveToElement(it3).moveToElement(it4).moveToElement(it5).release().build().perform();
	
}
}
