package day_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
public static void main(String[] args) throws InterruptedException {
	//printing attribute name by using attribute value
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	String att = pass.getAttribute("type");
	System.out.println(att);
}
}
