package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.STRARTTIMEtest;
import com.pageobjects.Searchresultspage;

public class STARTandENDtest extends BASEclass {
	Homepage homepage ;
	STRARTTIMEtest startedtime;
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
	public void  searchtest() throws Throwable {
		homepage = new Homepage();
		STRARTTIMEtest startedtime = homepage.startedtime();
		Thread.sleep(3333);
		//startedtime.selectmonth("August");
		startedtime.selectpublisher();
		Thread.sleep(3333);
		//startedtime.selectyear(2222);
	}
}
