package day_14;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	public static void flash(WebElement element,WebDriver driver ) {
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0; i<500;i++)
		{
			changeColor("#000000", element, driver);
			changeColor(bgcolor, element, driver);
		}
		
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		
		try
		{
			Thread.sleep(200);
		}
		catch (InterruptedException e) {
			
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("argumnets[0].style.border='3px solid red'", element);
	}
	
	
	
	
}
