package CopyPasteProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program_02 {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Automation%20class/2TextBox.html");
	WebElement tBox1 = driver.findElement(By.xpath("//input[@value='abc']"));
	tBox1.sendKeys(Keys.CONTROL+"a");
	tBox1.sendKeys(Keys.CONTROL+"c");
	WebElement tBox2=driver.findElement(By.xpath("//input[@value='xyz']"));
	tBox2.sendKeys(Keys.CONTROL+"a");
	tBox2.sendKeys(Keys.CONTROL+"v");
}
}
