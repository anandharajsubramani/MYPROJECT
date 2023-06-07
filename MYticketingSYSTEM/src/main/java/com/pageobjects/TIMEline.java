package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class TIMEline extends BASEclass {

	@FindBy(xpath="/html/body/div[1]/div[3]/div[3]/div[1]/h2/a ")
	WebElement  cancelbutton;
	
	 public  TIMEline() {
			PageFactory.initElements(getDriver(), this);
		}
	 public Homepage myprofile() throws Throwable {
			Actionsclass.click(getDriver(), cancelbutton);
			return new Homepage();
			
		}
}
