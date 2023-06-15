package com.pageobjects;



import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;


public class Ticketseditpage  extends BASEclass{
	@FindBy(xpath="//table[@id='tblDashboard']//tbody//tr[position()=(1)]//td[position()=(9)]//i[@title='Info']")
     WebElement pencilbuttonclick;
	@FindBy(xpath="//table[@id='tblDashboard']//tbody//tr[position()=(1)]//td[position()=(9)]//i")
    WebElement pencilbuttonclick1;

// assign button functionality
	@FindBy(xpath="//div[@class='row']//button[@id='assign1']")
    WebElement assignbutton;
	@FindBy(xpath="//*[@id='select2-lstAssign-results']/li   ")
	List<WebElement> assignbuttonlist;
	@FindBy(xpath="//*[@id=\"select2-lstAssign-container\"] ")
    WebElement assignnamelist;
	@FindBy(id="assign")
    WebElement assignsavebutton;
	@FindBy(xpath="/html/body/div[7]/div/div[6]/button[1]")
    WebElement assignupdatedbutton;
  //  @FindBy(xpath="//*[@id='Assign-issue']/div/div/div[1]/button/span  ")
   // WebElement assignclosedbutton;
	@FindBy(xpath="	//*[@id=\"TicketView\"]/div/div/div[1]/button ")
	WebElement ticketclosedbutton;

// REassign button functionality
	@FindBy(xpath="//div[@class='row']//button[@id='reassign']")
	  WebElement reassignbutton;
	@FindBy(xpath="//*[@id='select2-lstReassign-container']")
    WebElement reassignnamelist;
	@FindBy(xpath="//*[@id='select2-lstReassign-results']/li  ")
	List<WebElement> reassignbuttonlist;
	@FindBy(xpath="//*[@id='Text']")
	 WebElement reassign_des;
	@FindBy(xpath="//*[@id='Reassign'] ")
    WebElement reassignsavebutton;
	@FindBy(xpath="/html/body/div[7]/div/div[6]/button[1]  ")
    WebElement reassignupdatedbutton;
   // @FindBy(xpath="//*[@id=\\\"reassign-issue\\\"]/div/div/div[1]/button/span ")
   // WebElement reassignclosedbutton;
	
	
 // revert button functionality
    @FindBy(xpath="//div[@class='row']//button[@id='Revert']")
    WebElement revertbutton;
	 @FindBy(css="textarea[id='RevertInfo']  ")
	 WebElement revert_des;
	@FindBy(xpath="//*[@id='reverthe']")
	 WebElement revert_sendbutton;
	@FindBy(xpath="/html/body/div[6]/div/div[6]/button[1]")//html/body/div[6]/div/div[6]/button[1]
    WebElement revertupdatedbutton;
	// @FindBy(xpath="//*[@id=\"Revertpop\"]/div/div/div[1]/button/span")
	  //  WebElement revertclosedbutton;
	
// needmoreifo button functionality
	 @FindBy(xpath="//div[@class='row']//button[@id='need']")
	    WebElement needmorebutton;
		@FindBy(id="needmoreinfo")
		 WebElement needmoreinfo_des;
		@FindBy(id="needminfo")
		 WebElement needmoreinfo_sendbutton;
		@FindBy(xpath="/html/body/div[6]/div/div[6]/button[1]")
	    WebElement needmoreinfoupdatedbutton;
		//@FindBy(xpath="//*[@id=\"Needinfo\"]/div/div/div[1]/button/span")
	    //WebElement needmoreinfoclosedbutton;
	
		
// inprogress button functionality
		@FindBy(xpath="//div[@class='row']//button[@id='inprogress']")
		 WebElement inprogressbutton;
		@FindBy(xpath="/html/body/div[5]/div/div/div[2]/button[2]")
		 WebElement inprogress_sendbutton;
		@FindBy(xpath="/html/body/div[5]/div/div[6]/button[1]")
	    WebElement inprgressupdatedbutton;
		
		
 // split button functionality	
				@FindBy(xpath="//div[@class='row']//button[@id='split']")
				   WebElement splitbutton;
				@FindBy(id="txtsplittitle")
				 WebElement split_title;
				@FindBy(xpath="//*[@id='Tool']")
			    WebElement split_tool;
				@FindBy(id="txtsplitdesc")
				 WebElement split_des;
				@FindBy(xpath="//input[@id='file']")
			    WebElement split_choosefile;
				@FindBy(xpath="//*[@id='Load'] ")
			    WebElement split_sendbutton;
				@FindBy(xpath="//*[@id=\"select2-Publisher-container\"] ")
			    WebElement split_dept;
						
				
 // resolved button functionality			
	@FindBy(xpath="//*[@id=\"Resolved\"]")
	 WebElement Resolvedbutton;		
	@FindBy(xpath="//*[@id=\"iddesc\"]")
	 WebElement Resolvedesdbutton;					
	@FindBy(xpath="//*[@id=\"Resolvedid\"]	")
	 WebElement Resolvesavedbutton;			
	@FindBy(xpath="//*[@id=\"resolve\"]/div/div/div[1]/button/span")
	 WebElement Resolvecanceldbutton;			
	@FindBy(xpath="/html/body/div[8]/div/div[6]/button[1]")
    WebElement reslovedupdatedbutton;		
				
	//change due date  functionality			
	@FindBy(xpath="//div[@class='row']//button[@id='change']")
    WebElement duedatechangebutton;
	@FindBy(xpath="	//*[@id='text']")
	 WebElement changeduedate_des;
		@FindBy(xpath="//*[@id='date']")
	 WebElement duedate_setbutton;
	@FindBy(xpath="//*[@id=\"changeduedates\"] ")
	 WebElement duedate_sendbutton;			
    @FindBy(xpath="//*[@id=\"Changeduedate\"]/div/div/div[1]/button/span ")
	 WebElement changeduecanceldbutton;
    
    		@FindBy(xpath="/html/body/div[6]/div/div[6]/button[1]")
    WebElement changedueupdatedbutton;
	
  //response functionality
    @FindBy(xpath="//div[@class='row']//button[@id='addnote']")
	 WebElement  Responsebutton;
	@FindBy(xpath="//*[@id=\"select2-responseList-container\"] ")//*[@id=\"select2-responseList-results\"]/li 
	WebElement responsdebuttonlist;
	@FindBy(xpath="//*[@id=\"select2-responseList-results\"]/li ")
	List<WebElement> responsenamelist;
	@FindBy(xpath="//*[@id=\"body\"]")
	 WebElement response_des;
	@FindBy(xpath="//*[@id=\"addnotess\"] ")
	 WebElement response_sendbutton;
	@FindBy(xpath="/html/body/div[7]/div/div[6]/button[1]")
    WebElement responseupdatedbutton;
  //  @FindBy(xpath="//*[@id=\"add-notes\"]/div/div/div[1]/button/span ")
 //   WebElement responseclosedbutton;
	
  //reopen functionality
	@FindBy(xpath="//*[@id='reopen'] ")
	WebElement reopenbutton;
	@FindBy(xpath="//*[@id=\"ttt\"]")
	 WebElement reopen_des;
	@FindBy(xpath="//*[@id=\"Submit\"] ")
	 WebElement reopensavebutton;
	
	
	//close functionality
	@FindBy(xpath="//div[@class='row']//button[@id='close']")
	    WebElement closebutton;
	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/button[2] ")
	 WebElement closedokbutton;
	@FindBy(xpath="/html/body/div[5]/div/div[6]/button[1]")
    WebElement closedupdatedbutton;
	
	
	//download functionality
	@FindBy(xpath="//*[@id=\\\"filedownload\\\"]")
	 WebElement download_button;
	

	
public  Ticketseditpage() {
	PageFactory.initElements(getDriver(), this);
}



public void editthetickets() throws Throwable{
	Log.info("click on the pencil icon ");
	Actionsclass.click(getDriver(), pencilbuttonclick);
	
}
public Searchresultspage editthetickets1() throws Throwable{
	Actionsclass.click(getDriver(), pencilbuttonclick);
	return new Searchresultspage();
}

public Homepage assign(String des) throws Throwable {
	Log.info("assign function ");
		Actionsclass.click(getDriver(), assignbutton);
		Actionsclass.click(getDriver(), assignnamelist);
		
		
		try {
			for(WebElement wed:assignbuttonlist) {
				getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				if(wed.getText().trim().equalsIgnoreCase(des)) {
					System.out.println("selected option on web element"+" = "+ wed.getText());
					wed.click();
				}
				}
        } catch(StaleElementReferenceException e) {
        	//Actionsclass.click(getDriver(), assignsavebutton);
        }
	     Actionsclass.click(getDriver(), assignsavebutton);
		Thread.sleep(3222);
	     Actionsclass.click(getDriver(), assignupdatedbutton);
	    // Actionsclass.click(getDriver(), assignclosedbutton);
	     Actionsclass.click(getDriver(), ticketclosedbutton);
			return new Homepage();
	}
public Homepage Revert(String des) throws Throwable {
	Log.info("revert function ");
 	 Actionsclass.click(getDriver(),revertbutton);
		Thread.sleep(2222);
		 Actionsclass.type(revert_des,des );
		 
		 Actionsclass.click(getDriver(),revert_sendbutton);
		 Thread.sleep(2222);
		  Actionsclass.click(getDriver(), revertupdatedbutton);
		   //  Actionsclass.click(getDriver(), revertclosedbutton);
		     Actionsclass.click(getDriver(), ticketclosedbutton);
		 return new Homepage();
	
	}
public Homepage Resolved(String des) throws Throwable {
	Log.info("resolved function ");
		Actionsclass.click(getDriver(), Resolvedbutton);
		Thread.sleep(2222);
		 Actionsclass.type(Resolvedesdbutton,des );
		 Actionsclass.click(getDriver(),Resolvesavedbutton);
		 Thread.sleep(2222);
		  Actionsclass.click(getDriver(), reslovedupdatedbutton);
		    // Actionsclass.click(getDriver(), Resolvecanceldbutton);
		  Thread.sleep(2222);
		     Actionsclass.click(getDriver(), ticketclosedbutton);
		 return new Homepage();	  
	}
	
	
public Homepage need(String des) throws Throwable {
	Log.info("needmore function ");
		Actionsclass.click(getDriver(), needmorebutton);
			Actionsclass.click(getDriver(),needmorebutton);
			
			 Actionsclass.type(needmoreinfo_des,des );
			 Actionsclass.click(getDriver(),needmoreinfo_sendbutton);
			 getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			  Actionsclass.click(getDriver(), needmoreinfoupdatedbutton);
			   //  Actionsclass.click(getDriver(), needmoreinfoclosedbutton);
			     Actionsclass.click(getDriver(), ticketclosedbutton);
			 return new Homepage();
		
	}
public Homepage split(String des,int d,String des1,int g) throws Throwable {
	Log.info("split function ");
		Actionsclass.click(getDriver(),splitbutton);
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 Actionsclass.type(split_title,des );
		 Actionsclass.selectByIndex( split_tool, d);
		 Actionsclass.selectByIndex( split_dept, g);
		 Actionsclass.type(split_des,des1 );
		/* Actionsclass.click(getDriver(),split_choosefile);
		 String file = "C:\\Users\\2662\\Downloads\\MicrosoftTeams-image (33).png";
		 StringSelection dd = new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dd, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5555);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);*/
			 Actionsclass.click(getDriver(),split_sendbutton);
			
		
			 return new Homepage();
	}
	
public void change(String des,String d) throws Throwable {
	Log.info("change due date function ");
		Actionsclass.click(getDriver(),duedatechangebutton);
		Thread.sleep(2222);
		 Actionsclass.type(changeduedate_des,des );
		 Thread.sleep(2222);
		 Actionsclass.click(getDriver(),duedate_setbutton);
		 Actionsclass.type(duedate_setbutton, d);
		 Actionsclass.click(getDriver(),duedate_sendbutton);
		 //Actionsclass.click(getDriver(),changeduecanceldbutton);
		 Thread.sleep(2222);
		 Actionsclass.click(getDriver(), changedueupdatedbutton);
		 
		// Actionsclass.click(getDriver(), ticketclosedbutton);
		 //return new Homepage();
	
	}
public Homepage inprogress() throws Throwable {
	Log.info("inprogress function ");
		Actionsclass.click(getDriver(),inprogressbutton);
		 Actionsclass.click(getDriver(),inprogress_sendbutton);
		 getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 Actionsclass.click(getDriver(), inprgressupdatedbutton);
		 //Actionsclass.click(getDriver(), ticketclosedbutton);
		 return new Homepage();
	 }
public Homepage reassign(String des,String input) throws Throwable {
	Log.info("reassign function ");
		Actionsclass.click(getDriver(), reassignbutton);
		 Actionsclass.type(reassign_des,des );
		Actionsclass.click(getDriver(), reassignnamelist);
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try {
			for(WebElement wed:reassignbuttonlist) {
				getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				if(wed.getText().trim().equals(input)) {
					System.out.println("selected option on web element"+" = "+ wed.getText());
					wed.click();
				}
				}
        } catch(StaleElementReferenceException e) {
        	Actionsclass.click(getDriver(), reassignsavebutton);
        }
	     Actionsclass.click(getDriver(), reassignsavebutton);
	     getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	     Actionsclass.click(getDriver(), reassignupdatedbutton);
	    // Actionsclass.click(getDriver(), reassignclosedbutton);
	     Actionsclass.click(getDriver(), ticketclosedbutton);
			return new Homepage();		
		
	}
public void Response(String des,String des1) throws Throwable {
	Log.info("response function ");
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	//WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(5));
	//   WebElement elm = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='addnote']")));
	//elm.click();
	JavascriptExecutor js = (JavascriptExecutor)getDriver();
	 js.executeScript("arguments[0].click();", Responsebutton);
			//Actionsclass.click(getDriver(),Responsebutton);
			
			Actionsclass.type(response_des,des );
			getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Actionsclass.click(getDriver(), responsdebuttonlist);
			
			System.out.println("jjjj");

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
		    
			
        	Actionsclass.click(getDriver(), response_sendbutton);
        	getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         Actionsclass.click(getDriver(),responseupdatedbutton);
		   //  Actionsclass.click(getDriver(), responseclosedbutton);
		    // Actionsclass.click(getDriver(), ticketclosedbutton);
				//return new Homepage();
    		   //  Actionsclass.click(getDriver(), responseclosedbutton);
    		    // Actionsclass.click(getDriver(), ticketclosedbutton);
    				//return new Homepage();
     
	}

	public Homepage reopen(String des) throws Throwable {
		Log.info("reopen function ");
		Thread.sleep(1000);
		getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Actionsclass.click(getDriver(),reopenbutton);
	
		 Actionsclass.type(reopen_des,des );
		 getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 Actionsclass.click(getDriver(),reopensavebutton);
		 return new Homepage();
	}
	@SuppressWarnings("deprecation")
	public Homepage close() throws Throwable {
		Log.info("closed function ");
		getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Actionsclass.click(getDriver(),closebutton);
		Thread.sleep(2000);
		getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actionsclass.click(getDriver(),closedokbutton);
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Actionsclass.click(getDriver(),closedupdatedbutton);
		Actionsclass.click(getDriver(), ticketclosedbutton);
		return new Homepage();
		
		
	}
	
public void download() throws Throwable {
	Log.info("download function ");
	Actionsclass.click(getDriver(), download_button);
	//driver.findElement(By.xpath("//*[@id=\"filedownload\"]")).click();
	File filelocation = new File("C:\\Users\\2662\\Downloads");
	File[] totalfiles = filelocation.listFiles();
	for(File file:totalfiles) {
		
	if	(file.getName().equals("")) {
		System.out.println("file is download");
		
	}
		
	}
	
}
	
	
	
}
