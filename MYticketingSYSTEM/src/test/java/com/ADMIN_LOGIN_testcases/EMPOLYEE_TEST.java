package com.ADMIN_LOGIN_testcases;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.EMPLOYEEcreated;
import com.pageobjects.Homepage;
import com.pageobjects.Logoutpage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.Ticketcreation;
import com.pageobjects.Ticketseditpage;

public class EMPOLYEE_TEST  extends BASEclass {
	Homepage homepage ;
	Logoutpage logout;
	MYPROFILEtest JK ;
	  EMPLOYEEcreated fvn;

	@Parameters("browser")
	@BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	
	
	
	@AfterMethod(groups=  {"smoke","sanity","regression"})
	public void teardown() throws Throwable {
		
		System.out.println("m,;lfbdg");
		Thread.sleep(2222);
	        logout.myprofile111();
			logout.logout();
	//	driver.quit();
		}
	@Test(groups="smoke")
	public void  newemployeecreated() throws Throwable {
		 homepage = new Homepage();
	   fvn = homepage.employee();
	
	   logout = fvn.employeecreated();
	
	}
}
