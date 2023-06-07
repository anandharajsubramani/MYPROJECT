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
		
		System.out.println("m,;lfbdg");
		Thread.sleep(2222);
		//logout.myprofile();
		// logout.logout();
	//	driver.quit();
		}
	@Test(groups="regression")
	public void  profileedit() throws Throwable {
		homepage = new Homepage();
		MYPROFILEtest profilecreation = homepage.myprofile();
		//boolean results = Ticketcreation.validateticketcreatepage();
		// Assert.assertTrue(results);
		profilecreation.myprofile1();
		
		profilecreation.entername("");
		profilecreation.enterconpassword("");
		profilecreation.enteremail("");
		profilecreation.enterpassword("");
		profilecreation.enterphoneno("");
		profilecreation.clickonsaveprofilebutton();
	}
}
