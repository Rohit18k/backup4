package com.fitsyn.qa.testcases;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RailOneApplicationAPIDataRun extends TestBase1{


	public RailOneApplicationAPIDataRun() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	  @Test(priority=1)
	    public void createApplicationRailOnePOSTAPI() throws Exception {
	    	RestAssured.baseURI="https://demo.fitsyn.com/api/lead";
	    	RequestSpecification httprequest=RestAssured.given();
	    	JSONObject requestparams= new JSONObject();
	    	requestparams.put( "vendor_id","5db2cadd07492e00180353d3");
	    	requestparams.put( "agent_email", "riya@test.com");
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
	    	requestparams.put( "card_purposes", "balance_transfer");
	    	requestparams.put(  "custom_debt_balance","12");
	    	requestparams.put(  "custom_interest_rate","11");
	    	requestparams.put(  "custom_term","1");
	    	requestparams.put(    "custom_savings","12");
	    	requestparams.put(  "custom_cost","12");
	    	requestparams.put(  "custom_monthly_payment","12");
	    	requestparams.put( "custom_lender_id","Test Offer");
	    	requestparams.put(  "cardCustomLenderId", "Test Lender Id 4");
	    	requestparams.put(  "customAnnualFee", "1");
	    	requestparams.put(  "customPurchaseApr", "2");
	    	requestparams.put(  "customPurchaseIntroApr", "3");
	    	requestparams.put( "customCashAdvanceApr", "4");
	    	requestparams.put(  "customPurchaseIntroAprTerm", "5");
	    	requestparams.put(  "customCardOfferUrl", "http://www.google.com");
	    	
	    	
	    	httprequest.header("Content-Type","application/json");
	    	httprequest.body(requestparams.toJSONString());
	    	
	    	Response response=httprequest.request(Method.POST);
	   String responsebody=response.getBody().asString();
	   System.out.println(responsebody);
	   
	   String responsebody1= response.jsonPath().get("message");
	   Assert.assertEquals(responsebody1,"Application created successful. Please confirm application by redirect to confirmation_url.");
	    }
	  
	
	  @Test(priority=2)
	    public void clickRunButtonApplicationListPage() throws Exception {
	    	Thread.sleep(3000);
	    	driver.navigate().to("https://demo.fitsyn.com/applications");
	    	driver.manage().window().maximize();
	    	Thread.sleep(5000);
	    	
	    	try  
	        {  
	    		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/a[2]")).click();
	        }  
	             
	        catch(Exception e)  
	        {  
	            System.out.println(e);  
	        }  
	    	
	    	
	    	
	    	Thread.sleep(2000);
	    
	    	Actions actn3=new Actions(driver);
	    	actn3.moveToElement(driver.findElement(By.xpath("/html/body/div[11]/h2"))).click().build().perform();
	    	
	    	 String actual1= driver.findElement(By.xpath("/html/body/div[11]/h2")).getText();
	    	   Assert.assertEquals(actual1,"Are you sure?");
	    	
	    	
	    	Actions actn=new Actions(driver);
	    	actn.moveToElement(driver.findElement(By.xpath("/html/body/div[11]/div[7]/div/button"))).click().build().perform();
	    	Thread.sleep(9000);
	    	
	    	Actions actn2=new Actions(driver);
	    	actn2.moveToElement(driver.findElement(By.xpath("/html/body/div[11]/h2"))).click().build().perform();
	    	
	   String actual= driver.findElement(By.xpath("/html/body/div[11]/h2")).getText();
	   Assert.assertEquals(actual,"Succeed!");
	    	
	    	Actions actn1=new Actions(driver);
	    	actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[11]/div[7]/div/button"))).click().build().perform(); }
	    	
	    
}
