package com.pageobjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;

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
		Log.info("click on the profile icon option");
		Actionsclass.click(getDriver(), iconprofilebutton);
		return new MYPROFILEtest();
		
	}
	
	
	public Ticketseditpage agentticketpage() throws Throwable {
		Log.info("click on the tickets tab page");
		Actionsclass.click(getDriver(), agentticketpage);
		return new Ticketseditpage();
		
	}
	
	public void refersh() throws Throwable {
		Log.info("click on the refresh option");
		Actionsclass.click(getDriver(), refershbutton);
		
	}
	
	public void notification() throws Throwable {
		Log.info(" click on the notification option");
		Actionsclass.click(getDriver(), notification);
	}
	
@SuppressWarnings("deprecation")
public void validatemylist() throws Throwable {
	Log.info("click on the each tab  option in tickets tab page");
		 for(WebElement wed: mylist) {
			 getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			if(wed.getText().trim().equalsIgnoreCase("Resolved")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Actionsclass.click(getDriver(), wed);
			   //userpencilbutton();   //userlogin 
				//break;
			}
			else if(wed.getText().trim().equalsIgnoreCase("Open")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				Actionsclass.click(getDriver(), wed);
				//editthetickets(); //agent and technician
				//userpencilbutton();	//user
				//break;
			}else if(wed.getText().trim().equalsIgnoreCase("Assigned")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				
				Actionsclass.click(getDriver(), wed);
				//editthetickets();// agent and technician
				//userpencilbutton();  //user
				//break;
			}else if(wed.getText().trim().equalsIgnoreCase("Inprogress")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
			
				Actionsclass.click(getDriver(), wed);
				//editthetickets();//agent and technician
				//userpencilbutton();  //user
				//break;
			}else if(wed.getText().trim().equalsIgnoreCase("NeedMoreInformation")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
			
				Actionsclass.click(getDriver(), wed);
				//editthetickets();//agent and technician
				//userpencilbutton(); //user
				//break;
			}else if(wed.getText().trim().equalsIgnoreCase("All")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
			
				Actionsclass.click(getDriver(), wed);
				//editthetickets();//agent and technician
				//userpencilbutton();  //user
				//break;
			}
			else if(wed.getText().trim().equalsIgnoreCase("Responded")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
			
				Actionsclass.click(getDriver(), wed);
				//editthetickets();  //agent and technician
				//userpencilbutton(); //user
				//break;
			}
			else if(wed.getText().trim().equalsIgnoreCase("Reopen")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
	
				Actionsclass.click(getDriver(), wed);
				//editthetickets();  //agent and technician
				//userpencilbutton();  //user
				//break;
			}
			else if(wed.getText().trim().equalsIgnoreCase("Reverted")) {
				System.out.println("selected option on web element"+" = "+ wed.getText());
				
				Actionsclass.click(getDriver(), wed);
				   //userpencilbutton();  //user
				//break; 
			}
			
			}
		// return new Ticketseditpage();
		 
		}
@SuppressWarnings("deprecation")
public Ticketseditpage validatemylist1(String input) throws Throwable {
	Log.info("click on the some particular selected tab in the tickets tab page");
	 for(WebElement wed: mylist) {
		 getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		if(wed.getText().trim().equalsIgnoreCase(input)) {
			System.out.println("selected option on web element"+" = "+ wed.getText());
			Actionsclass.click(getDriver(), wed);
		   //userpencilbutton();   //userlogin 
			agent_pencilbutton();//agent and technician
		}
	 }
	return new Ticketseditpage();

}
@SuppressWarnings("deprecation")
public Ticketseditpage validatemylist2(String input) throws Throwable {
	Log.info("click on the some particular selected tab in the tickets tab page");
	 for(WebElement wed: mylist) {
		 getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		if(wed.getText().trim().equalsIgnoreCase(input)) {
			System.out.println("selected option on web element"+" = "+ wed.getText());
			Actionsclass.click(getDriver(), wed);
		   userpencilbutton();   //userlogin 
			
		}
	 }
	return new Ticketseditpage();

}
//new ticket creation
	public Ticketcreation ticketscreationbutton() throws Throwable {
		Log.info("click on the new tickets creation button");
		Actionsclass.click(getDriver(),  tickets);
		return new Ticketcreation();
	}
	
	public STRARTTIMEtest startedtime() throws Throwable {
		Log.info("click on the date starttime details");
		Actionsclass.click(getDriver(),  starttime);
		return new STRARTTIMEtest();
	}
	public Ticketcreation endtime() throws Throwable {
		Log.info("click on the date endtime details");
		Actionsclass.click(getDriver(),  endtime);
		return new Ticketcreation();
	}

// search option for all common functions
	public  Ticketseditpage searchtickets(String ticketname) throws Throwable {
		Log.info("user enter to the search option to search the tickets");
		Actionsclass.type(Searchtickets, ticketname);
		Actionsclass.click(getDriver(),  Searchtickets);	
		return new Ticketseditpage();
	}
	public void userpencilbutton() throws Throwable {
		Log.info("user click on the pencil icon ");
		Actionsclass.click(getDriver(), eyeviewbuttonclick);
		//return new  Searchresultspage();
		//return new Ticketseditpage();
	}
	public void agent_pencilbutton() throws Throwable {
		Log.info("agent or techinican  click on the pencil icon ");
		Actionsclass.click(getDriver(), pencilbuttonclick);
		//return new  Searchresultspage();
		//return new Ticketseditpage();
	}
	public TIMEline timeline() throws Throwable {
		Log.info(" end user click on the timeline icon ");
		Actionsclass.click(getDriver(), timelinebuttonclick);
		return new TIMEline();
	}
	public TIMEline timeline1() throws Throwable {
		Log.info("agent or tech click on the timeline icon ");
		Actionsclass.click(getDriver(), timelineagentbutton);
		return new TIMEline();
	}
// download option functions
	public void  exceldown() throws Throwable {
		Log.info("click on the excel and pdf option download ");
		Actionsclass.click(getDriver(), ExcelDOWNbutton);
		Actionsclass.click(getDriver(), PDFDOWNbutton);
	}
//sla PAGE
	public SLAPAGE  sla() throws Throwable {
		Log.info("click on the sla tab page ");
		Actionsclass.click(getDriver(), SLAConfigurepage);
		Actionsclass.click(getDriver(), SLAConfiguredropdownclick);
		return new SLAPAGE();
	}
	
//TICKETS REPORTS
	public report  TICKTSreport() throws Throwable {
		Log.info("click on the tickets reports tab page ");
		Actionsclass.click(getDriver(), agentticketreportspage);
		Actionsclass.click(getDriver(),ticketreportdropdownclick);
		return new report();
	}
//chart REPORTS
	public report  chartreport() throws Throwable {
		Log.info("click on the chart reports tab page ");
		Actionsclass.click(getDriver(), agentticketreportspage);
		Actionsclass.click(getDriver(),ticketreportdropdownclick);
		return new report();
	}
//new empolyee created
		public EMPLOYEEcreated  employee() throws Throwable {
			Log.info("new employee created function ");
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
		 
