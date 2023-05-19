package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class STRARTTIMEtest extends BASEclass {

	
	
	@FindBy(xpath="	/html/body/div[2]/div[1]/div[1]/button[1]  ")
   WebElement priviousbutton;
	

	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/button[3]")
	
   WebElement nextbutton;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/button[2] ")
   WebElement homedate;

	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/div[1]/div/div[1]/div")
    WebElement monthdropdown;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/div[2]")
    WebElement yeardropdown;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[5]  ")
    WebElement selecteddate;
	
	public STRARTTIMEtest () {
		PageFactory.initElements(getDriver(), this);
	}
	
     
     
     

	
	
	public void selectmonth( String w) throws Throwable {
		Actionsclass.selectByVisibleText( w,monthdropdown );
	}
	public void selectyear(int t) throws Throwable {
		Actionsclass.selectByIndex( yeardropdown, t);
	}
	public Homepage selectpublisher() throws Throwable {
		Actionsclass.isEnabled( getDriver(), selecteddate);
		return new Homepage();
	}
	
	
	

}
