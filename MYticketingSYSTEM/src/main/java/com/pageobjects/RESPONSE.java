package com.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;

public class RESPONSE extends BASEclass{
	//response functionality
    @FindBy(xpath="//*[@id='addnote']")
	 By  Responsebutton;
	@FindBy(xpath="//*[@id=\"select2-responseList-container\"] ")//*[@id=\"select2-responseList-results\"]/li 
	WebElement responsdebuttonlist;
	@FindBy(xpath="//*[@id=\"select2-responseList-results\"]/li ")
	List<WebElement> responsenamelist;
	@FindBy(xpath="//*[@id=\"body\"]")
	 WebElement response_des;
	@FindBy(xpath="//*[@id=\"addnotess\"] ")
	 WebElement response_sendbutton;
	@FindBy(xpath="/html/body/div[6]/div/div[6]/button[1]")
    WebElement responseupdatedbutton;
	system.out.println("hhsajh");
  //  @FindBy(xpath="//*[@id=\"add-notes\"]/div/div/div[1]/button/span ")
 //   WebElement responseclosedbutton;
	WebDriverWait wait;
	public Ticketseditpage Response1(String des,String des1) throws Throwable {
		Log.info("response ooption to enter first and next response details ");
		System.out.println("jjjj");
		Thread.sleep(3222);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait= new WebDriverWait(getDriver(), Duration.ofSeconds(5));
		  wait.until(ExpectedConditions.presenceOfElementLocated(Responsebutton)).click();

		//JavascriptExecutor js = (JavascriptExecutor)getDriver();
		//JavascriptExecutor js =(JavascriptExecutor)getDriver();
	  // js.executeScript("arguments[0].click();", Responsebutton);
				//Actionsclass.click(getDriver(),Responsebutton);
				Thread.sleep(2222);
				Actionsclass.type(response_des,des );
				Thread.sleep(2222);
				Actionsclass.click(getDriver(), responsdebuttonlist);
				
				

				try {
					for(WebElement wed:responsenamelist) {
						 Thread.sleep(2000);
						if(wed.getText().trim().equalsIgnoreCase(des1)) {
							System.out.println("selected option on web element"+" = "+ wed.getText());
							wed.click();
						}
						}
		        }
				
				catch(Exception e) {
					
		        }
			    
				Thread.sleep(2222);
	        	Actionsclass.click(getDriver(), response_sendbutton);
	        	Thread.sleep(2222);
	         Actionsclass.click(getDriver(),responseupdatedbutton);
			   //  Actionsclass.click(getDriver(), responseclosedbutton);
			    // Actionsclass.click(getDriver(), ticketclosedbutton);
					return new  Ticketseditpage();
	     
		}
	
}
