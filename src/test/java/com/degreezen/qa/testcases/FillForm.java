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

public class FillForm extends TestBase1{


	public FillForm() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization1();
	}
	
	  @Test(priority=1)
	     public void  FillForm() throws Exception {
	         Thread.sleep(5000);
	         Actions actn= new Actions(driver);
	       actn.moveToElement(driver.findElement(By.xpath("//a[@class='comman-btn']"))).click().build().perform();
	       Thread.sleep(2000);
	  
	 driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")).click();
	       
	Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")));
	slt.selectByValue("Art & Design");
	
	Thread.sleep(1000);
	
	
	 driver.findElement(By.xpath("//*[@id=\"academic_level\"]")).click();
	
	 Select slt1=new Select( driver.findElement(By.xpath("//*[@id=\"academic_level\"]")));
		slt1.selectByValue("Bachelor's");
		
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//*[@id=\"degree\"]")).click();
		
		 Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"degree\"]")));
			slt2.selectByValue("Graphic Design");
	
			
		driver.findElement(By.xpath("//input[@value='Get Started']")).click();
		
		 Thread.sleep(1000);
		 
		 
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
		 
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
		 
		 
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).click();
		 
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ronit");
		 
		 
		 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("8562345875");
		 
		 driver.findElement(By.xpath("//input[@id='zip_code']")).sendKeys("50527");
		 
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email' or @class ='email-field form-control' or @name='email']"))); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	    
	       driver.findElement(By.xpath("//input[@placeholder='Email' or @class ='email-field form-control' or @name='email']")).sendKeys("ronit@gmail.com"); 
	       
	       
	    
	       
WebElement elt=driver.findElement(By.xpath("//input[@value='Get Info']"));

((JavascriptExecutor)driver).executeScript("arguments[0].click();", elt);

	
	       
	  }
	
	
	
	
	
	
	
	
	
	

}
