package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.NEXTANDPRIVIOUSPAGEtest;
import com.pageobjects.Searchresultspage;

public class NEXTPAGEtest extends BASEclass{
	NEXTANDPRIVIOUSPAGEtest vv;
	Searchresultspage searchresultpage;
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
	@Test(groups="sanity")
	public void  searchtest() throws Throwable {
 vv = new NEXTANDPRIVIOUSPAGEtest();
		vv.nextpage();
	}
}
