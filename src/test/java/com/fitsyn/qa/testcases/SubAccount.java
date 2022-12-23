package com.fitsyn.qa.testcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class SubAccount extends TestBase1{

	Random r=new Random();
	public SubAccount() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}

	 @Test(priority=1)
		public void addSubAccount() throws Exception {
			 Thread.sleep(2000);
				driver.navigate().to("https://demo.fitsyn.com/vendors");	
				driver.manage().window().maximize();
				Thread.sleep(2000);
				  Actions action=new Actions(driver);
			 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/a"))).click().build().perform();
			 	  Thread.sleep(2000);
			 	 JavascriptExecutor js1= (JavascriptExecutor) driver;
				   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				   Thread.sleep(2000);
				   Actions actn1=new Actions(driver);
					actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
					 Thread.sleep(2000);
					 
					 String text=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[1]/div/label[2]")).getText();
						System.out.println(text);
						String exp="Please enter First Name";
						Assert.assertEquals(text,exp);
						
						 try {
							 Thread.sleep(2000);
							  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[1]/div/input")).click();
							  
								String username="Test"+r.nextInt(10);
							  
						     driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[1]/div/input")).sendKeys(username);
							 }catch(Exception e) {
								 e.printStackTrace();
							 }
						 Thread.sleep(1000);
						 String text1=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[2]/div/label[2]")).getText();
							System.out.println(text1);
							String exp1="Please enter Last Name";
							Assert.assertEquals(text1,exp1);
							
							  try {
								  Thread.sleep(2000);
								   driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[2]/div/input")).click();
								   driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[2]/div/input")).sendKeys("account");
									 }catch(Exception e) {
										 e.printStackTrace();
									 }
							  Thread.sleep(1000);
							   String text2=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/label[2]")).getText();
								System.out.println(text2);
								String exp2="Please enter Company Name";
								Assert.assertEquals(text2,exp2);
							
								  try {
									  Thread.sleep(2000);
									   driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/input")).click();
									   driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/input")).sendKeys("TechSolution");
										 }catch(Exception e) {
											 e.printStackTrace();
										 }
							
							
								  try {
									  Thread.sleep(2000);
									  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).click();
									  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).sendKeys("https://www.techsolution.com");
									 }catch(Exception e) {
										 e.printStackTrace();
									 }
								  Thread.sleep(1000);
								  String text3=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[5]/div/label[2]")).getText();
									System.out.println(text3);
									String exp3="Please enter Email";
									Assert.assertEquals(text3,exp3);
							
							
									  try {
										  Thread.sleep(2000);
										  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[5]/div/input")).click();
										  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[5]/div/input")).sendKeys("test@gmail@gmail.com");
										  Thread.sleep(1000);
										  String text31=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[5]/div/label[2]")).getText();
											System.out.println(text31);
											String exp31="Please enter valid Email";
											Assert.assertEquals(text31,exp31);
										  
										 }catch(Exception e) {
											 e.printStackTrace();
										 }
									  try {
										  Thread.sleep(2000);
										  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[5]/div/input")).clear();
											String email="user__123"+r.nextInt(1000)+"@testing.com";
										  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[5]/div/input")).sendKeys(email);
										 }catch(Exception e) {
											 e.printStackTrace();
										 }
									  
									  Thread.sleep(1000);
										String text4=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/label[2]")).getText();
										System.out.println(text4);
										String exp4="Please enter Mobile Number";
										Assert.assertEquals(text4,exp4);
									  
									  
										 try {
											  Thread.sleep(2000);
											  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/input")).click();
											  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/input")).sendKeys("!@%$#$");
											  Thread.sleep(1000);
											  String text33=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/label[2]")).getText();
												System.out.println(text33);
												String exp33="Please enter only digits";
												Assert.assertEquals(text33,exp33);
											 }catch(Exception e) {
												 e.printStackTrace();
											 }
									  
										 try {
											  Thread.sleep(2000);
											  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/input")).clear();
											  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/input")).sendKeys("8569854589");
											 }catch(Exception e) {
												 e.printStackTrace();
											 }
										 Thread.sleep(1000);
											String text41=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[7]/div/label[2]")).getText();
											System.out.println(text41);
											String exp41="Please enter Password";
											Assert.assertEquals(text41,exp41);
									  
									  
									  
											try {
												  Thread.sleep(2000);
												  driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
												  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
												  Thread.sleep(1000);
												  String text33=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[7]/div/label[2]")).getText();
													System.out.println(text33);
													String exp33="Please enter password with a mix of capital letters, small letters, numbers and special characters (@, #, $, !, %, *, ? or &)";
													Assert.assertEquals(text33,exp33);
												 }catch(Exception e) {
													 e.printStackTrace();
												 }
										  
											try {
												  Thread.sleep(2000);
												  driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
												  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sah@1212121212345");
												  Thread.sleep(1000);
												  String text33=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[7]/div/label[2]")).getText();
													System.out.println(text33);
													String exp33="You can enter maximum 15 character password";
													Assert.assertEquals(text33,exp33);		
													Thread.sleep(2000);
													  driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
													  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sah@1212");			
												 }catch(Exception e) {
													 e.printStackTrace();
												 }
							
											 Thread.sleep(1000);
												String text414=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[8]/div/label[2]")).getText();
												System.out.println(text414);
												String exp414="Please enter Confirm Password";
												Assert.assertEquals(text414,exp414);
											
											
												try {
													  Thread.sleep(2000);
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[8]/div/input")).click();
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[8]/div/input")).sendKeys("1234");
													  Thread.sleep(1000);
													  String text33=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[8]/div/label[2]")).getText();
														System.out.println(text33);
														String exp33="Current Password must be as same as password";
														Assert.assertEquals(text33,exp33);
													 }catch(Exception e) {
														 e.printStackTrace();
													 }
											
												try {
													  Thread.sleep(2000);
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[8]/div/input")).clear();
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[8]/div/input")).sendKeys("Sah@1212");
													 }catch(Exception e) {
														 e.printStackTrace();
													 }
											
												Thread.sleep(1000);
												String text411=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[9]/div/label[2]")).getText();
												System.out.println(text411);
												String exp411="Please enter Address";
												Assert.assertEquals(text411,exp411);
											
											
												try {
													  Thread.sleep(2000);
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[9]/div/textarea")).click();
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[9]/div/textarea")).sendKeys("71 ST. NICHOLAS DRIVE");								
													 }catch(Exception e) {
														 e.printStackTrace();
													 }
												
												
												
												JavascriptExecutor js5 = (JavascriptExecutor) driver;
												   js5.executeScript("window.scrollBy(0,50)");
												   
												   
												Thread.sleep(1000);
												String text4111=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[10]/div/label[2]")).getText();
												System.out.println(text4111);
												String exp4111="Please enter City";
												Assert.assertEquals(text4111,exp4111);
												
												
												
												try {
													  Thread.sleep(2000);
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[10]/div/input")).click();
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[10]/div/input")).sendKeys("NORTH POLE");								
													 }catch(Exception e) {
														 e.printStackTrace();
													 }
												
												Thread.sleep(1000);
												String text412=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[11]/div/label[2]")).getText();
												System.out.println(text412);
												String exp412="Please enter State";
												Assert.assertEquals(text412,exp412);
												
												
												
												try {
													  Thread.sleep(2000);
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[11]/div/input")).click();
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[11]/div/input")).sendKeys("AK");								
													 }catch(Exception e) {
														 e.printStackTrace();
													 }
												
												
												Thread.sleep(1000);
												String text42=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[12]/div/label[2]")).getText();
												System.out.println(text42);
												String exp42="Please enter Country";
												Assert.assertEquals(text42,exp42);
												
												
												try {
													  Thread.sleep(2000);
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[12]/div/input")).click();
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[12]/div/input")).sendKeys("FAIRBANKS NORTH STAR");								
													 }catch(Exception e) {
														 e.printStackTrace();
													 }
												
												
												Thread.sleep(1000);
												String text421=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[13]/div/label[2]")).getText();
												System.out.println(text421);
												String exp421="Please enter Zip Code";
												Assert.assertEquals(text421,exp421);
												
												
												try {
													  Thread.sleep(2000);
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[13]/div/input")).click();
													  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[13]/div/input")).sendKeys("99705");								
													 }catch(Exception e) {
														 e.printStackTrace();
													 }
												
											
												Thread.sleep(1000);
												  Actions action1=new Actions(driver);
												   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
												   Thread.sleep(5000);
												   String text423=driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();
													System.out.println(text423);
													String exp423="Sub Account successfully created";
													Assert.assertEquals(text423,exp423);
											
												
												
												
												
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}