

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RailTwoApplicationAPIDataRun extends TestBase1{


	public RailTwoApplicationAPIDataRun() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
//	
	
	 @Test(priority=1)
	    public void createApplicationRailTwoPOSTAPI() throws Exception {
		 RestAssured.baseURI="https://test.wazecapital.com/api/lead";
	    	RequestSpecification httprequest=RestAssured.given();
	    	JSONObject requestparams= new JSONObject();
	    	requestparams.put( "vendor_id","60be31dc457c420008444b80");
	    	requestparams.put( "agent_email", "rakesh@fitsyn.com");
	    	requestparams.put(  "first_name","Angel");
	    	requestparams.put( "last_name","Broking");
	    	requestparams.put( "birth_date","12/21/1998");
	    	requestparams.put( "ssn_number", "568-56-7854");
	    	requestparams.put( "annual_gross_income", "90000");
	    	requestparams.put(  "mobile", "8569854589");
	    	requestparams.put(  "email","test@gmail.com");
	    	requestparams.put(  "address","Washington DCCC");
	    	requestparams.put( "city", "USA");
	    	requestparams.put(   "state", "AL");
	    	requestparams.put(  "zip_code", "56987");
	    	requestparams.put("loan_purpose", "taxes");
	    	requestparams.put(  "loan_amount", "60000");
	    	requestparams.put(  "employment_status", "employed");
	    	requestparams.put(  "employment_pay_frequency", "weekly");
	    	requestparams.put( "self_reported_credit_score", "720+");
	    	requestparams.put(  "housing_type", "rent");
	    	requestparams.put( "card_purposes", "balance_transfer");
	    	requestparams.put(  "custom_debt_balance","12");
	    	requestparams.put(  "custom_interest_rate","11");
	    	requestparams.put(  "custom_term","1");
	    	requestparams.put(    "custom_savings","12");
	    	requestparams.put(  "custom_cost","12");
	    	requestparams.put(  "custom_monthly_payment","12");
	    	requestparams.put( "custom_lender_id","Test Offer");
	    	requestparams.put(  "custom_offer_url","http://www.google.com");
	    	requestparams.put(  "co_app_first_name","two");
	    	requestparams.put(  "co_app_last_name","railtwo");
	    	requestparams.put(  "co_app_dob","12/21/1998");
	    	requestparams.put(  "coAppSSN","458-56-5823");
	    	requestparams.put(  "co_app_address1","Dc ");
	    	requestparams.put(  "co_app_city","usa");
	    	requestparams.put(  "co_app_state","AL");
	    	requestparams.put(  "co_app_zipcode","45862");
	    	requestparams.put(  "co_app_annual_income","80000");
	    	requestparams.put(  "income_source","employed");
	    	requestparams.put(   "military","0");
	    	requestparams.put(   "employer_name","WebTech");
	    	requestparams.put(  "months_at_employer","240");
	    	requestparams.put( "months_at_address","650");
	    	requestparams.put( "monthly_rent","2300");
	    	requestparams.put(  "co_app","1");
	    	requestparams.put(  "cardCustomLenderId", "Test Lender Id 4");
	    	requestparams.put(  "customAnnualFee", "1");
	    	requestparams.put(  "customPurchaseApr", "2");
	    	requestparams.put(  "customPurchaseIntroApr", "3");
	    	requestparams.put( "customCashAdvanceApr", "4");
	    	requestparams.put(  "customPurchaseIntroAprTerm", "5");
	    	requestparams.put(  "customCardOfferUrl", "http://www.google.com");
	    	requestparams.put(  "co_phn", "9532645725");
	    	requestparams.put(  "app_phn", "9532457812");
	    	
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
	    	driver.navigate().to("https://test.wazecapital.com/applications");
	    	driver.manage().window().maximize();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/a[2]")).click();
	    	Thread.sleep(2000);
	    	
	    	Actions actn3=new Actions(driver);
	    	actn3.moveToElement(driver.findElement(By.xpath("/html/body/div[17]/h2"))).click().build().perform();
	    	
	    	 String actual1= driver.findElement(By.xpath("/html/body/div[17]/h2")).getText();
	    	   Assert.assertEquals(actual1,"Are you sure?");
	    	
	    	
	    	Actions actn=new Actions(driver);
	    	actn.moveToElement(driver.findElement(By.xpath("/html/body/div[17]/div[7]/div/button"))).click().build().perform();
	    	Thread.sleep(9000);
	    	
	    	Actions actn2=new Actions(driver);
	    	actn2.moveToElement(driver.findElement(By.xpath("/html/body/div[17]/h2"))).click().build().perform();
	    	
//	   String actual= driver.findElement(By.xpath("/html/body/div[17]/h2")).getText();
//	   Assert.assertEquals(actual,"Succeed!");
	    	
	    	Actions actn1=new Actions(driver);
	    	actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[17]/div[7]/div/button"))).click().build().perform(); }
	   
	 //note: in cae of run..application not approved
	 
	 
}
