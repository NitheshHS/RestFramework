package browserpopup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String parent = driver.getTitle();
		System.out.println(driver.getTitle());
		Set<String> tabs = driver.getWindowHandles();
		for(String tab:tabs) {
			String title = driver.switchTo().window(tab).getTitle();
			if(!title.equalsIgnoreCase(parent)) {
				driver.close();
				
				
			}
			
		}
		
		
	}
}
