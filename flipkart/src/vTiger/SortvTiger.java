package vTiger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SortvTiger {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.linkText("Organizations")).click();
		List<WebElement> orgName = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td/a[@title='Organizations']"));
		System.out.println("before sort");
		

		ArrayList<String> lst=new ArrayList<>();
		for(WebElement org:orgName) {
			lst.add(org.getText());
		}
		Collections.sort(lst);
		for(String lt:lst) {
			System.out.println(lt);
		}
		driver.findElement(By.linkText("Organization Name")).click();
		Thread.sleep(5000);
		List<WebElement> orgSort = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td/a[@title='Organizations']"));
		System.out.println("after sort");
		

		TreeSet<String> tree=new TreeSet<>();
		for(WebElement org:orgSort) {
			tree.add(org.getText());
		}
		for(String tr:tree) {
			System.out.println(tr);
		}
		Assert.assertEquals(lst, tree);

	}

}
