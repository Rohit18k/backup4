package com.fitsyn.qa.multipletestcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class InviteUsers extends TestBase1{
	Random r=new Random();

	public InviteUsers() {
	super();
	}
	
//	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
//	


	  @Test(priority=1)
			public void userList() throws Exception {
				Thread.sleep(2000);
				  driver.navigate().to("https://demo.fitsyn.com/users");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				Actions actn=new Actions(driver);
				actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[2]/strong"))).click().build().perform();
				Thread.sleep(2000);
				Actions actn1=new Actions(driver);
				actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input"))).click().build().perform();
				String email="UsersTest"+r.nextInt(1000)+"@uat.com";
				driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input")).sendKeys(email);
				Thread.sleep(2000);
				Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[2]/div/select")));
				Thread.sleep(2000);
				slt.selectByVisibleText("Super Admin");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"add-invite-user-btn\"]")).click();  
				Thread.sleep(5000);
				String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
				Assert.assertEquals(pwdtext1,"Email sent successfully.");
	  }
	  
	  @Test(priority=2)
		public void userList2() throws Exception {
			Thread.sleep(2000);
			  driver.navigate().to("https://demo.fitsyn.com/users");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions actn=new Actions(driver);
			actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[2]/strong"))).click().build().perform();
			Thread.sleep(2000);
			Actions actn1=new Actions(driver);
			actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input"))).click().build().perform();
			String email="UsersTest"+r.nextInt(1000)+"@uat.com";
			driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input")).sendKeys(email);
			Thread.sleep(2000);
			Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[2]/div/select")));
			Thread.sleep(2000);
			slt.selectByVisibleText("Team Manager");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"add-invite-user-btn\"]")).click(); 
			Thread.sleep(5000);
			String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
			Assert.assertEquals(pwdtext1,"Email sent successfully.");
	  
	  }
			
	  
			 @Test(priority=3)
				public void userList3() throws Exception {
					Thread.sleep(2000);
					  driver.navigate().to("https://demo.fitsyn.com/users");
					driver.manage().window().maximize();
					Thread.sleep(2000);
					Actions actn=new Actions(driver);
					actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[2]/strong"))).click().build().perform();
					Thread.sleep(2000);
					Actions actn1=new Actions(driver);
					actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input"))).click().build().perform();
					String email="UsersTest"+r.nextInt(1000)+"@uat.com";
					driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input")).sendKeys(email);
					Thread.sleep(2000);
					Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[2]/div/select")));
					Thread.sleep(2000);
					slt.selectByVisibleText("Admin");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"add-invite-user-btn\"]")).click();
					Thread.sleep(5000);
					String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
					Assert.assertEquals(pwdtext1,"Email sent successfully.");
			 
			 }
	  
	  
			 @Test(priority=4)
				public void userList4() throws Exception {
					Thread.sleep(2000);
					  driver.navigate().to("https://demo.fitsyn.com/users");
					driver.manage().window().maximize();
					Thread.sleep(2000);
					Actions actn=new Actions(driver);
					actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[2]/strong"))).click().build().perform();
					Thread.sleep(2000);
					Actions actn1=new Actions(driver);
					actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input"))).click().build().perform();
					String email="UsersTest"+r.nextInt(1000)+"@uat.com";
					driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input")).sendKeys(email);
					Thread.sleep(2000);
					Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[2]/div/select")));
					Thread.sleep(2000);
					slt.selectByVisibleText("Manager");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"add-invite-user-btn\"]")).click(); 
					Thread.sleep(5000);
					String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
					Assert.assertEquals(pwdtext1,"Email sent successfully.");
			 
			 }
	  
	  
	  
			 @Test(priority=5)
				public void userList5() throws Exception {
					Thread.sleep(2000);
					  driver.navigate().to("https://demo.fitsyn.com/users");
					driver.manage().window().maximize();
					Thread.sleep(2000);
					Actions actn=new Actions(driver);
					actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[2]/strong"))).click().build().perform();
					Thread.sleep(2000);
					Actions actn1=new Actions(driver);
					actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input"))).click().build().perform();
					String email="UsersTest"+r.nextInt(1000)+"@uat.com";
					driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input")).sendKeys(email);
					Thread.sleep(2000);
					Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[2]/div/select")));
					Thread.sleep(2000);
					slt.selectByVisibleText("Team Member");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"add-invite-user-btn\"]")).click(); 
			 }
	  
	
	  
			 @Test(priority=6)
				public void userList6() throws Exception {
					Thread.sleep(2000);
					  driver.navigate().to("https://demo.fitsyn.com/users");
					driver.manage().window().maximize();
					Thread.sleep(2000);
					Actions actn=new Actions(driver);
					actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[2]/strong"))).click().build().perform();
					Thread.sleep(2000);
					Actions actn1=new Actions(driver);
					actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input"))).click().build().perform();
					String email="UsersTest"+r.nextInt(1000)+"@uat.com";
					driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input")).sendKeys(email);
					Thread.sleep(2000);
					Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[2]/div/select")));
					Thread.sleep(2000);
					slt.selectByVisibleText("Processor");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"add-invite-user-btn\"]")).click(); 
					Thread.sleep(5000);
					String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
					Assert.assertEquals(pwdtext1,"Email sent successfully.");
			 }
	  
	  
	  
			 @Test(priority=7)
				public void userList7() throws Exception {
					Thread.sleep(2000);
					  driver.navigate().to("https://demo.fitsyn.com/users");
					driver.manage().window().maximize();
					Thread.sleep(2000);
					Actions actn=new Actions(driver);
					actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[2]/strong"))).click().build().perform();
					Thread.sleep(2000);
					Actions actn1=new Actions(driver);
					actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input"))).click().build().perform();
					String email="UsersTest"+r.nextInt(1000)+"@uat.com";
					driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input")).sendKeys(email);
					Thread.sleep(2000);
					Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[2]/div/select")));
					Thread.sleep(2000);
					slt.selectByVisibleText("Seller");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"add-invite-user-btn\"]")).click(); 
					Thread.sleep(5000);
					String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
					Assert.assertEquals(pwdtext1,"Email sent successfully.");
			 }
	  
			 @Test(priority=8)
				public void userList8() throws Exception {
					Thread.sleep(2000);
					  driver.navigate().to("https://demo.fitsyn.com/users");
					driver.manage().window().maximize();
					Thread.sleep(2000);
					Actions actn=new Actions(driver);
					actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[2]/strong"))).click().build().perform();
					Thread.sleep(2000);
					Actions actn1=new Actions(driver);
					actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input"))).click().build().perform();
					String email="UsersTest"+r.nextInt(1000)+"@uat.com";
					driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[1]/div/input")).sendKeys(email);
					Thread.sleep(2000);
					Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"add_invite_user_form\"]/div[1]/div/div[2]/div/select")));
					Thread.sleep(2000);
					slt.selectByVisibleText("Representative");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"add-invite-user-btn\"]")).click(); 
			 
			 }
	  
	  
	  //note:represntative, team leader toast msg doesn't not shown
			 //note:toast msg is not perfect
	  
}