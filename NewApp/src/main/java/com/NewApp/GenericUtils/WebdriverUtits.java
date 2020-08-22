package com.NewApp.GenericUtils;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This class contains all the custom method required for project
 * @author Nithesh HS 
 *
 */
public class WebdriverUtits {
	/**
	 * This method used to wait for web element for mentioned time
	 * @param driver
	 * @param timeInSec
	 */
	
	public void setPageload(WebDriver driver, int timeInSec) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * This method used to wait for visibility of web element in DOM 
	 * @param driver
	 * @param element
	 */
	public void waitForVisibilityOfElement(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method used to move the mouse over the element
	 * @param driver
	 * @param element
	 */
	public void mouseOverOnElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	/**
	 * This method used to handle the drop down by using visible text
	 * @param driver
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebDriver driver,WebElement element, String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	/**
	 * This method used for handle drop down by specifing index
	 * @param driver
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebDriver driver,WebElement element, int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * Specify the web element and driver will wait and click on element
	 * @param driver
	 * @param element
	 * @return
	 * @throws InterruptedException
	 */
	public boolean waitAndClick(WebDriver driver, WebElement element) throws InterruptedException {
		boolean flag=false;
		int click=0;
		while(click<=30) {
			try {
				element.click();
				flag=true;
				break;
			}
			catch(Exception e) {
				Thread.sleep(1000);
				click++;
			}
		}
		return flag;
	}
	/**
	 * This method wait for webelement display on DOM
	 * @param driver
	 * @param element
	 * @return
	 * @throws InterruptedException
	 */
	public boolean waitTillElementDisplay(WebDriver driver, WebElement element) throws InterruptedException {
		int count=0;
		boolean flag=false;
		while(count<=30) {
			try {
				element.isDisplayed();
				flag=true;
				break;
			}
			catch (Exception e) {
				Thread.sleep(1000);
				count++;
			}
		}
		return flag;
	}
	/**
	 * switch to new window by specifing the page title  
	 * @param driver
	 * @param pageTitle
	 */
	public void switchToNewWindow(WebDriver driver,String pageTitle) {
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		while(itr.hasNext()) {
			String id = itr.next();
			String title = driver.switchTo().window(id).getTitle();
			if(title.contains(pageTitle)) {
				break;
			}
		}
	}
	/**
	 * switch to frame by name or id
	 * @param driver
	 * @param element
	 */
	public void switchFrameByNameId(WebDriver driver,String element) {
		driver.switchTo().frame(element);
		
	}
	/**
	 * switch to frame by index
	 * @param driver
	 * @param index
	 */
	public void switchFrameByIndex(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * switch to frame
	 * @param driver
	 * @param frame
	 */
	public void switchFrameByString(WebDriver driver, WebElement frame) {
		driver.switchTo().frame(frame);
	}
	/**
	 * accept the alert
	 * @param driver
	 */
	public void alertOK(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * dismiss the alert
	 * @param driver
	 */
	public void alertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * Execute the javascript query
	 * @param driver
	 * @param query
	 */
	public void exceuteJavascriptQuery(WebDriver driver, String query) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(query);
	}
	
	

}
