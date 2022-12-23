package com.fitsyn.qa.multipletestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class PublicFormCreditCardApplicationRailTwo extends TestBase1{


	public PublicFormCreditCardApplicationRailTwo() {
	super();
	}
	
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}
	
	
	
	
	@Test(priority=1)
	public void subaccountSetting() throws Exception {
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
		select.selectByValue("monevo");
		driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
	}
	
	
	
	   @Test(priority=2)
				public void publicForm() throws Exception {
					Thread.sleep(5000);
					driver.navigate().to("https://loanenroll.demoserver.biz/index.html?vendor_id=5db2cadd07492e00180353d3");
					driver.manage().window().maximize();
					Thread.sleep(5000);
					  Actions action6=new Actions(driver);
					  action6.moveToElement(driver.findElement(By.xpath("//*[@id=\"credit_card_btn\"]/a"))).click().build().perform();
									
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					   js.executeScript("window.scrollBy(0,2200)");
					   Thread.sleep(5000);
					   Actions action=new Actions(driver);
					   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();

						String text=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[1]/div/label")).getText();
						System.out.println(text);
						String exp="This field is required.";
						Assert.assertEquals(text,exp);
						
					   try {
							  driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[1]/div/input[1]")).click();
						     driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[1]/div/input[1]")).sendKeys("Emma");
							 }catch(Exception e) {
								 e.printStackTrace();
							 }
					   String text1=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/label")).getText();
						System.out.println(text1);
						String exp1="This field is required.";
						Assert.assertEquals(text1,exp1);
					   
					   try {
						   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/input")).click();
						   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/input")).sendKeys("Lewis");
							 }catch(Exception e) {
								 e.printStackTrace();
							 }
					   String text2=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[3]/div/label")).getText();
						System.out.println(text2);
						String exp2="This field is required.";
						Assert.assertEquals(text2,exp2);
					   try {
							  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).click();
							  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/09/2004");
							  String text21=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[3]/div/label")).getText();
								System.out.println(text21);
								String exp21="You must be at least 20 years old!";
								Assert.assertEquals(text21,exp21);
								Thread.sleep(1000);
								 driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).clear();
							  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/21/1998");
							 }catch(Exception e) {
								 e.printStackTrace();
							 }
					   String text10=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[4]/div/label")).getText();
						System.out.println(text10);
						String exp10="This field is required.";
						Assert.assertEquals(text10,exp10);
						
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[4]/div/input")).sendKeys("aasdsddd");
						
						   String text101=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[4]/div/label")).getText();
							System.out.println(text101);
							String exp101="Please enter only digits.";
							Assert.assertEquals(text101,exp101);
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[4]/div/input")).clear();
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[4]/div/input")).sendKeys("8569854589");
					
						 Thread.sleep(1000);
							String text4=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/label")).getText();
							System.out.println(text4);
							String exp4="This field is required.";
							Assert.assertEquals(text4,exp4);
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/input")).sendKeys("mock+265@evenfinancial.com");
							
							String text41=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[6]/div/label")).getText();
							System.out.println(text41);
							String exp41="This field is required.";
							Assert.assertEquals(text41,exp41);
							driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[6]/div/input")).clear();
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[6]/div/input")).sendKeys("71 ST. NICHOLAS DRIVE");
						
						
						 Thread.sleep(1000);
						String text11=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[7]/div/label")).getText();
						System.out.println(text11);
						String exp11="This field is required.";
						Assert.assertEquals(text11,exp11);
						Thread.sleep(1000);
						try {
					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[7]/div/input")).sendKeys("NORTH POLE");}
						catch(Exception e) {
							 e.printStackTrace();
						 }
						   
						String text14=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/label")).getText();
						System.out.println(text14);
						String exp14="Select State";
						Assert.assertEquals(text14,exp14);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/div/button/span[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/div/div/ul/li[3]/a/span[1]")).click();
				
						
						String text15=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[9]/div/label")).getText();
						System.out.println(text15);
						String exp15="This field is required.";
						Assert.assertEquals(text15,exp15);
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[1]/div/div/div/div/div/div[9]/div/input")).sendKeys("99705");
						
						JavascriptExecutor js6 = (JavascriptExecutor) driver;
						   js6.executeScript("window.scrollBy(0,200)");
						
						String text16=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[2]/div/div[2]/ul/li/div/div[1]/div/label")).getText();
						System.out.println(text16);
						String exp16="Choose Card Purpose";
						Assert.assertEquals(text16,exp16);
					Thread.sleep(3000); 
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[2]/div/div[2]/ul/li/div/div[1]/div/div/button/span[1]")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[2]/div/div[2]/ul/li/div/div[1]/div/div/div/ul/li[2]/a/span[1]")).click();
							
						String text17=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[2]/div/div[2]/ul/li/div/div[2]/div/label")).getText();
						System.out.println(text17);
						String exp17="Choose Estimated Credit Score";
						Assert.assertEquals(text17,exp17);
						Thread.sleep(3000); 
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[2]/div/div[2]/ul/li/div/div[2]/div/div/button/span[1]")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[2]/div/div[2]/ul/li/div/div[2]/div/div/div/ul/li[1]/a/span[1]")).click();
							
		
							   Thread.sleep(2000); 
					WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div/div[2]/div/div[3]/input"));
					WebElement submit= driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"));
					
					Actions actn1=new Actions(driver);
					actn1.moveToElement(checkbox).click().build().perform();
					  Thread.sleep(5000);
					  Actions actn2=new Actions(driver);
						actn2.moveToElement(submit).click().build().perform();
						Thread.sleep(9000);
					 /*	  
					   	 Thread.sleep(7000);
					     driver.navigate().to("https://demo.fitsyn.com/applications");
					     driver.manage().window().maximize();
					     Thread.sleep(7000);
					     driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/button")).click();
					     Thread.sleep(7000);
					     Actions actn3=new Actions(driver);
					     actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/div/a[6]"))).click().build().perform();
//					     Thread.sleep(60000);
//						 driver.navigate().refresh();
//						 Thread.sleep(5000);
//					     Actions actn4=new Actions(driver);
//					        actn4.moveToElement( driver.findElement(By.xpath("//*[@id=\"creditReport\"]/div"))).click().build().perform();
//					        Thread.sleep(9000);
//					   	
//					        JavascriptExecutor js82 = (JavascriptExecutor) driver;
//							   js82.executeScript("window.scrollBy(0,150)");
//							   driver.close();
			//note: in app list page, no application shows */
					
				}
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
