package com.fitsyn.qa.multipletestcases;

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

public class JointApplicationPOSTAPIValidDataAndSubmit extends TestBase1{


	public JointApplicationPOSTAPIValidDataAndSubmit() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}

	 @Test(priority=1)
	    public void validData() {
	    	RestAssured.baseURI="https://demo.fitsyn.com/api/lead";
	    	RequestSpecification httprequest=RestAssured.given();
	    	JSONObject requestparams= new JSONObject();
	    	requestparams.put( "vendor_id","5db2cadd07492e00180353d3");
	    	requestparams.put( "agent_email", "linda@apptest.life");
	    	requestparams.put(  "first_name","Condi");
	    	requestparams.put( "last_name","Testcase");
	    	requestparams.put( "birth_date","04/23/2003");
	    	requestparams.put( "ssn_number", "000000017");
	    	requestparams.put( "annual_gross_income", "450000");
	    	requestparams.put(  "mobile", "2345254411");
	    	requestparams.put(  "email","linda@apptest.life");
	    	requestparams.put(  "address","784 Beach Blvd");
	    	requestparams.put( "city", "Anthill");
	    	requestparams.put(   "state", "MO");
	    	requestparams.put(  "zip_code", "65488");
	    	requestparams.put("loan_purpose", "auto");
	    	requestparams.put(  "loan_amount", "42400");
	    	requestparams.put(  "employment_status", "employed");
	    	requestparams.put(  "employment_pay_frequency", "weekly");
	    	requestparams.put( "self_reported_credit_score", "720+");
	    	requestparams.put(  "housing_type", "rent");
	    	requestparams.put( "card_purposes", "balance_transfer");
	    	requestparams.put(  "co_app_first_name","Cary");
	    	requestparams.put(  "co_app_last_name","Testcase");
	    	requestparams.put(  "co_app_dob","10/10/1969");
	    	requestparams.put(  "coAppSSN","000000018");
	    	requestparams.put(  "co_app_address1","784 Beach Blvd");
	    	requestparams.put(  "co_app_city","Anthill");
	    	requestparams.put(  "co_app_state","MO");
	    	requestparams.put(  "co_app_zipcode","65488");
	    	requestparams.put(  "co_app_annual_income","20000");
	    	requestparams.put(  "income_source","employed");
	    	requestparams.put(   "military","0");
	    	requestparams.put(   "employer_name","Software services");
	    	requestparams.put(  "months_at_employer","24");
	    	requestparams.put( "months_at_address","65");
	    	requestparams.put( "monthly_rent","2300");
	    	requestparams.put(  "co_app","1");
	    	requestparams.put(  "co_app_mobile", "2343511122");
	    	requestparams.put(  "co_app_email", "rex_3we14b93d@yopmail.com");
	    	

	    	
	    	httprequest.header("Content-Type","application/json");
	    	httprequest.body(requestparams.toJSONString());
	    	
	    	Response response=httprequest.request(Method.POST);
	   String responsebody=response.getBody().asString();
	   System.out.println(responsebody);
	   
	   String responsebody1= response.jsonPath().get("message");
	   Assert.assertEquals(responsebody1,"Application successfully submitted. Please confirm application by redirect to confirmation_url.");
	    	
	    }
	
	
	 @Test(priority=2)
	    public void submitform() throws Exception {
	    	Thread.sleep(3000);
	    	driver.navigate().to("https://demo.fitsyn.com/applications");
	    	driver.manage().window().maximize();
	    	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/a[1]")).click();
	    	Thread.sleep(3000);
	    	JavascriptExecutor js8 = (JavascriptExecutor) driver;
			   js8.executeScript("window.scrollBy(0,150)");
			   driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[1]/div/input")).sendKeys("800000");
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[2]/div/input")).sendKeys("12");
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[3]/div/input")).sendKeys("200000");
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[4]/div/input")).sendKeys("12000");
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[5]/div/input")).sendKeys("24");
				driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[6]/div/input")).sendKeys("100000");//need to test
				
			   
	    	JavascriptExecutor js811= (JavascriptExecutor) driver;
			   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(1000);
	driver.findElement(By.cssSelector("#submit-btn")).click();
	 Thread.sleep(60000);
	 driver.navigate().refresh();
	 Thread.sleep(7000);
	 
Actions actn4=new Actions(driver);
actn4.moveToElement( driver.findElement(By.xpath("//*[@id=\"creditReport\"]/div"))).click().build().perform();
Thread.sleep(5000);
Actions actn5=new Actions(driver);
actn5.moveToElement( driver.findElement(By.xpath("//*[@id=\"creditCardContainer\"]/div/div/div[1]/div/div/label[2]/span"))).click().build().perform();
Thread.sleep(5000);
JavascriptExecutor js82 = (JavascriptExecutor) driver;
js82.executeScript("window.scrollBy(0,1000)");
Thread.sleep(2000);
((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
 Thread.sleep(1000);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
