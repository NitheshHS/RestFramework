package facebook;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SignUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Nithesh");
		driver.findElement(By.name("lastname")).sendKeys("Gowda");
		driver.findElement(By.id("u_0_r")).sendKeys("831034265");
		driver.findElement(By.id("u_0_w")).sendKeys("papu@2003");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		//for selecting day
		Select date=new Select(day);
		if(date.isMultiple()) {
			System.out.println("Date is multiple select");
		}else {
			System.out.println("Date is single select");
		}
		date.selectByValue("4");
		//for selecting month
		WebElement month = driver.findElement(By.id("month"));
		Select mon = new Select(month);
		mon.selectByVisibleText("May");
		//for selecting year
		WebElement year = driver.findElement(By.id("year"));
		Select yr = new Select(year);
		yr.selectByValue("1998");

		driver.findElement(By.id("u_0_7")).click();

		driver.findElement(By.xpath("//button[text()='Sign Up' and @id='u_0_13']")).click();

		TakesScreenshot event = (TakesScreenshot)driver;
		File src = event.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\user\\Desktop\\Automation class\\facebooklogin.png");
		Files.copy(src, dest);
		Thread.sleep(5000);
		driver.close();



	}
}
