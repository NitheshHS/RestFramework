package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Flipkart {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	WebElement img = driver.findElement(By.xpath("//span[.='Plus']//ancestor::a/preceding-sibling::a[1]"));
	TakesScreenshot screen = (TakesScreenshot)driver;
	File src = screen.getScreenshotAs(OutputType.FILE);
	File dest= new File("‪C:\\Users\\user\\Desktop\\flip.png");
	Files.copy(src, dest);
	if(src.hashCode()==dest.hashCode()) {
		System.out.println("File copied");
	}
	driver.close();
}
}
