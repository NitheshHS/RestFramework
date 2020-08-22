package aShotAPI;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoAmazon {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.tatacliq.com/");
	WebElement logo = driver.findElement(By.xpath("//div[@class='_2ThZLOx5Lprtf4tuFSQTaz']"));
	Screenshot logoimg = new AShot().takeScreenshot(driver, logo);
	ImageIO.write(logoimg.getImage(), "png", new File("H:\\tatacliq.png"));
	
}
}
