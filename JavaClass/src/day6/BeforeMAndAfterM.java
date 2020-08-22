package day6;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMAndAfterM {
	@BeforeSuite
	public void connectDB()
	{
		System.out.println("connect to mysql");
	}
	@BeforeTest
	public void launchDiffBrowser()
	{
		System.out.println("differeent browser are launched");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("browser is launched");
	}
	@BeforeMethod()
	public void login()
	{
		System.out.println("login");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("browser closed");
	}
	@AfterTest
	public void closeDiffBrowser()
	{
		System.out.println("close diff browser");
	}
	@AfterSuite
	public void disconnectFromDb() {
		System.out.println("disconnect form mysql");
	}

}
