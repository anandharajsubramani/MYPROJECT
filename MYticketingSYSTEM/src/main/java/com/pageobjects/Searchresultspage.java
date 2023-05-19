package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class Searchresultspage extends BASEclass{
	
	
	   
	
	@FindBy(xpath="//*[@id=\"tblDashboard\"]/tbody/tr/td[7]/div/span[1]/i")
    WebElement iconbuttonclick;
	
	@FindBy(xpath="//*[@id=\"ULTabul\"]/li[2]/a ")
    WebElement addtionaldetailespage;
	
	
	
	@FindBy(xpath="//*[@id=\"TicketView\"]/div/div/div[1]/button")
    WebElement addtionaldetailespageclose;
	@FindBy(xpath="//table[@id='tblDashboard']//tbody//tr[position()=(1)]//td[position()=(9)]//i")
    WebElement pencilbuttonclick;
	
	
	public  Searchresultspage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public Ticketseditpage agentandtechnicianclickontickets() throws Throwable {
		Actionsclass.click(getDriver(), pencilbuttonclick);
		return new Ticketseditpage();
		
	}
	
	public Ticketseditpage userclickontickets() throws Throwable {
		Actionsclass.click(getDriver(), iconbuttonclick);
		return new Ticketseditpage();
	}

	public NEXTANDPRIVIOUSPAGEtest addtionals() throws Throwable {
		Actionsclass.click(getDriver(),addtionaldetailespage);
		Actionsclass.click(getDriver(),addtionaldetailespageclose);
		return new NEXTANDPRIVIOUSPAGEtest();
		
	}
}
