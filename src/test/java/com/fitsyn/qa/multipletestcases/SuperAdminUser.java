package com.fitsyn.qa.multipletestcases;

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

public class SuperAdminUser extends TestBase1{
	Random r=new Random();

	public SuperAdminUser() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
		
	  @Test(priority=1)
		public void userSuperAdmin() throws Exception {
			Thread.sleep(2000);
			  driver.navigate().to("https://demo.fitsyn.com/users");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions actn=new Actions(driver);
			actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[3]"))).click().build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[1]/div/input")).click();
			String username="test"+r.nextInt(10);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[1]/div/input")).sendKeys(username);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[2]/div/input")).sendKeys("team");
			Thread.sleep(1000);
			String email="test"+r.nextInt(1000)+"@uat.com";
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).sendKeys(email);
			Thread.sleep(1000);
			Faker faker = new Faker(new Locale("en-US"));
			String num=	faker.number().digits(10);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).sendKeys(num);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mohini@123");	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[6]/div/input")).sendKeys("Mohini@123");
			Thread.sleep(1000);
			Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[7]/div/select")));
			Thread.sleep(2000);
			slt.selectByVisibleText("Super Admin");
		    JavascriptExecutor js= (JavascriptExecutor) driver;
			   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(2000);
			   Actions actn1=new Actions(driver);
			actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[2]/button[1]"))).click().build().perform();
			Thread.sleep(5000);
			String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
			Assert.assertEquals(pwdtext1,"User successfully created.");
			
	}
	  @Test(priority=2)
	  public void userEdit() throws Exception {
		  Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actn3=new Actions(driver);
		actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div//button"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/div//a[1]")).click();
		Thread.sleep(4000);
		String email="test"+r.nextInt(1000)+"@uat.com";
		Actions actn2=new Actions(driver);
		actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_form_validation\"]/div[1]/div[1]/div/div[3]/div//input"))).click();
		driver.findElement(By.xpath("//*[@id=\"user_form_validation\"]/div[1]/div[1]/div/div[3]/div//input")).clear();
		driver.findElement(By.xpath("//*[@id=\"user_form_validation\"]/div[1]/div[1]/div/div[3]/div//input")).sendKeys(email);
		Thread.sleep(1000);
		Faker faker = new Faker(new Locale("en-US"));
		String num=	faker.number().digits(10);
		driver.findElement(By.xpath("//*[@id=\"user_form_validation\"]/div[1]/div[1]/div/div[4]/div//input")).clear();
		driver.findElement(By.xpath("//*[@id=\"user_form_validation\"]/div[1]/div[1]/div/div[4]/div//input")).click();
		driver.findElement(By.xpath("//*[@id=\"user_form_validation\"]/div[1]/div[1]/div/div[4]/div//input")).sendKeys(num); 
		JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(2000);
		   Actions actn1=new Actions(driver);
		actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();  
		Thread.sleep(5000);
		String pwdtext2= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
		Assert.assertEquals(pwdtext2,"User successfully updated.");
	  
	  }
		
	  
	  @Test(priority=3)
	  public void changePassword() throws Exception {
		  Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actn3=new Actions(driver);
		actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div//button"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/div//a[3]")).click();
		Thread.sleep(2000);
		Actions actn1=new Actions(driver);
		actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"password_form_validation\"]//*[@id=\"new_password\"]"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password_form_validation\"]//*[@id=\"new_password\"]")).sendKeys("Mohini@123"); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password_form_validation\"]/div[1]/div[2]/div//input")).sendKeys("Mohini@123"); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click(); 
//		Thread.sleep(4000);
//		String pwdtext2= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
//		Assert.assertEquals(pwdtext2,"Password successfully changed.");
	  
	  }
	  
	  
	  @Test(priority=4)
	  public void addCommission() throws Exception {	  
		  Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actn3=new Actions(driver);
		actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div//button"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/div//a[4]")).click();
		Thread.sleep(1000);
		   Actions actn1=new Actions(driver);
			actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"commission\"]"))).click();
			driver.findElement(By.xpath("//*[@id=\"commission\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"commission\"]")).sendKeys("10");
			driver.findElement(By.xpath("//*[@id=\"add-card-btn\"]")).click();  
			Thread.sleep(4000);
			String pwdtext2= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
			Assert.assertEquals(pwdtext2,"Commission successfully updated");  }
	  
	  
	  @Test(priority=5)
	  public void activeAndInactive() throws Exception {
		  Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]//button")).click();
		Thread.sleep(2000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button"))).click().build().perform();  
		Thread.sleep(2000);
		Actions actn1=new Actions(driver);
		actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button"))).click().build().perform(); 
		  
	  }
	  
	  @Test(priority=6)
	  public void switchToUserAccount() throws Exception {
		  Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actn3=new Actions(driver);
		actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/a//i"))).click().build().perform();  
		Thread.sleep(12000);
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]//a")).isDisplayed();
			Actions actn2=new Actions(driver);
			actn2.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]//a"))).doubleClick().build().perform();  }
		catch(Exception e) {
			e.printStackTrace();
		}
	  
	  
	  
	  
//		  note:useraccess not available, add commision available 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  } 
	  
	  
	  
	  
}