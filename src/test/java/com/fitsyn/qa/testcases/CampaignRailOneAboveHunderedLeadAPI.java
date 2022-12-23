package com.fitsyn.qa.testcases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class CampaignRailOneAboveHunderedLeadAPI extends TestBase1{


	public CampaignRailOneAboveHunderedLeadAPI() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	//before this do setting for railone in setting page otherwise give credit score error{

	
	
	
	
	
	
	
	
//	
//	@Test(priority=1)
//	public  void createApp() throws Exception {
//		
//			Thread.sleep(7000);
//			driver.navigate().to("https://demo.fitsyn.com/vendors");
////			driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/a")).click();
////			Thread.sleep(9000);
////			driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/ul/li[1]//a[@href='/vendors']")).click();	
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("admin@site.com");
//		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//button[@value='submit']")).click();
//
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div//button[@class='btn btn-default btn-sm dropdown-toggle']")).click();
//		Thread.sleep(7000);
//		
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/div/a[@href='/vendors/settings/5db2cadd07492e00180353d3']")).click();
//
//		Thread.sleep(3000);
//		
//		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
//		select.selectByVisibleText("Rail One");
//		driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();}
	
    @Test(priority=2)
    public void validData() {
    	RestAssured.baseURI="https://demo.fitsyn.com/api/lead/60fff09a845729002a638541";
    	RequestSpecification httprequest=RestAssured.given();
    	JSONObject requestparams= new JSONObject();
    	requestparams.put(  "first_name","Test");
    	requestparams.put( "last_name","leadss");
    	requestparams.put( "birth_date","04/30/1908");
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
    public void submitform() throws Exception {
    	Thread.sleep(3000);
    	driver.navigate().to("https://demo.fitsyn.com/leads#");
    	driver.manage().window().maximize();}
}