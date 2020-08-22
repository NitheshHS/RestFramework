package aShotAPI;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class OrangeHRM {
public static void main(String[] args) throws IOException {
	WebDriver driver=new OperaDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'logo.png')]"));
	Screenshot logoimg = new AShot().takeScreenshot(driver, logo);
	ImageIO.write(logoimg.getImage(), "png", new File("C:\\Users\\user\\Desktop\\Automation class/orange.png"));
}
}
