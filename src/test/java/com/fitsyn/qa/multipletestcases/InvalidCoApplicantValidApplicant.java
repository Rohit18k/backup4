package com.fitsyn.qa.multipletestcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class InvalidCoApplicantValidApplicant extends TestBase1{

	Random r=new Random();
	
	public InvalidCoApplicantValidApplicant() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	 @Test(priority=1)
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
	 	   
	 	  Thread.sleep(1000);
	 		String text100=driver.findElement(By.cssSelector("label[for='first_name']")).getText();
	 		System.out.println(text100);
	 		String exp100="This field is required.";
	 		Assert.assertEquals(text100,exp100);
	 		 Thread.sleep(1000);
	 	   try {
	 			  driver.findElement(By.cssSelector("input[placeholder='Enter first name'][name='first_name']")).click();
	 		     driver.findElement(By.cssSelector("input[placeholder='Enter first name'][name='first_name']")).sendKeys("Condi");
	 			 }catch(Exception e) {
	 				 e.printStackTrace();
	 			 }
	 	  Thread.sleep(1000);
	 	   String text1=driver.findElement(By.cssSelector("label[for='last_name']")).getText();
	 		System.out.println(text1);
	 		String exp1="This field is required.";
	 		Assert.assertEquals(text1,exp1);
	 		 Thread.sleep(1000);
	 	   try {
	 		   driver.findElement(By.cssSelector("input[placeholder='Enter last name'][name='last_name']")).click();
	 		   driver.findElement(By.cssSelector("input[placeholder='Enter last name'][name='last_name']")).sendKeys("Testcase");
	 			 }catch(Exception e) {
	 				 e.printStackTrace();
	 			 }
	 	  Thread.sleep(1000);
	 	   String text2=driver.findElement(By.cssSelector("label[for='dob']")).getText();
	 		System.out.println(text2);
	 		String exp2="Please enter birth date";
	 		Assert.assertEquals(text2,exp2);
	 		 Thread.sleep(1000);
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
	 	  Thread.sleep(1000);
	 	   String text3=driver.findElement(By.cssSelector("label[for='social_security_number']")).getText();
	 		System.out.println(text3);
	 		String exp3="This field is required.";
	 		Assert.assertEquals(text3,exp3);
	 		 Thread.sleep(1000);
	 	   try {
	 			  driver.findElement(By.cssSelector("#social_security_number")).click();
	 			  driver.findElement(By.cssSelector("#social_security_number")).sendKeys("000-00-0017");
	 			 }catch(Exception e) {
	 				 e.printStackTrace();
	 			 }
	 		 Thread.sleep(1000);
	 			String text4=driver.findElement(By.cssSelector("label[for='monthly_income']")).getText();
	 			System.out.println(text4);
	 			String exp4="This field is required.";
	 			Assert.assertEquals(text4,exp4);
	 			driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).sendKeys("!@#$%");
	 			 Thread.sleep(1000);
	 			String text41=driver.findElement(By.cssSelector("label[for='monthly_income']")).getText();
	 			System.out.println(text41);
	 			String exp41="Please enter only digits.";
	 			Assert.assertEquals(text41,exp41);
	 			driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).clear();
	 		driver.findElement(By.cssSelector("input[placeholder='Annual Income'][name='monthly_income']")).sendKeys("1200000");
	 		
	 		JavascriptExecutor js4 = (JavascriptExecutor) driver;	
	 		   js4.executeScript("window.scrollBy(0,20)");
	 		  Thread.sleep(1000);
	 		   String text5=driver.findElement(By.cssSelector("label[for='income_source']")).getText();
	 			System.out.println(text5);
	 			String exp5="Select Job Type";
	 			Assert.assertEquals(text5,exp5);
	 			 Thread.sleep(1000);
	 		try {
	 		Select slt=new Select(driver.findElement(By.cssSelector("select[title='Select Job Type']")));
	 		slt.selectByIndex(2);}catch(Exception e) {
	 			 e.printStackTrace();
	 		 }
	 		String text6=driver.findElement(By.cssSelector("label[for='pay_frequency']")).getText();
	 		System.out.println(text6);
	 		String exp6="Choose Pay Frequency";
	 		Assert.assertEquals(text6,exp6);
	 		 Thread.sleep(1000);
	 		try {
	 		Select slt1=new Select(driver.findElement(By.cssSelector("select[title='Choose Pay Frequency']")));
	 		slt1.selectByIndex(2);	
	 		}catch(Exception e) {
	 			 e.printStackTrace();
	 		 }
	 		 Thread.sleep(1000);
	 		String text7=driver.findElement(By.cssSelector("label[for='employer_name']")).getText();
	 		System.out.println(text7);
	 		String exp7="This field is required.";
	 		Assert.assertEquals(text7,exp7);
	 		 Thread.sleep(1000);
	 		try {
	 		driver.findElement(By.cssSelector("input[placeholder='Your Employer Name']")).sendKeys("software service");}
	 		catch(Exception e) {
	 			 e.printStackTrace();
	 		 }
	 		 Thread.sleep(1000);
	 		String text8=driver.findElement(By.cssSelector("label[for='months_at_employer']")).getText();
	 		System.out.println(text8);
	 		String exp8="This field is required.";
	 		Assert.assertEquals(text8,exp8);
	 		 Thread.sleep(1000);
	 		try {
	 		driver.findElement(By.cssSelector("input[placeholder='Number of Months']")).sendKeys("!@#$%");
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
	 		  Thread.sleep(1000);
	 		   String text10=driver.findElement(By.xpath("//label[@for='mobile_phone']")).getText();
	 			System.out.println(text10);
	 			String exp10="This field is required.";
	 			Assert.assertEquals(text10,exp10);
	 			
	 			driver.findElement(By.cssSelector("input[placeholder='5555551234']")).sendKeys("!@#$%");
	 			 Thread.sleep(1000);
	 			   String text101=driver.findElement(By.xpath("//label[@for='mobile_phone']")).getText();
	 				System.out.println(text101);
	 				String exp101="Please enter only digits.";
	 				Assert.assertEquals(text101,exp101);
	 				driver.findElement(By.cssSelector("input[placeholder='5555551234']")).clear();
	 		driver.findElement(By.cssSelector("input[placeholder='5555551234']")).sendKeys("8569854589");
	 		
	 		 Thread.sleep(1000);
	 		String text11=driver.findElement(By.xpath("//label[normalize-space()='Please enter Email']")).getText();
	 		System.out.println(text11);
	 		String exp11="Please enter Email";
	 		Assert.assertEquals(text11,exp11);
	 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div//input[@placeholder='Enter Email']")).sendKeys("testfitsyn@gmail.com@gmail.com@gmail.com");
	 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div//input[@placeholder='Enter Email']")).clear();
	 		
	 		try {
	 	driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div//input[@placeholder='Enter Email']")).sendKeys("mock+265@evenfinancial.com");}
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
	 		driver.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys("784 Beach Blvd");
	 		 Thread.sleep(1000);
	 		String text13=driver.findElement(By.xpath("//label[@for='city']")).getText();
	 		System.out.println(text13);
	 		String exp13="This field is required.";
	 		Assert.assertEquals(text13,exp13);
	 		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Anthill");
	 		
	 		 Thread.sleep(1000);
	 		String text14=driver.findElement(By.xpath("//label[normalize-space()='Select State']")).getText();
	 		System.out.println(text14);
	 		String exp14="Select State";
	 		Assert.assertEquals(text14,exp14);
	 		Select slt2=new Select(driver.findElement(By.xpath("//select[@name='state']")));
	 		slt2.selectByValue("MO");
	 		 Thread.sleep(1000);
	 		
	 		String text15=driver.findElement(By.xpath("//label[@for='zipcode']")).getText();
	 		System.out.println(text15);
	 		String exp15="This field is required.";
	 		Assert.assertEquals(text15,exp15);
	 		 Thread.sleep(2000);
	 		
	 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[6]/div/input")).sendKeys("65488");
	 		 Thread.sleep(1000);
	 		String text16=driver.findElement(By.xpath("//label[normalize-space()='Choose Loan Purpose']")).getText();
	 		System.out.println(text16);
	 		String exp16="Choose Loan Purpose";
	 		Assert.assertEquals(text16,exp16);
	 		 Thread.sleep(1000);
	 		Select slt3=new Select(driver.findElement(By.xpath("//select[@title='Choose Loan Purpose']")));
	 		slt3.selectByIndex(2);
	 		 Thread.sleep(1000);
	 		String text17=driver.findElement(By.xpath("//label[@for='loan_amount']")).getText();
	 		System.out.println(text17);
	 		String exp17="This field is required.";
	 		Assert.assertEquals(text17,exp17);
	 		 Thread.sleep(1000);
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
	 			 Thread.sleep(1000);
	 			driver.findElement(By.xpath("//input[@name='co_app_first_name']")).sendKeys("cindrella");
	 			 Thread.sleep(1000);
	 			driver.findElement(By.xpath("//input[@name='co_app_last_name']")).sendKeys("Test");
	 			 Thread.sleep(1000);
	 			driver.findElement(By.xpath("//input[@id='co_app_dob']")).sendKeys("12/21/1998");
	 			 Thread.sleep(1000);
	 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[5]/div[6]/div/input")).sendKeys("000-00-0002");
	 			
	 			 Thread.sleep(1000);
	 			driver.findElement(By.xpath("//input[@placeholder='Type address here..']")).sendKeys("71 ST. NICHOLAS DRIV");
	 			 Thread.sleep(2000);
	 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[5]/div[8]/div/input")).sendKeys("NORTH POLE");
	 			 Thread.sleep(1000);
	 			Select slt4=new Select(driver.findElement(By.xpath("//select[@name='co_app_state']")));
	 			slt4.selectByValue("AK");
	 			 Thread.sleep(1000);
	 			driver.findElement(By.xpath("//input[@name='co_app_zipcode']")).sendKeys("99705");
	 			 Thread.sleep(1000);
	 			driver.findElement(By.xpath("//input[@name='co_app_annual_income']")).sendKeys("400000");
	 			 Thread.sleep(1000);
	 			String text172=driver.findElement(By.xpath("//label[@for='months_at_address']")).getText();
	 			System.out.println(text172);
	 			String exp172="This field is required.";
	 			Assert.assertEquals(text172,exp172);
	 			 Thread.sleep(1000);
	 			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).sendKeys("!@#$%");
	 			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).clear();
	 			driver.findElement(By.xpath("//input[@placeholder='Number of months']")).sendKeys("12");
	 			driver.findElement(By.xpath("//input[@placeholder='Rent Per Month']")).sendKeys("15000");
	 			 Thread.sleep(1000);
	 			
	 			Select slt5=new Select(driver.findElement(By.xpath("//select[@title='Choose Estimated Credit Score']")));
	 			slt5.selectByValue("4");
	 			Select slt6=new Select(driver.findElement(By.xpath("//select[@title='Choose Applicant Housing Status']")));
	 			slt6.selectByValue("1");
//	 			Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[5]/div/select")));
//				slt7.selectByValue("cash_back");
	 			driver.findElement(By.xpath("//span[@class='slidert round']")).click();//removed from ui
	 			 			
					try {
					Thread.sleep(5000);
					JavascriptExecutor js811= (JavascriptExecutor) driver;
					   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			driver.findElement(By.cssSelector("#submit-btn")).click();}
					catch(Exception e) {
						e.printStackTrace();
					}
	

					 Thread.sleep(60000);
					 driver.navigate().refresh();
					 Thread.sleep(2000);
					 
	        Actions actn4=new Actions(driver);
	        actn4.moveToElement( driver.findElement(By.xpath("//*[@id=\"creditReport\"]/div"))).click().build().perform();
	        Thread.sleep(5000);
	        Actions actn5=new Actions(driver);
	        actn5.moveToElement( driver.findElement(By.xpath("//*[@id=\"creditCardContainer\"]/div/div/div[1]/div/div/label[2]/span"))).click().build().perform();
	        Thread.sleep(2000);
	        JavascriptExecutor js82 = (JavascriptExecutor) driver;
			   js82.executeScript("window.scrollBy(0,100)");
		}

}
