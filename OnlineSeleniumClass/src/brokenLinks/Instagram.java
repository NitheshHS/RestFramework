package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram {
public static void main(String[] args) throws IOException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.instagram.com/?hl=en");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for(int i=0;i<links.size();i++) {
		String link = links.get(i).getAttribute("href");
		URL url=new URL(link);
		HttpURLConnection httpconn=(HttpURLConnection)url.openConnection();
		httpconn.connect();
		int rescode = httpconn.getResponseCode();
		if(rescode>+400) {
			System.out.println(link+"---->"+"Invalid link");
		}
		else
		{
			System.out.println(link+"--->"+"valid link");
		}
	}
}
}
