package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;

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
 
 
public void ticketsreports(String input) throws Throwable {
	Log.info("selct the drop down in the tickets reports page ");
	 for(WebElement wed:  reportsdropdown) {
		 Thread.sleep(3333);
		if(wed.getText().trim().equals(input)) {
			System.out.println("selected option on web element"+" = "+ wed.getText());
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
