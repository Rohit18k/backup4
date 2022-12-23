package com.fitsyn.qa.multipletestcases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
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

public class AddCustomLenderOffers extends TestBase1{
	Random r=new Random();

	public AddCustomLenderOffers() {
	super();
	}

	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	


	 @Test(priority=1)
	 public void addCustomLenderOffers() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/custom_lenders");
			driver.manage().window().maximize();

				Thread.sleep(2000);
				 Actions actn=new Actions (driver);
		           actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a"))).click().build().perform();
		           Thread.sleep(2000);
		           JavascriptExecutor js= (JavascriptExecutor) driver;
				   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				   Thread.sleep(2000);
				   Actions actn1=new Actions (driver);
		           actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
		           Thread.sleep(2000);
		           driver.findElement(By.xpath("//*[@id=\"is_public_form\"]")).click();
		           Thread.sleep(1000);
		           driver.findElement(By.xpath("//*[@id=\"is_backend_form\"]")).click();
		           Thread.sleep(1000);
		           driver.findElement(By.xpath("//*[@id=\"is_posting_api\"]")).click();
		           Thread.sleep(2000);
		           String pwdtext1= driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[4]/div/label[2]")).getText();	
					Assert.assertEquals(pwdtext1,"Please enter lender name");	
					Thread.sleep(2000);
		           Actions actn2=new Actions (driver);
		           actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[4]/div/input"))).click().build().perform();
		           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[4]/div/input")).sendKeys("Test_Custom_Offer");
		       	Thread.sleep(1000);
		       	driver.findElement(By.xpath("//*[@id=\"hide_offer_name\"]")).click();
		    	Thread.sleep(1000);
			String pwdtext2= driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[6]/div/label[2]")).getText();	
				Assert.assertEquals(pwdtext2,"This field is required.");					
				Thread.sleep(1000);
				  Actions actn3=new Actions (driver);
		           actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[6]/div/input"))).click().build().perform();
		           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[6]/div/input")).sendKeys("453");		           
		           Thread.sleep(1000);
		           String pwdtext3= driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[7]/div/label[2]")).getText();	
					Assert.assertEquals(pwdtext3,"Please enter some description");	
					  Thread.sleep(1000);
					  Actions actn4=new Actions (driver);
			           actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[7]/div/input"))).click().build().perform();
			           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[7]/div/input")).sendKeys("Testing custom offer");
			           Thread.sleep(1000);
			           String pwdtext4= driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[8]/div/label[2]")).getText();	
						Assert.assertEquals(pwdtext4,"This field is required.");	
						Thread.sleep(1000);
						  Actions actn5=new Actions (driver);
				           actn5.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[8]/div/input"))).click().build().perform();
				           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[8]/div/input")).sendKeys("+18004444444");
				           Thread.sleep(2000);
				           String pwdtext5= driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[10]/div/label[2]")).getText();	
							Assert.assertEquals(pwdtext5,"Please enter URL");	
						    Thread.sleep(1000);
						    Actions actn6=new Actions (driver);
					           actn6.moveToElement(driver.findElement(By.xpath("//*[@id=\"url\"]"))).click().build().perform();
					           driver.findElement(By.xpath("//*[@id=\"url\"]")).sendKeys("https://www.google.com");
					           Thread.sleep(1000);
					           String pwdtext6= driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[11]/div/label[2]")).getText();	
								Assert.assertEquals(pwdtext6,"Please enter URL");	
								   Thread.sleep(1000);
								   Actions actn7=new Actions (driver);
						           actn7.moveToElement(driver.findElement(By.xpath("//*[@id=\"post_url\"]"))).click().build().perform();
						           driver.findElement(By.xpath("//*[@id=\"post_url\"]")).sendKeys("https://www.google.com");
						           Thread.sleep(1000);						           
						           JavascriptExecutor js8 = (JavascriptExecutor) driver;
								   js8.executeScript("window.scrollBy(0,400)");
						           Actions actn8=new Actions (driver);
						           actn8.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[12]/div/label[2]/span"))).click().build().perform();
						           Thread.sleep(1000);
						           Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[2]/div[2]/select")));
						           slt.selectByVisibleText(" >= (Greater or Equal)");
						           Thread.sleep(1000);
						           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[2]/div[3]/input")).sendKeys("5000");
						           Thread.sleep(1000);
						           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[3]/div[1]/div/input")).sendKeys("3000");
						           Thread.sleep(1000);
						           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[3]/div[2]/div/input")).sendKeys("8000");
						           Thread.sleep(1000);
						           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[3]/div[3]/div/input")).sendKeys("35000");
						           Thread.sleep(1000);
						           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[3]/div[4]/div/input")).sendKeys("50000");
						           Thread.sleep(2000);
                                    driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[3]/div[5]/div/span/span[1]/span/ul/li/input")).sendKeys("720+");
						           Thread.sleep(1000);
						           List<WebElement> lstt =driver.findElements(By.xpath("//ul[@id=\"select2-select_credit_score-results\"]/li"));						           
						           Thread.sleep(2000);
						       	lstt.get(0).click();
						           Thread.sleep(1000);
						           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[3]/div[6]/div/span/span[1]/span/ul/li/input")).sendKeys("NORTH POLE");
						           Thread.sleep(2000);
						           List<WebElement> lstt2= driver.findElements(By.xpath("//ul[@id=\"select2-select_city-results\"]/li"));
						           Thread.sleep(2000);
						        	lstt2.get(0).click();	
						        	   Thread.sleep(1000);
						           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[3]/div[7]/div/span/span[1]/span/ul/li/input")).click();
						           Thread.sleep(1000);
						           List<WebElement> lstt1= driver.findElements(By.xpath("//ul[@id=\"select2-select_state-results\"]/li"));
						           Thread.sleep(2000);
							        	lstt1.get(1).click();
						           Thread.sleep(1000);
						           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[3]/div[8]/div/span/span[1]/span/ul/li/input")).sendKeys("99705");
						           Thread.sleep(2000);
						           List<WebElement> lstt3= driver.findElements(By.xpath("//ul[@id=\"select2-select_zipcode-results\"]/li"));
						           Thread.sleep(2000);
							        	lstt3.get(0).click();
				                   Thread.sleep(2000);
						           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[3]/div[9]/div/span/span[1]/span/ul/li/input")).sendKeys("Business");
						           Thread.sleep(1000);
						           List<WebElement> lstt4= driver.findElements(By.xpath("//ul[@id=\"select2-select_loan_purpose-results\"]/li"));
						           Thread.sleep(2000);
							        	lstt4.get(0).click();
				                   Thread.sleep(2000);
						           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[3]/div[10]/div/span/span[1]/span/ul/li/input")).sendKeys("Employed");
						           Thread.sleep(1000);
						           List<WebElement> lstt5= driver.findElements(By.xpath("//ul[@id=\"select2-select_employment_status-results\"]/li"));
						           Thread.sleep(2000);
							        	lstt5.get(0).click();
				                   Thread.sleep(2000);
		                            driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[4]/div/span/span[1]/span/ul/li/input")).sendKeys("footer Tags");
		                            Thread.sleep(2000);
		                            List<WebElement> lstt6= driver.findElements(By.xpath("//ul[@id=\"select2-select_footer_tag-results\"]/li"));
							           Thread.sleep(2000);
								        	lstt6.get(0).click();
					                   Thread.sleep(2000);
					                   JavascriptExecutor js9 = (JavascriptExecutor) driver;
									   js9.executeScript("window.scrollBy(0,400)");
									   Thread.sleep(2000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[1]/div/div[2]/div/input")).sendKeys("10.5");
		                            Thread.sleep(1000);
		                            Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[1]/div/div[3]/div/select")));
		                            slt1.selectByVisibleText("Percentage");
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[1]/div/div[4]/div/label[2]/span")).click();
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[2]/div/div[2]/div/input")).sendKeys("40000");
		                            Thread.sleep(1000);
		                            Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[2]/div/div[3]/div/select")));
		                            slt2.selectByValue("amount");
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[2]/div/div[4]/div/label[2]/span")).click();
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[3]/div/div[2]/div/input")).sendKeys("4000");
		                            Thread.sleep(1000);
		                            Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[3]/div/div[3]/div/select")));
		                            slt3.selectByValue("amount");
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[3]/div/div[4]/div/label[2]/span")).click();
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[4]/div/div[2]/div/input")).sendKeys("20000");
		                            Thread.sleep(1000);
		                            Select slt4=new Select(driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[4]/div/div[3]/div/select")));
		                            slt4.selectByValue("amount");
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[4]/div/div[4]/div/label[2]/span")).click();
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[5]/div/div[2]/div/input")).sendKeys("20");
		                            Thread.sleep(1000);
		                            Select slt5=new Select(driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[5]/div/div[3]/div/select")));
		                            slt5.selectByValue("text");
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[5]/div/div[4]/div/label[2]/span")).click();
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[6]/div/div[2]/div/input")).sendKeys("45000");
		                            Thread.sleep(1000);
		                            Select slt6=new Select(driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[6]/div/div[3]/div/select")));
		                            slt6.selectByValue("amount");
		                            Thread.sleep(1000);
		                            driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[6]/div/div[4]/div/label[2]/span")).click();
		                            Thread.sleep(2000);
		                            Actions actn12=new Actions (driver);
							         actn12.moveToElement(driver.findElement(By.xpath("//*[@id=\"setFieldPriorityBlock\"]/div/button"))).click().build().perform();
							         Thread.sleep(2000);
							         
							 		WebElement source= driver.findElement(By.xpath("//*[@id=\"leftFields\"]/li[2]"));
							 		WebElement dest= driver.findElement(By.xpath("//*[@id=\"leftFields\"]/li[1]"));
							 		         Actions actn13=new Actions (driver);
							 		         actn13.moveToElement(source).clickAndHold();
							 		         Thread.sleep(2000);
							 		         actn13.moveToElement(dest).release().perform();
							 		        Thread.sleep(2000);
							 		   	WebElement source1= driver.findElement(By.xpath("//*[@id=\"leftFields\"]/li[4]"));
								 		WebElement dest1= driver.findElement(By.xpath("//*[@id=\"leftFields\"]/li[3]"));
							 		        
							 		        
							 		       Actions actn14=new Actions (driver);
							 		      actn14.moveToElement(source1).clickAndHold();
							 		     Thread.sleep(2000);
						 		         actn14.moveToElement(dest1).release().perform();
						 		         
						 		        Thread.sleep(2000);
							 		   	WebElement source2= driver.findElement(By.xpath("//*[@id=\"leftFields\"]/li[5]"));
								 		WebElement dest2= driver.findElement(By.xpath("//*[@id=\"leftFields\"]/li[4]"));
							 		        
							 		        
							 		       Actions actn15=new Actions (driver);
							 		      actn15.moveToElement(source2).clickAndHold();
							 		     Thread.sleep(2000);
						 		         actn15.moveToElement(dest2).release().perform();
						 		        driver.findElement(By.xpath("//*[@id=\"setCustomLenderFieldsPriority\"]/div/div/div[3]/button")).click();
						 		         
		                            Thread.sleep(2000);
		                            JavascriptExecutor js10 = (JavascriptExecutor) driver;
									   js10.executeScript("window.scrollBy(0,250)");
									   Thread.sleep(2000); 
									   Actions actn9=new Actions (driver);
							           actn9.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[10]/div/div/textarea"))).click().build().perform();
							           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[10]/div/div/textarea")).sendKeys("disclosure");
							           Thread.sleep(1000); 
							           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[12]/div[2]/div/input")).sendKeys("Offer");
							           Thread.sleep(2000);
							           Actions actn10=new Actions (driver);
							           actn10.moveToElement(driver.findElement(By.xpath("//img[@id='avatar']"))).click().build().perform();  
							           Robot robot=new Robot();
							           robot.setAutoDelay(7000);
							           File file = new File("./Imagefiles/the-new-york-public-library-w8uU35aGU6A-unsplash.jpg");	
							           StringSelection stringSelection=new StringSelection(file.getAbsolutePath());
							         //  StringSelection stringSelection=new StringSelection("C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\Imagefiles\\the-new-york-public-library-w8uU35aGU6A-unsplash.jpg");
							           Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
							           clipboard.setContents(stringSelection, null);
							           robot.setAutoDelay(7000);
							           robot.keyPress(KeyEvent.VK_CONTROL);
							           robot.keyPress(KeyEvent.VK_V);
							           
							           robot.keyRelease(KeyEvent.VK_V);
							           robot.keyRelease(KeyEvent.VK_CONTROL);
							           
							           robot.setAutoDelay(7000);
							           
							           robot.keyPress(KeyEvent.VK_ENTER);
							           robot.keyRelease(KeyEvent.VK_ENTER);
							           
							      
							           Thread.sleep(5000);
							         Actions actn11=new Actions (driver);
							         actn11.moveToElement(driver.findElement(By.xpath("//button[@id=\"crop\"]"))).click().build().perform();
							         Thread.sleep(2000);
							         WebElement element =  driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")); 
							         JavascriptExecutor executor = (JavascriptExecutor)driver; executor. executeScript("arguments[0]. click();", element);
							           Thread.sleep(20000);
							       
//							           String image= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
//							           System.out.println(image);
										//Assert.assertEquals(image,"Please enter some description");	
				
							           
}
	
	/*
	
	 @Test(priority=4)
	 public void setPriority() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/custom_lenders");
			driver.manage().window().maximize();
			 Thread.sleep(2000);
			  Actions actn=new Actions (driver);
		         actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[3]/button"))).click().build().perform();
		         Thread.sleep(2000);
		         
		WebElement source= driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[2]"));
		WebElement dest= driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
		         Actions actn1=new Actions (driver);
		         actn1.moveToElement(source).clickAndHold();
		         Thread.sleep(2000);
		         actn1.moveToElement(dest).release().perform();
}

	
	 @Test(priority=5)
	 public void setPriority1() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/custom_lenders");
			driver.manage().window().maximize();
			 Thread.sleep(2000);
			  Actions actn=new Actions (driver);
		         actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[3]/button"))).click().build().perform();
		         Thread.sleep(2000);
		         
		WebElement source= driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[4]"));
		WebElement dest= driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[3]"));
		         Actions actn1=new Actions (driver);
		         actn1.moveToElement(source).clickAndHold();
		         Thread.sleep(2000);
		         actn1.moveToElement(dest).release().perform();
}
	

	 @Test(priority=6)
	 public void setPriority2() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/custom_lenders");
			driver.manage().window().maximize();
			 Thread.sleep(2000);
			  Actions actn=new Actions (driver);
		         actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[3]/button"))).click().build().perform();
		         Thread.sleep(2000);
		         
		WebElement source= driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[6]"));
		WebElement dest= driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[5]"));
		         Actions actn1=new Actions (driver);
		         actn1.moveToElement(source).clickAndHold();
		         Thread.sleep(2000);
		         actn1.moveToElement(dest).release().perform();
}

	
	 @Test(priority=7)
	 public void setPriority3() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/custom_lenders");
			driver.manage().window().maximize();
			 Thread.sleep(2000);
			  Actions actn=new Actions (driver);
		         actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[3]/button"))).click().build().perform();
		         Thread.sleep(2000);
		         
		WebElement source= driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[8]"));
		WebElement dest= driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[7]"));
		         Actions actn1=new Actions (driver);
		         actn1.moveToElement(source).clickAndHold();
		         Thread.sleep(2000);
		         actn1.moveToElement(dest).release().perform();
}


	
	 @Test(priority=8)
	 public void setPriority4() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/custom_lenders");
			driver.manage().window().maximize();
			 Thread.sleep(2000);
			  Actions actn=new Actions (driver);
		         actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[3]/button"))).click().build().perform();
		         Thread.sleep(2000);
		         
		WebElement source= driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[9]"));
		WebElement dest= driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[8]"));
		         Actions actn1=new Actions (driver);
		         actn1.moveToElement(source).clickAndHold();
		         Thread.sleep(2000);
		         actn1.moveToElement(dest).release().perform();		          
		           Thread.sleep(5000);
		           String image= driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();	
		           System.out.println(image);
		           Assert.assertEquals(image,"Priority successfully changed");
		           Thread.sleep(2000);
			          driver.findElement(By.xpath("//*[@id=\"set_custom_lender_priority\"]/div/div/div[3]/button")).click();
}

	
	 @Test(priority=2)
		public  void createApp() throws Exception {
			
				Thread.sleep(7000);
				driver.navigate().to("https://demo.fitsyn.com/vendors");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("admin@site.com");
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
	 
	 
	 
	 
	
	 
	 
	 
	 
	 @Test(priority=3)
	 public void iniateAppCustomOfferShow() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/custom_lenders");
			driver.manage().window().maximize();
			 Thread.sleep(2000);
			  Actions actn=new Actions (driver);
		         actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[1]/td[4]/label/span"))).click().build().perform();
		         Thread.sleep(5000);
		           String image= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
		           System.out.println(image);
		           Assert.assertEquals(image,"Setup mode is off for Test_Custom_Offer");
		         
		         
		         Thread.sleep(2000);
		         
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
						Thread.sleep(5000);
						Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[5]/div/select")));
						slt7.selectByValue("cash_back");
						 JavascriptExecutor js81 = (JavascriptExecutor) driver;
						   js81.executeScript("window.scrollTo(0, document.body.scrollHeight)");
						   Actions action2=new Actions(driver);
						   action2.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
		
}
	
	 
	 @Test(priority=9)
	 public void searchLenderName() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/custom_lenders");
			driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"list_lenders\"]/div/div[1]/input")).sendKeys("Test_Custom_Offer");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			 
	 }
	 
	 
	 @Test(priority=10)
	 public void editOffer() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/custom_lenders");
			driver.manage().window().maximize();
			 Thread.sleep(2000);
			  Actions action2=new Actions(driver);
			  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr[1]/td[5]/a[1]"))).click().build().perform();
			  Thread.sleep(2000);
	           driver.findElement(By.xpath("//*[@id=\"is_public_form\"]")).click();
	           Thread.sleep(1000);
	           driver.findElement(By.xpath("//*[@id=\"is_backend_form\"]")).click();
	           Thread.sleep(1000);
	           driver.findElement(By.xpath("//*[@id=\"is_posting_api\"]")).click();	
				Thread.sleep(2000);
	           Actions actn2=new Actions (driver);
	           actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[4]/div/input"))).click().build().perform();
	           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[4]/div/input")).clear();
	           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[4]/div/input")).sendKeys("Test_Custom_Offer");
	       	Thread.sleep(1000);
	       	driver.findElement(By.xpath("//*[@id=\"hide_offer_name\"]")).click();					
			Thread.sleep(1000);
			  Actions actn3=new Actions (driver);
	           actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[6]/div/input"))).click().build().perform();
	           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[6]/div/input")).clear();
	           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[6]/div/input")).sendKeys("453");		           
				  Thread.sleep(1000);
				  Actions actn4=new Actions (driver);
		           actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[7]/div/input"))).click().build().perform();
		           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[7]/div/input")).clear();
		           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[7]/div/input")).sendKeys("Testing custom offer");	
					Thread.sleep(1000);
					  Actions actn5=new Actions (driver);
			           actn5.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[8]/div/input"))).click().build().perform();
			           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[8]/div/input")).clear();
			           driver.findElement(By.xpath("//*[@id=\"add_lenders\"]/div[1]/div[8]/div/input")).sendKeys("+18004444444");
					    Thread.sleep(1000);
					    Actions actn6=new Actions (driver);
				           actn6.moveToElement(driver.findElement(By.xpath("//*[@id=\"url\"]"))).click().build().perform();
				           driver.findElement(By.xpath("//*[@id=\"url\"]")).clear();
				           driver.findElement(By.xpath("//*[@id=\"url\"]")).sendKeys("https://www.google.com");
							   Thread.sleep(1000);
							   Actions actn7=new Actions (driver);
					           actn7.moveToElement(driver.findElement(By.xpath("//*[@id=\"post_url\"]"))).click().build().perform();
					           driver.findElement(By.xpath("//*[@id=\"post_url\"]")).clear();
					           driver.findElement(By.xpath("//*[@id=\"post_url\"]")).sendKeys("https://www.google.com");
					           Thread.sleep(1000);						           				           
					           JavascriptExecutor js8 = (JavascriptExecutor) driver;
							   js8.executeScript("window.scrollBy(0,800)");
							   Thread.sleep(1000);		
							   driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[1]/div/div[4]/div/label[2]/span")).click();
							   Thread.sleep(1000);		
							   driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[2]/div/div[4]/div/label[2]/span")).click();
							   Thread.sleep(1000);		
							   driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[3]/div/div[4]/div/label[2]/span")).click();
							   Thread.sleep(1000);		
							   driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[4]/div/div[4]/div/label[2]/span")).click();
							   Thread.sleep(1000);		
							   driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[5]/div/div[4]/div/label[2]/span")).click();
							   Thread.sleep(1000);		
							   driver.findElement(By.xpath("//*[@id=\"offer_values_div\"]/div[6]/div/div[4]/div/label[2]/span")).click();
							   JavascriptExecutor js10 = (JavascriptExecutor) driver;
							   js10.executeScript("window.scrollBy(0,250)");
							   Thread.sleep(2000);	
							   driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
							   Thread.sleep(4000);
					           String image= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
					           System.out.println(image);
					           Assert.assertEquals(image,"Custom lender updated successfully");
							   
							   
							   
							   
							   
							   
							   
	 }
	
	
	
	
	
	
	
	
	
	 @Test(priority=11)
	 public void deleteOffer() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/custom_lenders");
			driver.manage().window().maximize();
			 Thread.sleep(2000);
			  Actions action2=new Actions(driver);
			  action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"lenders_list\"]/tbody/tr/td[5]/a[2]"))).click().build().perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click(); 
			 
	 }
	 
	 */
}
