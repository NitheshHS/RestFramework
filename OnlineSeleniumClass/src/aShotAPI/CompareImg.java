package aShotAPI;

import java.awt.image.BufferedImage;
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
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImg {
public static void main(String[] args) throws IOException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//path of the expected img
	BufferedImage expImg = ImageIO.read(new File("C:\\Users\\user\\Desktop\\Automation class\\logo.png"));
	WebElement logoimg = driver.findElement(By.xpath("//img[contains(@src,'logo.png')]"));
	Screenshot logoimgsc = new AShot().takeScreenshot(driver, logoimg);
	BufferedImage actimg = logoimgsc.getImage();
	ImageDiffer imgdiff=new ImageDiffer();
	ImageDiff diff = imgdiff.makeDiff(expImg, actimg);
	if(diff.hasDiff()==true) {
		System.out.println("Images are not same");
	}
	else
	{
		System.out.println("images are same");
	}
	driver.quit();
}
}
