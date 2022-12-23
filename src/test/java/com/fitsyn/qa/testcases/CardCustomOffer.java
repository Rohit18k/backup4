package com.fitsyn.qa.testcases;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class CardCustomOffer extends TestBase1{


	public CardCustomOffer() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
//	
//    @Test(priority=1)
//	public  void createApp() throws Exception {
//		
//		Thread.sleep(7000);
//	driver.navigate().to("https://demo.fitsyn.com/vendors");
//		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("admin@site.com");
//	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//button[@value='submit']")).click();
//
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/button[@class='btn btn-default btn-sm dropdown-toggle']")).click();
//	Thread.sleep(7000);
//	
//	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/div/a[@href='/vendors/settings/5db2cadd07492e00180353d3']")).click();
//
//	Thread.sleep(3000);
//	
//	Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
//	select.selectByVisibleText("Rail One");
//	driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();}
	
	
	
    @Test(priority=2)
		public void disableEnableCreditCardCustomOffersCreateApplication() throws InterruptedException {
	
			driver.navigate().to("https://demo.fitsyn.com/card_custom_lenders/");
			
			driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[1]/td[4]/label/span")).click();
			driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[2]/td[4]/label/span")).click();
			driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[3]/td[4]/label/span")).click();
			driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[4]/td[4]/label/span")).click();
		
			
			driver.navigate().to("https://demo.fitsyn.com/dashboard");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			 WebElement l=driver.findElement(By.partialLinkText("Initiate Applicati"));
			  l.click();
			  
			  JavascriptExecutor js34 = (JavascriptExecutor) driver;
			   js34.executeScript("window.scrollBy(0,1200)");
			   Thread.sleep(5000);
			   Actions action=new Actions(driver);
			   action.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
			   
	
				String text=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/label[2]")).getText();
				System.out.println(text);
				String exp="Please enter First Name";
				Assert.assertEquals(text,exp);
				
			   try {
					  driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).click();
				     driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).sendKeys("John");
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
			   String text1=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/label[2]")).getText();
				System.out.println(text1);
				String exp1="Please enter Last Name";
				Assert.assertEquals(text1,exp1);
			   
			   try {
				   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).click();
				   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).sendKeys("shoy");
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
					  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).sendKeys("678-98-9898");
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
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).sendKeys("45000");
				
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
				Thread.sleep(1000);
				try {
			//	driver.findElement(By.cssSelector("body.slack-chat-page.config--vertical.config--borderLess.menu-left--colorful.menu-left--shadow.theme--light.menu-left--visible:nth-child(2) div.utils__content:nth-child(7) div.cui-layout.cui-layout-has-sider:nth-child(1) div.cui-layout div.cui-layout-content div.cui-utils-content section.card:nth-child(4) div.card-body form:nth-child(2) div.row:nth-child(7) div.col-xl-6.col-md-6.col-sm-12:nth-child(2) div.form-group.state-success > input.form-control")).click();
			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/input")).sendKeys("mock+265@evenfinancial.com");}
				catch(Exception e) {
					 e.printStackTrace();
				 }
				   
				JavascriptExecutor js5 = (JavascriptExecutor) driver;
				   js5.executeScript("window.scrollBy(0,50)");
				   
				   String text12=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/label[2]")).getText();
					System.out.println(text12);
					String exp12="Please enter Address";
					Assert.assertEquals(text12,exp12);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/input")).sendKeys("Washington Dc");
				
				String text13=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/label[2]")).getText();
				System.out.println(text13);
				String exp13="Please enter City";
				Assert.assertEquals(text13,exp13);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/input")).sendKeys("Indore");
				
	
				String text14=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[5]/div/label[2]")).getText();
				System.out.println(text14);
				String exp14="Please select State";
				Assert.assertEquals(text14,exp14);
				Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[5]/div/select")));
				slt2.selectByIndex(2);
				Thread.sleep(2000);
				
				String text15=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[6]/div/label[2]")).getText();
				System.out.println(text15);
				String exp15="Please enter Zipcode";
				Assert.assertEquals(text15,exp15);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[6]/div/input")).sendKeys("12345");
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
				driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("2300");
				   String text5=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[1]/div/label[2]")).getText();
					System.out.println(text5);
					String exp5="Please select Job Type";
					Assert.assertEquals(text5,exp5);
					
				try {
				Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[1]/div/select")));
				slt.selectByIndex(2);}catch(Exception e) {
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
					////select[@title='Choose Estimated Credit Score']
					Select slt6=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[4]/div/select")));
					slt6.selectByValue("rent");
					Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[5]/div/select")));
					slt7.selectByValue("cash_back");
					 JavascriptExecutor js81 = (JavascriptExecutor) driver;
					   js81.executeScript("window.scrollBy(0,70)");
					   Thread.sleep(5000);
					   Actions action2=new Actions(driver);
					   action2.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
					   try {
					   Thread.sleep(10000);
					   JavascriptExecutor js88 = (JavascriptExecutor) driver;
					   js88.executeScript("window.scrollBy(0,500)");
					   WebElement element = driver.findElement(By.xpath("//a[@data-application_type=\"credit_card\"]"));
					  Actions action32 =new Actions(driver);
					  action32.moveToElement(element).click().build().perform();
					  Thread.sleep(5000);
					  JavascriptExecutor js87 = (JavascriptExecutor) driver;
					   js87.executeScript("window.scrollBy(0,50)");}
					   catch(Exception e) {
						   e.printStackTrace();
					   }
					  
					   

					   Thread.sleep(5000);
					   driver.navigate().to("https://demo.fitsyn.com/card_custom_lenders/");
					   
			
					   
					   driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[1]/td[4]/label/span")).click();
						driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[2]/td[4]/label/span")).click();
						driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[3]/td[4]/label/span")).click();
						driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[4]/td[4]/label/span")).click();					
						
						driver.navigate().to("https://demo.fitsyn.com/dashboard");
						Thread.sleep(2000);
						
						 WebElement l2=driver.findElement(By.partialLinkText("Initiate Applicati"));
						  l2.click();
						  
						  JavascriptExecutor js342 = (JavascriptExecutor) driver;
						   js342.executeScript("window.scrollBy(0,1200)");
						   Thread.sleep(5000);
						   Actions action22=new Actions(driver);
						   action22.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
						   
	
							String text22=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/label[2]")).getText();
							System.out.println(text22);
							String exp22="Please enter First Name";
							Assert.assertEquals(text22,exp22);
							
						   try {
								  driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).click();
							     driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).sendKeys("John");
								 }catch(Exception e) {
									 e.printStackTrace();
								 }
						   String text112=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/label[2]")).getText();
							System.out.println(text112);
							String exp112="Please enter Last Name";
							Assert.assertEquals(text112,exp112);
						   
						   try {
							   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).click();
							   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).sendKeys("shoy");
								 }catch(Exception e) {
									 e.printStackTrace();
								 }
						   String text21=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[3]/div/label[2]")).getText();
							System.out.println(text21);
							String exp21="Please enter Birth date";
							Assert.assertEquals(text21,exp21);
						   try {
								  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).click();
								  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/09/2004");
								  String text211=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[3]/div/label[2]")).getText();
									System.out.println(text211);
									String exp211="You must be at least 18 years old!";
									Assert.assertEquals(text211,exp211);
									Thread.sleep(1000);
									 driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).clear();
								  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/21/1998");
								 }catch(Exception e) {
									 e.printStackTrace();
								 }
						   String text31=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[4]/div/label[2]")).getText();
							System.out.println(text31);
							String exp31="Please enter Social Security Number";
							Assert.assertEquals(text31,exp31);
						   try {
								  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).click();
								  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).sendKeys("678-98-9898");
								 }catch(Exception e) {
									 e.printStackTrace();
								 }
							 Thread.sleep(1000);
								String text412=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/label[2]")).getText();
								System.out.println(text412);
								String exp412="Please enter Estimated Annual Income";
								Assert.assertEquals(text412,exp412);
								driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).sendKeys("assssddddf");
								
								String text411=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/label[2]")).getText();
								System.out.println(text411);
								String exp411="Please enter only numbers";
								Assert.assertEquals(text411,exp411);
								driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).clear();
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).sendKeys("45000");
							
							JavascriptExecutor js42 = (JavascriptExecutor) driver;	
							   js42.executeScript("window.scrollBy(0,20)");
							   
							   String text102=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/label[2]")).getText();
								System.out.println(text102);
								String exp102="Please enter Mobile Number";
								Assert.assertEquals(text102,exp102);
								
								driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).sendKeys("aasdsddd");
								
								   String text1012=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/label[2]")).getText();
									System.out.println(text1012);
									String exp1012="Please enter only numbers";
									Assert.assertEquals(text1012,exp1012);
									driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).clear();
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).sendKeys("8569854589");
							
							 Thread.sleep(1000);
							String text1121=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/label[2]")).getText();
							System.out.println(text1121);
							String exp1121="Please enter Email";
							Assert.assertEquals(text1121,exp1121);
							Thread.sleep(1000);
							try {
						//	driver.findElement(By.cssSelector("body.slack-chat-page.config--vertical.config--borderLess.menu-left--colorful.menu-left--shadow.theme--light.menu-left--visible:nth-child(2) div.utils__content:nth-child(7) div.cui-layout.cui-layout-has-sider:nth-child(1) div.cui-layout div.cui-layout-content div.cui-utils-content section.card:nth-child(4) div.card-body form:nth-child(2) div.row:nth-child(7) div.col-xl-6.col-md-6.col-sm-12:nth-child(2) div.form-group.state-success > input.form-control")).click();
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/input")).sendKeys("mock+265@evenfinancial.com");}
							catch(Exception e) {
								 e.printStackTrace();
							 }
							   
							JavascriptExecutor js52 = (JavascriptExecutor) driver;
							   js52.executeScript("window.scrollBy(0,50)");
							   
							   String text122=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/label[2]")).getText();
								System.out.println(text122);
								String exp122="Please enter Address";
								Assert.assertEquals(text122,exp122);
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/input")).sendKeys("Washington Dc");
							
							String text132=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/label[2]")).getText();
							System.out.println(text132);
							String exp132="Please enter City";
							Assert.assertEquals(text132,exp132);
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/input")).sendKeys("Indore");
							
	
							String text141=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[5]/div/label[2]")).getText();
							System.out.println(text141);
							String exp141="Please select State";
							Assert.assertEquals(text141,exp141);
							Select slt21=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[5]/div/select")));
							slt21.selectByIndex(2);
							Thread.sleep(2000);
							
							String text151=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[6]/div/label[2]")).getText();
							System.out.println(text151);
							String exp151="Please enter Zipcode";
							Assert.assertEquals(text151,exp151);
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[6]/div/input")).sendKeys("12345");
							JavascriptExecutor js61 = (JavascriptExecutor) driver;
							   js61.executeScript("window.scrollBy(0,50)");
							
							String text161=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[1]/div/label[2]")).getText();
							System.out.println(text161);
							String exp161="Please select Loan Purpose";
							Assert.assertEquals(text161,exp161);
							Select slt31=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[1]/div/select")));
							slt31.selectByIndex(2);
							String text1713=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/label[2]")).getText();
							System.out.println(text171);
							String exp1713="Please enter Amount Financed";
							Assert.assertEquals(text1713,exp1713);
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/input")).sendKeys("!@!@@##");
							String text1712=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/label[2]")).getText();
							System.out.println(text1712);
							String exp1712="Please enter only numbers";
							Assert.assertEquals(text1712,exp1712);
							driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).clear();
							driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("2300");
							   String text51=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[1]/div/label[2]")).getText();
								System.out.println(text51);
								String exp51="Please select Job Type";
								Assert.assertEquals(text51,exp51);
								
							try {
							Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[1]/div/select")));
							slt.selectByIndex(2);}catch(Exception e) {
								 e.printStackTrace();
							 }
							String text61=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[2]/div/label[2]")).getText();
							System.out.println(text61);
							String exp61="Please select Employment Pay Frequency";
							Assert.assertEquals(text61,exp61);
							
							try {
							Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[2]/div/select")));
							slt1.selectByIndex(2);	
							}catch(Exception e) {
								 e.printStackTrace();
							 }
							
							JavascriptExecutor js31 = (JavascriptExecutor) driver;
							   js31.executeScript("window.scrollBy(0,50)");
							   
								Select slt51=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[3]/div/select")));
								slt51.selectByValue("excellent");
								////select[@title='Choose Estimated Credit Score']
								Select slt61=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[4]/div/select")));
								slt61.selectByValue("rent");
								Select slt71=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[5]/div/select")));
								slt71.selectByValue("cash_back");
								
								
								 JavascriptExecutor js83 = (JavascriptExecutor) driver;
								   js83.executeScript("window.scrollBy(0,70)");
								   Thread.sleep(5000);
								   Actions action23=new Actions(driver);
								   action23.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
//			
		                         try{
								    Thread.sleep(10000);
								   JavascriptExecutor js89 = (JavascriptExecutor) driver;
								   js89.executeScript("window.scrollBy(0,500)");
								   WebElement element12 = driver.findElement(By.xpath("//a[@data-application_type=\"credit_card\"]"));
								  Actions action321 =new Actions(driver);
								  action321.moveToElement(element12).click().build().perform();
								  Thread.sleep(5000);
								  JavascriptExecutor js871 = (JavascriptExecutor) driver;
								   js871.executeScript("window.scrollBy(0,50)");}
		                         catch(Exception e) {
		                        	 e.printStackTrace();
		                         }
			
			
			
	}}
