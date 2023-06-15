package com.USER_LOGIN_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.Searchresultspage;

public class SEARCHBUTTONtest extends BASEclass{
	Homepage homepage ;
	Searchresultspage searchresultpage;
	@Parameters("browser")
	@BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	
	
	@AfterMethod(groups=  {"smoke","sanity","regression"})
	public void teardown() throws Throwable {
		
		MYPROFILEtest jk = homepage.myprofile();
	    jk.logout();
		getDriver().quit();
		}
	@Test(groups="smoke")
	public void  searchtest() throws Throwable {
		homepage = new Homepage();
		homepage.searchtickets("p1");
		//homepage.userpencilbutton(); user login
		//homepage.agent_pencilbutton();  agent login
		Thread.sleep(3333);
		homepage=searchresultpage.addtionals();
	}
}
