package instagram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.findElement(By.name("username")).sendKeys("nitheshsgowda4.ng@gmail.com");
	driver.findElement(By.name("password")).sendKeys("CORONA");
	driver.findElement(By.xpath("//div[text()='Log In']")).click();
}
}
