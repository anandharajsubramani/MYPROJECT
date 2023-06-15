package com.AGENT_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.RESPONSE;
import com.pageobjects.Ticketcreation;
import com.pageobjects.Ticketseditpage;

public class Reassigntab_test extends BASEclass {
	Homepage homepage ;
	  RESPONSE KL;
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
		
		System.out.println("m,;lfbdg");
		Thread.sleep(2222);
		MYPROFILEtest jk = homepage.myprofile();
	    jk.logout();
		getDriver().quit();
		}
	@Test(groups="smoke")
	public void  assign_reassingtab() throws Throwable {
		 homepage = new Homepage();
	     homepage.agentticketpage();
	     //Thread.sleep(2222);
	     Ticketseditpage = homepage.validatemylist1("Assigned");
	     homepage =Ticketseditpage.reassign("more values","parveen");
	     //Ticketseditpage = homepage.validatemylist1("Inprogress");
	    // Ticketseditpage.Response("the points are very diffecult","FIRST RESPONSE","almost cleared ","SECOND RESPONSE");
		//   KL.Response1("almost cleared ","SECOND RESPONSE");
		// Ticketseditpage.change("more timetaken to slove the tickets", "0100");
	     // Ticketseditpage.Resolved("problem resolved");
	}
}
