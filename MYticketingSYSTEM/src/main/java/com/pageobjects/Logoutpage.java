package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;

public class Logoutpage extends BASEclass{
		@FindBy(xpath="//div[@class='pros-sml']")
	    WebElement iconprofilebutton;
	    @FindBy(xpath="//i[@class='fas fa-sign-out-alt']")
	    WebElement signout;
		public Logoutpage() {
			PageFactory.initElements(getDriver(), this);
		}
		public void myprofile111() throws Throwable {
			Log.info("edit profile button");
			Actionsclass.click(getDriver(), iconprofilebutton);
			
			
		}
		
		public void logout() throws Throwable {
			Log.info("click on the sign out page ");
			Actionsclass.click(getDriver(), signout);
			
		}
	    
	    
	    
	    
	    
	    
	    
}
