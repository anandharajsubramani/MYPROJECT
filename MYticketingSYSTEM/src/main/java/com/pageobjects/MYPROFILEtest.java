package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;

public class MYPROFILEtest extends BASEclass {

	 @FindBy(xpath=" //*[@id=\"popupField\"]/li[2]/a   ")
	    WebElement myprofile;
		
	    @FindBy(xpath="//i[@class='fas fa-sign-out-alt']")
	    WebElement signout;
		
		@FindBy(id="txtName")
	   WebElement entername;

		@FindBy(id="txtphno")
	    WebElement enterphoneno;
		
		
		@FindBy(id="txtEmail")
	    WebElement enteremail;
		
		@FindBy(id="txtpass")
	    WebElement enterpassword;
		
		
		@FindBy(id="txtconpass")
	   WebElement enterconpassword;
		
	
		@FindBy(xpath="//*[@id=\"myProfile\"]/div/div/div[2]/div[4]/button[2]")
		//@FindBy(xpath="//table[@id='tblDashboard']//tbody//tr[position()=last()]")
	    WebElement savebutton;
	 
	 
	 
	public MYPROFILEtest() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void myprofile1() throws Throwable {
		Log.info("click on the profile option ");
		Actionsclass.click(getDriver(), myprofile);
		
	}
	public void entername(String titledes) throws Throwable {
		Log.info("enter the name ");
		Actionsclass.type(entername, titledes);
		
	}
	public void enterphoneno(String titledes) throws Throwable {
		Log.info("enter the phone number ");
		Actionsclass.type(enterphoneno, titledes);
		
	}
	public void enteremail(String titledes) throws Throwable {
		Log.info("enter the email id ");
		Actionsclass.type(enteremail, titledes);
		
	}
	public void enterpassword(String titledes) throws Throwable {
		Log.info("enter the password ");
		Actionsclass.type(enterpassword, titledes);
		
	}
	public void enterconpassword(String titledes) throws Throwable {
		Log.info("enter the conform password ");
		Actionsclass.type(enterconpassword, titledes);
		
	}
	public Homepage clickonsaveprofilebutton() throws Throwable {
		Actionsclass.JSClick(getDriver(),savebutton );
		return new Homepage();
		}
	public Userpage logout() throws Throwable {
		Actionsclass.click(getDriver(), signout);
		return new Userpage();
		
	}
}
