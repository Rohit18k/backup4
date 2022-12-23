package com.fitsyn.qa.testcases;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class CampaignRailTwoBelowEighteenLeadAPI extends TestBase1{


	public CampaignRailTwoBelowEighteenLeadAPI() {
	super();
	}
//	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	//before this do setting for railone in setting page otherwise give credit score error
//	@Test(priority=1)
//	public void systemSettingPage() throws Exception {
//		
//		Thread.sleep(5000);
//		driver.navigate().to("https://demo.fitsyn.com/settings/");
//		  driver.manage().window().maximize();
//		  JavascriptExecutor js= (JavascriptExecutor) driver;
//		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		  Thread.sleep(5000);
//		  Actions actn=new Actions(driver);
//		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smtp_form_validation\"]/div[6]/div[38]/div/label[2]/span"))).click().build().perform();
//		   Thread.sleep(5000);
//		   Actions actn1=new Actions(driver);
//		   actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
//		
//	}
	
    @Test(priority=2)
    public void validData() {
    	RestAssured.baseURI="https://demo.fitsyn.com/api/lead/60fff09a845729002a638541";
    	RequestSpecification httprequest=RestAssured.given();
    	JSONObject requestparams= new JSONObject();
    	requestparams.put(  "first_name","Test");
    	requestparams.put( "last_name","leadss");
    	requestparams.put( "birth_date","03/24/2004");
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
    	requestparams.put( "self_reported_credit_score", "720+");
    	requestparams.put(  "housing_type", "rent");
    	requestparams.put( "card_purposes", "balance_transfer");
    	requestparams.put(  "co_app_first_name","Riya");
    	requestparams.put(  "co_app_last_name","Simson");
    	requestparams.put(  "co_app_dob","12/21/1998");
    	requestparams.put(  "co_app_address1","Washington DC");
    	requestparams.put(  "co_app_city","USA");
    	requestparams.put(  "co_app_state","OK");
    	requestparams.put(  "co_app_zipcode","12345");
    	requestparams.put(  "co_app_annual_income","45000");
    	requestparams.put(  "income_source","employed");
    	requestparams.put(   "military","0");
    	requestparams.put(   "employer_name","Software services");
    	requestparams.put(  "months_at_employer","24");
    	requestparams.put( "months_at_address","65");
    	requestparams.put( "monthly_rent","2300");
    	requestparams.put(  "co_app","1");
    	
    	httprequest.header("Content-Type","application/json");
    	httprequest.body(requestparams.toJSONString());
    	
    	Response response=httprequest.request(Method.POST);
   String responsebody=response.getBody().asString();
   System.out.println(responsebody);
   
   String responsebody1= response.jsonPath().get("message");
   Assert.assertEquals(responsebody1,"Lead Inserted successfully");
    	
    }
    @Test(priority=3)
    public void submitform() throws Exception {
    	Thread.sleep(3000);
    	driver.navigate().to("https://demo.fitsyn.com/leads#");
    	driver.manage().window().maximize();}
}



