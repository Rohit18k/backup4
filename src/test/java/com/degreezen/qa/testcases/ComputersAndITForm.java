package com.degreezen.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.degreezen.qa.base.TestBase1;

public class ComputersAndITForm extends TestBase1{


	public ComputersAndITForm() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization1();
	}
	
	  @Test(priority=1)
	     public void  computersAndITForm() throws Exception {
	         Thread.sleep(5000);
	         Actions actn= new Actions(driver);
	       actn.moveToElement(driver.findElement(By.xpath("//a[@class='comman-btn btn-white mt-5']"))).click().build().perform();
	 	
			 Thread.sleep(2000);
	       
	 driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")).click();
	       
	Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")));
	slt.selectByValue("Some High School");
	
	Thread.sleep(1000);
	
	 driver.findElement(By.xpath("//*[@id=\"academic_level\"]")).click();
	
	 Select slt1=new Select( driver.findElement(By.xpath("//*[@id=\"academic_level\"]")));
		slt1.selectByValue("2003");
		
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//*[@id=\"degree\"]")).click();
		
		 Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"degree\"]")));
			slt2.selectByValue("Doctorate");
	
			
			 Thread.sleep(1000);
			 
			 
			 
				driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("12523");
			 
			 
		 Thread.sleep(1000);
		 
		 
	       WebDriverWait wait = new WebDriverWait(driver, 5);
			
			 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"computers_it\"]"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
			
		 
			 WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"informationsystems\"]"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2);
			
			 
			 WebElement element7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"webdevelopment\"]"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element7);
			 
			 
		 
			 WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Get Started']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element3);
			 
	
		      Thread.sleep(1000);
			
		 driver.findElement(By.xpath("//*[@id=\"start3\"]")).click();

		 
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
		 
		 
	
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Riya");
		 
		 Thread.sleep(1000);

		 
			 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("4419 RANGELINE RD");
			
			 
			
					 
					 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("riya@gmail.com");
				
				 Thread.sleep(1000);
				 

						
		 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("9563258523");

			
			
			
			 WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"security_number_check\"]"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element5);
			
			
	   
WebElement elt=driver.findElement(By.xpath("//input[@value='Get Info']"));

((JavascriptExecutor)driver).executeScript("arguments[0].click();", elt);

}}
