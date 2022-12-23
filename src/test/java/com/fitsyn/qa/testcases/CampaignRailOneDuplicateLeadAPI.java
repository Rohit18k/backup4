package com.fitsyn.qa.testcases;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class CampaignRailOneDuplicateLeadAPI extends TestBase1{


	public CampaignRailOneDuplicateLeadAPI() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}

	
	@Test(priority=1)
	public void systemSettingPage() throws Exception {		
		Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/settings/");
		  driver.manage().window().maximize();
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  Thread.sleep(5000);
		  Actions actn=new Actions(driver);
		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smtp_form_validation\"]/div[6]/div[38]/div/label[2]/span"))).click().build().perform();
		   Thread.sleep(5000);
		   Actions actn1=new Actions(driver);
		   actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
		
	}
	
    @Test(priority=2)
    public void validData() {
    	RestAssured.baseURI="https://demo.fitsyn.com/api/lead/60fff09a845729002a638541";
    	RequestSpecification httprequest=RestAssured.given();
    	JSONObject requestparams= new JSONObject();
    	requestparams.put(  "first_name","Test");
    	requestparams.put( "last_name","leadss");
    	requestparams.put( "birth_date","12/21/1998");
    	requestparams.put( "ssn_number", "678-98-9898");
    	requestparams.put( "annual_gross_income", "45000");
    	requestparams.put(  "mobile", "4086577161");
    	requestparams.put(  "email","wcg.number@gmail.com");
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
    	
    	
    	httprequest.header("Content-Type","application/json");
    	httprequest.body(requestparams.toJSONString());
    	
    	Response response=httprequest.request(Method.POST);
   String responsebody=response.getBody().asString();
   System.out.println(responsebody);
   
   String responsebody1= response.jsonPath().get("message");
   Assert.assertEquals(responsebody1,"Duplicate lead cannot be created. Select unique phone number value and try again.");
    	
    }
    @Test(priority=3)
    public void submitform() throws Exception {
    	Thread.sleep(3000);
    	driver.navigate().to("https://demo.fitsyn.com/leads#");
    	driver.manage().window().maximize();}
}