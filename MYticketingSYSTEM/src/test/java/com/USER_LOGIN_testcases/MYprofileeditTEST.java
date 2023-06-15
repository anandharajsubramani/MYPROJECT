package com.USER_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.Logoutpage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.Ticketcreation;

public class MYprofileeditTEST extends BASEclass {

	
	Homepage homepage ;
	Logoutpage logout;
	MYPROFILEtest profilecreation;
	@Parameters("browser")
	@BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	
	
	@AfterMethod(groups=  {"smoke","sanity","regression"})
	public void teardown() throws Throwable {
		profilecreation = homepage.myprofile();
		profilecreation.logout();
		 getDriver().quit();
		}
	@Test(groups="regression")
	public void  MYPROFILEEDIT() throws Throwable {
		homepage = new Homepage();
		profilecreation = homepage.myprofile();
		//boolean results = Ticketcreation.validateticketcreatepage();
		// Assert.assertTrue(results);
		profilecreation.myprofile1();
		
		profilecreation.entername("anisha");
		profilecreation.enterconpassword("uZXTHbN6#Xg!L");
		profilecreation.enteremail("anishaj@novatechset.com");
		profilecreation.enterpassword("uZXTHbN6#Xg!L");
		profilecreation.enterphoneno("9856741230");
		homepage=profilecreation.clickonsaveprofilebutton();
	}
}
