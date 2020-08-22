package sikuli;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Youtube {
public static void main(String[] args) throws FindFailed, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/watch?v=wZWAtpRAXyA");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//*[@id=\"thumbnail\"]")).click();
	Screen s=new Screen();
	Pattern playP=new Pattern("‪C:\\Users\\user\\Desktop\\Automation class\\pauseYT.PNG");
	s.wait(10);
	s.click(playP);
	
	
}
}
