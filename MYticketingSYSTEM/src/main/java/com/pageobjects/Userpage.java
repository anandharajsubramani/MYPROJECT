package com.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;


public class Userpage extends BASEclass{
	ChromeOptions chromeOptions=null;
	FirefoxOptions firefoxoptions=null;
	@FindBy(id="EMAIL")
	 WebElement username1;
	@FindBy(id="PASSWORD")
	 WebElement password2;
	@FindBy(xpath="//button[text()='Login']")
	 WebElement submitbutton;
	
	
	public  Userpage() {
		PageFactory.initElements(getDriver(), this);
	}
	public void user( String uname,String  pword) throws Throwable {
		
		

	           
		
		
		System.out.println("rdghdbhd");
		
      Log.startTestCase("logintest");
      Log.info("enter username and password");
      
		Actionsclass.type(username1, uname);
		Actionsclass.type(password2, pword);
		Actionsclass.click(getDriver(),  submitbutton);
	
		
		Thread.sleep(5555);
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
