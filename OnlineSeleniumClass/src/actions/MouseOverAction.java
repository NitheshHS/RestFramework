package actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123",Keys.ENTER);
	WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
	WebElement userMan=driver.findElement(By.xpath("//a[.='User Management']"));
	WebElement user=driver.findElement(By.xpath("//a[.='Users']"));
	Actions act=new Actions(driver);
	act.moveToElement(admin).moveToElement(userMan).moveToElement(user).click().build().perform();
	List<WebElement> status = driver.findElements(By.xpath("//table/thead/tr[*]/th//a[.='Status']/ancestor::thead/following-sibling::tbody/tr[*]/td[last()]"));
	int enable=0;
	int disable=0;
	
	for(WebElement text:status) {
		if(text.getText().equals("Enabled")) {
			enable++;
		}
		else
		{
			disable++;
		}
	}
	
//	for(int i=0;i<status.size();i++) {
//		String stat = status.get(i).getText();
//		if(stat.equals("Enabled"))
//		{
//			enable++;
//		}
//		else
//		{
//			disable++;
//		}
//	}
	System.out.println("No of enabled"+ enable);
	System.out.println("No of disabled"+ disable);
	
}
}
