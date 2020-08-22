package flipkartDropDown;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Flipkart {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search=driver.findElement(By.xpath("//input[@class='LM6RPg' and @name='q']"));
		search.sendKeys("mi mobiles",Keys.ENTER);
		search.findElement(By.xpath("//div[text()='6 GB & Above']")).click();
		WebElement price = search.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
		System.out.println("mobile name is "+search.getText()+"and price is "+price.getText());
		RemoteWebDriver remote = (RemoteWebDriver)search;
		WebElement mobile = remote.findElement(By.xpath("//img[@class='_1Nyybr  _30XEf0' and @alt='Redmi Note 7 Pro (Space Black, 64 GB)']"));
		File src = mobile.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\user\\Desktop\\Automation class\\mi mobile.jpg");
		Files.copy(src, dest);
		driver.close();
	}
}
