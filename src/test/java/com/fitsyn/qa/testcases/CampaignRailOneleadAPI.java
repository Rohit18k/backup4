package com.fitsyn.qa.testcases;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class CampaignRailOneleadAPI  extends TestBase1{


	public CampaignRailOneleadAPI() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	

	
	
	
	
	
	
	
	
	
	@Test(priority=1)
	public  void subAccountRailOne() throws Exception {
		
			Thread.sleep(7000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("admin@site.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//button[@value='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div//button[@class='btn btn-default btn-sm dropdown-toggle']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/div/a[@href='/vendors/settings/5db2cadd07492e00180353d3']")).click();

		Thread.sleep(3000);
		
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
		select.selectByVisibleText("Rail One");
		driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();}
	
    @Test(priority=2)
    public void createCampaignLeadRailOnePOSTAPI() throws Exception {
    	RestAssured.baseURI="https://demo.fitsyn.com/api/lead/61138e3a4d28ab0029fca866";
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
   Assert.assertEquals(responsebody1,"Lead Inserted successfully");
    	
    }
    @Test(priority=3)
    public void navigateLeadPage() throws Exception {
    	Thread.sleep(3000);
    	driver.navigate().to("https://demo.fitsyn.com/leads#");
    	driver.manage().window().maximize();}
}

