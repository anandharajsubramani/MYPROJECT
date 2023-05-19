package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class Homepage extends BASEclass {
	
	@FindBy(xpath=("/html/body/header/div/div[1]/a"))
	 WebElement logo;

	@FindBy(id=("TxtEndDt"))
	 WebElement endtime; 
	
	
	@FindBy(id=("bell"))
	WebElement notification; 
	
	
	@FindBy(id=("TxtStartDt"))
	WebElement starttime; 
	
	@FindBy(xpath=("//*[@class='tick-taber']//li"))
	 List<WebElement> mylist; 
	
	@FindBy(xpath="//table[@id='tblDashboard']//tbody//tr[position()=(1)]//td[position()=(9)]//i")
     WebElement pencilbuttonclick;
	
	@FindBy(xpath="//a[@class='btn-a']")
     WebElement tickets;
	
	@FindBy(xpath="//*[@id=\"tblDashboard_filter\"]/label/input")
	WebElement Searchtickets; 
	@FindBy(xpath="//div[@class='pros-sml']")
    WebElement iconprofilebutton;
    @FindBy(xpath="//i[@class='fas fa-sign-out-alt']")
    WebElement signout;
   
    @FindBy(xpath=" /html/body/header/div/div[2]/ul/li[1]/a")
    WebElement refershbutton;
   

   
    public  Homepage() {
		PageFactory.initElements(getDriver(), this);
	}
    
	public MYPROFILEtest myprofile() throws Throwable {
		Actionsclass.click(getDriver(), iconprofilebutton);
		return new MYPROFILEtest();
		
	}
	
	public void logout() throws Throwable {
		Actionsclass.click(getDriver(), signout);
		
	}
    
	
	public void refersh() throws Throwable {
		Actionsclass.click(getDriver(), refershbutton);
		
	}
	
	public void notification() throws Throwable {
		Actionsclass.click(getDriver(), notification);
		
	}
	
	public void validatemylist() throws Throwable {
		
		 for(WebElement wed: mylist) {
			 Thread.sleep(3333);
			if(wed.getText().trim().equals("Resolved")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Actionsclass.click(getDriver(), wed);
				
			}
			else if(wed.getText().trim().equals("Open")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Actionsclass.click(getDriver(), wed);
			
			
			}else if(wed.getText().trim().equals("Assigned")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Thread.sleep(3333);
				Actionsclass.click(getDriver(), wed);
				
			}else if(wed.getText().trim().equals("Inprogress")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Thread.sleep(3333);
				Actionsclass.click(getDriver(), wed);
				
			}else if(wed.getText().trim().equals("NeedMoreInformation")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Thread.sleep(3333);
				Actionsclass.click(getDriver(), wed);
				
			}else if(wed.getText().trim().equals("All")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Thread.sleep(3333);
				Actionsclass.click(getDriver(), wed);
			}else if(wed.getText().trim().equals("Reverted")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Thread.sleep(3333);
				Actionsclass.click(getDriver(), wed);
			
			}
			
			}
		 
		}

	public Ticketcreation ticketscreationbutton() throws Throwable {
		Actionsclass.click(getDriver(),  tickets);
		return new Ticketcreation();
	}
	public STRARTTIMEtest startedtime() throws Throwable {
		Actionsclass.click(getDriver(),  starttime);
		return new STRARTTIMEtest();
	}
	public Ticketcreation endtime() throws Throwable {
		Actionsclass.click(getDriver(),  endtime);
		return new Ticketcreation();
	}
	public void editthetickets() throws Throwable{
		Actionsclass.click(getDriver(), pencilbuttonclick);
		
	}
	
	public Searchresultspage searchtickets(String ticketname) throws Throwable {
		Actionsclass.type(Searchtickets, ticketname);
		Actionsclass.click(getDriver(),  Searchtickets);
		return new Searchresultspage();
	}

	
	public boolean validatelogo() throws Throwable {
		return Actionsclass.isDisplayed(getDriver(), logo);
		
	}
	
	
	public String gettitleofhomepage() {
	
		String title = getDriver().getTitle();
		//System.out.println(title);
		return  title;
	}
	
public String getcurrenturl() {
	String homepageurl = getDriver().getCurrentUrl();
	return homepageurl;
}
	
	
}
		 
