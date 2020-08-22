package day_14;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExcutor {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/user/Desktop/Automation%20class/DisableElement.html");
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//to enter data to disabled element
	js.executeScript("document.getElementById('user').value='xyz'");
	
	//to remove data in the disabled element
	Thread.sleep(3000);
	js.executeScript("document.getElementById('user').value=' '");
}
}
