package aShotAPI;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogo {
public static void main(String[] args) throws IOException {
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement logoimg = driver.findElement(By.xpath("//img[contains(@src,'logo.png')]"));
	Screenshot logoimgscreenshot = new AShot().takeScreenshot(driver, logoimg);
	ImageIO.write(logoimgscreenshot.getImage(), "png", new File("C:\\Users\\user\\Desktop\\Automation class/logo1.png"));
}
}
