

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

public class RailSixApplicationAPIDataRun extends TestBase1{


	public RailSixApplicationAPIDataRun() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	/*
	 @Test(priority=1)
		public  void subaccountSettingRailSix() throws Exception {
			
			Thread.sleep(7000);		
		WebElement sidebar=	driver.findElement(By.xpath("/html/body/nav/div[3]/div[2]/div"));
			   Actions action=new Actions(driver);
			   action.moveToElement(sidebar).click().build().perform();
			   Thread.sleep(2000);
				WebElement subaccount=	driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[30]//a"));
			   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", subaccount);
			   Thread.sleep(2000);
			   Actions action1=new Actions(driver);
			   action1.moveToElement(subaccount).click().build().perform();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[30]/ul/li[1]//a")).click();
			   Thread.sleep(2000);
			   driver.manage().window().maximize();
			   Thread.sleep(2000);
				WebElement actionbutton=	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[2]/td[8]/div/button"));	   
			   Actions action2=new Actions(driver);
			   action2.moveToElement(actionbutton).click().build().perform();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[2]/td[8]/div/div/a[2]")).click();
			   Thread.sleep(3000);
			   Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]/div/select")));
			   Thread.sleep(3000);
				select.selectByVisibleText("Rail Six");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();}
	
	*/
	
    @Test(priority=2)
    public void createApplicationRailSixPOSTAPI() throws Exception {
    	RestAssured.baseURI="https://test.wazecapital.com/api/lead";
    	RequestSpecification httprequest=RestAssured.given();
    	JSONObject requestparams= new JSONObject();
    	requestparams.put( "vendor_id","60be31dc457c420008444b80");
    	requestparams.put(  "first_name","RailSix");
    	requestparams.put( "last_name","postingapii");
    	requestparams.put( "birth_date","04/04/1988");
    	requestparams.put( "ssn_number", "787-47-4752");
    	requestparams.put(  "monthly_income", "45000");
    	requestparams.put(   "mobile","9781787977");
    	requestparams.put(     "email","automate_11@gmail.com");
    	requestparams.put(       "address", "4922 LIJJNQAW YWXXNQW WAY APT 30");
    	requestparams.put(    "city", "COTTONWOOD HEIGHTS");
    	requestparams.put(     "state","NJ");
    	requestparams.put(    "zip_code", "84121");
    	requestparams.put(   "loan_amount","20000");
    	requestparams.put(   "monthly_rent", "1000");
    	requestparams.put(   "employment_status", "employed full time");
    	requestparams.put(     "housing_type","rent");
    	requestparams.put(  "annual_gross_income", "600000");
//    	requestparams.put(    "cust_5","7897897897");
//    	requestparams.put(    "Debt Amount","5000");
    	
    	
    	httprequest.header("Content-Type","application/json");
    	httprequest.body(requestparams.toJSONString());
    	
    	Response response=httprequest.request(Method.POST);
   String responsebody=response.getBody().asString();
   System.out.println(responsebody);
   
   String responsebody1= response.jsonPath().get("message");
   Assert.assertEquals(responsebody1,"Application created successful. Please confirm application by redirect to confirmation_url.");
    }
    
    @Test(priority=3)
    public void clickRunButtonApplicationListPage() throws Exception {
    	Thread.sleep(3000);
    	driver.navigate().to("https://test.wazecapital.com/applications");
        driver.manage().window().maximize();
        Thread.sleep(2000); 
        Actions actn3=new Actions(driver);
        actn3.moveToElement(  driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/a[2]"))).click().build().perform();
        Thread.sleep(2000); 
    	Actions actn=new Actions(driver);
    	actn.moveToElement(driver.findElement(By.xpath("/html/body/div[16]/div[7]/div/button"))).click().build().perform();
    	  Thread.sleep(5000); 
    		Actions actn1=new Actions(driver);
        	actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[16]/div[7]/div/button"))).click().build().perform();
        	 Thread.sleep(9000);
     		
    	 	 driver.navigate().refresh();
        
          	
            JavascriptExecutor js2= (JavascriptExecutor) driver;
     	   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//Note: Run is not possible in railsix application posting api
}}
