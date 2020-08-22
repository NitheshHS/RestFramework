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
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(4000);
		for(int i=0;i<links.size();i++) {
			WebElement link = links.get(i);
			String li = link.getAttribute("href");
			URL url=new URL(li) ;
			HttpURLConnection http=(HttpURLConnection)url.openConnection();
			Thread.sleep(2000);
			http.connect();
			int rescode = http.getResponseCode();
			if(rescode>=400) {
				System.out.println(url+"--"+"is broken link");
			}
			else
			{
				System.out.println(url+"--"+"is valid link");
			}
			
		}
	}

}
