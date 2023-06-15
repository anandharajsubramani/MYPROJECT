package com.USER_LOGIN_testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;

public class Homepagetest extends BASEclass {
	
	MYPROFILEtest profilecreation;
	Homepage homepage ;
	
	
	
	@Parameters("browser")
	@BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	
	
	
	@AfterMethod(groups=  {"smoke","sanity","regression"})
	public void teardown() throws Throwable {
		 profilecreation = homepage.myprofile();
		profilecreation.logout();
		 getDriver().quit();
		
		}
	
	@Test(groups="smoke")
	public void mylist() throws Throwable {
	 homepage = new Homepage();
	homepage.validatemylist();
	 
	 
	}
	
	
	
}
