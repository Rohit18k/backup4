package com.fitsyn.qa.testcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class RepresentativeOptInProcessSpanishRailTwo extends TestBase1{
	Random r=new Random();

	public RepresentativeOptInProcessSpanishRailTwo() {
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
		public void fillForm() throws Exception {
			Thread.sleep(3000);
			driver.navigate().to("https://demo.fitsyn.com/dashboard");
			driver.manage().window().maximize();
			Thread.sleep(3000);

	        WebElement l=driver.findElement(By.partialLinkText("Initiate Applicati"));
	        l.click();
	        
	              JavascriptExecutor js = (JavascriptExecutor) driver;
	 	   js.executeScript("window.scrollBy(0,1200)");
	 	   Thread.sleep(5000);
	 	   Actions action=new Actions(driver);
	 	   action.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
	 	   
	 
	 		String text100=driver.findElement(By.cssSelector("label[for='first_name']")).getText();
	 		System.out.println(text100);
	 		String exp100="This field is required.";
	 		Assert.assertEquals(text100,exp100);
	 		
	 	   try {
	 			  driver.findElement(By.cssSelector("input[placeholder='Enter first name'][name='first_name']")).click();
	 		     driver.findElement(By.cssSelector("input[placeholder='Enter first name'][name='first_name']")).sendKeys("Emily	");
	 			 }catch(Exception e) {
	 				 e.printStackTrace();
	 			 }
	 	   String text1=driver.findElement(By.cssSelector("label[for='last_name']")).getText();
	 		System.out.println(text1);
	 		String exp1="This field is required.";
	 		Assert.assertEquals(text1,exp1);
	 	   
	 	   try {
	 		   driver.findElement(By.cssSelector("input[placeholder='Enter last name'][name='last_name']")).click();
	 		   driver.findElement(By.cssSelector("input[placeholder='Enter last name'][name='last_name']")).sendKeys("Fallon");
	 			 }catch(Exception e) {
	 				 e.printStackTrace();
	 			 }
	 	   String text2=driver.findElement(By.cssSelector("label[for='dob']")).getText();
	 		System.out.println(text2);
	 		String exp2="Please enter birth date";
	 		Assert.assertEquals(text2,exp2);
	 	   try {
	 			  driver.findElement(By.cssSelector("#dob")).click();
	 			  driver.findElement(By.cssSelector("#dob")).sendKeys("12/09/2004");
	 			  String text21=driver.findElement(By.cssSelector("label[for='dob']")).getText();
	 				System.out.println(text21);
	 				String exp21="You must be at least 18 years old.";
	 				Assert.assertEquals(text21,exp21);
	 				 driver.findElement(By.cssSelector("#dob")).clear();
	 			  driver.findElement(By.cssSelector("#dob")).sendKeys("12/21/1998");
	 			 }catch(Exception e) {
	 				 e.printStackTrace();
	 			 }
	 	   String text3=driver.findElement(By.cssSelector("label[for='social_security_number']")).getText();
	 		System.out.println(text3);
	 		String exp3="This field is required.";
	 		Assert.assertEquals(text3,exp3);
	 	   try {
	 			  driver.findElement(By.cssSelector("#social_security_number")).click();
	 			  driver.findElement(By.cssSelector("#social_security_number")).sendKeys("678-98-9898");
	 			 }catch(Exception e) {
	 				 e.printStackTrace();
	 			 }
	 		 Thread.sleep(1000);
	 			String text4=driver.findElement(By.cssSelector("label[for='monthly_income']")).getText();
	 			System.out.println(text4);
	 			String exp4="This field is required.";
	 			Assert.assertEquals(text4,exp4);
	 			driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).sendKeys("assssddddf");
	 			
	 			String text41=driver.findElement(By.cssSelector("label[for='monthly_income']")).getText();
	 			System.out.println(text41);
	 			String exp41="Please enter only digits.";
	 			Assert.assertEquals(text41,exp41);
	 			driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).clear();
	 		driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).sendKeys("1200000");
	 		
	 		JavascriptExecutor js4 = (JavascriptExecutor) driver;	
	 		   js4.executeScript("window.scrollBy(0,20)");
	 		   
	 		   String text5=driver.findElement(By.cssSelector("label[for='income_source']")).getText();
	 			System.out.println(text5);
	 			String exp5="Select Job Type";
	 			Assert.assertEquals(text5,exp5);
	 			
	 		try {
	 		Select slt=new Select(driver.findElement(By.cssSelector("select[title='Select Job Type']")));
	 		slt.selectByIndex(2);}catch(Exception e) {
	 			 e.printStackTrace();
	 		 }
	 		String text6=driver.findElement(By.cssSelector("label[for='pay_frequency']")).getText();
	 		System.out.println(text6);
	 		String exp6="Choose Pay Frequency";
	 		Assert.assertEquals(text6,exp6);
	 		
	 		try {
	 		Select slt1=new Select(driver.findElement(By.cssSelector("select[title='Choose Pay Frequency']")));
	 		slt1.selectByIndex(2);	
	 		}catch(Exception e) {
	 			 e.printStackTrace();
	 		 }
	 
	 		String text7=driver.findElement(By.cssSelector("label[for='employer_name']")).getText();
	 		System.out.println(text7);
	 		String exp7="This field is required.";
	 		Assert.assertEquals(text7,exp7);
	 		try {
	 		driver.findElement(By.cssSelector("input[placeholder='Your Employer Name']")).sendKeys("software service");}
	 		catch(Exception e) {
	 			 e.printStackTrace();
	 		 }
	 		 
	 		String text8=driver.findElement(By.cssSelector("label[for='months_at_employer']")).getText();
	 		System.out.println(text8);
	 		String exp8="This field is required.";
	 		Assert.assertEquals(text8,exp8);
	 		
	 		try {
	 		driver.findElement(By.cssSelector("input[placeholder='Number of Months']")).sendKeys("FDSGFH");
	 		String text81=driver.findElement(By.cssSelector("label[for='months_at_employer']")).getText();
	 		System.out.println(text81);
	 		String exp81="Please enter only digits.";
	 		Assert.assertEquals(text81,exp81);
	 		driver.findElement(By.cssSelector("input[placeholder='Number of Months']")).clear();
	 		driver.findElement(By.cssSelector("input[placeholder='Number of Months']")).sendKeys("12");}
	 		catch(Exception e) {
	 			 e.printStackTrace();
	 		 }
	 		JavascriptExecutor js2 = (JavascriptExecutor) driver;
	 		   js2.executeScript("window.scrollBy(0,50)");
	 		   
	 		   String text10=driver.findElement(By.xpath("//label[@for='mobile_phone']")).getText();
	 			System.out.println(text10);
	 			String exp10="This field is required.";
	 			Assert.assertEquals(text10,exp10);
	 			
	 			driver.findElement(By.cssSelector("input[placeholder='5555551234']")).sendKeys("aasdsddd");
	 			
	 			   String text101=driver.findElement(By.xpath("//label[@for='mobile_phone']")).getText();
	 				System.out.println(text101);
	 				String exp101="Please enter only digits.";
	 				Assert.assertEquals(text101,exp101);
	 				driver.findElement(By.cssSelector("input[placeholder='5555551234']")).clear();
	 		driver.findElement(By.cssSelector("input[placeholder='5555551234']")).sendKeys("8569854589");
	 		
	 		 Thread.sleep(2000);
	 		String text11=driver.findElement(By.xpath("//label[normalize-space()='Please enter Email']")).getText();
	 		System.out.println(text11);
	 		String exp11="Please enter Email";
	 		Assert.assertEquals(text11,exp11);
	 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div/input")).sendKeys("testfitsyn@gmail.com@gmail.com@gmail.com");
	 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div/input")).clear();
	 		
	 		try {
	 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div/input")).sendKeys("mock+265@evenfinancial.com");}
	 		catch(Exception e) {
	 			 e.printStackTrace();
	 		 }
	 		Thread.sleep(2000);
	 		JavascriptExecutor js5 = (JavascriptExecutor) driver;
	 		   js5.executeScript("window.scrollBy(0,50)");
	 		   
	 		   String text12=driver.findElement(By.xpath("//label[@for='address1']")).getText();
	 			System.out.println(text12);
	 			String exp12="This field is required.";
	 			Assert.assertEquals(text12,exp12);
	 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[3]/div/input")).sendKeys("Washington Dc");
	 		
	 		String text13=driver.findElement(By.xpath("//label[@for='city']")).getText();
	 		System.out.println(text13);
	 		String exp13="This field is required.";
	 		Assert.assertEquals(text13,exp13);
	 		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Florida");
	 		
	 
	 		String text14=driver.findElement(By.xpath("//label[normalize-space()='Select State']")).getText();
	 		System.out.println(text14);
	 		String exp14="Select State";
	 		Assert.assertEquals(text14,exp14);
	 		Select slt2=new Select(driver.findElement(By.xpath("//select[@name='state']")));
	 		slt2.selectByIndex(2);
	 		Thread.sleep(2000);
	 		
	 		String text15=driver.findElement(By.xpath("//label[@for='zipcode']")).getText();
	 		System.out.println(text15);
	 		String exp15="This field is required.";
	 		Assert.assertEquals(text15,exp15);
	 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[6]/div/input")).sendKeys("12345");
	 		String text16=driver.findElement(By.xpath("//label[normalize-space()='Choose Loan Purpose']")).getText();
	 		System.out.println(text16);
	 		String exp16="Choose Loan Purpose";
	 		Assert.assertEquals(text16,exp16);
	 		Select slt3=new Select(driver.findElement(By.xpath("//select[@title='Choose Loan Purpose']")));
	 		slt3.selectByIndex(2);
	 		String text17=driver.findElement(By.xpath("//label[@for='loan_amount']")).getText();
	 		System.out.println(text17);
	 		String exp17="This field is required.";
	 		Assert.assertEquals(text17,exp17);
	 		driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("!@!@@##");
	 		String text171=driver.findElement(By.xpath("//label[@for='loan_amount']")).getText();
	 		System.out.println(text171);
	 		String exp171="Please enter only digits.";
	 		Assert.assertEquals(text171,exp171);
	 		driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).clear();
	 		driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("1000000");
			String text1711=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[4]/div[2]/div/label[2]")).getText();
			System.out.println(text1711);
			String exp1711="Please enter amount less than or eaqual to 100000";
			Assert.assertEquals(text1711,exp1711);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("100000");		 		
	 		JavascriptExecutor js3 = (JavascriptExecutor) driver;
	 		   js3.executeScript("window.scrollBy(0,50)");
	 		   
	 			driver.findElement(By.xpath("//input[@id='co_app']")).click();
	 			driver.findElement(By.xpath("//input[@name='co_app_first_name']")).sendKeys("jennifer");
	 			driver.findElement(By.xpath("//input[@name='co_app_last_name']")).sendKeys("lopez");
	 			Thread.sleep(2000);
	 			driver.findElement(By.xpath("//input[@id='co_app_dob']")).sendKeys("12/21/1998");
	 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[5]/div[6]/div/input")).sendKeys("678-98-9898");
	 			driver.findElement(By.xpath("//input[@placeholder='Type address here..']")).sendKeys("Washington Dc");
	 			driver.findElement(By.xpath("//input[@name='co_app_city']")).sendKeys("Florida");
	 			Select slt4=new Select(driver.findElement(By.xpath("//select[@name='co_app_state']")));
	 			slt4.selectByIndex(2);
	 			driver.findElement(By.xpath("//input[@name='co_app_zipcode']")).sendKeys("12345");
	 			driver.findElement(By.xpath("//input[@name='co_app_annual_income']")).sendKeys("400000");
	 			String text172=driver.findElement(By.xpath("//label[@for='months_at_address']")).getText();
	 			System.out.println(text172);
	 			String exp172="This field is required.";
	 			Assert.assertEquals(text172,exp172);
	 			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).sendKeys("&%$$$%%");
	 			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).clear();
	 			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).sendKeys("12");
	 			driver.findElement(By.xpath("//input[@placeholder='Rent Per Month']")).sendKeys("3000");
	 			Thread.sleep(2000);
	 			
	 			Select slt5=new Select(driver.findElement(By.xpath("//select[@title='Choose Estimated Credit Score']")));
	 			slt5.selectByValue("4");
	 			Select slt6=new Select(driver.findElement(By.xpath("//select[@title='Choose Applicant Housing Status']")));
	 			slt6.selectByValue("1");
	 			Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[5]/div/select")));
				slt7.selectByValue("cash_back");
					
					JavascriptExecutor js81= (JavascriptExecutor) driver;
					   js81.executeScript("window.scrollBy(0,100)");
					driver.findElement(By.xpath("//*[@id=\"send_sms\"]")).click();
					Thread.sleep(5000);
					JavascriptExecutor js83 = (JavascriptExecutor) driver;
					   js83.executeScript("window.scrollBy(0,50)");

					driver.findElement(By.xpath("//*[@id=\"spanish_applications\"]")).click();
					try {
					Thread.sleep(5000);
					JavascriptExecutor js811= (JavascriptExecutor) driver;
					   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			driver.findElement(By.cssSelector("#submit-btn")).click();}
					catch(Exception e) {
						e.printStackTrace();
					}
	
					   try {
						   Thread.sleep(9000);
						   String actualsentmsg=driver.findElement(By.xpath("//span[contains(text(),'Application created successfully and message sent')]")).getText();
						   String exptsentmsg="Application created successfully and message sent";
						   Assert.assertEquals(actualsentmsg, exptsentmsg);}
						   catch(Exception e) {
							   e.printStackTrace();
						   }
					
				 Thread.sleep(12000);
				   
				 Actions action5=new Actions(driver);
				action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"sms_history\"]/div/div/div[3]/button"))).click().build().perform();
				
				   
					 String url=driver.findElement(By.xpath("//*[@id=\"short_url\"]")).getText();
					 System.out.println(url);
					 String newurl="https://"+ url;
					 driver.switchTo().newWindow(WindowType.TAB);
					 driver.get(newurl);
					 
					 Thread.sleep(15000);
						 JavascriptExecutor js82 = (JavascriptExecutor) driver;
						   js82.executeScript("window.scrollBy(0,3000)");
					
						 
							   WebElement element = driver.findElement(By.xpath("//*[@id=\"monevo_confirm_form\"]/div/div[1]/div/div/div/div/div/div[30]/div[2]/input"));
							WebElement el4=   driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/form/div/div[2]/button"));
							Thread.sleep(5000);
			Actions builder=new Actions(driver);
			builder.moveToElement(element).click().build().perform();
			Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"monevo_confirm_form\"]/div/div[1]/div/div/div/div/div/div[30]/div[4]/input")).click();
		
			Actions builder1=new Actions(driver);
			builder1.moveToElement(el4).click().build().perform(); 
			Thread.sleep(15000);
			Thread.sleep(7000);
			  driver.navigate().to("https://demo.fitsyn.com/reports/application_report");
		        driver.manage().window().maximize();
		        Thread.sleep(7000);
		        
		        JavascriptExecutor js41= (JavascriptExecutor) driver;
		 	   js41.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 	   
		 	   WebElement scrollArea1 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
		 	   
		 	   Actions actn1=new Actions (driver);
		 	           actn1.moveToElement(scrollArea1).click().build().perform();
		 	        
		 	
		 	// Scroll to div's most right:
		 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea1);
		 	
		 	Thread.sleep(5000);
		 	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");
		 	
				   
			Thread.sleep(5000); 
				   
				   
				   
				   
			 Actions actn2=new Actions (driver);
	           actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[10]/a"))).click().build().perform();
		        Thread.sleep(5000);
			//note:offers shown 
		      	
		        JavascriptExecutor js211= (JavascriptExecutor) driver;
		 	   js211.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
			//note:need to check
			
			
		}  
	
	
	
	
	
	
	
	
	
	
	
	
}
