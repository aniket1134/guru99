package com.guru99bank.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.Pageobject.AddCustomerPage;
import com.bank.Pageobject.LoginPage;

public class Tc_addcustomername extends BaseClass{


	
	@Test
	public void addcustomer() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
	driver.get(baseurl);
	lp.setusername(userid);
	lp.setpassword(password);
		lp.Clicksubmit();
		AddCustomerPage ac=new AddCustomerPage (driver);
		ac.clickAddNewCustomer();
		ac.custName("anikt");
		ac.custgender("male");
		ac.custdob("09","15","1985");
		Thread.sleep(3000);
		ac.custaddress("INDIA");
		ac.custcity("HYD");
		ac.custstate("AP");
		ac.custpinno("501000");
		ac.custtelephoneno("9889891287");
		
	
		ac.custemailid("aniket19.ingle@gmail.com");
		ac.custpassword("abcdef");
		ac.custsubmit();
		Thread.sleep(3000);
		
		
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
	
		}
		else
		{
			
			Assert.assertTrue(false);
		}
		
	}

	private String randomestring() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
