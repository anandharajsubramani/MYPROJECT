package com.AGENT_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.Ticketcreation;
import com.pageobjects.Ticketseditpage;

public class INPROGRESS_test extends BASEclass {
	Homepage homepage ;
	Homepage logout;
	Ticketseditpage editticketz;
	
	Ticketcreation Ticketcreation;
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
	@Test(groups="smoke")
	public void  inprogressfunction() throws Throwable {
		 homepage = new Homepage();
	     homepage.agentticketpage();
	     //Thread.sleep(2222);
	 //  editticketz = homepage.editthetickets();
		//logout=editticketz.inprogress();
	}
}
