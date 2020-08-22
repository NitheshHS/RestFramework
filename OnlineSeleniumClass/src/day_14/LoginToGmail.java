package day_14;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToGmail {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/");
	driver.findElement(By.id("identifierId")).sendKeys("nitheshsgowda4.ng", Keys.ENTER);
	driver.findElement(By.name("password")).sendKeys(decodeString("cGFwdUAyMDAz", Keys.ENTER));

}
static String decodeString(String password, Keys enter) {
	byte[] decode = Base64.decodeBase64(password);
	return (new String(decode));
	
}
}
