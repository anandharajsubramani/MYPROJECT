package com.AGENT_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.NEXTANDPRIVIOUSPAGEtest;
import com.pageobjects.Searchresultspage;
import com.pageobjects.Ticketcreation;
import com.pageobjects.Ticketseditpage;

public class ENDTOEND_test extends BASEclass {
	Homepage homepage ;
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
	public void teardown() {
		
		System.out.println("m,;lfbdg");
		//driver.quit();
	}
	
	
 @Test(groups="smoke")
	public void endtoend () throws Throwable {
	  homepage= new Homepage();
	  homepage.agentticketpage();
	     //Thread.sleep(2222);
//	 editticketz = homepage.editthetickets();
	 editticketz.assign();
	 editticketz.inprogress();
	 editticketz.Resolved("dfgh");
	  
		
		}
 
}
