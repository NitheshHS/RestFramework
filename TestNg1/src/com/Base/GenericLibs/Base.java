package com.Base.GenericLibs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.vtigerapp.ObjectRepo.Home;
import com.vtigerapp.ObjectRepo.Login;

public class Base {
	public WebDriver driver;
	public static WebDriver staticDriver;
	FileLib flib=new FileLib();
	
	public Login login;
	public Home home;
	@BeforeClass
	public void configBC()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void confingAc()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void configBM() {
	login = PageFactory.initElements(driver, Login.class);
		login.login(flib.getpropertyKeyValue("username"), flib.getpropertyKeyValue("password"));
		
	}
	
	@AfterMethod
	public void configAm() {
		home=PageFactory.initElements(driver, Home.class);
		home.signout(driver);
	}
}

