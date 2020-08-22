package day_14;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ReadingBarCode {
	public static void main(String[] args) throws IOException, NotFoundException {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		String barCodeUrl = driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[1]")).getAttribute("src");
		System.out.println(barCodeUrl);
		
		URL url=new URL(barCodeUrl);
		
		BufferedImage bufferedrimage= ImageIO.read(url);
		
		LuminanceSource luminancesource = new BufferedImageLuminanceSource(bufferedrimage);
		
		BinaryBitmap binarybitmap = new BinaryBitmap(new HybridBinarizer(luminancesource));
		
		Result result = new MultiFormatReader().decode(binarybitmap);
		
		System.out.println(result);
		
		
		
		
	}
}
