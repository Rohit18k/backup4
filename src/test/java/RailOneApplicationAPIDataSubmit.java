

import java.util.Random;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class RailOneApplicationAPIDataSubmit extends TestBase1{

	Random r=new Random();
	
	public RailOneApplicationAPIDataSubmit() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
//
//	
	
	
	 @Test(priority=2)
	    public void createApplicationRailOnePOSTAPI() throws Exception {
			RestAssured.baseURI="https://test.wazecapital.com/api/lead";
	    	RequestSpecification httprequest=RestAssured.given();
	    	JSONObject requestparams= new JSONObject();
	    	requestparams.put( "vendor_id","60be31dc457c420008444b80");
	    	requestparams.put( "agent_email", "rakesh@fitsyn.com");
	    	requestparams.put(  "first_name","Abigail");
	    	requestparams.put( "last_name","Delaney");
	    	requestparams.put( "birth_date","12/21/1998");
	    	requestparams.put( "ssn_number", "678-98-9898");
	    	requestparams.put( "annual_gross_income", "45000");
	    	requestparams.put(  "mobile", "8569854589");
	    	requestparams.put(  "email","test67@gmail.com");
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
	    	requestparams.put(  "app_phn", "9731248534");
	    	
	    	
	    	httprequest.header("Content-Type","application/json");
	    	httprequest.body(requestparams.toJSONString());
	    	
	    	Response response=httprequest.request(Method.POST);
	   String responsebody=response.getBody().asString();
	   System.out.println(responsebody);
	   
	   String responsebody1= response.jsonPath().get("message");
	   Assert.assertEquals(responsebody1,"Application created successful. Please confirm application by redirect to confirmation_url.");
	    }
	
	
	 @Test(priority=3)
	    public void clickSubmitButtonApplicationListPage() throws Exception {
	    	Thread.sleep(3000);
	    	driver.navigate().to("https://test.wazecapital.com/applications");
	    	driver.manage().window().maximize();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/a[1]")).click(); 
	    	Thread.sleep(2000);
			   
	    	JavascriptExecutor js811= (JavascriptExecutor) driver;
			   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(3000);
	driver.findElement(By.cssSelector("#submit-btn")).click();}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
