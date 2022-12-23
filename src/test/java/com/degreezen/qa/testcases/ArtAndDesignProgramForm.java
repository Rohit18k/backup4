package com.degreezen.qa.testcases;

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

public class ArtAndDesignProgramForm extends TestBase1{


	public ArtAndDesignProgramForm() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization1();
	}
	
	  @Test(priority=1)
	     public void  artDesignForm() throws Exception {
	         Thread.sleep(5000);
	         
	         
	         Actions actn= new Actions(driver);
	       actn.moveToElement(driver.findElement(By.xpath("//a[@class='comman-btn btn-white mt-5']"))).click().build().perform();
	       Thread.sleep(2000);
	  
	       WebDriverWait wait = new WebDriverWait(driver, 5);
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Get Started']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	       
	     //  driver.findElement(By.xpath("//input[@value='Get Started']")).click();
	       
			 JavascriptExecutor j = (JavascriptExecutor) driver;
		      j.executeScript("window.scrollBy(0,-800)");
	       
	       
	       
	       String text1=driver.findElement(By.xpath("//*[@id=\"level_of_education-error\"]")).getText();
			System.out.println(text1);
			String exp1="Please Select Level of Education.!!";
			Assert.assertEquals(text1,exp1);
			
			 Thread.sleep(2000);
	       
	 driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")).click();
	       
	Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")));
	slt.selectByValue("Some College");
	
	Thread.sleep(1000);
	
	 driver.findElement(By.xpath("//*[@id=\"academic_level\"]")).click();
	
	 Select slt1=new Select( driver.findElement(By.xpath("//*[@id=\"academic_level\"]")));
		slt1.selectByValue("2018");
		
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//*[@id=\"degree\"]")).click();
		
		 Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"degree\"]")));
			slt2.selectByValue("Bachelors");
	
			
			driver.findElement(By.xpath("//*[@id=\"online1\"]")).click();
			
			
			 Thread.sleep(1000);
			 
			 

			 String text2=driver.findElement(By.xpath("//*[@id=\"zip_code-error\"]")).getText();
				System.out.println(text2);
				String exp2="Please Enter ZipCode.!!";
				Assert.assertEquals(text2,exp2);
				
				driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("785");

			 String text11=driver.findElement(By.xpath("//*[@id=\"zip_code-error\"]")).getText();
				System.out.println(text11);
				String exp11="Only 5 Digit Zip Allowed.!!";
				Assert.assertEquals(text11,exp11);
				
				driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).clear();
			 
				driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("78535");
			 
			 
		 Thread.sleep(1000);
		 
		 
		 
		 String text3=driver.findElement(By.xpath("//*[@id=\"program-error\"]")).getText();
			System.out.println(text3);
			String exp3="Please Select Program.!!";
			Assert.assertEquals(text3,exp3);
		 
			
			 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"art\"]"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
			
		 
			 WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"architecture\"]"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2);
			
		 
			 WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Get Started']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element3);
			
			 Thread.sleep(1000);
		 
			 
			 WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Get Info']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element4);
			 
			 
			 JavascriptExecutor j1 = (JavascriptExecutor) driver;
		      j1.executeScript("window.scrollBy(0,-800)");
			 
	
		      Thread.sleep(1000);
			
		 driver.findElement(By.xpath("//input[@id='start2']")).click();
		 
		 String text4=driver.findElement(By.xpath("//*[@id=\"firstname-error\"]")).getText();
			System.out.println(text4);
			String exp4="Please Enter First Name.!!";
			Assert.assertEquals(text4,exp4);
		 
		 
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
		 
		 
		 String text5=driver.findElement(By.xpath("//*[@id=\"lastname-error\"]")).getText();
			System.out.println(text5);
			String exp5="Please Enter Last Name.!!";
			Assert.assertEquals(text5,exp5);
		 
		 
		 
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).click();
		 
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ronit");
		 
		 Thread.sleep(1000);
		 
		 String text6=driver.findElement(By.xpath("//*[@id=\"address-error\"]")).getText();
			System.out.println(text6);
			String exp6="Please Enter Address.!!";
			Assert.assertEquals(text6,exp6);
		 
		 
			 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("71 ST. NICHOLAS DRIVE");
			
			 
			 
			 String text7=driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText();
				System.out.println(text7);
				String exp7="Please Enter Your Email.!!";
				Assert.assertEquals(text7,exp7);
			
				 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com@gamil.com");
				 
				 
				 
				 String text13=driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText();
					System.out.println(text13);
					String exp13="Please Enter Valid Email.!!";
					Assert.assertEquals(text13,exp13);
				 
					 driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
					 
					 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com");
				
				 Thread.sleep(1000);
				 
				 String text8=driver.findElement(By.xpath("//*[@id=\"phone_number-error\"]")).getText();
					System.out.println(text8);
					String exp8="Please Enter Phone Number.!!";
					Assert.assertEquals(text8,exp8);
				 
					 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("8562");
					
					
					 String text14=driver.findElement(By.xpath("//*[@id=\"phone_number-error\"]")).getText();
						System.out.println(text14);
						String exp14="Please Enter 10 Digit Phone Number.!!";
						Assert.assertEquals(text14,exp14);
					 
						 driver.findElement(By.xpath("//input[@id='phone_number']")).clear();
						
		 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("8562345875");
		 
		 
		 
		 String text9=driver.findElement(By.xpath("//*[@id=\"security_number_check-error\"]")).getText();
			System.out.println(text9);
			String exp9="Please check the agreement.";
			Assert.assertEquals(text9,exp9);
			
			
			
			 WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"security_number_check\"]"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element5);
			
			
	   
WebElement elt=driver.findElement(By.xpath("//input[@value='Get Info']"));

((JavascriptExecutor)driver).executeScript("arguments[0].click();", elt);


Thread.sleep(1000);

String text10=driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div/div/div[2]/div/h2")).getText();
System.out.println(text10);
String exp10="Thank you";
Assert.assertEquals(text10,exp10);


	  }
	  

}
