package com.fitsyn.qa.testcases;

import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;
import com.github.javafaker.Faker;

public class Affiliate  extends TestBase1{

	Random r=new Random();
	
	public Affiliate() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	@Test(priority=1)
	public void addAfilliate() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/affiliate_user/");	
			driver.manage().window().maximize();
			  driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/a/strong"))).click().build().perform();
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
						 Thread.sleep(1000);
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
							  Thread.sleep(1000);
							   driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[2]/div/input")).click();
							   driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[2]/div/input")).sendKeys("affiliate");
								 }catch(Exception e) {
									 e.printStackTrace();
								 }
					
						 Thread.sleep(1000);
						   String text2=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/label[2]")).getText();
							System.out.println(text2);
							String exp2="Please enter Email";
							Assert.assertEquals(text2,exp2);
										
					
					
							 try {
								  Thread.sleep(1000);
								  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/input")).click();
								  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/input")).sendKeys("test123@gmail@gmail.com");
								  Thread.sleep(1000);
								  String text31=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/label[2]")).getText();
									System.out.println(text31);
									String exp31="Please enter valid Email";
									Assert.assertEquals(text31,exp31);
								  
								 }catch(Exception e) {
									 e.printStackTrace();
								 }
							  try {
								  Thread.sleep(1000);
								  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/input")).clear();
									String email="affiliate"+r.nextInt(1000)+"@testing.com";		  
								  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/input")).sendKeys(email);
								 }catch(Exception e) {
									 e.printStackTrace();
								 }			
					
					
							  Thread.sleep(1000);
							  String text3=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/label[2]")).getText();
								System.out.println(text3);
								String exp3="Please enter Mobile Number";
								Assert.assertEquals(text3,exp3);
		
								try {
									  Thread.sleep(1000);
									  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).click();
									  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).sendKeys("!@%$#$");
									  Thread.sleep(1000);
									  String text33=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/label[2]")).getText();
										System.out.println(text33);
										String exp33="Please enter only numbers";
										Assert.assertEquals(text33,exp33);
									 }catch(Exception e) {
										 e.printStackTrace();
									 }
							  
								 try {
									  Thread.sleep(1000);
									  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).clear();
									  
										Faker faker = new Faker(new Locale("en-US"));
										String num=	faker.number().digits(10);
									  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).sendKeys(num);
									 }catch(Exception e) {
										 e.printStackTrace();
									 }
								
								 Thread.sleep(1000);
									String text41=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[5]/div/label[2]")).getText();
									System.out.println(text41);
									String exp41="Please enter Password";
									Assert.assertEquals(text41,exp41);
							  
							  
							  
									try {
										  Thread.sleep(1000);
										  driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
										  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
										  Thread.sleep(1000);
										  String text33=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[5]/div/label[2]")).getText();
											System.out.println(text33);
											String exp33="Please enter password with a mix of capital letters, small letters, numbers and special characters (@, #, $, !, %, *, ? or &)";
											Assert.assertEquals(text33,exp33);
										 }catch(Exception e) {
											 e.printStackTrace();
										 }
								  
									try {
										  Thread.sleep(1000);
										  driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
										  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sah@1212121212345");
										  Thread.sleep(1000);
										  String text33=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[5]/div/label[2]")).getText();
											System.out.println(text33);
											String exp33="You can enter maximum 15 character password";
											Assert.assertEquals(text33,exp33);		
											Thread.sleep(1000);
											  driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
											  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sah@1212");			
										 }catch(Exception e) {
											 e.printStackTrace();
										 }
								
									 Thread.sleep(1000);
										String text414=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/label[2]")).getText();
										System.out.println(text414);
										String exp414="Please enter Confirm Password";
										Assert.assertEquals(text414,exp414);
									
									
										try {
											  Thread.sleep(1000);
											  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/input")).click();
											  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/input")).sendKeys("1234");
											  Thread.sleep(1000);
											  String text33=driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/label[2]")).getText();
												System.out.println(text33);
												String exp33="Current Password must be as same as password";
												Assert.assertEquals(text33,exp33);
											 }catch(Exception e) {
												 e.printStackTrace();
											 }
									
										try {
											  Thread.sleep(1000);
											  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/input")).clear();
											  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[6]/div/input")).sendKeys("Sah@1212");
											 }catch(Exception e) {
												 e.printStackTrace();
											 }
									
										 Thread.sleep(1000);
										 Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[7]/div/select")));
										 Thread.sleep(1000);
										 slt.selectByIndex(1);
										 Thread.sleep(1000);
										 Actions actn2=new Actions(driver);
											actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
											 Thread.sleep(5000);
											 String text40=driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();
												System.out.println(text40);
												String exp40="Affiliate user created successfully";
												Assert.assertEquals(text40,exp40);
									
									
									
									
	}	
			
}
