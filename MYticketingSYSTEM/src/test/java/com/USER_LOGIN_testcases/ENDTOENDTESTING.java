package com.USER_LOGIN_testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.MYPROFILEtest;
import com.pageobjects.NEXTANDPRIVIOUSPAGEtest;
import com.pageobjects.Searchresultspage;
import com.pageobjects.Ticketcreation;

public class ENDTOENDTESTING extends BASEclass {
	 Homepage homepage ;
	 Ticketcreation Ticketcreation;
	 Searchresultspage searchresultpage;
	 NEXTANDPRIVIOUSPAGEtest NEXTANDPRIVIOUSPAGEtest ;
	 MYPROFILEtest   MYPROFILEtest;
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
	
	
  @Test(groups="regression")
	public void endtoenduserLOGIN() throws Throwable {
	  homepage= new Homepage();
	  Ticketcreation=homepage.ticketscreationbutton();
	  Ticketcreation.entertitle("anishalalala");
		 Ticketcreation.selectpriority(2);
		 Ticketcreation.selectpublisher(0);
		 Ticketcreation.selecttool(2);
		 Thread.sleep(4433);
		 Ticketcreation.enterdescription("kuhrgehkh");
		 homepage=Ticketcreation.clickonticketsbutton();
		homepage.validatemylist();
        MYPROFILEtest = NEXTANDPRIVIOUSPAGEtest.nextpage();
        MYPROFILEtest.myprofile1();	
        MYPROFILEtest.entername("");
        MYPROFILEtest.enterconpassword("");
        MYPROFILEtest.enteremail("");
        MYPROFILEtest.enterpassword("");
        MYPROFILEtest.enterphoneno("");
        homepage=MYPROFILEtest.clickonsaveprofilebutton();
        homepage.validatelogo();
        homepage.gettitleofhomepage();
  
		}
  
}
