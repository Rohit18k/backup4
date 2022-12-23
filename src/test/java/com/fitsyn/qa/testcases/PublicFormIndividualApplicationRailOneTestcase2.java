package com.fitsyn.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class PublicFormIndividualApplicationRailOneTestcase2 extends TestBase1{


	public PublicFormIndividualApplicationRailOneTestcase2() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
    @Test(priority=1)
		public void publicForm() throws Exception {
			Thread.sleep(5000);
			driver.navigate().to("https://loanenroll.demoserver.biz/index.html?vendor_id=5db2cadd07492e00180353d3");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,2200)");
			   Thread.sleep(5000);
			   Actions action=new Actions(driver);
			   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();


				String text=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[1]/div/label")).getText();
				System.out.println(text);
				String exp="Please enter First Name";
				Assert.assertEquals(text,exp);
				
			   try {
					  driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[1]/div/input[1]")).click();
				     driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[1]/div/input[1]")).sendKeys("Marisol");
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
			   String text1=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/label")).getText();
				System.out.println(text1);
				String exp1="Please enter Last Name";
				Assert.assertEquals(text1,exp1);
			   
			   try {
				   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/input")).click();
				   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/input")).sendKeys("Testcase");
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
			   String text2=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[3]/div/label")).getText();
				System.out.println(text2);
				String exp2="Please enter Date of Birth";
				Assert.assertEquals(text2,exp2);
			   try {
					  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).click();
					  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/09/2004");
					  String text21=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[3]/div/label")).getText();
						System.out.println(text21);
						String exp21="You must be at least 18 years old!";
						Assert.assertEquals(text21,exp21);
						Thread.sleep(1000);
						 driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).clear();
					  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/21/1998");
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
			   String text3=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[4]/div/label")).getText();
				System.out.println(text3);
				String exp3="Please enter Social Security Number";
				Assert.assertEquals(text3,exp3);
			   try {
					  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).click();

					  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).sendKeys("000-00-0001");
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
				 Thread.sleep(1000);
					String text4=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/label")).getText();
					System.out.println(text4);
					String exp4="Please enter Estimated Annual Income";
					Assert.assertEquals(text4,exp4);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/input")).sendKeys("assssddddf");
					
					String text41=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/label")).getText();
					System.out.println(text41);
					String exp41="Please enter only numbers";
					Assert.assertEquals(text41,exp41);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/input")).sendKeys("45000");
				
				JavascriptExecutor js4 = (JavascriptExecutor) driver;	
				   js4.executeScript("window.scrollBy(0,20)");
				   
				   String text10=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/label")).getText();
					System.out.println(text10);
					String exp10="Please enter Cell Phone Number";
					Assert.assertEquals(text10,exp10);
					
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/input")).sendKeys("aasdsddd");
					
					   String text101=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/label")).getText();
						System.out.println(text101);
						String exp101="Please enter only numbers";
						Assert.assertEquals(text101,exp101);
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/input")).sendKeys("8569854589");
				
				 Thread.sleep(1000);
				String text11=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[9]/div/label")).getText();
				System.out.println(text11);
				String exp11="Please enter Email";
				Assert.assertEquals(text11,exp11);
				Thread.sleep(1000);
				try {
			//	driver.findElement(By.cssSelector("body.slack-chat-page.config--vertical.config--borderLess.menu-left--colorful.menu-left--shadow.theme--light.menu-left--visible:nth-child(2) div.utils__content:nth-child(7) div.cui-layout.cui-layout-has-sider:nth-child(1) div.cui-layout div.cui-layout-content div.cui-utils-content section.card:nth-child(4) div.card-body form:nth-child(2) div.row:nth-child(7) div.col-xl-6.col-md-6.col-sm-12:nth-child(2) div.form-group.state-success > input.form-control")).click();
			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[9]/div/input")).sendKeys("mock+265@evenfinancial.com");}
				catch(Exception e) {
					 e.printStackTrace();
				 }
				   
				JavascriptExecutor js5 = (JavascriptExecutor) driver;
				   js5.executeScript("window.scrollBy(0,50)");
				   
				   String text12=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[10]/div/label")).getText();
					System.out.println(text12);
					String exp12="Please enter Address";
					Assert.assertEquals(text12,exp12);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[10]/div/input")).sendKeys("220 Locust Ave");
				
				String text13=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[11]/div/label")).getText();
				System.out.println(text13);
				String exp13="Please enter City";
				Assert.assertEquals(text13,exp13);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[11]/div/input")).sendKeys("Metairie");
				
				JavascriptExecutor js51 = (JavascriptExecutor) driver;
				   js51.executeScript("window.scrollBy(0,80)");
				   
				String text14=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[12]/div/label")).getText();
				System.out.println(text14);
				String exp14="Please select State";
				Assert.assertEquals(text14,exp14);
		driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[12]/div/div/button/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[12]/div/div/div/ul/li[28]/a")).click();
		
				String text15=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[13]/div/label")).getText();
				System.out.println(text15);
				String exp15="Please enter Zip Code";
				Assert.assertEquals(text15,exp15);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[13]/div/input")).sendKeys("65088");
				JavascriptExecutor js6 = (JavascriptExecutor) driver;
				   js6.executeScript("window.scrollBy(0,90)");
				
				String text16=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[15]/div/label")).getText();
				System.out.println(text16);
				String exp16="Please select Loan Purpose";
				Assert.assertEquals(text16,exp16);
			Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[15]/div/div/button/span[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[15]/div/div/div/ul/li[4]/a/span[1]")).click();
				
				
				String text17=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[16]/div/label")).getText();
				System.out.println(text17);
				String exp17="Please enter Loan Amount";
				Assert.assertEquals(text17,exp17);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[16]/div/input")).sendKeys("!@!@@##");
				String text171=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[16]/div/label")).getText();
				System.out.println(text171);
				String exp171="Please enter only number";
				Assert.assertEquals(text171,exp171);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[16]/div/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[16]/div/input")).sendKeys("2300");
				
				   String text5=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[18]/div/label")).getText();
					System.out.println(text5);
					String exp5="Please select Job Type";
					Assert.assertEquals(text5,exp5);
		
				try {////*[@id="application_form"]/div/div[1]/div/div/div/div/div/div[18]/div/div/button/span[1]
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/form/div/div[1]/div/div/div/div/div/div[18]/div/div/button/span[1]")).click();
				Thread.sleep(3000);
		        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/form/div/div[1]/div/div/div/div/div/div[18]/div/div/div/ul/li[1]/a/span[1]")).click();}
				catch(Exception e) {
					 e.printStackTrace();
				 }
				String text6=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[19]/div/label")).getText();
				System.out.println(text6);
				String exp6="Please select Employment Pay Frequency";
				Assert.assertEquals(text6,exp6);
				
				try {
					Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[19]/div/div/button/span[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[19]/div/div/div/ul/li[3]/a/span[1]")).click();
				}catch(Exception e) {
					 e.printStackTrace();
				 }
				
				JavascriptExecutor js3 = (JavascriptExecutor) driver;
				   js3.executeScript("window.scrollBy(0,50)");
				
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[20]/div/div/button/span[1]")).click();
					Thread.sleep(3000);
				    driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[20]/div/div/div/ul/li[1]/a/span[1]")).click();
				    Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[21]/div/div/button/span[1]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[21]/div/div/div/ul/li[1]/a/span[1]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"credit_card_block\"]/div[2]/div/div/div/button/span[1]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id=\"credit_card_block\"]/div[2]/div/div/div/div/ul/li[3]/a")).click();
					
					
					
					JavascriptExecutor js56 = (JavascriptExecutor) driver;
					   js56.executeScript("window.scrollBy(0,70)");
					   Thread.sleep(5000);
			WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[2]/div/div/input"));
			WebElement submit= driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"));
			
			Actions actn1=new Actions(driver);
			actn1.moveToElement(checkbox).click().build().perform();
			  Thread.sleep(5000);
			  Actions actn2=new Actions(driver);
				actn2.moveToElement(submit).click().build().perform();
				Thread.sleep(9000);
			 	  
			   	 Thread.sleep(7000);
			     driver.navigate().to("https://demo.fitsyn.com/applications");
			     driver.manage().window().maximize();
			     Thread.sleep(7000);
			     driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/button")).click();
			     Thread.sleep(7000);
			     Actions actn3=new Actions(driver);
			     actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/div/a[6]"))).click().build().perform();
			     Thread.sleep(60000);
				 driver.navigate().refresh();
				 Thread.sleep(2000);
			     Actions actn4=new Actions(driver);
			        actn4.moveToElement( driver.findElement(By.xpath("//*[@id=\"creditReport\"]/div"))).click().build().perform();
			        Thread.sleep(9000);
			   	
			        JavascriptExecutor js82 = (JavascriptExecutor) driver;
					   js82.executeScript("window.scrollBy(0,150)");
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
