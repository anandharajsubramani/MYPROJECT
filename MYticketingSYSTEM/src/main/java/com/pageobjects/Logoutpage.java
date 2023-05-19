package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class Logoutpage extends BASEclass{
		@FindBy(xpath="//div[@class='pros-sml']")
	    WebElement iconprofilebutton;
	    @FindBy(xpath="//i[@class='fas fa-sign-out-alt']")
	    WebElement signout;
		public Logoutpage() {
			PageFactory.initElements(getDriver(), this);
		}
		public void myprofile() throws Throwable {
			Actionsclass.click(getDriver(), iconprofilebutton);
			
			
		}
		
		public void logout() throws Throwable {
			Actionsclass.click(getDriver(), signout);
			
		}
	    
	    
	    
	    
	    
	    
	    
}
