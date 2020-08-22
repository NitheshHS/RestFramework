package sikuli;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Fileupload {
public static void main(String[] args) throws InterruptedException, FindFailed {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("imagesrc")).click();
	Screen s=new Screen();
	Pattern inputTestBox=new Pattern("C:\\Users\\user\\Desktop\\Automation class\\textbox.PNG");
	Pattern openButton=new Pattern("C:\\Users\\user\\Desktop\\Automation class\\OpenButton.PNG");
	
	Thread.sleep(2000);
	s.wait(inputTestBox, 20);
	s.type("C:\\Users\\user\\Desktop\\Automation class\\pause.PNG");
	s.click(openButton);
	
}
}
