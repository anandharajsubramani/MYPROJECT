package com.pageobjects;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BASEclass;

public class NEXTANDPRIVIOUSPAGEtest extends BASEclass{
	
	@FindBy(xpath="//div[@id='tblDashboard_paginate']//a")
     WebElement nextpage;
	public NEXTANDPRIVIOUSPAGEtest () {
		PageFactory.initElements(getDriver(), this);
	}
	public MYPROFILEtest nextpage() throws FileNotFoundException, InterruptedException {
		 List<String> namelist= new ArrayList<String>();
		
	     List<WebElement> listofnames;
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scroll(0,5000)");
	     Thread.sleep(3333);
	     WebElement ff = getDriver().findElement(By.xpath("//*[@id='tblDashboard_length']/label/select"));
	     Thread.sleep(3333);
	     Select slect = new Select(ff);
	    	slect.selectByIndex(2);
	     int sizeofpagination = getDriver().findElements(By.xpath("//div[@class='dataTables_paginate paging_simple_numbers']//a")).size();
	     System.out.println("dddddddd"+ sizeofpagination);
	     int pageCount = sizeofpagination-2;
	     int itrValue =1;
	     String displaycount = getDriver().findElement(By.xpath("//*[@id='tblDashboard_info']")).getText().split(" ")[5]; 
	     System.out.println("total articles count;" +" "+displaycount);
	     System.out.println(pageCount);
	     	WebElement nexbutton1 = new WebDriverWait(getDriver(), Duration.ofHours(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']//parent::a")));
	     	if(sizeofpagination>0) {
	     		Thread.sleep(3333);
	     		System.out.println("hgjhgj");
	  	  	do {
	  	  		Thread.sleep(5000);
	  		// listofnames= driver.findElements(By.xpath("//table[@id='tblDashboard']//tbody//tr[position()=last()]//td[1]"));
	  		 listofnames= getDriver().findElements(By.xpath("//table[@id='tblDashboard']//tbody//tr[position()=(1)]//td[1]"));
	  		 
	  		 for (WebElement name:listofnames) {
	  			 System.out.println(name.getText());
	  			 namelist.add(name.getText());  
	      } 
	  		if(pageCount>itrValue) {
	  			Thread.sleep(1000);
	  			  itrValue++; 
	  		new WebDriverWait(getDriver(), Duration.ofHours(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']//parent::a"))).click();
	  	  } 
	  	   else {
	  		  break;
	  	 }
	  	}
	     	while(true);
	     }
	      else {
	  	   System.out.println("no pagination in this page");
	     }
	     return new MYPROFILEtest();
		}
	
	
	

}
