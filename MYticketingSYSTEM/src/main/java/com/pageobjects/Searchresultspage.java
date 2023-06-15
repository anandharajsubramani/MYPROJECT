package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;

public class Searchresultspage extends BASEclass{
    @FindBy(xpath="//*[@id=\"ULTabul\"]/li[2]/a ")
    WebElement addtionaldetailespage;
	@FindBy(xpath="//*[@id=\"TicketView\"]/div/div/div[1]/button")
    WebElement addtionaldetailespageclose;

	public  Searchresultspage() {
		PageFactory.initElements(getDriver(), this);
	}
public Homepage addtionals() throws Throwable {
	Log.info("addtional details page function");
		Actionsclass.click(getDriver(),addtionaldetailespage);
		Actionsclass.click(getDriver(),addtionaldetailespageclose);
	    return new Homepage();
		
	}
}
