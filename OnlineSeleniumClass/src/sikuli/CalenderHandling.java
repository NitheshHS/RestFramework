package sikuli;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandling {
public static void main(String[] args) {
	WebDriver driver=new OperaDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123",Keys.ENTER);
	driver.findElement(By.xpath("//b[.='Leave']")).click();
	driver.findElement(By.xpath("//img[contains(@src,'calendar.png')]")).click();
	WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
	WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
	Select s=new Select(month);
	Select s1=new Select(year);
	s.selectByVisibleText("May");	
	s1.selectByVisibleText("2021");
	driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='4']")).click();
}
}
