package com.fitsyn.qa.testcases;

import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;
import com.github.javafaker.Faker;

public class SubAccountActionDropdown extends TestBase1{

	Random r=new Random();
	public SubAccountActionDropdown() {
	super();
	}

//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}

	 @Test(priority=1)
	 public void accountEdit() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			  Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/button"))).click().build().perform();
		 	 Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/div/a[1]")).click();
				 Thread.sleep(2000);
				 Actions action1=new Actions(driver);
			 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/input"))).click().build().perform();
			 	  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/input")).clear();
			 	 String email="user__123"+r.nextInt(1000)+"@testing.com";
			 	 driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[3]/div/input")).sendKeys(email);
			 	 Thread.sleep(1000);
			 	 driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).clear();
			 	Faker faker = new Faker(new Locale("en-US"));
				String num=	faker.number().digits(10);
			 	 driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).sendKeys(num);
			 	Thread.sleep(1000);
			 	Actions action2=new Actions(driver);
			 	   action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
			 	  Thread.sleep(4000);
					String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
					Assert.assertEquals(pwdtext1,"Sub Account successfully updated");}

	
	
	 @Test(priority=2)
	 public void accountSetting() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
//			Thread.sleep(2000);			
//			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("My Company");			
//			  Thread.sleep(1000);
//			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]/button")).click();	
			  Thread.sleep(2000);
			  Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/button"))).click().build().perform();
		 	 Thread.sleep(2000);
		 	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/div/a[3]")).click();
		 	Thread.sleep(2000);
		 	Actions action1=new Actions(driver);
		 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[1]/div[2]/div/label[2]/span"))).click().build().perform();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id=\"recurring_fees\"]/div/input")).sendKeys("1");
		 		Thread.sleep(1000);
	 		driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[1]/div/label[2]/span")).click();
		 		Thread.sleep(1000);
//////		 		driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[3]/div[1]/div/label[2]/span")).click();
//		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[3]/div/label[2]/span")).click();
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[3]/div[2]/div/input")).click();
		 		driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[3]/div[2]/div/input")).clear();
		 		driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[3]/div[2]/div/input")).sendKeys("1");
		 		Thread.sleep(1000);
		 		Actions action2=new Actions(driver);
			 	   action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
			 	  Thread.sleep(3000);
					String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
					Assert.assertEquals(pwdtext1,"Sub Account settings successfully updated");}
	 

	 @Test(priority=3)
	 public void accountExtraCharge() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			  Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/button"))).click().build().perform();
		 	 Thread.sleep(2000);
		 	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/div/a[4]")).click();
			Thread.sleep(2000);
			Actions action1=new Actions(driver);
		 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"extra_charge_validation\"]/div[1]/div/div/input"))).click().build().perform();
		 	  driver.findElement(By.xpath("//*[@id=\"extra_charge_validation\"]/div[1]/div/div/input")).sendKeys("1");
		 	 Thread.sleep(1000);
		 	driver.findElement(By.xpath("//*[@id=\"extra-charge-btn\"]")).click();
//		 	Thread.sleep(3000);
//			String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
//			System.out.println(pwdtext1);
//			//Assert.assertEquals(pwdtext1,"Sub Account successfully updated");
			}
	
	 @Test(priority=4)
	 public void userCredit() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			  Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/button"))).click().build().perform();
		 	 Thread.sleep(2000);
		  	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/div/a[6]")).click();
		  	Thread.sleep(2000);
			Actions action1=new Actions(driver);
		 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_user_credit_form\"]/div[1]/div/div/input"))).click().build().perform();
		 	  driver.findElement(By.xpath("//*[@id=\"add_user_credit_form\"]/div[1]/div/div/input")).sendKeys("1");
		 	 Thread.sleep(1000);
			 	driver.findElement(By.xpath("//*[@id=\"add-user-credit-btn\"]")).click();
//			 	Thread.sleep(3000);
//				String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
//				System.out.println(pwdtext1);
//				Assert.assertEquals(pwdtext1,"Sub Account successfully updated");
				}
	
	 @Test(priority=5)
	 public void userRollAccess() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			  Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/button"))).click().build().perform();
		 	 Thread.sleep(2000);
		 	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/div/a[5]")).click();
		 	Thread.sleep(2000);
		 	 JavascriptExecutor js1= (JavascriptExecutor) driver;
			   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(2000);
			   Actions action1=new Actions(driver);
		 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"access_form\"]/div[1]/div/div/table/tbody/tr[110]/td[2]/label/span"))).click().build().perform();
		 	  Thread.sleep(1000);
		 	 Actions action2=new Actions(driver);
		 	   action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"access_form\"]/div[2]/button"))).click().build().perform();
		 		Thread.sleep(4000);
				String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
				Assert.assertEquals(pwdtext1,"Role Access successfully updated.");
}

	 @Test(priority=5)
		public void accountSwitch() throws Exception {
			 Thread.sleep(2000);
				driver.navigate().to("https://demo.fitsyn.com/vendors");	
				driver.manage().window().maximize();
				Thread.sleep(2000);
				  Actions action=new Actions(driver);
			 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/a"))).click().build().perform();
			 	  Thread.sleep(15000);
			 	 Actions action1=new Actions(driver);
			 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/a"))).click().build().perform();}
	 
	 
	 @Test(priority=6)
	 public void accountRemove() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			  Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/button"))).click().build().perform();
		 	 Thread.sleep(2000);
		 	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/div/a[2]")).click();
		 	 Thread.sleep(2000);
		 	Actions action3=new Actions(driver);
		 	   action3.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
	String text=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
	Assert.assertEquals(text,"Are you sure?");
	
	 Thread.sleep(1000);	
		 	 Actions action1=new Actions(driver);
		 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
		 	   
		 	  Thread.sleep(2000);	 	  
		 	 Actions action4=new Actions(driver);
		 	   action4.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
	String text1=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
	Assert.assertEquals(text1,"Removed!");
	
	 Thread.sleep(1000);
		 	  
		 	 Actions action2=new Actions(driver);
		 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();}
	  
	 
	 

	 
	 
	 
	 
	 
}