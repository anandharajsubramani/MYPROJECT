package com.pageobjects;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;
public class EMPLOYEEcreated extends BASEclass  {
	 FileInputStream inputStream ;
	  XSSFSheet sheet;
	XSSFWorkbook workbook;
	List<String> column1Values;
	List<String> column2Values ;
	List<String> column3Values ;
	List<String> column4Values ;
	List<String> column5Values ;
	Row row;
	Cell cell1;
	Cell cell2;
	Cell cell3;
	Cell cell4;
	Cell cell5;
    	@FindBy(xpath=" //*[@id=\"tblEmployee_wrapper\"]/div[2]/button[3]/span/button")
        WebElement employeeADDpage; 
	    @FindBy(xpath="//*[@id=\"tblEmployee\"]/tbody/tr[1]/td[6]/div/span[2]/i")
	    WebElement employeeeditbutton ;
	    @FindBy(xpath="//*[@id=\"tblEmployee\"]/tbody/tr[1]/td[6]/div/span[1]/i")
	    WebElement employeedeletebutton ;
	    @FindBy(xpath="//*[@id=\"txtname\"]")
	    WebElement entername;
		@FindBy(xpath="//*[@id=\"txtemail\"]")
	    WebElement enteremail;
		@FindBy(xpath="//*[@id=\"select2-lstRole-container\"]")
	    WebElement enterrole;
		@FindBy(xpath="//*[@id=\"select2-lstRole-results\"]/li")
	    List<WebElement> enterroledropdown;
		@FindBy(xpath="//*[@id=\"txtphnno\"]")
	    WebElement enterphonenumber;
		@FindBy(xpath="//*[@id=\"divContent\"]/div/span/span[1]/span")
	    WebElement enterdept;
		@FindBy(xpath="//*[@id=\"select2-lstTool-results\"]/li")
		List<WebElement> selectdept;
		@FindBy(xpath="//*[@id=\"divContent\"]/div/span/span[1]/span/ul/li[1]/span")
	    WebElement deletedept;
		@FindBy(xpath="//*[@id=\"btnUpdate\"]")
        WebElement employeeupdatedbutton;
		@FindBy(xpath="//*[@id=\"myModal_View1\"]/div/div/div[3]/div/button[2]")
	    WebElement cancelbutton;
		 @FindBy(xpath="/html/body/div[2]/div/div[6]/button[1]")
	       WebElement updatedbutton;
		@FindBy(xpath="//*[@id=\"tblEmployee_wrapper\"]/div[2]/button[3]/span/button")
	     WebElement newbutton;
		 public   EMPLOYEEcreated() {
			PageFactory.initElements(getDriver(), this);
		}
	@SuppressWarnings("unlikely-arg-type")
	public Logoutpage employeecreated() throws Throwable {
		Log.info("creating a new employee ");
	File vc = new  File("D:\\asasd.xlsx");
 inputStream = new FileInputStream(vc);
     workbook = new XSSFWorkbook(inputStream);
  sheet = workbook.getSheetAt(0);
     List<String> column1Values = new ArrayList<>();
     List<String> column2Values = new ArrayList<>();
     List<String> column3Values = new ArrayList<>();
     List<String> column4Values = new ArrayList<>();
     List<String> column5Values = new ArrayList<>();
	 int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
	//int rowcount = sheet.getPhysicalNumberOfRows();
 System.out.println(rowCount);
		for(int i=0;i<rowCount;i++) {
		 row = sheet.getRow(i);
			   cell1 = row.getCell(0);
	           cell2 = row.getCell(1);
	           cell3 = row.getCell(2);
	           cell4 = row.getCell(3);
	           cell5 = row.getCell(4);
	           column1Values.add(cell1.getStringCellValue());
	           column2Values.add(cell2.getStringCellValue());
	           column3Values.add(cell3.getStringCellValue());
	           column4Values.add(cell4.getStringCellValue());
	           column5Values.add(cell5.getStringCellValue());
			} 
			  for(int j=1;j<rowCount;j++)  { 
				  JavascriptExecutor executor = (JavascriptExecutor)getDriver();
					executor.executeScript("arguments[0].click();", employeeADDpage);
				  Thread.sleep(2222);
				  System.out.println(j);
					Actionsclass.type(entername, column1Values.get(j) );
					Thread.sleep(2222);
					Actionsclass.type(enteremail, column2Values.get(j));	
					Thread.sleep(2222);
					Actionsclass.type(enterphonenumber, column3Values.get(j));
					Thread.sleep(2222);
					Actionsclass.click(getDriver(), enterrole);
					 boolean found1 = false;
				        for ( WebElement  s:enterroledropdown ) {
				        	System.out.println(s.getText());
				            if (s.getText().trim().equals(column4Values.get(j))) {
				            	
				                found1 = true;
				                Actionsclass.click(getDriver(), s);
				                Actionsclass.click(getDriver(), s);
				              
				                break;
				            }
				        }

				        if (found1) {
				            System.out.println("The input text is in the collection.");
				        } else {
				            System.out.println("The input text is not in the collection.");
				        }
				        Actionsclass.click(getDriver(), enterdept);
						 boolean found2 = false;
					        for ( WebElement  s: selectdept) {
					        	 String bsdh = column5Values.get(j);
					        	 String[] dd = bsdh.split(",");
					        	for(String ddd:dd) {
					        		if (s.getText().trim().equals(ddd)) {
						            	found2 = true;
						                Actionsclass.click(getDriver(), s);
						               
						                break;    
						          }
					        		
					        	}
					
					        }
	              if (found2) {
					            System.out.println("The input text is in the collection.");
					        } else {
					            System.out.println("The input text is not in the collection.");
					        }
					       Actionsclass.click(getDriver(), employeeupdatedbutton);
					    	Thread.sleep(2222);
					    	Actionsclass.click(getDriver(), updatedbutton); 	
		  }
		return new Logoutpage();	
	}		

}

