package com.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.dataprovider.Dataproviders;
import com.pageobjects.Homepage;
import com.utility.Log;

public class LOGINPAGEtest  extends BASEclass{
	 Homepage homepage ;
	 
	 
	 @Parameters("browser")
	 @BeforeMethod(groups=  {"smoke","sanity","regression"})
		public void setup(String browser) throws Throwable {
			launchbrowser(browser);
			
		}
	
	
	
	@AfterMethod(groups=  {"smoke","sanity","regression"})
	public void teardown() {
		
		//System.out.println("m,;lfbdg");
		getDriver().quit();
	}
	
	
  @Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"})
	public void logintest () throws Throwable {
		 homepage = new Homepage();
		 boolean results = homepage.validatelogo();
		 Assert.assertTrue(false);
		String actualurl = homepage.getcurrenturl();
		String expectedurl="https://devsesame.novatechset.com/NTTS/Home/Index";
		Log.info("verifying if user able to login");
		Assert.assertEquals(actualurl, expectedurl);
		Log.info("login is success");
		}
  


	
}