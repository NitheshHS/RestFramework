package dragAndDrop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/droppable/#photo-manager");
	driver.switchTo().frame(0);
	List<WebElement> images = driver.findElements(By.xpath("//ul[@id='gallery']/li"));
	WebElement target=driver.findElement(By.id("trash"));
	Actions act=new Actions(driver);
	for(WebElement img:images) {
		Thread.sleep(2000);
		//act.clickAndHold(img).moveToElement(target).release(img).build().perform();
		act.dragAndDrop(img, target).build().perform();
		
	}
	
	
}
}
