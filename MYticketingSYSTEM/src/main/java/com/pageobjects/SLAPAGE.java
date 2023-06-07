package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class SLAPAGE extends BASEclass {
	@FindBy(xpath=("//*[@id=\"select2-lstTool-results\"]/li"))
	List<WebElement> sladropdown; 
	
	@FindBy(xpath=("//*[@id=\"savebtn\"]"))
    WebElement savebutton; 
    @FindBy(xpath=("/html/body/div[2]/div/div[6]/button[1]"))
    WebElement updatedbutton; 	  
			  
			  
			//*[@id="SLAdata"]/tbody/tr[1]/td
	 public   SLAPAGE() {
			PageFactory.initElements(getDriver(), this);
		}
	 
	 
public void sladropdown() throws Throwable {
		
		 for(WebElement wed: sladropdown) {
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


public void saveoption() throws Throwable {
	Actionsclass.click(getDriver(), savebutton);	
}
	
public Homepage updates() throws Throwable {
	Actionsclass.click(getDriver(), updatedbutton);
	return new Homepage();
}




}
