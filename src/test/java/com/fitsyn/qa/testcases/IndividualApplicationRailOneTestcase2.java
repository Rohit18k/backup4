package com.fitsyn.qa.testcases;

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

public class IndividualApplicationRailOneTestcase2 extends TestBase1{

	Random r=new Random();
	
	public IndividualApplicationRailOneTestcase2() {
	super();
	}
	//need to test it
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}

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
				   

					String text=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/label[2]")).getText();
					System.out.println(text);
					String exp="Please enter First Name";
					Assert.assertEquals(text,exp);
					
				   try {
						  driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).click();
					     driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).sendKeys("Marisol");
						 }catch(Exception e) {
							 e.printStackTrace();
						 }
				   String text1=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/label[2]")).getText();
					System.out.println(text1);
					String exp1="Please enter Last Name";
					Assert.assertEquals(text1,exp1);
				   
				   try {
					   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).click();
					   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).sendKeys("Testcase");
						 }catch(Exception e) {
							 e.printStackTrace();
						 }
				   String text2=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[3]/div/label[2]")).getText();
					System.out.println(text2);
					String exp2="Please enter Birth date";
					Assert.assertEquals(text2,exp2);
				   try {
						  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).click();
						  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/09/2004");
						  String text21=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[3]/div/label[2]")).getText();
							System.out.println(text21);
							String exp21="You must be at least 18 years old!";
							Assert.assertEquals(text21,exp21);
							Thread.sleep(1000);
							 driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).clear();
						  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/21/1998");
						 }catch(Exception e) {
							 e.printStackTrace();
						 }
				   String text3=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[4]/div/label[2]")).getText();
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
						String text4=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/label[2]")).getText();
						System.out.println(text4);
						String exp4="Please enter Estimated Annual Income";
						Assert.assertEquals(text4,exp4);
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).sendKeys("assssddddf");
						
						String text41=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/label[2]")).getText();
						System.out.println(text41);
						String exp41="Please enter only numbers";
						Assert.assertEquals(text41,exp41);
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).sendKeys("1200000");
					
					JavascriptExecutor js4 = (JavascriptExecutor) driver;	
					   js4.executeScript("window.scrollBy(0,20)");
					   
					   String text10=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/label[2]")).getText();
						System.out.println(text10);
						String exp10="Please enter Mobile Number";
						Assert.assertEquals(text10,exp10);
						
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).sendKeys("aasdsddd");
						
						   String text101=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/label[2]")).getText();
							System.out.println(text101);
							String exp101="Please enter only numbers";
							Assert.assertEquals(text101,exp101);
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).sendKeys("8569854589");
					
					 Thread.sleep(1000);
					String text11=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/label[2]")).getText();
					System.out.println(text11);
					String exp11="Please enter Email";
					Assert.assertEquals(text11,exp11);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/input")).sendKeys("testfitsyn@gmail.com@gmail.com@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/input")).clear();
					
					Thread.sleep(1000);
					try {
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/input")).sendKeys("mock+265@evenfinancial.com");}
					catch(Exception e) {
						 e.printStackTrace();
					 }
					   
					JavascriptExecutor js5 = (JavascriptExecutor) driver;
					   js5.executeScript("window.scrollBy(0,50)");
					   
					   String text12=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/label[2]")).getText();
						System.out.println(text12);
						String exp12="Please enter Address";
						Thread.sleep(1000);
						Assert.assertEquals(text12,exp12);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/input")).sendKeys("220 Locust Ave");
					
					String text13=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/label[2]")).getText();
					System.out.println(text13);
					String exp13="Please enter City";
					Assert.assertEquals(text13,exp13);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/input")).sendKeys("Metairie");
					

					String text14=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[5]/div/label[2]")).getText();
					System.out.println(text14);
					String exp14="Please select State";
					Assert.assertEquals(text14,exp14);
					Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[5]/div/select")));
					slt2.selectByVisibleText("Montana");
					Thread.sleep(2000);
					
					String text15=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[6]/div/label[2]")).getText();
					System.out.println(text15);
					String exp15="Please enter Zipcode";
					Assert.assertEquals(text15,exp15);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[6]/div/input")).sendKeys("65088");
					JavascriptExecutor js6 = (JavascriptExecutor) driver;
					   js6.executeScript("window.scrollBy(0,50)");
					
					String text16=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[1]/div/label[2]")).getText();
					System.out.println(text16);
					String exp16="Please select Loan Purpose";
					Assert.assertEquals(text16,exp16);
					Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[1]/div/select")));
					slt3.selectByIndex(2);
					String text17=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/label[2]")).getText();
					System.out.println(text17);
					String exp17="Please enter Amount Financed";
					Assert.assertEquals(text17,exp17);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/input")).sendKeys("!@!@@##");
					String text171=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/label[2]")).getText();
					System.out.println(text171);
					String exp171="Please enter only numbers";
					Assert.assertEquals(text171,exp171);
					driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).clear();
					driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("1000000");
					String text1711=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/label[2]")).getText();
					System.out.println(text1711);
					String exp1711="Please enter amount less than or eaqual to 100000";
					Assert.assertEquals(text1711,exp1711);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).clear();
					driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("100000");
					   String text5=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[1]/div/label[2]")).getText();
						System.out.println(text5);
						String exp5="Please select Job Type";
						Assert.assertEquals(text5,exp5);
						
					try {
					Select slt45=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[1]/div/select")));
					slt45.selectByIndex(2);}catch(Exception e) {
						 e.printStackTrace();
					 }
					String text6=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[2]/div/label[2]")).getText();
					System.out.println(text6);
					String exp6="Please select Employment Pay Frequency";
					Assert.assertEquals(text6,exp6);
					
					try {
					Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[2]/div/select")));
					slt1.selectByIndex(2);	
					}catch(Exception e) {
						 e.printStackTrace();
					 }
					
					JavascriptExecutor js3 = (JavascriptExecutor) driver;
					   js3.executeScript("window.scrollBy(0,50)");
					   
						Select slt5=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[3]/div/select")));
						slt5.selectByValue("excellent");
					
						Select slt6=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[4]/div/select")));
						slt6.selectByValue("rent");
						//Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[5]/div/select")));
						//slt7.selectByValue("cash_back");
						driver.findElement(By.xpath("//span[@class='slidert round']")).click();
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
			        Thread.sleep(15000);
			        JavascriptExecutor js82 = (JavascriptExecutor) driver;
					   js82.executeScript("window.scrollBy(0,150)");
					   Thread.sleep(2000);
					   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
						 Thread.sleep(1000);
						 Actions actn6=new Actions(driver);
					        actn6.moveToElement( driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/a"))).click().build().perform();
					        Thread.sleep(5000);
					        JavascriptExecutor js1= (JavascriptExecutor) driver;
							   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
							    Thread.sleep(2000);
							    Actions actn7=new Actions(driver);
						        actn7.moveToElement( driver.findElement(By.xpath("//span[@class='slidert round']"))).click().build().perform();
						        Thread.sleep(2000);
						        Actions actn8=new Actions(driver);
						        actn8.moveToElement( driver.findElement(By.xpath("//*[@id=\"send_sms\"]"))).click().build().perform();
						        Thread.sleep(2000);
						        Actions actn9=new Actions(driver);
						        actn9.moveToElement( driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
						        Thread.sleep(12000);						   
								 Actions action5=new Actions(driver);
								action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"sms_history\"]/div/div/div[3]/button"))).click().build().perform();			        
			
		}


@Test(priority=2)
		public void appHistory() throws Exception {
			Thread.sleep(3000);
			 driver.navigate().to("https://demo.fitsyn.com/applications");
		        driver.manage().window().maximize();
		        Thread.sleep(7000);
		        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/button")).click();
		        Thread.sleep(7000);
		        Actions actn3=new Actions(driver);
		        actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/div/a[6]"))).click().build().perform();
		        Thread.sleep(5000);
		        JavascriptExecutor js1= (JavascriptExecutor) driver;
				   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
