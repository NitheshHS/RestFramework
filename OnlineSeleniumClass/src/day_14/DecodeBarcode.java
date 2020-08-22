package day_14;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class DecodeBarcode {
public static void main(String[] args) throws IOException, NotFoundException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://testautomationpractice.blogspot.com/");
	
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[2]"));
	
	String barcode = ele.getAttribute("src");
	
	org.openqa.selenium.Point p = ele.getLocation();
	
	System.out.println(p);
	
	int x = p.getX();
	
	int y=p.getY();
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy("+x+","+y+")");
	
	
	
	URL url = new URL(barcode);
	
	BufferedImage bufferedimage = ImageIO.read(url);
	
	LuminanceSource luminancesource = new BufferedImageLuminanceSource(bufferedimage);
	
	BinaryBitmap binarymap= new BinaryBitmap(new HybridBinarizer(luminancesource));
	
	Result result = new MultiFormatReader().decode(binarymap);
	
	System.out.println(result);
	
}
}
