package com.AGENT_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.SLAPAGE;
import com.pageobjects.Ticketseditpage;

public class SLA_pageTEST extends BASEclass  {
	Ticketseditpage logout;
	Homepage homepage ;
	MYPROFILEtest jk ;
	   SLAPAGE SLAMODULE ;
	
	@Parameters("browser")
	@BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	
	
	
	@AfterMethod(groups=  {"smoke","sanity","regression"})
	public void teardown() throws Throwable {
	
		 jk = homepage.myprofile();
	    jk.logout();
		getDriver().quit();
		}
	
	@Test(groups="smoke")
	public void sla_modulepage() throws Throwable {
	 homepage = new Homepage();
 SLAMODULE = homepage.sla();
 homepage=SLAMODULE.sladropdown("SESAME");
 

	 
	 
	}
}
