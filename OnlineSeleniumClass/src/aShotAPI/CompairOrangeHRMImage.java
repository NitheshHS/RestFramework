package aShotAPI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompairOrangeHRMImage {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	BufferedImage expectedimg = ImageIO.read(new File("C:\\Users\\user\\Desktop\\Automation class\\logo1.png"));
	WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
	Thread.sleep(3000);
	Screenshot logoimg = new AShot().takeScreenshot(driver, logo);
	BufferedImage actualimg = logoimg.getImage();
	ImageDiffer diff = new ImageDiffer();
	ImageDiff imgdiff = diff.makeDiff(expectedimg, actualimg);
	if(imgdiff.hasDiff()==true)
	{
		System.out.println("Images are different");
	}
	else
	{
		System.out.println("images are same");
	}
	driver.quit();
}
}
