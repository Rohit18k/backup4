package com.fitsyn.qa.testcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class InSchedularSideMenuApplicantEmailSchedular extends TestBase1{

	Random r=new Random();
	
	public InSchedularSideMenuApplicantEmailSchedular() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	
	@Test(priority=1)
	public void addSchedularOfferClicked() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a/strong"))).click().build().perform();
		 	  Thread.sleep(2000);
		 	 Actions action1=new Actions(driver);
		 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/a"))).click().build().perform();
		 	  Thread.sleep(1000);
		 	 Actions action7=new Actions(driver);
		 	   action7.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/ul/li[3]"))).click().build().perform();
		 	  Thread.sleep(1000);
 	  
			 	 driver.findElement(By.xpath("//*[@id=\"subject\"]")).click();
				 driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Regarding offer clicked");
				 Thread.sleep(2000);
				 driver.switchTo().frame(0);
				 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys(" offer clicked");		
				 driver.switchTo().defaultContent();
			 	  Thread.sleep(1000);
			 	 JavascriptExecutor js1= (JavascriptExecutor) driver;
				   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				   Thread.sleep(2000);
				   Actions actn1=new Actions(driver);
					actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();
					driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys(" offer clicked");
									
					  Thread.sleep(2000);			 	  
					  Actions actn2=new Actions(driver);
						actn2.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
		 	Thread.sleep(4000);
			String error1=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
			Assert.assertEquals(error1,"Please select status");
		 	  Thread.sleep(9000);
		 	 Actions action3=new Actions(driver);
		 	   action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/a"))).click().build().perform();
		 	  Thread.sleep(1000);
		 	 Actions action2=new Actions(driver);
		 	   action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/ul/li[2]"))).click().build().perform();
		 	  Thread.sleep(1000);
		 	 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
		 	Thread.sleep(2000);
			String error2=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
			Assert.assertEquals(error2,"Please enter valid day(s)");
		 	  Thread.sleep(9000);
		 	 Actions action5=new Actions(driver);
		 	   action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
		 	  Thread.sleep(1000);
			 	 Actions action6=new Actions(driver);
			 	   action6.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
			 	  driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("1");
			 	 Thread.sleep(1000);
			 	 driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button")).click();			 	  
			 	  Thread.sleep(1000);
			 	 Actions action8=new Actions(driver);
			 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
			 		Thread.sleep(4000);
					String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
					Assert.assertEquals(success,"Applicant Email Scheduler successfully created");
					
	
	}
	

	@Test(priority=2)
	public void editSchedular() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/a"))).click().build().perform();
		 	  Thread.sleep(2000);
		 	 Actions actn2=new Actions(driver);
				actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
				  Thread.sleep(2000);
				 Actions actn3=new Actions(driver);
					actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
				driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("2");
				 Thread.sleep(1000);
				 Actions actn4=new Actions(driver);
					actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
					 Thread.sleep(1000);
					 Actions actn5=new Actions(driver);
						actn5.moveToElement( driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button"))).click().build().perform();							
						  Thread.sleep(2000);
						  JavascriptExecutor js1= (JavascriptExecutor) driver;
						   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
						   Thread.sleep(2000);
						   Actions actn1=new Actions(driver);
							actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();						
							driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).clear();
							driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys(" offer clicked");
			 	  Thread.sleep(1000);
			 	 Actions action8=new Actions(driver);
			 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
			 	  Thread.sleep(4000);
					String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
					Assert.assertEquals(success,"Applicant Email Scheduler successfully updated");
							}
	
	 @Test(priority=3)
	 public void removeSchedular() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");		
			driver.manage().window().maximize();
			Thread.sleep(2000);
			  Actions action=new Actions(driver);
			   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/button"))).click().build().perform();
		 	 Thread.sleep(2000);
		 	Actions action3=new Actions(driver);
		 	   action3.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
	String text=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
	Assert.assertEquals(text,"Are you sure?");
	
	 Thread.sleep(2000);	
		 	 Actions action1=new Actions(driver);
		 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
		 	   
		 	  Thread.sleep(3000);	 	  
		 	 Actions action4=new Actions(driver);
		 	   action4.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
	String text1=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
	Assert.assertEquals(text1,"Removed!");
	
	 Thread.sleep(2000);
		 	  
		 	 Actions action2=new Actions(driver);
		 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
		 	  Thread.sleep(2000);}
	
	 @Test(priority=4)
		public void addSchedularFunded() throws Exception {
			 Thread.sleep(2000);
				driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
				driver.manage().window().maximize();
				Thread.sleep(2000);
				Actions action=new Actions(driver);
			 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a/strong"))).click().build().perform();
			 	  Thread.sleep(2000);
			 	 Actions action1=new Actions(driver);
			 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/a"))).click().build().perform();
			 	  Thread.sleep(1000);
			 	 Actions action7=new Actions(driver);
			 	   action7.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/ul/li[3]"))).click().build().perform();
			 	  Thread.sleep(1000);
	 	  
				 	 driver.findElement(By.xpath("//*[@id=\"subject\"]")).click();
					 driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Regarding offer funded");
					 Thread.sleep(2000);
					 driver.switchTo().frame(0);
					 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys(" offer funded");	
					 driver.switchTo().defaultContent();
				 	  Thread.sleep(1000);
				 	 JavascriptExecutor js1= (JavascriptExecutor) driver;
					   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					   Thread.sleep(2000);
					   Actions actn1=new Actions(driver);
						actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();
						driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys(" offer funded");
										
						  Thread.sleep(2000);			 	  
						  Actions actn2=new Actions(driver);
							actn2.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
			 	Thread.sleep(4000);
				String error1=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
				Assert.assertEquals(error1,"Please select status");
			 	  Thread.sleep(9000);
			 	 Actions action3=new Actions(driver);
			 	   action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/a"))).click().build().perform();
			 	  Thread.sleep(1000);
			 	 Actions action2=new Actions(driver);
			 	   action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/ul/li[3]"))).click().build().perform();
			 	  Thread.sleep(1000);
			 	 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
			 	Thread.sleep(2000);
				String error2=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
				Assert.assertEquals(error2,"Please enter valid day(s)");
			 	  Thread.sleep(9000);
			 	 Actions action5=new Actions(driver);
			 	   action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
			 	  Thread.sleep(1000);
				 	 Actions action6=new Actions(driver);
				 	   action6.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
				 	  driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("1");
				 	 Thread.sleep(1000);
				 	 driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button")).click();			 	  
				 	  Thread.sleep(1000);
				 	 Actions action8=new Actions(driver);
				 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
				 		Thread.sleep(4000);
						String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
						Assert.assertEquals(success,"Applicant Email Scheduler successfully created");
						
		
		}
	
	 @Test(priority=5)
		public void editSchedular1() throws Exception {
			 Thread.sleep(2000);
				driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
				driver.manage().window().maximize();
				Thread.sleep(2000);
				Actions action=new Actions(driver);
			 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/a"))).click().build().perform();
			 	  Thread.sleep(2000);
			 	 Actions actn2=new Actions(driver);
					actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
					  Thread.sleep(2000);
					 Actions actn3=new Actions(driver);
						actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
					driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("2");
					 Thread.sleep(1000);
					 Actions actn4=new Actions(driver);
						actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
						 Thread.sleep(1000);
						 Actions actn5=new Actions(driver);
							actn5.moveToElement( driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button"))).click().build().perform();	
							  Thread.sleep(2000);
							  JavascriptExecutor js1= (JavascriptExecutor) driver;
							   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
							   Thread.sleep(2000);
							   Actions actn1=new Actions(driver);
								actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();						
								driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).clear();
								driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys(" offer funded");
				 	  Thread.sleep(1000);
				 	 Actions action8=new Actions(driver);
				 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
				 	  Thread.sleep(4000);
						String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
						Assert.assertEquals(success,"Applicant Email Scheduler successfully updated");
								}
		
		 @Test(priority=6)
		 public void removeSchedular1() throws Exception {
			 Thread.sleep(2000);
				driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");		
				driver.manage().window().maximize();
				Thread.sleep(2000);
				  Actions action=new Actions(driver);
				   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/button"))).click().build().perform();
			 	 Thread.sleep(2000);
			 	Actions action3=new Actions(driver);
			 	   action3.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
		String text=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
		Assert.assertEquals(text,"Are you sure?");
		
		 Thread.sleep(2000);	
			 	 Actions action1=new Actions(driver);
			 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
			 	   
			 	  Thread.sleep(3000);	 	  
			 	 Actions action4=new Actions(driver);
			 	   action4.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
		String text1=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
		Assert.assertEquals(text1,"Removed!");
		
		 Thread.sleep(2000);
			 	  
			 	 Actions action2=new Actions(driver);
			 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
			 	  Thread.sleep(2000);}
	
	
		 @Test(priority=7)
			public void addSchedularApplicantSent() throws Exception {
				 Thread.sleep(2000);
					driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
					driver.manage().window().maximize();
					Thread.sleep(2000);
					Actions action=new Actions(driver);
				 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a/strong"))).click().build().perform();
				 	  Thread.sleep(2000);
				 	 Actions action1=new Actions(driver);
				 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/a"))).click().build().perform();
				 	  Thread.sleep(1000);
				 	 Actions action7=new Actions(driver);
				 	   action7.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/ul/li[3]"))).click().build().perform();
				 	  Thread.sleep(1000);
		 	  
					 	 driver.findElement(By.xpath("//*[@id=\"subject\"]")).click();
						 driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Regarding Application sent");
						 Thread.sleep(2000);
						 driver.switchTo().frame(0);
						 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("Application sent to  applicant");		
						 driver.switchTo().defaultContent();
					 	  Thread.sleep(1000);
					 	 JavascriptExecutor js1= (JavascriptExecutor) driver;
						   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
						   Thread.sleep(2000);
						   Actions actn1=new Actions(driver);
							actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();
							driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys("Application sent to  applicant");
											
							  Thread.sleep(2000);			 	  
							  Actions actn2=new Actions(driver);
								actn2.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
				 	Thread.sleep(4000);
					String error1=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
					Assert.assertEquals(error1,"Please select status");
				 	  Thread.sleep(9000);
				 	 Actions action3=new Actions(driver);
				 	   action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/a"))).click().build().perform();
				 	  Thread.sleep(1000);
				 	 Actions action2=new Actions(driver);
				 	   action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/ul/li[4]"))).click().build().perform();
				 	  Thread.sleep(1000);
				 	 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
				 	Thread.sleep(2000);
					String error2=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
					Assert.assertEquals(error2,"Please enter valid day(s)");
				 	  Thread.sleep(9000);
				 	 Actions action5=new Actions(driver);
				 	   action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
				 	  Thread.sleep(1000);
					 	 Actions action6=new Actions(driver);
					 	   action6.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
					 	  driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("1");
					 	 Thread.sleep(1000);
					 	 driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button")).click();			 	  
					 	  Thread.sleep(1000);
					 	 Actions action8=new Actions(driver);
					 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
					 		Thread.sleep(4000);
							String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
							Assert.assertEquals(success,"Applicant Email Scheduler successfully created");
							
			
			}
	
	
		 @Test(priority=8)
			public void editSchedular2() throws Exception {
				 Thread.sleep(2000);
					driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
					driver.manage().window().maximize();
					Thread.sleep(2000);
					Actions action=new Actions(driver);
				 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/a"))).click().build().perform();
				 	  Thread.sleep(2000);
				 	 Actions actn2=new Actions(driver);
						actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
						  Thread.sleep(2000);
						 Actions actn3=new Actions(driver);
							actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
						driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).clear();
						driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("2");
						 Thread.sleep(1000);
						 Actions actn4=new Actions(driver);
							actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
							 Thread.sleep(1000);
							 Actions actn5=new Actions(driver);
								actn5.moveToElement( driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button"))).click().build().perform();	 	  
								  Thread.sleep(2000);
								  JavascriptExecutor js1= (JavascriptExecutor) driver;
								   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
								   Thread.sleep(2000);
								   Actions actn1=new Actions(driver);
									actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();						
									driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).clear();
									driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys("Applicantion sent to applicant");
								Thread.sleep(1000);
					 	 Actions action8=new Actions(driver);
					 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
					 	  Thread.sleep(4000);
							String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
							Assert.assertEquals(success,"Applicant Email Scheduler successfully updated");
									}
			
			 @Test(priority=9)
			 public void removeSchedular2() throws Exception {
				 Thread.sleep(2000);
					driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");		
					driver.manage().window().maximize();
					Thread.sleep(2000);
					  Actions action=new Actions(driver);
					   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/button"))).click().build().perform();
				 	 Thread.sleep(2000);
				 	Actions action3=new Actions(driver);
				 	   action3.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
			String text=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
			Assert.assertEquals(text,"Are you sure?");
			
			 Thread.sleep(2000);	
				 	 Actions action1=new Actions(driver);
				 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
				 	   
				 	  Thread.sleep(3000);	 	  
				 	 Actions action4=new Actions(driver);
				 	   action4.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
			String text1=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
			Assert.assertEquals(text1,"Removed!");
			
			 Thread.sleep(2000);
				 	  
				 	 Actions action2=new Actions(driver);
				 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
				 	  Thread.sleep(2000);}
	
	
	
			 @Test(priority=10)
				public void addSchedularLookingForOffer() throws Exception {
					 Thread.sleep(2000);
						driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
						driver.manage().window().maximize();
						Thread.sleep(2000);
						Actions action=new Actions(driver);
					 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a/strong"))).click().build().perform();
					 	  Thread.sleep(2000);
					 	 Actions action1=new Actions(driver);
					 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/a"))).click().build().perform();
					 	  Thread.sleep(1000);
					 	 Actions action7=new Actions(driver);
					 	   action7.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/ul/li[3]"))).click().build().perform();
					 	  Thread.sleep(1000);
			 	  
						 	 driver.findElement(By.xpath("//*[@id=\"subject\"]")).click();
							 driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Regarding looking for offer");
							 Thread.sleep(2000);
							 driver.switchTo().frame(0);
							 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("looking for offer");	
							 driver.switchTo().defaultContent();
						 	  Thread.sleep(1000);
						 	 JavascriptExecutor js1= (JavascriptExecutor) driver;
							   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
							   Thread.sleep(2000);
							   Actions actn1=new Actions(driver);
								actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();
								driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys("looking for offer");
												
								  Thread.sleep(2000);			 	  
								  Actions actn2=new Actions(driver);
									actn2.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
					 	Thread.sleep(4000);
						String error1=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
						Assert.assertEquals(error1,"Please select status");
					 	  Thread.sleep(9000);
					 	 Actions action3=new Actions(driver);
					 	   action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/a"))).click().build().perform();
					 	  Thread.sleep(1000);
					 	 Actions action2=new Actions(driver);
					 	   action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/ul/li[5]"))).click().build().perform();
					 	  Thread.sleep(1000);
					 	 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
					 	Thread.sleep(2000);
						String error2=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
						Assert.assertEquals(error2,"Please enter valid day(s)");
					 	  Thread.sleep(9000);
					 	 Actions action5=new Actions(driver);
					 	   action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
					 	  Thread.sleep(1000);
						 	 Actions action6=new Actions(driver);
						 	   action6.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
						 	  driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("1");
						 	 Thread.sleep(1000);
						 	 driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button")).click();			 	  
						 	  Thread.sleep(1000);
						 	 Actions action8=new Actions(driver);
						 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
						 		Thread.sleep(4000);
								String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
								Assert.assertEquals(success,"Applicant Email Scheduler successfully created");
								
				
				}
	
	
			 @Test(priority=11)
				public void editSchedular3() throws Exception {
					 Thread.sleep(2000);
						driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
						driver.manage().window().maximize();
						Thread.sleep(2000);
						Actions action=new Actions(driver);
					 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/a"))).click().build().perform();
					 	  Thread.sleep(2000);
					 	 Actions actn2=new Actions(driver);
							actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
							  Thread.sleep(2000);
							 Actions actn3=new Actions(driver);
								actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
							driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).clear();
							driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("2");
							 Thread.sleep(1000);
							 Actions actn4=new Actions(driver);
								actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
								 Thread.sleep(1000);
								 Actions actn5=new Actions(driver);
									actn5.moveToElement( driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button"))).click().build().perform();	 	  
									  Thread.sleep(2000);
									  JavascriptExecutor js1= (JavascriptExecutor) driver;
									   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
									   Thread.sleep(2000);
									   Actions actn1=new Actions(driver);
										actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();						
										driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).clear();
										driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys("looking for offer");
									Thread.sleep(1000);
						 	 Actions action8=new Actions(driver);
						 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
						 	  Thread.sleep(4000);
								String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
								Assert.assertEquals(success,"Applicant Email Scheduler successfully updated");
										}
				
				 @Test(priority=12)
				 public void removeSchedular3() throws Exception {
					 Thread.sleep(2000);
						driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");		
						driver.manage().window().maximize();
						Thread.sleep(2000);
						  Actions action=new Actions(driver);
						   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/button"))).click().build().perform();
					 	 Thread.sleep(2000);
					 	Actions action3=new Actions(driver);
					 	   action3.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
				String text=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
				Assert.assertEquals(text,"Are you sure?");
				
				 Thread.sleep(2000);	
					 	 Actions action1=new Actions(driver);
					 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
					 	   
					 	  Thread.sleep(3000);	 	  
					 	 Actions action4=new Actions(driver);
					 	   action4.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
				String text1=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
				Assert.assertEquals(text1,"Removed!");
				
				 Thread.sleep(2000);
					 	  
					 	 Actions action2=new Actions(driver);
					 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
					 	  Thread.sleep(2000);}
	
				 @Test(priority=13)
					public void addSchedularNoOffers() throws Exception {
						 Thread.sleep(2000);
							driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
							driver.manage().window().maximize();
							Thread.sleep(2000);
							Actions action=new Actions(driver);
						 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a/strong"))).click().build().perform();
						 	  Thread.sleep(2000);
						 	 Actions action1=new Actions(driver);
						 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/a"))).click().build().perform();
						 	  Thread.sleep(1000);
						 	 Actions action7=new Actions(driver);
						 	   action7.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/ul/li[3]"))).click().build().perform();
						 	  Thread.sleep(1000);
				 	  
							 	 driver.findElement(By.xpath("//*[@id=\"subject\"]")).click();
								 driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Regarding no offer");
								 Thread.sleep(2000);
								 driver.switchTo().frame(0);
								 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("no offer");
								 driver.switchTo().defaultContent();
							 	  Thread.sleep(1000);
							 	 JavascriptExecutor js1= (JavascriptExecutor) driver;
								   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
								   Thread.sleep(2000);
								   Actions actn1=new Actions(driver);
									actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();
									driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys("no offer");
													
									  Thread.sleep(2000);			 	  
									  Actions actn2=new Actions(driver);
										actn2.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
						 	Thread.sleep(4000);
							String error1=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
							Assert.assertEquals(error1,"Please select status");
						 	  Thread.sleep(9000);
						 	 Actions action3=new Actions(driver);
						 	   action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/a"))).click().build().perform();
						 	  Thread.sleep(1000);
						 	 Actions action2=new Actions(driver);
						 	   action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/ul/li[6]"))).click().build().perform();
						 	  Thread.sleep(1000);
						 	 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
						 	Thread.sleep(2000);
							String error2=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
							Assert.assertEquals(error2,"Please enter valid day(s)");
						 	  Thread.sleep(9000);
						 	 Actions action5=new Actions(driver);
						 	   action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
						 	  Thread.sleep(1000);
							 	 Actions action6=new Actions(driver);
							 	   action6.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
							 	  driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("1");
							 	 Thread.sleep(1000);
							 	 driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button")).click();			 	  
							 	  Thread.sleep(1000);
							 	 Actions action8=new Actions(driver);
							 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
							 		Thread.sleep(4000);
									String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
									Assert.assertEquals(success,"Applicant Email Scheduler successfully created");
									
					
					}
	
				 @Test(priority=14)
					public void editSchedular4() throws Exception {
						 Thread.sleep(2000);
							driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
							driver.manage().window().maximize();
							Thread.sleep(2000);
							Actions action=new Actions(driver);
						 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/a"))).click().build().perform();
						 	  Thread.sleep(2000);
						 	 Actions actn2=new Actions(driver);
								actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
								  Thread.sleep(2000);
								 Actions actn3=new Actions(driver);
									actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
								driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).clear();
								driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("2");
								 Thread.sleep(1000);
								 Actions actn4=new Actions(driver);
									actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
									 Thread.sleep(1000);
									 Actions actn5=new Actions(driver);
										actn5.moveToElement( driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button"))).click().build().perform();	 	  
							 	
										  Thread.sleep(2000);
										  JavascriptExecutor js1= (JavascriptExecutor) driver;
										   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
										   Thread.sleep(2000);
										   Actions actn1=new Actions(driver);
											actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();						
											driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).clear();
											driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys("no offers");
										Thread.sleep(1000);
							 	 Actions action8=new Actions(driver);
							 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
							 	  Thread.sleep(4000);
									String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
									Assert.assertEquals(success,"Applicant Email Scheduler successfully updated");
											}
					
					 @Test(priority=15)
					 public void removeSchedular4() throws Exception {
						 Thread.sleep(2000);
							driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");		
							driver.manage().window().maximize();
							Thread.sleep(2000);
							  Actions action=new Actions(driver);
							   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/button"))).click().build().perform();
						 	 Thread.sleep(2000);
						 	Actions action3=new Actions(driver);
						 	   action3.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
					String text=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
					Assert.assertEquals(text,"Are you sure?");
					
					 Thread.sleep(2000);	
						 	 Actions action1=new Actions(driver);
						 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
						 	   
						 	  Thread.sleep(3000); 	  
						 	 Actions action4=new Actions(driver);
						 	   action4.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
					String text1=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
					Assert.assertEquals(text1,"Removed!");
					
					 Thread.sleep(2000);
						 	  
						 	 Actions action2=new Actions(driver);
						 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
						 	  Thread.sleep(2000);}
					 
					 
					 @Test(priority=16)
						public void addSchedularOffersAvailable() throws Exception {
							 Thread.sleep(2000);
								driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
								driver.manage().window().maximize();
								Thread.sleep(2000);
								Actions action=new Actions(driver);
							 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a/strong"))).click().build().perform();
							 	  Thread.sleep(2000);
							 	 Actions action1=new Actions(driver);
							 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/a"))).click().build().perform();
							 	  Thread.sleep(1000);
							 	 Actions action7=new Actions(driver);
							 	   action7.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/ul/li[3]"))).click().build().perform();
							 	  Thread.sleep(1000);
					 	  
								 	 driver.findElement(By.xpath("//*[@id=\"subject\"]")).click();
									 driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Regarding offers available");
									 Thread.sleep(2000);
									 driver.switchTo().frame(0);
									 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("offers available");
									 driver.switchTo().defaultContent();
								 	  Thread.sleep(1000);
								 	 JavascriptExecutor js1= (JavascriptExecutor) driver;
									   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
									   Thread.sleep(2000);
									   Actions actn1=new Actions(driver);
										actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();
										driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys("offers available");
														
										  Thread.sleep(2000);			 	  
										  Actions actn2=new Actions(driver);
											actn2.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
							 	Thread.sleep(4000);
								String error1=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
								Assert.assertEquals(error1,"Please select status");
							 	  Thread.sleep(9000);
							 	 Actions action3=new Actions(driver);
							 	   action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/a"))).click().build().perform();
							 	  Thread.sleep(1000);
							 	 Actions action2=new Actions(driver);
							 	   action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/ul/li[7]"))).click().build().perform();
							 	  Thread.sleep(1000);
							 	 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
							 	Thread.sleep(2000);
								String error2=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
								Assert.assertEquals(error2,"Please enter valid day(s)");
							 	  Thread.sleep(9000);
							 	 Actions action5=new Actions(driver);
							 	   action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
							 	  Thread.sleep(1000);
								 	 Actions action6=new Actions(driver);
								 	   action6.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
								 	  driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("1");
								 	 Thread.sleep(1000);
								 	 driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button")).click();			 	  
								 	  Thread.sleep(1000);
								 	 Actions action8=new Actions(driver);
								 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
								 		Thread.sleep(4000);
										String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
										Assert.assertEquals(success,"Applicant Email Scheduler successfully created");
										
						
						}	 
					 
					 
					 
					 @Test(priority=17)
						public void editSchedular5() throws Exception {
							 Thread.sleep(2000);
								driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
								driver.manage().window().maximize();
								Thread.sleep(2000);
								Actions action=new Actions(driver);
							 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/a"))).click().build().perform();
							 	  Thread.sleep(2000);
							 	 Actions actn2=new Actions(driver);
									actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
									  Thread.sleep(2000);
									 Actions actn3=new Actions(driver);
										actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
									driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).clear();
									driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("2");
									 Thread.sleep(1000);
									 Actions actn4=new Actions(driver);
										actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
										 Thread.sleep(1000);
										 Actions actn5=new Actions(driver);
											actn5.moveToElement( driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button"))).click().build().perform();	 	  				 	
											  Thread.sleep(2000);
											  JavascriptExecutor js1= (JavascriptExecutor) driver;
											   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
											   Thread.sleep(2000);
											   Actions actn1=new Actions(driver);
												actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();						
												driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).clear();
												driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys(" offers available");
											Thread.sleep(1000);
								 	 Actions action8=new Actions(driver);
								 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
								 	  Thread.sleep(4000);
										String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
										Assert.assertEquals(success,"Applicant Email Scheduler successfully updated");
												}
						
						 @Test(priority=18)
						 public void removeSchedular5() throws Exception {
							 Thread.sleep(2000);
								driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");		
								driver.manage().window().maximize();
								Thread.sleep(2000);
								  Actions action=new Actions(driver);
								   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/button"))).click().build().perform();
							 	 Thread.sleep(2000);
							 	Actions action3=new Actions(driver);
							 	   action3.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
						String text=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
						Assert.assertEquals(text,"Are you sure?");
						
						 Thread.sleep(2000);	
							 	 Actions action1=new Actions(driver);
							 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
							 	   
							 	  Thread.sleep(3000); 	  
							 	 Actions action4=new Actions(driver);
							 	   action4.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
						String text1=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
						Assert.assertEquals(text1,"Removed!");
						
						 Thread.sleep(2000);
							 	  
							 	 Actions action2=new Actions(driver);
							 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
							 	  Thread.sleep(2000);}	 
					 
					 
						 @Test(priority=19)
							public void addSchedularRejected() throws Exception {
								 Thread.sleep(2000);
									driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
									driver.manage().window().maximize();
									Thread.sleep(2000);
									Actions action=new Actions(driver);
								 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a/strong"))).click().build().perform();
								 	  Thread.sleep(2000);
								 	 Actions action1=new Actions(driver);
								 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/a"))).click().build().perform();
								 	  Thread.sleep(1000);
								 	 Actions action7=new Actions(driver);
								 	   action7.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/ul/li[3]"))).click().build().perform();
								 	  Thread.sleep(1000);
						 	  
									 	 driver.findElement(By.xpath("//*[@id=\"subject\"]")).click();
										 driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Regarding application reject");
										 Thread.sleep(2000);
										 driver.switchTo().frame(0);
										 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("application rejected");	
										 driver.switchTo().defaultContent();
									 	  Thread.sleep(1000);
									 	 JavascriptExecutor js1= (JavascriptExecutor) driver;
										   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
										   Thread.sleep(2000);
										   Actions actn1=new Actions(driver);
											actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();
											driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys("application rejected");
															
											  Thread.sleep(2000);			 	  
											  Actions actn2=new Actions(driver);
												actn2.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
								 	Thread.sleep(4000);
									String error1=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
									Assert.assertEquals(error1,"Please select status");
								 	  Thread.sleep(9000);
								 	 Actions action3=new Actions(driver);
								 	   action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/a"))).click().build().perform();
								 	  Thread.sleep(1000);
								 	 Actions action2=new Actions(driver);
								 	   action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[2]/ul/li[8]"))).click().build().perform();
								 	  Thread.sleep(1000);
								 	 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
								 	Thread.sleep(2000);
									String error2=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
									Assert.assertEquals(error2,"Please enter valid day(s)");
								 	  Thread.sleep(9000);
								 	 Actions action5=new Actions(driver);
								 	   action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
								 	  Thread.sleep(1000);
									 	 Actions action6=new Actions(driver);
									 	   action6.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
									 	  driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("1");
									 	 Thread.sleep(1000);
									 	 driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button")).click();			 	  
									 	  Thread.sleep(1000);
									 	 Actions action8=new Actions(driver);
									 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
									 		Thread.sleep(4000);
											String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
											Assert.assertEquals(success,"Applicant Email Scheduler successfully created");
											
							
							}	 		 
					 
						 @Test(priority=20)
							public void editSchedular6() throws Exception {
								 Thread.sleep(2000);
									driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");	
									driver.manage().window().maximize();
									Thread.sleep(2000);
									Actions action=new Actions(driver);
								 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/a"))).click().build().perform();
								 	  Thread.sleep(2000);
								 	 Actions actn2=new Actions(driver);
										actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
										  Thread.sleep(2000);
										 Actions actn3=new Actions(driver);
											actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input"))).click().build().perform();
										driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).clear();
										driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/input")).sendKeys("2");
										 Thread.sleep(1000);
										 Actions actn4=new Actions(driver);
											actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/a"))).click().build().perform();
											 Thread.sleep(1000);
											 Actions actn5=new Actions(driver);
												actn5.moveToElement( driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[3]/ul/li[1]/button"))).click().build().perform();	 	  									 	
												  Thread.sleep(2000);
												  JavascriptExecutor js1= (JavascriptExecutor) driver;
												   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
												   Thread.sleep(2000);
												   Actions actn1=new Actions(driver);
													actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"text_Body\"]"))).click().build().perform();						
													driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).clear();
													driver.findElement(By.xpath("//*[@id=\"text_Body\"]")).sendKeys("rejected");												
												Thread.sleep(1000);
									 	 Actions action8=new Actions(driver);
									 	   action8.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
									 	  Thread.sleep(4000);
											String success=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
											Assert.assertEquals(success,"Applicant Email Scheduler successfully updated");
													}
							
							 @Test(priority=21)
							 public void removeSchedular6() throws Exception {
								 Thread.sleep(2000);
									driver.navigate().to("https://demo.fitsyn.com/scheduler/applicant");		
									driver.manage().window().maximize();
									Thread.sleep(2000);
									  Actions action=new Actions(driver);
									   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]/button"))).click().build().perform();
								 	 Thread.sleep(2000);
								 	Actions action3=new Actions(driver);
								 	   action3.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
							String text=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
							Assert.assertEquals(text,"Are you sure?");
							
							 Thread.sleep(2000);	
								 	 Actions action1=new Actions(driver);
								 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
								 	   
								 	  Thread.sleep(3000);	 	  
								 	 Actions action4=new Actions(driver);
								 	   action4.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
							String text1=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
							Assert.assertEquals(text1,"Removed!");
							
							 Thread.sleep(2000);
								 	  
								 	 Actions action2=new Actions(driver);
								 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
								 	  Thread.sleep(2000);}	
					 
					 
	
}
