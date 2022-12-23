package com.fitsyn.qa.multipletestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class Applistpage extends TestBase1{


	public Applistpage() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}

	 @Test(priority=1)
     public void handleDropdownoptions() throws Exception {
	        driver.manage().window().maximize();
	        Thread.sleep(7000);
	        driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[7]/a")).click();
	        Thread.sleep(5000);	        
	     	JavascriptExecutor js8 = (JavascriptExecutor) driver;
			   js8.executeScript("window.scrollBy(0,120)");
			   Thread.sleep(5000);	        
	        	driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[7]/ul/li[1]/a")).click();
	        	 Thread.sleep(5000);

	
	
	
	
	 }
	
	
}
