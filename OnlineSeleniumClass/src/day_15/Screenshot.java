package day_15;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Screenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement image = driver.findElement(By.id("hplogo"));
	File src=image.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\user\\Desktop\\Test Yantra Assignment/google.png");
	Files.copy(src, dest);
}
}
