package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleclickAction {
	@Test
	public void copyPasteText()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions ac=new Actions(driver);
		ac.doubleClick(driver.findElement(By.xpath("//span[.='India']"))).perform();
		ac.sendKeys(Keys.CONTROL,"C").build().perform();
		
	}
}
