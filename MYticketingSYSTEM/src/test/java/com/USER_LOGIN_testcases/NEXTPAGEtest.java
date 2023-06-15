package com.USER_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.NEXTANDPRIVIOUSPAGEtest;
import com.pageobjects.Searchresultspage;
import com.utility.Log;

public class NEXTPAGEtest extends BASEclass{
	NEXTANDPRIVIOUSPAGEtest vv;
	Homepage hhk;
	Searchresultspage searchresultpage;
	@Parameters("browser")
	@BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	
	
	@AfterMethod(groups=  {"smoke","sanity","regression"})
	public void teardown() throws Throwable {
		MYPROFILEtest cb = hhk.myprofile();
		cb.logout();
			getDriver().quit();
			Log.endTestCase("logout");
		}
	@Test(groups="sanity")
	public void  searchtestANDNEXTPAGE() throws Throwable {
 vv = new NEXTANDPRIVIOUSPAGEtest();
		 hhk = vv.nextpage();
	}
}
