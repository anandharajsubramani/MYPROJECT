package com.AGENT_LOGIN_testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.Ticketcreation;
import com.pageobjects.Ticketseditpage;

public class REVERT_test extends BASEclass {
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
	
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		MYPROFILEtest jk = logout.myprofile();
	    jk.logout();
		getDriver().quit();
		}
	@Test(groups="smoke")
	public void  revertfunction() throws Throwable {
		 homepage = new Homepage();
			editticketz = homepage.agentticketpage();
		     //Thread.sleep(2222);
		    editticketz .editthetickets();
			logout=editticketz.Revert("This ticket is not my department, so please change the ticket details");
	}
}
