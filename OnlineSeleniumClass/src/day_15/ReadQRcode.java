package day_15;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ReadQRcode {
public static void main(String[] args) throws IOException, NotFoundException {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://testautomationpractice.blogspot.com/");
	
	WebElement ele=driver.findElement(By.xpath("//h2[.='QR Code']/ancestor::div/descendant::div[1]/img"));
	Point loc = ele.getLocation();
	int x=loc.getX();
	int y=loc.getY();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	
	String Qrcode=ele.getAttribute("src");
	
	URL url=new URL(Qrcode);
	
	BufferedImage bufferedImage=ImageIO.read(url);
	
	LuminanceSource luminancesource=new BufferedImageLuminanceSource(bufferedImage);
	
	BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(luminancesource));
	
	Result result=new MultiFormatReader().decode(binarybitmap);
	
	System.out.println(result.getText());
	
	
	
	
	
	
	
	
	
	
	
	







}
}
