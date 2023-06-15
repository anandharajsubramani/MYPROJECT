package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;

public class Ticketcreation extends BASEclass {

	
	@FindBy(xpath="	//h4[text()='Add New Ticket'] ")
	//@FindBy(xpath="//table[@id='tblDashboard']//tbody//tr[position()=last()]")
   WebElement ticketscreationpagetitle;
	
	
	
	@FindBy(id="Title")
   WebElement title;

	@FindBy(id="Priority")
    WebElement Priority;
	
	
	@FindBy(id="Tool")
    WebElement department;
	
	@FindBy(id="publisher")
    WebElement publisher;
	
	
	@FindBy(id="Description")
   WebElement Description;
	
	@FindBy(id="Load")
   WebElement createticket;
	
	@FindBy(xpath="//table[@id='tblDashboard']//tbody//tr[position()=last()]//td[1]")
	//@FindBy(xpath="//table[@id='tblDashboard']//tbody//tr[position()=last()]")
    WebElement lastcreatedtickets;
	
	
	public Ticketcreation() {
		PageFactory.initElements(getDriver(), this);
	}
	
     public boolean validateticketcreatepage() throws Throwable {
	  return Actionsclass.isDisplayed(getDriver(), ticketscreationpagetitle );
     }
     
     
	public void entertitle(String titledes) throws Throwable {
		Log.info("enter the title ");
		Actionsclass.type(title, titledes);
		
	}
	
	
	public void selectpriority( int i) throws Throwable {
		Log.info("select the priority ");
		Actionsclass.selectByIndex( Priority, i);
	}
	public void selecttool(int t) throws Throwable {
		Log.info("enter the tool");
		Actionsclass.selectByIndex( department, t);
	}
	public void selectpublisher(int d) throws Throwable {
		Log.info("enter the publisher");
		Actionsclass.selectByIndex( publisher, d);
	}
	public void enterdescription(String des) throws Throwable {
		Log.info("enter the des");
		Actionsclass.type(Description, des);
	}
	
	
public Homepage clickonticketsbutton() throws Throwable {
	Actionsclass.JSClick(getDriver(),createticket );
	return new Homepage();
	}
	
	
	
	

}
