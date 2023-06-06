package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class Homepage extends BASEclass {
//all page common functions
	@FindBy(xpath=("/html/body/header/div/div[1]/a"))
	WebElement logo;
	@FindBy(xpath=" /html/body/header/div/div[2]/ul/li[1]/a")
    WebElement refershbutton;
	@FindBy(id=("bell"))
	WebElement notification; 
	@FindBy(xpath="//div[@class='pros-sml']")
    WebElement iconprofilebutton;
	@FindBy(xpath="//*[@id=\"tblDashboard_wrapper\"]/div[2]/button[1]/span/img")
    WebElement ExcelDOWNbutton;
	@FindBy(xpath="//*[@id=\"tblDashboard_wrapper\"]/div[2]/button[2]/span/img")
    WebElement PDFDOWNbutton;
	@FindBy(id=("TxtStartDt"))
	WebElement starttime; 
	@FindBy(id=("TxtEndDt"))
	WebElement endtime; 
	@FindBy(xpath="//div//*[text()='Get']")
	WebElement getbutton;
	@FindBy(xpath=("//*[@class='tick-taber']//li"))
	List<WebElement> mylist; 
	@FindBy(xpath="//*[@id=\"tblDashboard_filter\"]/label/input")
	WebElement Searchtickets;
	
//user login  functions
	@FindBy(xpath="//a[@class='btn-a']")
    WebElement tickets;
	@FindBy(xpath="//*[@id=\"tblDashboard\"]/tbody/tr[1]/td[7]/div/span[1]/i")
    WebElement  eyeviewbuttonclick;
	@FindBy(xpath="//*[@id=\"tblDashboard\"]/tbody/tr[1]/td[7]/div/span[2]/i ")
    WebElement timelinebuttonclick;
	
	
//user agent  functions
	//tickets tab function
	@FindBy(xpath=" /html/body/div/div[1]/ul/li[2]/a ")
    WebElement agentticketpage;
	@FindBy(xpath="//*[@id='tblDashboard']/tbody/tr/td[9]/div/span/i[@class='fa fa-pencil ']")
    WebElement  pencilbuttonclick;
	@FindBy(xpath="//*[@id=\"tblDashboard\"]/tbody/tr[1]/td[9]/div/span[2]/i")
    WebElement timelineagentbutton;
	//sla tab function
	@FindBy(xpath="/html/body/div[1]/div[1]/ul/li[3]/a")
    WebElement  SLAConfigurepage;
	@FindBy(xpath="//*[@id=\"select2-lstTool-container\"]")
    WebElement  SLAConfiguredropdownclick;
//ticketreport tab function
    @FindBy(xpath="/html/body/div/div[1]/ul/li[4]/a ")
    WebElement agentticketreportspage;
    @FindBy(xpath="//*[@id=\"select2-ddltool-container\"] ")
    WebElement ticketreportdropdownclick;
//ticketchartreport tab function
    @FindBy(xpath="/html/body/div/div[1]/ul/li[5]/a")
    WebElement agentchartreportspage;
    
  //EMPOLYEE tab function
    @FindBy(xpath="/html/body/div/div[1]/ul/li[4]/a")
    WebElement employeetappage; 
  //*[@id="tblEmployee_wrapper"]/div[2]/button[3]/span/button
 
    
    
   public  Homepage() {
		PageFactory.initElements(getDriver(), this);
	}
    
	public MYPROFILEtest myprofile() throws Throwable {
		Actionsclass.click(getDriver(), iconprofilebutton);
		return new MYPROFILEtest();
		
	}
	
	
	public void agentticketpage() throws Throwable {
		Actionsclass.click(getDriver(), agentticketpage);
		
	}
	
	public void refersh() throws Throwable {
		Actionsclass.click(getDriver(), refershbutton);
		
	}
	
	public void notification() throws Throwable {
		Actionsclass.click(getDriver(), notification);
	}
	
public Ticketseditpage validatemylist() throws Throwable {
		
		 for(WebElement wed: mylist) {
			 Thread.sleep(3333);
			if(wed.getText().trim().equals("Resolved")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Actionsclass.click(getDriver(), wed);
				eyeviewbutton();
				break;
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
				//editthetickets();
				//break;
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
		 return new Ticketseditpage();
		 
		}
//new ticket creation
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

// search option for all common functions
	public  void searchtickets(String ticketname) throws Throwable {
		Actionsclass.type(Searchtickets, ticketname);
		Actionsclass.click(getDriver(),  Searchtickets);	
	}
	public Searchresultspage eyeviewbutton() throws Throwable {
		Actionsclass.click(getDriver(), eyeviewbuttonclick);
		return new  Searchresultspage();
	}
	public TIMEline timeline() throws Throwable {
		Actionsclass.click(getDriver(), timelinebuttonclick);
		return new TIMEline();
	}
	public TIMEline timeline1() throws Throwable {
		Actionsclass.click(getDriver(), timelineagentbutton);
		return new TIMEline();
	}
// download option functions
	public void  exceldown() throws Throwable {
		Actionsclass.click(getDriver(), ExcelDOWNbutton);
		Actionsclass.click(getDriver(), PDFDOWNbutton);
	}
//sla PAGE
	public SLAPAGE  sla() throws Throwable {
		Actionsclass.click(getDriver(), SLAConfigurepage);
		Actionsclass.click(getDriver(), SLAConfiguredropdownclick);
		return new SLAPAGE();
	}
	
//TICKETS REPORTS
	public report  TICKTSreport() throws Throwable {
		Actionsclass.click(getDriver(), agentticketreportspage);
		Actionsclass.click(getDriver(),ticketreportdropdownclick);
		return new report();
	}
//chart REPORTS
	public report  chartreport() throws Throwable {
		Actionsclass.click(getDriver(), agentticketreportspage);
		Actionsclass.click(getDriver(),ticketreportdropdownclick);
		return new report();
	}
//new empolyee created
		public EMPLOYEEcreated  employee() throws Throwable {
			Actionsclass.click(getDriver(), employeetappage);
			
			return new EMPLOYEEcreated();
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
		 
