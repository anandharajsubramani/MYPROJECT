package com.AGENT_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.Searchresultspage;
import com.pageobjects.Ticketseditpage;

public class SEARCHBUTTONtest extends BASEclass{
	Homepage homepage ;
	Searchresultspage searchresultpage;
	Ticketseditpage editticketz;
	Homepage logout;
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
		}
	@Test(groups="smoke")
	public void  searchoptiontest() throws Throwable {
		homepage = new Homepage();
		homepage.agentticketpage();
		 editticketz = homepage.searchtickets("p1");
		//searchresultpage.userclickontickets();
		 searchresultpage = editticketz .editthetickets1();
		logout=searchresultpage.addtionals();
	}
}
