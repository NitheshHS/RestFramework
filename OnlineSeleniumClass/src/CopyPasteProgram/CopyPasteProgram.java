package CopyPasteProgram;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteProgram {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/user/Desktop/Automation%20class/2TextBox.html");
	WebElement text1 = driver.findElement(By.xpath("//input[@value='abc']"));
	text1.sendKeys(Keys.CONTROL+"a");
	text1.sendKeys(Keys.DELETE);
	
	
}

}
