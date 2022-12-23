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

public class DelayResultsInpreOfferForRailOne extends TestBase1{
	Random r=new Random();

	public DelayResultsInpreOfferForRailOne() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	@Test(priority=1)
	 public void systemSetting() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/settings/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			 JavascriptExecutor js= (JavascriptExecutor) driver;
			   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-300)");
				Thread.sleep(2000);
				 Actions actn=new Actions (driver);
		           actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smtp_form_validation\"]/div[6]/div[24]/div/input"))).click().build().perform();
		           driver.findElement(By.xpath("//*[@id=\"smtp_form_validation\"]/div[6]/div[24]/div/input")).clear();
		           driver.findElement(By.xpath("//*[@id=\"smtp_form_validation\"]/div[6]/div[24]/div/input")).sendKeys("5");
		           Thread.sleep(2000);
		           Actions actn1=new Actions (driver);
		           actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
		       	Thread.sleep(5000);
				String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
				Assert.assertEquals(pwdtext1,"System Settings updated successfully.");	 }
	
	
	
	
	
	
	
	
	
	
	  @Test(priority=2)
			public void optinOffer() throws Exception {
				 Thread.sleep(5000);
				driver.navigate().to("https://demo.fitsyn.com/settings/set_order");
				driver.manage().window().maximize();
//				String Actttitle=driver.getTitle();
//				String exptttile="Fitsyn UAT | Offer Management";
//				 Assert.assertEquals(Actttitle, exptttile);
//				 JavascriptExecutor js = (JavascriptExecutor) driver;
//				   js.executeScript("window.scrollBy(0,70)");
//				   try
//				   {
//					   WebElement display=	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section[2]/div/div/div/div/label[2]/span"));
//					   display.isDisplayed();
//				     System.out.println("Submit button has displayed");
//				     display.click();
//				   }
//				   catch (Exception e)
//				   {
//				     System.out.println("Submit button did not displayed");
//				   } 
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
		        js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		        Thread.sleep(3000);
			WebElement confirm=driver.findElement(By.xpath("//*[@id=\"show_confirmation_page\"]"));
				   Select slt=new Select(confirm);
				   slt.selectByVisibleText("After Confirmation Page");			   
				   driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section[2]/div/form/div[2]/button")).click();
				   Thread.sleep(5000);
					String actualmsg=driver.findElement(By.xpath("//span[contains(text(),'Pre-offer configurations has been saved !')]")).getText();
					String expmsg="Pre-offer configurations has been saved !";
					Assert.assertEquals(actualmsg, expmsg); }
	  
	  
	  @Test(priority=3)
		public  void createApp() throws Exception {
			
				Thread.sleep(7000);
				driver.navigate().to("https://demo.fitsyn.com/vendors");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("admin@site.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//button[@value='submit']")).click();

			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div//button[@class='btn btn-default btn-sm dropdown-toggle']")).click();
			Thread.sleep(7000);
			
			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/div//a[@href='/vendors/settings/5db2cadd07492e00180353d3']")).click();

			Thread.sleep(3000);
			
			Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
			select.selectByVisibleText("Rail One");
			driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();}
	  
	  
	  @Test(priority=4)	  	
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
					     driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).sendKeys("Evelyn");
						 }catch(Exception e) {
							 e.printStackTrace();
						 }
				   String text1=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/label[2]")).getText();
					System.out.println(text1);
					String exp1="Please enter Last Name";
					Assert.assertEquals(text1,exp1);
				   
				   try {
					   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).click();
					   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).sendKeys("Delaney");
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
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/input")).sendKeys("Washington Dc");
					
					String text13=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/label[2]")).getText();
					System.out.println(text13);
					String exp13="Please enter City";
					Assert.assertEquals(text13,exp13);
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/input")).sendKeys("Naples");
					

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
						Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[5]/div/select")));
						slt7.selectByValue("cash_back");
						Thread.sleep(5000);
						
						driver.findElement(By.xpath("//*[@id=\"pre_offer_process\"]")).click();
						driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[1]/div/input")).sendKeys("800000");
						driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[2]/div/input")).sendKeys("12");
						driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[3]/div/input")).sendKeys("200000");
						driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[4]/div/input")).sendKeys("12000");
						driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[5]/div/input")).sendKeys("24");
						driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[6]/div/input")).sendKeys("100000");
						JavascriptExecutor js8 = (JavascriptExecutor) driver;
						   js8.executeScript("window.scrollBy(0,30)");
						driver.findElement(By.xpath("//*[@id=\"send_sms\"]")).click();
//						Thread.sleep(5000);
//						JavascriptExecutor js83 = (JavascriptExecutor) driver;
//						   js83.executeScript("window.scrollBy(0,50)");
//
//						driver.findElement(By.xpath("//*[@id=\"spanish_applications\"]")).click();
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
						 Thread.sleep(5000);
				   
							 String url=driver.findElement(By.xpath("//*[@id=\"short_url\"]")).getText();
							 System.out.println(url);
							 String newurl="https://"+ url;
							 driver.switchTo().newWindow(WindowType.TAB);
							 driver.get(newurl);
							 
							 Thread.sleep(15000);
//							 String acttitle=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/h3")).getText();
//							 String expttitle="Confirm Your Application";
//							   Assert.assertEquals(acttitle, expttitle);
							   
							 JavascriptExecutor js82 = (JavascriptExecutor) driver;
							   js82.executeScript("window.scrollBy(0,1500)");//else use 4000
							   Thread.sleep(5000);
								   WebElement element = driver.findElement(By.xpath("//*[@id=\"even_confirm_form\"]/div/div[2]/div/div[4]/div[2]/input"));
								WebElement el4=   driver.findElement(By.xpath("//*[@id=\"submit-btn1\"]"));
				Actions builder=new Actions(driver);
				builder.moveToElement(element).click().build().perform();
		
			
				Actions builder1=new Actions(driver);
				builder1.moveToElement(el4).click().build().perform();
				Thread.sleep(15000);
				Thread.sleep(7000);
		        driver.navigate().to("https://demo.fitsyn.com/applications");
		        driver.manage().window().maximize();
		        Thread.sleep(7000);
		        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/button")).click();
		        Thread.sleep(7000);
		        Actions actn3=new Actions(driver);
		        actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/div/a[6]"))).click().build().perform();
		        Thread.sleep(5000);
			//note:offers shown 
		      	
		        JavascriptExecutor js2= (JavascriptExecutor) driver;
		 	   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
		}
	 
	  @Test(priority=5)
	  public void optinOffers() throws Exception {
	  	 Thread.sleep(5000);
	  	driver.navigate().to("https://demo.fitsyn.com/settings/set_order");
		driver.manage().window().maximize();
//	  	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	  	   js.executeScript("window.scrollBy(0,70)");
//	  	   try
//	  	   {
//	  		   WebElement display=	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section[2]/div/div/div/div/label[2]/span"));
//	  		   display.isDisplayed();
//	  	     System.out.println("Submit button has displayed");
//	  	     display.click();
//	  	   }
//	  	   catch (Exception e)
//	  	   {
//	  	     System.out.println("Submit button did not displayed");
//	  	   } 
	  	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	       js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	       Thread.sleep(3000);
	  WebElement confirm=driver.findElement(By.xpath("//*[@id=\"show_confirmation_page\"]"));
	  	   Select slt=new Select(confirm);
	  	   slt.selectByVisibleText("Before Confirmation Page");
	  	   driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section[2]/div/form/div[2]/button")).click();
	  	   Thread.sleep(5000);
	  	String actualmsg=driver.findElement(By.xpath("//span[contains(text(),'Pre-offer configurations has been saved !')]")).getText();
	  	String expmsg="Pre-offer configurations has been saved !";
	  	Assert.assertEquals(actualmsg, expmsg);
	  	   Thread.sleep(3000); }
	  
	  
	  
	  @Test(priority=6)	  	
			public void fillForms() throws Exception {
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
						     driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).sendKeys("jennifer");
							 }catch(Exception e) {
								 e.printStackTrace();
							 }
					   String text1=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/label[2]")).getText();
						System.out.println(text1);
						String exp1="Please enter Last Name";
						Assert.assertEquals(text1,exp1);
					   
					   try {
						   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).click();
						   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).sendKeys("lopez");
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
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/input")).sendKeys("Washington Dc");
						
						String text13=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/label[2]")).getText();
						System.out.println(text13);
						String exp13="Please enter City";
						Assert.assertEquals(text13,exp13);
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/input")).sendKeys("Naples");
						

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
							Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[5]/div/select")));
							slt7.selectByValue("cash_back");
							Thread.sleep(5000);
							
							driver.findElement(By.xpath("//*[@id=\"pre_offer_process\"]")).click();
							driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[1]/div/input")).sendKeys("800000");
							driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[2]/div/input")).sendKeys("12");
							driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[3]/div/input")).sendKeys("200000");
							driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[4]/div/input")).sendKeys("12000");
							driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[5]/div/input")).sendKeys("24");
							driver.findElement(By.xpath("//*[@id=\"pre_offer_process_div\"]/div[6]/div/input")).sendKeys("100000");
							JavascriptExecutor js8 = (JavascriptExecutor) driver;
							   js8.executeScript("window.scrollBy(0,30)");
							driver.findElement(By.xpath("//*[@id=\"send_sms\"]")).click();
//							Thread.sleep(5000);
//							JavascriptExecutor js83 = (JavascriptExecutor) driver;
//							   js83.executeScript("window.scrollBy(0,50)");
	//
//							driver.findElement(By.xpath("//*[@id=\"spanish_applications\"]")).click();
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
								 Thread.sleep(5000);
								   
									 String url=driver.findElement(By.xpath("//*[@id=\"short_url\"]")).getText();
									 System.out.println(url);
									 String newurl="https://"+ url;
									 driver.switchTo().newWindow(WindowType.TAB);
									 driver.get(newurl);
									 
									 Thread.sleep(15000);
									 Thread.sleep(7000);
								        driver.navigate().to("https://demo.fitsyn.com/applications");
								        driver.manage().window().maximize();
								        Thread.sleep(7000);
								        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/button")).click();
								        Thread.sleep(7000);
								        Actions actn3=new Actions(driver);
								        actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/div/a[6]"))).click().build().perform();
								     //   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[6]")).click();//view app history
								        Thread.sleep(5000);
									//note:offers shown 
								      	
								        JavascriptExecutor js2= (JavascriptExecutor) driver;
								 	   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
			}
	  
	  
	  
	  
	  
	  
	  
	  
}
