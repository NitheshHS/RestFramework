package day_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeValueMethod {
public static void main(String[] args) {
	//print attribute value of facebook email text box
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	//pass id as attribute name
	String att = email.getAttribute("id");//By passing attribute name we get attribute value as o/p
	System.out.println(att);//email
}
}
