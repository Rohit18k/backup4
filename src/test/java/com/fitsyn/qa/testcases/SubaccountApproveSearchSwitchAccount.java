package com.fitsyn.qa.testcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class SubaccountApproveSearchSwitchAccount extends TestBase1{

	Random r=new Random();
	public SubaccountApproveSearchSwitchAccount() {
	super();
	}

//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}

	@Test(priority=1)
	public void accountStatus() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			  Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/button"))).click().build().perform();
		 	  Thread.sleep(2000);
		 	 Actions action1=new Actions(driver);
		 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
		 	  Thread.sleep(2000);
			 	 Actions action2=new Actions(driver);
			 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();}
	
	

	
	@Test(priority=2)
	public void accountSearch() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			  Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input"))).click().build().perform();
		 	  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("TechSolution");
		 	  Thread.sleep(1000);
		 	  Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/select")));
		 	 Thread.sleep(1000);
		 	  slt.selectByVisibleText("Active");
		 	 Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[4]/a")).click();}

	
	@Test(priority=3)
	public void status() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/select")));
 Thread.sleep(1000);
  slt1.selectByVisibleText("Active");
  Thread.sleep(1000);
  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]/button")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[4]/a")).click();
  Thread.sleep(1000);
  Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/select")));
  Thread.sleep(1000);
   slt2.selectByVisibleText("Inactive");
   Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]/button")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[4]/a")).click();
   Thread.sleep(1000);
   Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/select")));
   Thread.sleep(1000);
    slt3.selectByVisibleText("New");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[4]/a")).click();}	  
	
	
	
	@Test(priority=4)
	public void downloadCSV() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/vendors");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			 Actions action1=new Actions(driver);
		 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[5]/button"))).click().build().perform();
		 	  Thread.sleep(5000);
		 	 String text1=driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText();
		 	Assert.assertEquals(text1,"Download report request generated successfully");	
		 	  Thread.sleep(2000);
		 	    driver.navigate().to("https://demo.fitsyn.com/reports/report_request");		 	    
		 	    Thread.sleep(180000);
		 	    driver.navigate().refresh();
		 	    driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/a/i")).click();
		 	    Thread.sleep(7000);
		 	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
