package com.pageobjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;


public class Ticketseditpage  extends BASEclass{
	@FindBy(xpath="//table[@id='tblDashboard']//tbody//tr[position()=(1)]//td[position()=(9)]//i")
     WebElement pencilbuttonclick;
	
	@FindBy(xpath="//div[@class='row']//button[@id='assign1']")
    WebElement assignbutton;

	@FindBy(xpath="//div[@class='row']//button[@id='Resolved']")
   WebElement Resolvedbutton;
	
	@FindBy(xpath="//div[@class='row']//button[@id='need']")
	    WebElement needmorebutton;
	
	@FindBy(xpath="//div[@class='row']//button[@id='split']")
   WebElement splitbutton;
	
	@FindBy(xpath="//div[@class='row']//button[@id='Revert']")
    WebElement revertbutton;
	
	@FindBy(xpath="//div[@class='row']//button[@id='change']")
    WebElement duedatechangebutton;
	
	@FindBy(xpath="//div[@class='row']//button[@id='inprogress']")
	 WebElement inprogressbutton;
	
	@FindBy(xpath="//div[@class='row']//button[@id='reassign']")
	  WebElement reassignbutton;
	
	@FindBy(xpath="//div[@class='row']//button[@id='addnote']")
	 WebElement  Responsebutton;
	
	@FindBy(xpath="//div[@class='row']//button[@id='reopen']")
	WebElement reopenbutton;
	
	@FindBy(xpath="//div[@class='row']//button[@id='close']")
	    WebElement closebutton;
	
	@FindBy(xpath="//table[@id='tblDashboard']//tbody//tr[position()=(1)]//td[position()=(9)]//i")
    WebElement pencilbuttonclick1;
	
	
	@FindBy(xpath="//select[@class='form-control col-sm-8 assign']")
    WebElement assignbuttonlist;
	
	
	@FindBy(id="iddesc")
	 WebElement resolveddes;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[3]/form[3]/div/div/div/div[2]/div[2]/button[2]")
    WebElement Resolvedsendbutton;
	
	
	@FindBy(id="needmoreinfo")
	 WebElement needmoreinfo_des;
	
	@FindBy(id="needminfo")
	 WebElement needmoreinfo_sendbutton;
	

	@FindBy(id="txtsplittitle")
	 WebElement split_title;
	
	@FindBy(xpath="//*[@id='Tool']")
    WebElement split_tool;
	
	@FindBy(id="txtsplitdesc")
	 WebElement split_des;
	@FindBy(xpath="/html/body/div[1]/div[3]/div[3]/form[7]/div/div/div/div[2]/div[3]/div/div/input[1]")
    WebElement split_choosefile;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[3]/form[7]/div/div/div/div[2]/div[4]/input")
    WebElement split_sendbutton;
	
	@FindBy(id="RevertInfo")
	 WebElement revert_des;
	
	@FindBy(xpath="//*[@id=\\\"Revertpop\\\"]/div/div/div[2]/div[2]/button[2]")
	 WebElement revert_sendbutton;
	
	

	
	@FindBy(xpath="	//*[@id=\\\"text\\\"]")
	 WebElement changeduedate_des;
	
	@FindBy(xpath="//*[@id=\\\\'date\\\\']")
	 WebElement duedate_setbutton;
	@FindBy(xpath="/html/body/div[1]/div[3]/div[3]/form[4]/div/div/div/div[2]/div[3]/button[2]")
	 WebElement duedate_sendbutton;
	
	

	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/button[2]")
	 WebElement inprogress_sendbutton;
	
	
	@FindBy(xpath="//*[@id='Text']")
	 WebElement reassign_des;
	
	 
	@FindBy(xpath="//*[@id='Reassign']")
	 WebElement reassign_sendbutton;
	
	@FindBy(xpath="//*[@id=\\\"body\\\"]")
	 WebElement response_des;
	
	 
	@FindBy(xpath="//*[@id='Reassign']")
	 WebElement response_sendbutton;
	

	
	
	
	@FindBy(xpath="	//*[@id=\\\"ttt\\\"]")
	 WebElement reopen_des;
	
	 
	@FindBy(xpath="/html/body/div[1]/div[3]/div[3]/form[2]/div/div/div/div[2]/div[3]/input")
	 WebElement reopen_sendbutton;
	
	

	
	@FindBy(xpath="//*[@id=\\\"filedownload\\\"]")
	 WebElement download_button;
	

	
public  Ticketseditpage() {
	PageFactory.initElements(getDriver(), this);
}



public void editthetickets() throws Throwable{
	Actionsclass.click(getDriver(), pencilbuttonclick);
	
}

	public void assign(int d) throws Throwable {
		
		System.out.println("bvxbvjbv");
		//Actions actions= new Actions(USERlogin.driver);
		Actionsclass.click(getDriver(), assignbutton);
		Actionsclass.selectByIndex( assignbuttonlist, d);
			//actions.moveToElement(Pencilbutton.assignbutton);
			//System.out.println("bvxbvjbv");
			//actions.click().build().perform();
			//System.out.println("bvxbvjbv");
		//driver.findElement(By.xpath("//span[@id='select2-lstAssign-container'])"));
			//driver.findElement(By.xpath("//*[@id='lstAssign'] ")).click();
           
			
			
		
			
			// WebElement list = driver.findElement(By.xpath("//select[@class='form-control col-sm-8 assign']"));
			//System.out.println("jhgjhbhbmmnmn");
		//Select selectrole = new Select(assignbuttonlist);
		//Thread.sleep(3000);
		
		 //selectrole.deselectByVisibleText("Tamil");
		// selectrole.selectByVisibleText("Albert");
		// selectrole.selectByIndex(1);
		//driver.findElement(By.id("assign")).click();
		//below line is cancel button
		//driver.findElement(By.xpath("//*[@id='Assign-issue']/div/div/div[2]/div[2]/button"));
		//below line is X button
		//driver.findElement(By.xpath("//*[@id='Assign-issue']/div/div/div[1]/button/span"));

	}
	
	public void Resolved(String des) throws Throwable {
		//Actionsclass.moveToElement(driver, Resolvedbutton);
		Actionsclass.click(getDriver(), Resolvedbutton);
		 Actionsclass.type(resolveddes, des);
		 Actionsclass.click(getDriver(),Resolvedsendbutton);
		//Actions actions= new Actions(USERlogin.driver);
		 //Thread.sleep(2000);
			//actions.moveToElement(Pencilbutton.Resolvedbutton);
			//actions.click().build().perform();
			//below line is description
		 //  driver.findElement(By.id("iddesc")).sendKeys("its not cleared statement");
		   
		  
		
		   
		   //below line is send button option
		   // driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/form[3]/div/div/div/div[2]/div[2]/button[2]")).click();
		  //below line is cancel button
		   // driver.findElement(By.xpath("//*[@id='resolve']/div/div/div[2]/div[2]/button[1]")).click();
		  //below line is X button
		//  driver.findElement(By.xpath("//*[@id='resolve']/div/div/div[1]/button/span")).click();	  
	}
	
	
	public void need(String des) throws Throwable {
		Actionsclass.click(getDriver(), needmorebutton);
		 Actionsclass.type(needmoreinfo_des,des );
		 Actionsclass.click(getDriver(),needmoreinfo_sendbutton);
			//below line is description
		  // driver.findElement(By.id("needmoreinfo")).sendKeys("I  NEED cleared statement");
		   
		   
		   
		   
		 //below line is send button option
		   // driver.findElement(By.id("needminfo")).click();
		  //below line is cancel button
		  //  driver.findElement(By.xpath("//*[@id='Needinfo']/div/div/div[2]/div[2]/button[1]")).click();
		  //below line is X button
		  //driver.findElement(By.xpath("//*[@id='Needinfo']/div/div/div[1]/button/span")).click();
		
	}
	public void split(String des,int d,String des1) throws Throwable {
		Actionsclass.click(getDriver(),splitbutton);
		 Actionsclass.type(split_title,des );
		 Actionsclass.selectByIndex( split_tool, d);
		 Actionsclass.type(split_des,des1 );
		 Actionsclass.click(getDriver(),split_choosefile);
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
			robot.keyRelease(KeyEvent.VK_ENTER);
			 Actionsclass.click(getDriver(),split_sendbutton);
		//below line is title 
			
		 //  driver.findElement(By.id("txtsplittitle")).sendKeys("its more statement so splited");
		 //below line is dept tool
		   Select selectrole = new Select(getDriver().findElement(By.xpath("//*[@id='Tool'] ")));
			selectrole.selectByIndex(2);
			//below line is description
			//driver.findElement(By.id("txtsplitdesc")).sendKeys("its more statement so splited");
			///below line is choose file button option
			System.out.println("mmmmmmm");
			Thread.sleep(8000);
			//actions.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/form[7]/div/div/div/div[2]/div[3]/div/div/input[1]")));
			//actions.click().build().perform();
			  // WebElement ss = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/form[7]/div/div/div/div[2]/div[3]/div/div/input[1]"));
			   // ss.click();
			    
				// Thread.sleep(5000);
			//  System.out.println("nnnnnn");
			
			//below line is rest file button option
			//driver.findElement(By.xpath("//*[@id=\"Split-ticket\"]/div/div/div[2]/div[3]/div/div/input[2]")).click();
			
			//below line is split ticket button option
			//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/form[7]/div/div/div/div[2]/div[4]/input")).click();
			
			
		  //below line is cancel button
		  // driver.findElement(By.xpath("//*[@id=\"Split-ticket\"]/div/div/div[2]/div[4]/button")).click();
		  //below line is X button
		//  driver.findElement(By.xpath("//*[@id='Split-ticket']/div/div/div[1]/button/span")).click();
	}
	public void Revert(String des) throws Throwable {
		Actionsclass.click(getDriver(),revertbutton);
		 Actionsclass.type(revert_des,des );
		 Actionsclass.click(getDriver(),revert_sendbutton);
			//below line is description
			//driver.findElement(By.id("RevertInfo")).sendKeys("this is not my dept");
			
			//below line is  revert send button option
			//driver.findElement(By.xpath("//*[@id=\"Revertpop\"]/div/div/div[2]/div[2]/button[2]")).click();
			
			
		  //below line is cancel button
		  // driver.findElement(By.xpath("//*[@id=\"Revertpop\"]/div/div/div[2]/div[2]/button[1]")).click();
		  //below line is X button
		 // driver.findElement(By.xpath("//*[@id=\"Revertpop\"]/div/div/div[1]/button/span")).click();	
	}
	public void change(String des,int d) throws Throwable {
		Actionsclass.click(getDriver(),duedatechangebutton);
		 Actionsclass.type(changeduedate_des,des );
		 Actionsclass.selectByIndex(duedate_setbutton, d);
		 Actionsclass.click(getDriver(),duedate_sendbutton);
			
		 
		 
		 
		 //below line is description
			//driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("its more statement so splited");
			//below line is time entery
			//Select selectrole = new Select(driver.findElement(By.xpath("//*[@id=\\'date\\']")));
		//	selectrole.selectByIndex(2);
			//below line is save  button option
			//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/form[4]/div/div/div/div[2]/div[3]/button[2]")).click();
			
			
		  //below line is cancel button
		   //driver.findElement(By.xpath("//*[@id=\"Changeduedate\"]/div/div/div[2]/div[3]/button[1]")).click();
		  //below line is X button
		//  driver.findElement(By.xpath("//*[@id=\"Changeduedate\"]/div/div/div[1]/button/span")).click();
		
		
		
	}
	public void inprogress() throws Throwable {
		
		Actionsclass.click(getDriver(),inprogressbutton);
		 Actionsclass.click(getDriver(),inprogress_sendbutton);
		
		
		
		
		
		
		
		
		
		
		//PageFactory.initElements(driver,Pencilbutton.class);
		//Actions actions= new Actions(USERlogin.driver);
		// Thread.sleep(2000);
			///actions.moveToElement(Pencilbutton.inprogressbutton);
			//actions.click().build().perform();
		 //below line is time entery
		   //Select selectrole = new Select(driver.findElement(By.xpath("//*[@id=\\'date\\']")));
			//selectrole.selectByIndex(2);
			///below line is description
			//driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("its more statement so splited");
			
			//below line is save  button option
			//driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/button[2]")).click();
			
			
		  //below line is cancel button
		   //driver.findElement(By.xpath("//*[@id=\"Changeduedate\"]/div/div/div[2]/div[3]/button[1]")).click();
		  //below line is X button
		 // driver.findElement(By.xpath("//*[@id=\"Changeduedate\"]/div/div/div[1]/button/span")).click();
		
		
		
		
	}
	public void reassign(String des,int d) throws Throwable {
	
		Actionsclass.click(getDriver(),reassignbutton);
		Actionsclass.selectByIndex( assignbuttonlist, d);
		 Actionsclass.type(reassign_des,des );
		
			Actionsclass.click(getDriver(), reassign_sendbutton);
		//PageFactory.initElements(driver,Pencilbutton.class);
		//Actions actions= new Actions(USERlogin.driver);
		 //Thread.sleep(2000);
			//actions.moveToElement(Pencilbutton.reassignbutton);
			//actions.click().build().perform();
		 //below line is time entery
		  // driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/form[9]/div/div/div/div[2]/div[1]/div/div/span/span[1]/span")).sendKeys("12.00");
		
			/*driver.findElement(By.xpath("//*[@id=\"select2-lstReassign-container\"]")).click();
			Thread.sleep(2222);
			kkk = driver.findElements(By.xpath("//*[@id='select2-lstReassign-results']//li"));
 
			 for(WebElement wed:kkk) {
				 Thread.sleep(3333);
				if(wed.getText().trim().equals("Parveen")) {
					System.out.println("selected option on web element"+" = "+ wed.getText());
					wed.click();
				}
				}
			 
			 
			//Select selectrole = new Select(driver.findElement(By.xpath("//*[@id=\"select2-lstReassign-results\"]//li")));
			//selectrole.selectByIndex(2);
			 Thread.sleep(3222);
			//below line is description
			driver.findElement(By.xpath("//*[@id='Text'] ")).sendKeys("its more statement so splited");
			
			//below line is reassign  button option
			driver.findElement(By.xpath("//*[@id='Reassign'] ")).click();*/
			
			
		  //below line is cancel button
		 //  driver.findElement(By.xpath("//*[@id=\"reassign-issue\"]/div/div/div[2]/div[3]/button[1]")).click();
		  //below line is X button
		 // driver.findElement(By.xpath("//*[@id=\"reassign-issue\"]/div/div/div[1]/button/span")).click();
		
		
		
		
	}
	public void  Response(String des) throws Throwable {
		/*PageFactory.initElements(driver,Pencilbutton.class);
		Actions actions= new Actions(USERlogin.driver);
		 Thread.sleep(2000);
			actions.moveToElement(Pencilbutton.Responsebutton);
			actions.click().build().perform();*/
		
			Actionsclass.click(getDriver(),Responsebutton);
			 Actionsclass.type(response_des,des );
			 Actionsclass.click(getDriver(),response_sendbutton);
			
		//below line is description
		//driver.findElement(By.xpath("//*[@id=\"body\"]")).sendKeys("its more statement so splited");
		
		//below line is add note   button option
		//driver.findElement(By.xpath("//*[@id='send']")).click();
		
		
	  //below line is cancel button
	   //driver.findElement(By.xpath("//*[@id=\"add-notes\"]/div/div/div[2]/div[3]/button[1]")).click();
	  //below line is X button
	  //driver.findElement(By.xpath("//*[@id=\"add-notes\"]/div/div/div[1]/button/span")).click();
		
		
		
	}
	public void reopen(String des) throws Throwable {
		Actionsclass.click(getDriver(),reopenbutton);
		 Actionsclass.type(reopen_des,des );
		 Actionsclass.click(getDriver(),reopen_sendbutton);
		 
		 
		/*PageFactory.initElements(driver,Pencilbutton.class);
		Actions actions= new Actions(USERlogin.driver);
		 Thread.sleep(2000);
			actions.moveToElement(Pencilbutton.reopenbutton);
			actions.click().build().perform();*/
		
			//below line is description
			//driver.findElement(By.xpath("//*[@id=\"ttt\"]")).sendKeys("its more statement so splited");
			//below line is choose file button option
			//driver.findElement(By.xpath("//*[@id='Reopen']/div/div/div[2]/div[2]/div/div/input ")).click();
			//below line is rest file button option
			//driver.findElement(By.xpath("//*[@id=\"Split-ticket\"]/div/div/div[2]/div[3]/div/div/input[2]")).click();
			
			//below line is reopen ticket button option
			//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/form[2]/div/div/div/div[2]/div[3]/input")).click();
			
			
		  //below line is cancel button
		//   driver.findElement(By.xpath("//*[@id=\"Reopen\"]/div/div/div[2]/div[3]/button[1]")).click();
		  //below line is X button
		 // driver.findElement(By.xpath("//*[@id=\"Reopen\"]/div/div/div[1]/button/span")).click();	
	}
	public void close() throws Throwable {
		Actionsclass.click(getDriver(),closebutton);
		
		/*Actions actions= new Actions(USERlogin.driver);
		 Thread.sleep(2000);
			actions.moveToElement(Pencilbutton.closebutton);
			actions.click().build().perform();*/
		
	}
	
public void download() throws Throwable {
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
