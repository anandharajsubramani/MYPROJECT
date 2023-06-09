package com.AGENT_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.NEXTANDPRIVIOUSPAGEtest;
import com.pageobjects.RESPONSE;
import com.pageobjects.Searchresultspage;
import com.pageobjects.Ticketcreation;
import com.pageobjects.Ticketseditpage;
import com.utility.Log;

public class ENDTOEND_test extends BASEclass {
	Homepage homepage ;
	 RESPONSE KL;
	 Ticketcreation Ticketcreation;
	 Searchresultspage searchresultpage;
	 NEXTANDPRIVIOUSPAGEtest NEXTANDPRIVIOUSPAGEtest ;
	 MYPROFILEtest   MYPROFILEtest;
	 Ticketseditpage editticketz;
	 @Parameters("browser")
	@BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	
	
	
	@AfterMethod(groups=  {"smoke","sanity","regression"})
	public void teardown() throws Throwable {
		
		System.out.println("m,;lfbdg");
		Thread.sleep(2222);
		MYPROFILEtest jk = homepage.myprofile();
	    jk.logout();
		getDriver().quit();
		Log.endTestCase("logout");
	}
	
	
 @Test(groups="smoke")
	public void endtoend () throws Throwable {
	  homepage= new Homepage();
	 editticketz = homepage.agentticketpage();
	 editticketz.editthetickets();
	editticketz.inprogress();
	editticketz.change("more timetaken to slove the tickets", "0100");
	Thread.sleep(2222);
	editticketz.Response("the points are very diffecult","FIRST RESPONSE");
	  // KL.Response1("almost cleared ","SECOND RESPONSE");
	
	Thread.sleep(3222);
	homepage =editticketz.Resolved("problem resolved");
	 }
 
}
