package com.guru99bank.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.Pageobject.LoginPage;

public class TC_Login_Page extends BaseClass{
	@Test
	public void Login_Page() {
		LoginPage lp=new LoginPage(driver);
	driver.get(baseurl);
	lp.setusername(userid);
	lp.setpassword(password);
		lp.Clicksubmit();
		
	
	if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager Homepage")) {
		Assert.assertTrue(true);
		
	}else {
		Assert.assertTrue(false);
	}
	}
}
