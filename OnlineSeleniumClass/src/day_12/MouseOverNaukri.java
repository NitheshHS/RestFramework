package day_12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseOverNaukri {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		WebElement ele = driver.findElement(By.xpath("//div[.='Companies']"));
		Actions ac = new Actions(driver);

		ac.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[.='Company Reviews'])[1]")).click();
		
		driver.findElement(By.xpath("//p[.='Bengaluru']/following-sibling::a")).click();
		
	}
}
