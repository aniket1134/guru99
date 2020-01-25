package com.guru99bank.TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseurl="http://www.demo.guru99.com/V4/";
	public String userid="mngr243109";
	public String password="dUjugyp";
	
	public  WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		driver=new ChromeDriver();
	
	}
//	@AfterClass
//	public void teardown()
//	{
//		
//	driver.close();
//	}
	
	
}