package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class OrangeHRM {
public static void main(String[] args) throws InterruptedException, FindFailed {
	WebDriver driver=new OperaDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123",Keys.ENTER);
	WebElement pim = driver.findElement(By.xpath("//b[.='PIM']"));
	Actions ac=new Actions(driver);
	ac.moveToElement(pim).perform();
	driver.findElement(By.xpath("//a[.='Add Employee']")).click();
	Thread.sleep(2000);
	Screen s=new Screen();
	Pattern choosefileimg=new Pattern("C:\\Users\\user\\Desktop\\Automation class\\choose file.PNG");
	Pattern filenameimg=new Pattern("C:\\Users\\user\\Desktop\\Automation class\\textbox.PNG");
	Pattern openbuttonimg=new Pattern("C:\\Users\\user\\Desktop\\Automation class\\OpenButton.PNG");
	s.wait(choosefileimg, 5);
	s.click(choosefileimg);
	s.type(filenameimg,"C:\\Users\\user\\Desktop\\Automation class\\OpenButton.PNG");
	s.click(openbuttonimg);
}
}
