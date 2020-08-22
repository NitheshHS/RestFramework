package day_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivisionPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//i[.='Cal'])[1]")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//a[.='21'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[.='June']/ancestor::div[1]/ancestor::div[1]/descendant::a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[.='30'])[1]")).click();
}
}
