package com.pageobjects;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;

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
	 
	 
public Homepage sladropdown(String asd) throws Throwable {
	Log.info("selct the drop down in the sla page ");
	try {
		 for(WebElement wed: sladropdown) {
			 Thread.sleep(3333);
			if(wed.getText().trim().equalsIgnoreCase(asd)) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Actionsclass.click(getDriver(), wed);
			}
		
			}
	  } 
	catch(StaleElementReferenceException e) {
	 
		Actionsclass.click(getDriver(), savebutton);
	  }
	Actionsclass.click(getDriver(), updatedbutton);
	return new Homepage(); 
		}
}
