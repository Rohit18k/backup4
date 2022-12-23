package com.fitsyn.qa.testcases;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RepresentativeRailOnePOSTAPIBelowAge extends TestBase1{


	public RepresentativeRailOnePOSTAPIBelowAge() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
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
	    	requestparams.put(  "first_name","Elizabeth	");
	    	requestparams.put( "last_name","Fallon");
	    	requestparams.put( "birth_date","03/24/2004");
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
	   Assert.assertEquals(responsebody1,"Applicant must be 18 years old. (Use MM/DD/YYYY Format)");
}
	 @Test(priority=2)
	    public void navigateAppListPage() throws Exception {
	    	Thread.sleep(3000);
	    	driver.navigate().to("https://demo.fitsyn.com/reports/application_report");
	    	driver.manage().window().maximize();}
}
