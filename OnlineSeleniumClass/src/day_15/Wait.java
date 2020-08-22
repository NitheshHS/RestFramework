package day_15;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/");
	driver.findElement(By.id("identifierId")).sendKeys("nitheshsgowda4.ng");
	driver.findElement(By.xpath("(//span[.='Next'])[1]")).click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	driver.findElement(By.name("password")).sendKeys(decodePassword("cGFwdUAyMDAz"));
	driver.findElement(By.xpath("(//span[.='Next'])[1]")).click();
	
	
}
static String decodePassword(String password) {
	byte[] decodedString=Base64.decodeBase64(password);
	return (new String(decodedString));
}
}
