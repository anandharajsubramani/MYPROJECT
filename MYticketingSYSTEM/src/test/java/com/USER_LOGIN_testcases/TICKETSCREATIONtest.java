package com.USER_LOGIN_testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.Logoutpage;
import com.pageobjects.Ticketcreation;
import com.pageobjects.Ticketseditpage;
public class TICKETSCREATIONtest extends BASEclass {
	Homepage homepage ;
	Homepage logout;
	Ticketcreation Ticketcreation;
	@Parameters("browser")
	@BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	
	
	
	@AfterMethod(groups=  {"smoke","sanity","regression"})
	public void teardown() throws Throwable {
		
		System.out.println("m,;lfbdg");
		Thread.sleep(2222);
		logout.myprofile();
		// logout.logout();
	//	driver.quit();
		}
	@Test(groups="sanity")
	public void  ticketscreation() throws Throwable {
		homepage = new Homepage();
		Ticketcreation=homepage.ticketscreationbutton();
		//boolean results = Ticketcreation.validateticketcreatepage();
		// Assert.assertTrue(results);
		 Ticketcreation.entertitle("anishalalala");
		 Ticketcreation.selectpriority(2);
		 Ticketcreation.selectpublisher(0);
		 Ticketcreation.selecttool(2);
		 Thread.sleep(4433);
		 Ticketcreation.enterdescription("kuhrgehkh");
		 logout =Ticketcreation.clickonticketsbutton();
		 Thread.sleep(4433);
		
		
	}
	
	
	
	
}
