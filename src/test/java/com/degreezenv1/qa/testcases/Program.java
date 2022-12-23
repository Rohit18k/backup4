package com.degreezenv1.qa.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.degreezen.qa.base.TestBase1;

public class Program extends TestBase1{


	public Program() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization2();
	}
	
	  @Test(priority=1)
	     public void  program() throws Exception {
	         Thread.sleep(5000);
	         
	         
			  File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
		     	FileInputStream fis=new FileInputStream(src);
		     	Properties pro=new  Properties();
		     	pro=new Properties();
		     	pro.load(fis);
		     	
	         Actions actn= new Actions(driver);
	       actn.moveToElement(driver.findElement(By.xpath("//a[@class='comman-btn btn-white mt-5']"))).click().build().perform();
	       
	       Thread.sleep(2000);
	    
	  
		  	driver.findElement(By.xpath("//*[@id=\"start2\"]")).click();
		      
	
						 driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(pro.getProperty("firstname"));
		      
			 
					driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(pro.getProperty("lastname"));
		      
					
		driver.findElement(By.xpath("//*[@id=\"female\"]")).click();	
					
		       	Thread.sleep(1000);
			
					
					 driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
					 
					 Select slt21=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
					 slt21.selectByValue(pro.getProperty("year"));
				
	
			 driver.findElement(By.xpath("//*[@id=\"month\"]")).click();
				 
				 Select slt31=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
				slt31.selectByValue(pro.getProperty("month"));
			 
	  
				  WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement source_dropdown=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"day\"]"))));
	        Select source = new Select(source_dropdown);
	        source.selectByIndex(18);
	        
				 
				 /*
	        String text631=driver.findElement(By.xpath("//*[@id=\"day-error\"]")).getText();
				System.out.println(text631);
				String exp631="Please Select Age Between 13 - 82 Years.";
				Assert.assertEquals(text631,exp631);
				 
				 
				 
				driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
					 
					 Select slt212=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
					 slt212.selectByValue("1977");
				 
				 
				 
					 Thread.sleep(1000);
				 
				 driver.findElement(By.xpath("//*[@id=\"month\"]")).click();
					 
					 Select slt312=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
					slt312.selectByValue("9");
				 
	            Thread.sleep(1000);
	            
	            WebElement source_dropdown1=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"day\"]"))));
	            Select source1 = new Select(source_dropdown1);
	            source1.selectByIndex(20);
					
					
	*/
				 
					 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(pro.getProperty("address"));

					 
					 driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(pro.getProperty("city"));
					 				 
						 
								     WebElement source_dropdown13=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"state\"]"))));
						 				Select source13 = new Select(source_dropdown13);
					                    source13.selectByVisibleText(pro.getProperty("state"));
						 				
					 				 Thread.sleep(1000);
					 				 					
					 					driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys(pro.getProperty("zipcode"));
					 				 	 
			 
							 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(pro.getProperty("email"));
						
			 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys(pro.getProperty("phonenumber"));
				 
			
					
					 WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"security_number_check\"]"))); 
					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element5);
					
					 
				 WebElement elt=driver.findElement(By.xpath("//*[@id=\"msform\"]/fieldset[1]/div/div[2]/div/input"));

					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", elt);
					 
					 
					 
					 Thread.sleep(3000);
										
							  driver.findElement(By.xpath("//*[@id=\"online2\"]")).click();
							   
							
									 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pro.getProperty("program")))); 
									 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
									
								
							 WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pro.getProperty("subject")))); 
									 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2);
									
							 
										   WebElement source_dropdown2=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"military_dependent_specific\"]"))));
						                Select source3 = new Select(source_dropdown2);
						                source3.selectByValue(pro.getProperty("military"));

						 
									 
									 WebElement element41 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[2]/div/div[2]/div/input[1]"))); 
									 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element41);
									 
									 
									 Thread.sleep(2000);
										
			
				 driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")).click();
				       
				Select slt11=new Select(driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")));
				slt11.selectByValue(pro.getProperty("levelofeducation"));
				
				
				 driver.findElement(By.xpath("//*[@id=\"academic_level\"]")).click();
				
				 Select slt1=new Select( driver.findElement(By.xpath("//*[@id=\"academic_level\"]")));
					slt1.selectByValue(pro.getProperty("academiclevel"));
					
	
					 driver.findElement(By.xpath("//*[@id=\"degree\"]")).click();
					
					 Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"degree\"]")));
						slt2.selectByValue(pro.getProperty("degree"));
					 
						WebElement element62 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[3]/div/div[2]/div/input[1]"))); 
						 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element62);
									 
		 
	  }}