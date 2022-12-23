package com.fitsyn.qa.multipletestcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class MultipleUsersAndSearchUsers extends TestBase1{
	Random r=new Random();

	public MultipleUsersAndSearchUsers() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	/*
	@Test(priority=1)
	public void multipleUsersList() throws Exception {
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
		driver.findElement(By.xpath("//*[@id=\"upload_file\"]")).sendKeys("C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\ReadExcelData\\MultipleUsersListt.csv");
		Thread.sleep(2000);
		JavascriptExecutor js2= (JavascriptExecutor) driver;
		   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(2000);
			Actions actn2=new Actions(driver);
			actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"create_user_btn\"]/span[1]"))).click().build().perform();
	 }
	*/
	
	@Test(priority=2)
	public void searchUsersByName() throws Exception {
		Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]//input"))).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("test6 team");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]/a")).click();
	 }
	
	@Test(priority=3)
	public void searchUsersByRole() throws Exception {
		Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]//input"))).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("Super Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]/a")).click();
	 }
	
	@Test(priority=4)
	public void searchUsersByNumber() throws Exception {
		Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]//input"))).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("8768001128");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]/a")).click();
	 }
	
	@Test(priority=5)
	public void searchUsersByEmail() throws Exception {
		Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]//input"))).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("test@appttest.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]/a")).click();
	 }
	
	//note: to do:ask about multiple users that where is csv file saved
	
	
	
	
	
	
	
	
	
}
