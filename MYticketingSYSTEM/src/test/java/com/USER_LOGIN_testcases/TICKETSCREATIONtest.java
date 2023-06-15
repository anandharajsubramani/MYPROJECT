package com.USER_LOGIN_testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.Logoutpage;
import com.pageobjects.MYPROFILEtest;
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
        logout.myprofile();
		MYPROFILEtest jk = logout.myprofile();
	    jk.logout();
		getDriver().quit();
		}
	@Test(groups="sanity")
	public void  ticketscreation() throws Throwable {
		homepage = new Homepage();
		Ticketcreation=homepage.ticketscreationbutton();
		//boolean results = Ticketcreation.validateticketcreatepage();
		// Assert.assertTrue(results);
		 Ticketcreation.entertitle("button is not working properly in the word pagee");
		 Ticketcreation.selectpriority(1);
		 Ticketcreation.selectpublisher(3);
		 Ticketcreation.selecttool(0);
		 getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 Ticketcreation.enterdescription("when i open the word document that time NT button not worked");
		 logout =Ticketcreation.clickonticketsbutton();
		
		
		
	}
	
	
	
	
}
