package day_07;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeBrowser {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	//for resize we should create a instance of dimension 
	Dimension d=new Dimension(100, 200);
	driver.manage().window().setSize(d);
	Dimension size = driver.manage().window().getSize();
	System.out.println("current size of window is:"+size);
}
}
