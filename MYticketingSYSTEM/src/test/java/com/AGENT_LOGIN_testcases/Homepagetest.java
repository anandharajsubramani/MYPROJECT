package com.AGENT_LOGIN_testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.Ticketseditpage;
import com.utility.Log;

public class Homepagetest extends BASEclass {
	
	Ticketseditpage logout;
	Homepage homepage ;
	MYPROFILEtest jk ;
	
	
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
		
	      Log.endTestCase("logout");
	     
		}
	
	@Test(groups="smoke")
	public void mylist() throws Throwable {
	 homepage = new Homepage();
    homepage.agentticketpage();
    Log.info("check all the list click operation");
      homepage.validatemylist();
	 
     
	}
	
	
	
}
