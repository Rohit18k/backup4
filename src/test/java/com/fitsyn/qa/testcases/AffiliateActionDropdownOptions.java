package com.fitsyn.qa.testcases;

import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;
import com.github.javafaker.Faker;

public class AffiliateActionDropdownOptions extends TestBase1{

	Random r=new Random();
	
	public AffiliateActionDropdownOptions() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}

	
	@Test(priority=1)
	public void editAfilliate() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/affiliate_user/");	
			driver.manage().window().maximize();
			  driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/button"))).click().build().perform();
		 	  Thread.sleep(1000);
			   Actions actn1=new Actions(driver);
				actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/div/a[1]"))).click().build().perform();
				Thread.sleep(1000);
				  Actions actn2=new Actions(driver);
				  actn2.moveToElement( driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[1]/div/input"))).click().build().perform();
				  driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[1]/div/input")).clear();
				String username="Test"+r.nextInt(10);
				 driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[1]/div/input")).sendKeys(username);
				Thread.sleep(1000);
				 driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[2]/div/input")).click();
				 driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[2]/div/input")).clear();
				   driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[2]/div/input")).sendKeys("affiliate");
				   Thread.sleep(1000);
				   driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).click();
				   driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).clear();
				   Faker faker = new Faker(new Locale("en-US"));
					String num=	faker.number().digits(10);
				   driver.findElement(By.xpath("//*[@id=\"register_form_validation\"]/div[1]/div[4]/div/input")).sendKeys(num);
				   Thread.sleep(1000);
				   Actions actn3=new Actions(driver);
					  actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
					  Thread.sleep(4000);
					  String text40=driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();
						System.out.println(text40);
						String exp40="Affiliate user updated successfully.";
						Assert.assertEquals(text40,exp40);}
	
	
	@Test(priority=2)
	public void SettingAfilliate() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/affiliate_user/");	
			driver.manage().window().maximize();
		     driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/button"))).click().build().perform();
		 	  Thread.sleep(1000);
		 	 Actions actn1=new Actions(driver);
				actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/div/a[3]"))).click().build().perform();
				Thread.sleep(1000);
				Actions actn2=new Actions(driver);
				  actn2.moveToElement( driver.findElement(By.xpath("//*[@id=\"affiliate_settings_form_validation\"]/div[1]/div[1]/div/input"))).click().build().perform();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//*[@id=\"affiliate_settings_form_validation\"]/div[1]/div[1]/div/input")).clear();
				  driver.findElement(By.xpath("//*[@id=\"affiliate_settings_form_validation\"]/div[1]/div[1]/div/input")).sendKeys("1");
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//*[@id=\"affiliate_settings_form_validation\"]/div[1]/div[2]/div/input")).click();
				  driver.findElement(By.xpath("//*[@id=\"affiliate_settings_form_validation\"]/div[1]/div[2]/div/input")).clear();
				  driver.findElement(By.xpath("//*[@id=\"affiliate_settings_form_validation\"]/div[1]/div[2]/div/input")).sendKeys("1");
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//*[@id=\"affiliate_settings_form_validation\"]/div[1]/div[3]/div/input")).click();
				  driver.findElement(By.xpath("//*[@id=\"affiliate_settings_form_validation\"]/div[1]/div[3]/div/input")).clear();
				  driver.findElement(By.xpath("//*[@id=\"affiliate_settings_form_validation\"]/div[1]/div[3]/div/input")).sendKeys("1");
				  Thread.sleep(1000);
				  Actions actn3=new Actions(driver);
				  actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"submit-btn-setting\"]"))).click().build().perform();
				  Thread.sleep(4000);
				  String text40=driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();
					System.out.println(text40);
					String exp40="Affiliate Settings successfully updated.";
					Assert.assertEquals(text40,exp40);}	
	
	
	
	
	 @Test(priority=3)
		public void affiliateStatus() throws Exception {
			 Thread.sleep(2000);
			  driver.navigate().to("https://demo.fitsyn.com/affiliate_user/");		
				driver.manage().window().maximize();
			     driver.manage().deleteAllCookies();
				Thread.sleep(2000);
				  Actions action=new Actions(driver);
			 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[4]/button"))).click().build().perform();
			 	  Thread.sleep(2000);
			 	 Actions action1=new Actions(driver);
			 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
			 	  Thread.sleep(2000);
				 	 Actions action2=new Actions(driver);
				 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();} 
	
	 @Test(priority=5)
		public void accountSearch() throws Exception {
			 Thread.sleep(2000);
				driver.navigate().to("https://demo.fitsyn.com/affiliate_user/");		
				driver.manage().window().maximize();
			     driver.manage().deleteAllCookies();
				Thread.sleep(2000);
				  Actions action=new Actions(driver);
			 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[1]/form/div/div[1]/input"))).click().build().perform();
			 	  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("8569854589");
			 	 Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[1]/form/div/div[3]/a")).click();
	}
	 
	 
	 
	 
	 
	 
	 @Test(priority=6)
		public void RemoveAfilliate() throws Exception {
			 Thread.sleep(2000);
				driver.navigate().to("https://demo.fitsyn.com/affiliate_user/");	
				driver.manage().window().maximize();
			     driver.manage().deleteAllCookies();
				Thread.sleep(2000);
				Actions action=new Actions(driver);
			 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/button"))).click().build().perform();
			 	  Thread.sleep(1000);
				 	 Actions actn1=new Actions(driver);
						actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/div/a[2]"))).click().build().perform();
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
						 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
		}	
	 @Test(priority=4)
	  public void switchToUserAccount() throws Exception {
		  Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/affiliate_user/");	
		driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		Actions actn3=new Actions(driver);
		actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/a"))).click().build().perform();  
		Thread.sleep(12000);	
		
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]//a")).isDisplayed();
			Actions actn2=new Actions(driver);
			actn2.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]//a"))).doubleClick().build().perform();  }
		catch(Exception e) {
			e.printStackTrace();
		}
}
	
	
	
	
	
	
	
	
}