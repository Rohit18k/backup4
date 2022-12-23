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

public class UsersList extends TestBase1{
	Random r=new Random();

	public UsersList() {
	super();
	}

	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}
	

	@Test(priority=1)
	public void addUser() throws Exception {
		Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[3]"))).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[1]/div/input")).click();
		String username="test"+r.nextInt(10);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[1]/div/input")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[2]/div/input")).sendKeys("team");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).sendKeys("test@uat@uat.com");
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).clear();
		String email="test"+r.nextInt(1000)+"@uat.com";
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).sendKeys("#######");
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).clear();
		Faker faker = new Faker(new Locale("en-US"));
		String num=	faker.number().digits(10);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).sendKeys(num);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");	
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mohini@123");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[6]/div/input")).sendKeys("Mohini@123");
		Thread.sleep(1000);
		Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[7]/div/select")));
		Thread.sleep(2000);
		slt.selectByVisibleText("Admin");	
	    JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(2000);
		   Actions actn1=new Actions(driver);
		actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[2]/button[1]"))).click().build().perform();
		Thread.sleep(5000);
//		String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
//		Assert.assertEquals(pwdtext1,"User successfully created.");
//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");	
}
	
	
	/*
	@Test(priority=2)
	public void addUserCustomRailToggleButtonEnabled() throws Exception {
		Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[3]"))).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[1]/div/input")).click();
		String username="test"+r.nextInt(10);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[1]/div/input")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[2]/div/input")).sendKeys("team");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).sendKeys("test@uat@uat.com");
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).clear();
		String email="test"+r.nextInt(1000)+"@uat.com";
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).sendKeys("#######");
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).clear();
		Faker faker = new Faker(new Locale("en-US"));
		String num=	faker.number().digits(10);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).sendKeys(num);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");	
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mohini@123");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[6]/div/input")).sendKeys("Mohini@123");
		Thread.sleep(1000);
		Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[7]/div/select")));
		Thread.sleep(2000);
		slt.selectByVisibleText("Admin");	
		Thread.sleep(2000); 
		Actions actn2=new Actions(driver);
		actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[17]/div/label[2]/span"))).click().build().perform();
		
	    JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(2000);
		   Actions actn1=new Actions(driver);
		actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[2]/button[1]"))).click().build().perform();
		
		Thread.sleep(5000);
//		String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
//		Assert.assertEquals(pwdtext1,"User successfully created.");
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");	
}
	

	@Test(priority=3)
	public void verifyUserCustomRailToggleDisplayedInUserList() throws Exception {
		Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/label/span"))).click().build().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		  driver.navigate().forward();}
	

	 @Test(priority=4)
	  public void userEdit() throws Exception {
		  Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(5000); 
		Actions actn3=new Actions(driver);
		actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/button"))).click().build().perform();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/div//a[1]")).click();
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
		Thread.sleep(1000);
		Actions actn4=new Actions(driver);
		actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_form_validation\"]/div[1]/div[1]/div/div[6]/div/label[2]/span"))).click().build().perform();		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(2000);
		   Actions actn1=new Actions(driver);
		actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();  
		Thread.sleep(5000);
		String pwdtext2= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
		Assert.assertEquals(pwdtext2,"User successfully updated.");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");	
	  
	  }
	
	 @Test(priority=5) 
		public void createMultipleUsers() throws Exception {
		 Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[3]"))).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[1]/div/input")).click();
		String username="test"+r.nextInt(10);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[1]/div/input")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[2]/div/input")).sendKeys("team");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).sendKeys("test@uat@uat.com");
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).clear();
		String email="test"+r.nextInt(1000)+"@uat.com";
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).sendKeys("#######");
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).clear();
		Faker faker = new Faker(new Locale("en-US"));
		String num=	faker.number().digits(10);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).sendKeys(num);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[5]/div/input")).sendKeys("12345678");	
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[5]/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[5]/div/input")).sendKeys("Mohini@123");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[6]/div/input")).sendKeys("Mohini@123");
		Thread.sleep(1000);
		Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[7]/div/select")));
		Thread.sleep(2000);
		slt.selectByVisibleText("Admin");	
		Thread.sleep(1000);
		Actions actn3=new Actions(driver);
		actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[17]/div/label[2]/span"))).click().build().perform();
		
		
		
		
	    JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(2000);
		   
		   Actions actn2=new Actions(driver);
		actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[2]/button[2]"))).click().build().perform();
		 Thread.sleep(3000);
		
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[1]/div/input")).click();
			String username1="test"+r.nextInt(10);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[1]/div/input")).sendKeys(username1);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[2]/div/input")).sendKeys("team");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[3]/div/input")).sendKeys("test@uat@uat.com");
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[3]/div/input")).clear();
			String email1="test"+r.nextInt(1000)+"@uat.com";
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[3]/div/input")).sendKeys(email1);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[4]/div/input")).sendKeys("#######");
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[4]/div/input")).clear();
			Faker faker1 = new Faker(new Locale("en-US"));
			String num1=	faker1.number().digits(10);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[4]/div/input")).sendKeys(num1);
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[2]/form/div[1]/div[5]/div/input")).sendKeys("12345678");	
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[2]/form/div[1]/div[5]/div/input")).clear();
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[2]/form/div[1]/div[5]/div/input")).sendKeys("Mohini@1234");	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[6]/div/input")).sendKeys("Mohini@1234");
			Thread.sleep(1000);
			Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[7]/div/select")));
			Thread.sleep(2000);
			slt1.selectByVisibleText("Super Admin");	
			
			Thread.sleep(1000);
			Actions actn4=new Actions(driver);
			actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[2]/form/div[1]/div[17]/div/label[2]/span"))).click().build().perform();
			
			
			
		    JavascriptExecutor js2= (JavascriptExecutor) driver;
			   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(2000);

			   Actions actn1=new Actions(driver);
		actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[2]/button[1]"))).click().build().perform();
		Thread.sleep(5000);
//		String pwdtext1= driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();	
//		Assert.assertEquals(pwdtext1,"Users successfully created.");
//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");	
	}
	 
	 /*

		@Test(priority=6)
		public void multipleUsersListbutton() throws Exception {
			Thread.sleep(2000);
			  driver.navigate().to("https://demo.fitsyn.com/users");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions actn=new Actions(driver);
			actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[4]"))).click().build().perform();
			Thread.sleep(2000);
			Actions actn1=new Actions(driver);
			actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"user_role\"]"))).click().build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"user_role\"]/option[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"upload_file\"]")).sendKeys("C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\ReadExcelData\\Multiple__Users.csv");
			Thread.sleep(2000);
			JavascriptExecutor js2= (JavascriptExecutor) driver;
			   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(2000);
				Actions actn2=new Actions(driver);
				actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"create_user_btn\"]/span[1]"))).click().build().perform();
		 }

	 */
	 
	 
	 
	 
}