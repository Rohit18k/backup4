package com.fitsyn.qa.testcases;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RepresentativeRailOnePOSTAPIValidData extends TestBase1{


	public RepresentativeRailOnePOSTAPIValidData() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
//	
//
//
//	 @Test(priority=1)
//		public  void searchRepresentative() throws Exception {
//			Thread.sleep(2000);
//			  driver.navigate().to("https://demo.fitsyn.com/users");
//			driver.manage().window().maximize();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("t2user@apptest.life");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
//			Thread.sleep(2000);
//			Actions actn=new Actions(driver);
//			actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/a"))).click().build().perform();
//			Thread.sleep(12000);
//			driver.manage().window().maximize();}

	   @Test(priority=2)
	    public void validData() {
	    	RestAssured.baseURI="https://demo.fitsyn.com/api/lead";
	    	RequestSpecification httprequest=RestAssured.given();
	    	JSONObject requestparams= new JSONObject();
	    	requestparams.put( "vendor_id","5db2cadd07492e00180353d3");
	    	requestparams.put( "agent_email", "t2user@apptest.life");
	    	requestparams.put(  "first_name","Abigail");
	    	requestparams.put( "last_name","Delaney");
	    	requestparams.put( "birth_date","12/21/1998");
	    	requestparams.put( "ssn_number", "678-98-9898");
	    	requestparams.put( "annual_gross_income", "45000");
	    	requestparams.put(  "mobile", "8569854589");
	    	requestparams.put(  "email","mock+265@evenfinancial.com");
	    	requestparams.put(  "address","Washington DC");
	    	requestparams.put( "city", "USA");
	    	requestparams.put(   "state", "OK");
	    	requestparams.put(  "zip_code", "12345");
	    	requestparams.put("loan_purpose", "taxes");
	    	requestparams.put(  "loan_amount", "2300");
	    	requestparams.put(  "employment_status", "employed");
	    	requestparams.put(  "employment_pay_frequency", "weekly");
	    	requestparams.put( "self_reported_credit_score", "good");
	    	requestparams.put(  "housing_type", "rent");
	
	    	httprequest.header("Content-Type","application/json");
	    	httprequest.body(requestparams.toJSONString());
	    	
	    	Response response=httprequest.request(Method.POST);
	   String responsebody=response.getBody().asString();
	   System.out.println(responsebody);
	   
	   String responsebody1= response.jsonPath().get("message");
	   Assert.assertEquals(responsebody1,"Application successfully submitted. Please confirm application by redirect to confirmation_url.");
  }
	
	   @Test(priority=3)
	    public void submitform() throws Exception {
		   Thread.sleep(3000);
	    	driver.navigate().to("https://demo.fitsyn.com/reports/application_report");
	        driver.manage().window().maximize();
	        Thread.sleep(7000);
	        
	        JavascriptExecutor js41= (JavascriptExecutor) driver;
	 	   js41.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 	   
	 	   WebElement scrollArea1 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
	 	   
	 	   Actions actn1=new Actions (driver);
	 	           actn1.moveToElement(scrollArea1).click().build().perform();
	 	        
	 	
	 	// Scroll to div's most right:
	 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea1);
	 	
	 	Thread.sleep(5000);
	 	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");
	 	
			   
		Thread.sleep(5000); 			   
		  Actions actn=new Actions (driver);		  
		  actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[10]/a"))).click().build().perform();
	        Thread.sleep(5000);
	    	JavascriptExecutor js8 = (JavascriptExecutor) driver;
			   js8.executeScript("window.scrollBy(0,150)");
			   
			   Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[5]/div/select")));
				slt7.selectByValue("cash_back");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[1]/div/input")).sendKeys("800000");
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[2]/div/input")).sendKeys("12");
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[3]/div/input")).sendKeys("200000");
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[4]/div/input")).sendKeys("12000");
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[5]/div/input")).sendKeys("24");
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[6]/div/input")).sendKeys("100000");
			   
	    	JavascriptExecutor js811= (JavascriptExecutor) driver;
			   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(1000);
	driver.findElement(By.cssSelector("#submit-btn")).click();} //note: looking for an offer after post api, then submit then offer availabe

	   
		 @Test(priority=4)
		 public void switchBackAdmin() throws Exception {
				Thread.sleep(3000);
		    	driver.navigate().to("https://demo.fitsyn.com/reports/application_report");
		    	driver.manage().window().maximize(); 
		    	Thread.sleep(2000);
		    	Actions actn=new Actions(driver);
		    	actn.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/a"))).click().build().perform();
	}
	/*
	   @Test(priority=5)
	    public void reSubmitForm() throws Exception {
		   Thread.sleep(3000);
	    	driver.navigate().to("https://demo.fitsyn.com/reports/application_report");
	    	driver.manage().window().maximize();
	    	  driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[10]/a")).click();
	    	  Thread.sleep(3000);
	    	  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/a")).click();  
	    	  Thread.sleep(3000);
		    	JavascriptExecutor js8 = (JavascriptExecutor) driver;
				   js8.executeScript("window.scrollBy(0,150)");
				   
				   Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[5]/div/select")));
					slt7.selectByValue("cash_back");
					JavascriptExecutor js811= (JavascriptExecutor) driver;
					   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					   Thread.sleep(1000);
			driver.findElement(By.cssSelector("#submit-btn")).click();}
	   //note:offers avaialable
	   
	    */ 
	   }
	   
	   
	   

