package day_07;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DragBrowser {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	Point p=new Point(200, 300);
	driver.manage().window().setPosition(p);
	Point point = driver.manage().window().getPosition();
	System.out.println("The window is "+point+" pixel moved");
}
}
