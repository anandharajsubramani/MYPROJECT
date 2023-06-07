package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class report extends BASEclass {
	
	@FindBy(xpath=("//*[@id=\"btnBkGet\"]"))
	WebElement getbutton; 
	
	@FindBy(xpath=("//*[@id=\"select2-ddltool-results\"]/li"))
	List<WebElement> reportsdropdown;
	@FindBy(xpath=("//*[@id=\"divContent\"]/span[2]/span[1]/span/ul/li/span[1]"))
	WebElement cancelbuttontechnician;
	@FindBy(xpath=("//*[@id=\"divContent\"]/span[2]/span[1]/span/ul"))
	WebElement technicianoption;
			  
    public   report() {
		PageFactory.initElements(getDriver(), this);
	}
 
 
public void sladropdown() throws Throwable {
	
	 for(WebElement wed:  reportsdropdown) {
		 Thread.sleep(3333);
		if(wed.getText().trim().equals("SMART")) {
			System.out.println("selected option on web element"+" = "+ wed.getText());
			Actionsclass.click(getDriver(), wed);
		
		}
		else if(wed.getText().trim().equals("SESAME ")) {
			System.out.println("selected option on web element"+" = "+ wed.getText());
			Actionsclass.click(getDriver(), wed);
			
	        	
		}else if(wed.getText().trim().equals("3B2")) {
			System.out.println("selected option on web element"+" = "+ wed.getText());
			Thread.sleep(3333);
			Actionsclass.click(getDriver(), wed);
			
		}else if(wed.getText().trim().equals("INDESIGN")) {
			System.out.println("selected option on web element"+" = "+ wed.getText());
			Thread.sleep(3333);
			Actionsclass.click(getDriver(), wed);
			
		}else if(wed.getText().trim().equals("XML PROCESS")) {
			System.out.println("selected option on web element"+" = "+ wed.getText());
			Thread.sleep(3333);
			Actionsclass.click(getDriver(), wed);
			
		}else if(wed.getText().trim().equals("Ticketing system")) {
			System.out.println("selected option on web element"+" = "+ wed.getText());
			Thread.sleep(3333);
			Actionsclass.click(getDriver(), wed);
		}
		}

	}


public Homepage saveoption() throws Throwable {
Actionsclass.click(getDriver(), getbutton);
return new Homepage();
}

public void techincianoption() throws Throwable {
Actionsclass.click(getDriver(), technicianoption);

}

public void techniciancancel() throws Throwable {
Actionsclass.click(getDriver(), cancelbuttontechnician);

}
	  
}
