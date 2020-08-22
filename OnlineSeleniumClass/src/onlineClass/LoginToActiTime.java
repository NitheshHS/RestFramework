package onlineClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTime {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://online.actitime.com/test2/login.do");
	driver.findElement(By.id("username")).sendKeys("nitheshsgowda4.ng@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("papu@2003");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	//varification
	String title = driver.getTitle();
	if(title.equals("actiTIME - Enter Time-Track")) {
		System.out.println("Home page is dispalyed");
	}else {
		System.out.println("Home page is not displayed");
	}
	driver.close();
}
}
