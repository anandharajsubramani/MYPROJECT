package com.AGENT_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.Logoutpage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.Ticketcreation;
import com.utility.Log;

public class MYprofileeditTEST extends BASEclass {

	 MYPROFILEtest jk;
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
		
		System.out.println("m,;lfbdg");

		 jk = homepage.myprofile();
		    jk.logout();
			getDriver().quit();
		    Log.endTestCase("logout");
		}
	@Test(groups="regression")
	public void  profileedit() throws Throwable {
		homepage = new Homepage();
		 profilecreation = homepage.myprofile();
		//boolean results = Ticketcreation.validateticketcreatepage();
		// Assert.assertTrue(results);
		profilecreation.myprofile1();
		 Log.info("edit the profile details");
		profilecreation.entername("ajeetha");
		profilecreation.enterconpassword("rULRZ#Kt4t%3c");
		profilecreation.enteremail("ajeetha@novatechset.com");
		profilecreation.enterpassword("rULRZ#Kt4t%3c");
		profilecreation.enterphoneno("9874561230");
		homepage=profilecreation.clickonsaveprofilebutton();
	}
}
