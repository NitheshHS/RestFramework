package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/slider/#default");
	driver.switchTo().frame(0);
	WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
	Actions act=new Actions(driver);
	//act.moveToElement(slider).dragAndDropBy(slider, 150, 0).build().perform();
	act.clickAndHold(slider).dragAndDropBy(slider, 200, 0).release(slider).build().perform();
}
}
