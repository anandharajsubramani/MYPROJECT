package com.USER_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.Ticketcreation;
import com.pageobjects.Ticketseditpage;
import com.utility.Log;

public class REOPEN_test  extends BASEclass{
	Homepage homepage ;
	Homepage logout;
	Ticketseditpage Ticketseditpage;
	Ticketcreation Ticketcreation;
	@Parameters("browser")
	@BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	
	
	
	@AfterMethod(groups=  {"smoke","sanity","regression"})
	public void teardown() throws Throwable {
		
		MYPROFILEtest jk = logout.myprofile();
		 jk.logout();
		 getDriver().quit();
		 Log.endTestCase("logout");
		}
	@Test(groups="smoke")
	public void  REOPEN() throws Throwable {
		 homepage = new Homepage();
	    
	     //Thread.sleep(2222);
		 Ticketseditpage =homepage.validatemylist2("Resolved");
	  logout = Ticketseditpage.reopen("problem not resloved");
	
	}
}
