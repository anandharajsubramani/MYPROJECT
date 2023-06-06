package com.base;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileReader;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Parameters;



import com.pageobjects.Userpage;
import com.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;



public  class BASEclass {
	 //  public static WebDriver driver;
	public static Properties props1;
	public static Properties properties=null;
	public  static String url="";
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	@BeforeSuite(groups=  {"smoke","sanity","regression"})
	public void launchbrowser1() throws IOException {
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");
		
		File dir = new File("D:\\java");
	     File[] files = dir.listFiles();
	System.out.println(files.length);

	for (File file : files) {
		 if (file.isFile()) {
			 
	          try {
	        	  String key = "file" + (file);
	        	  FileInputStream FileInputStream=new FileInputStream(file);
	        	  String value = readFileToString(file);
	    System.out.println(FileInputStream);
	        	
	             props1 = new Properties();
	    		     
	    		      //FileInputStream FileInputStream=new FileInputStream(line);
	    		     // System.out.println(value);
	    		      props1.load(FileInputStream);
	    		      String url= props1.getProperty("url");
		            	
		            	System.out.println(url);
		            	
		            	
		            	props1.setProperty(key, value); 
		                  // props.setProperty(key, value);
	        	/*  String key = "file" + (file+1) ;
	           FileInputStream FileInputStream=new FileInputStream(files[file]);
	                 
	           String value = readFileToString(files[file]);
	              System.out.println(value);
	                props.load(FileInputStream);
	                url= props.getProperty("url");
	            	String uname = props.getProperty("username");
	            	String pword = props.getProperty("password");
	                   props.setProperty(key, value);*/
	       	      
	               
	          } 	
	          catch (Exception ex) {
	 		     ex.printStackTrace();
	 		}
	   }
	}
		
		
		
		
		
		
		
		
		
		
	}



private static String readFileToString(File file) throws IOException {
    StringBuilder sb = new StringBuilder();
BufferedReader br = new BufferedReader(new FileReader(file));

String line;
   while ((line = br.readLine()) != null) {
sb.append(line);
  sb.append(System.lineSeparator());
  //System.out.println(line);


} 
   br.close();
return sb.toString();
   }
	

public static WebDriver getDriver() {
	// Get Driver from threadLocalmap
	return driver.get();
}




@Parameters("browser")
public static void launchbrowser(String asd  ) throws Throwable{
	
	
	
	
	//String asd1 = props1.getProperty("browser");
	
	if(asd.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		
	}
	getDriver().manage().window().maximize();
	getDriver().manage().deleteAllCookies();
	/* ChromeOptions chromeOptions = new ChromeOptions();
     chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
   driver= new ChromeDriver(chromeOptions);
    	driver.manage().window().maximize(); 
    	driver.get(url);*/

    //Actionsclass.implicitWait(driver, 15);
	//getDriver().manage().timeouts().implicitlyWait(Integer.parseInt(props1.getProperty("implicitWait")),TimeUnit.SECONDS);
 		 //  Actionsclass.pageLoadTimeOut(driver, 30);
   // getDriver().manage().timeouts().pageLoadTimeout(Integer.parseInt(props1.getProperty("pageLoadTimeOut")),TimeUnit.SECONDS);
 		  url= props1.getProperty("url");
 		 
 		 getDriver().get(url);
 		 //driver.get(url);
      	String uname = props1.getProperty("username");
      	String pword = props1.getProperty("password");
  		  Userpage ss = new Userpage();
           ss.user(uname,pword);

}


@AfterSuite
public void aftersuite() {
	ExtentManager.endReport();
}







}
		  
	