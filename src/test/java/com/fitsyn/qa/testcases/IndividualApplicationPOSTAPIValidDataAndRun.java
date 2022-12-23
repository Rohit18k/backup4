package com.fitsyn.qa.testcases;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class IndividualApplicationPOSTAPIValidDataAndRun extends TestBase1{


	public IndividualApplicationPOSTAPIValidDataAndRun() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
//doubt
	 @Test(priority=1)
	    public void validData() {
	    	RestAssured.baseURI="https://demo.fitsyn.com/api/lead";
	    	RequestSpecification httprequest=RestAssured.given();
	    	JSONObject requestparams= new JSONObject();
	    	requestparams.put( "vendor_id","5db2cadd07492e00180353d3");
	    	requestparams.put( "agent_email", "linda@apptest.life");
	    	requestparams.put(  "first_name","Bill");
	    	requestparams.put( "last_name","Testcase");
	    	requestparams.put( "birth_date","04/23/2003");
	    	requestparams.put( "ssn_number", "000000015");
	    	requestparams.put( "annual_gross_income", "450000");
	    	requestparams.put(  "mobile", "2345254411");
	    	requestparams.put(  "email","linda@apptest.life");
	    	requestparams.put(  "address","1600 SUNFLOWER AVE");
	    	requestparams.put( "city", "COSTA MESA");
	    	requestparams.put(   "state", "MO");
	    	requestparams.put(  "zip_code", "92626");
	    	requestparams.put("loan_purpose", "auto");
	    	requestparams.put(  "loan_amount", "42400");
	    	requestparams.put(  "employment_status", "employed");
	    	requestparams.put(  "employment_pay_frequency", "weekly");
	    	requestparams.put( "self_reported_credit_score", "excellent");
	    	requestparams.put(  "housing_type", "rent");
	    	requestparams.put( "card_purposes", "balance_transfer");
	    	
	    	
	    	httprequest.header("Content-Type","application/json");
	    	httprequest.body(requestparams.toJSONString());
	    	
	    	Response response=httprequest.request(Method.POST);
	   String responsebody=response.getBody().asString();
	   System.out.println(responsebody);
	   
	   String responsebody1= response.jsonPath().get("message");
	   Assert.assertEquals(responsebody1,"Application successfully submitted. Please confirm application by redirect to confirmation_url.");
	    	
	    }
	 @Test(priority=2)
	    public void runApp() throws Exception {
	    	Thread.sleep(3000);
	    	driver.navigate().to("https://demo.fitsyn.com/applications");
	    	driver.manage().window().maximize();
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/a[2]")).click();
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
	    	actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[11]/div[7]/div/button"))).click().build().perform();
	    	
	    	 Thread.sleep(60000);
	    	 driver.navigate().refresh();
	    	 Thread.sleep(2000);
	         Actions actn4=new Actions(driver);
	            actn4.moveToElement( driver.findElement(By.xpath("//*[@id=\"creditReport\"]/div"))).click().build().perform();
	            Thread.sleep(9000);
	       	
	            JavascriptExecutor js82 = (JavascriptExecutor) driver;
	    		   js82.executeScript("window.scrollBy(0,150)");
	 
	 
	 }
}
