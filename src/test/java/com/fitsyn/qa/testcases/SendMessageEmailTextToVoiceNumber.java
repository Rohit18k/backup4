package com.fitsyn.qa.testcases;
import java.io.File;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;


public class SendMessageEmailTextToVoiceNumber extends TestBase1{

	public SendMessageEmailTextToVoiceNumber() {
		super();
		}
	
//		@BeforeTest
//		public void openBrowser() throws Exception {
//			initialization();
//		}
		
	
		@Test(priority=1)
	public void addComments() throws Exception {
		
		Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/leads#");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
//		  JavascriptExecutor js= (JavascriptExecutor) driver;
//		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		   Thread.sleep(1000);
//		   WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
//		   
//		   Actions actn=new Actions (driver);
//		           actn.moveToElement(scrollArea).click().build().perform();
//		        
//		
//		// Scroll to div's most right:
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);
//		
//		Thread.sleep(5000);
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
//		  Thread.sleep(2000);
		  Actions actn1=new Actions (driver);
          actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[2]/div[1]/div/table/tbody/tr[1]/td[20]/a[1]/i"))).click().build().perform();
		  //driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[20]/a[1]//i")).click();
		  Thread.sleep(2000);
		  
		  JavascriptExecutor js1= (JavascriptExecutor) driver;
		   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"comment-input\"]")).sendKeys("hello");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"add-comment\"]//i")).click();
		   Thread.sleep(5000);
//			driver.findElement(By.xpath("//span[contains(text(),'Comment Added')]")).isDisplayed();
//		   String text=driver.findElement(By.xpath("//span[contains(text(),'Comment Added')]")).getText();
//			System.out.println(text);
//			String exp="Comment Added";
//			Assert.assertEquals(text,exp);			
//			 Thread.sleep(5000);
//			 driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[2]/div/div[1]/div/a/i")).click();
//			 Thread.sleep(2000);
//			 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[20]/a[1]//i")).click();
//			 Thread.sleep(2000);
//			 driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div[2]/div/button/i")).click();
//			 Thread.sleep(2000);
//			   driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div[2]/div/div/a")).click();
//			   Thread.sleep(2000);
//			   String text2=driver.findElement(By.xpath("/html/body/div[12]//h2")).getText();
//				System.out.println(text2);
//				String exp2="Are you sure?";
//				Assert.assertEquals(text2,exp2);
//				 Thread.sleep(2000);
//				 
//				 driver.findElement(By.xpath("/html/body/div[12]/div[7]/div//button")).click();
//				  Thread.sleep(2000);
//				  String text1=driver.findElement(By.xpath("/html/body/div[12]//h2")).getText();
//					System.out.println(text1);
//					String exp1="Succeed!";
//					Assert.assertEquals(text1,exp1);	
//					 Thread.sleep(2000);		  
//				   driver.findElement(By.xpath("/html/body/div[12]/div[7]/div//button")).click();
//				   Thread.sleep(2000);
}
		
		@Test(priority=2)	
public void composeEmail() throws Exception {
	
	Thread.sleep(5000);
	driver.navigate().to("https://demo.fitsyn.com/leads");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  Actions actn1=new Actions (driver);
      actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[2]/div[1]/div/table/tbody/tr[1]/td[20]/a[1]/i"))).click().build().perform();
	  JavascriptExecutor js= (JavascriptExecutor) driver;
//	   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	   
//	   WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
//	   
//	   Actions actn=new Actions (driver);
//	           actn.moveToElement(scrollArea).click().build().perform();
//	        
//	
//	// Scroll to div's most right:
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);
//	  Thread.sleep(2000);
	  Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"email-tab\"]")).click();
	   Thread.sleep(5000); 
	   driver.findElement(By.xpath("//*[@id=\"emails\"]/div/div/div/div[2]")).click();

	   driver.findElement(By.xpath(" //input[@id=\"mail_subject\"]")).sendKeys("About u");
	   
	   Thread.sleep(5000);
	   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   
	   driver.switchTo().frame(0);
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("/html/body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Hello,How are you?");
	   
	   
	   driver.switchTo().defaultContent();
	   Thread.sleep(5000);
	   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   Thread.sleep(5000);
	   File file = new File("./Imagefiles/the-new-york-public-library-w8uU35aGU6A-unsplash.jpg");
	   driver.findElement(By.xpath("//input[@id=\"mail_attachments\"]")).sendKeys(file.getAbsolutePath());
	//   driver.findElement(By.xpath("//input[@id=\"mail_attachments\"]")).sendKeys("C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\Imagefiles\\the-new-york-public-library-w8uU35aGU6A-unsplash.jpg");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"send-compose-mail\"]")).click();
	   
	   Thread.sleep(22000);	  
//	Thread.sleep(5000);
//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");

//	   String text=driver.findElement(By.xpath("/html/body/div[11]/span[3]")).getText();
//		System.out.println(text);
//		String exp="Mail send successfully.";
//		Assert.assertEquals(text,exp);
//		 Thread.sleep(2000);
		 
}
		
		/*
		@Test(priority=3)
public void checkInboxandSentbox() throws Exception {
	
	Thread.sleep(5000);
	driver.navigate().to("https://demo.fitsyn.com/leads");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
//	  JavascriptExecutor js= (JavascriptExecutor) driver;
//	   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	   
//	   WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
//	   
//	   Actions actn=new Actions (driver);
//	           actn.moveToElement(scrollArea).click().build().perform();
//	        
//	
//	// Scroll to div's most right:
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);
//	
//	Thread.sleep(5000);
//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
	   
	  Actions actn1=new Actions (driver);
      actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[2]/div[1]/div/table/tbody/tr[1]/td[20]/a[1]/i"))).click().build().perform();
	  Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"email-tab\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"mail-conv-type\"]")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"mail-conv-type\"]/option[2]")).click();//sent
	   Thread.sleep(5000);	     
	   
	   driver.findElement(By.xpath("//*[@id=\"emails\"]/div/div/ul/li[1]/div[1]")).click();//*imp
	   Thread.sleep(2000);	     
	   
	 //  driver.findElement(By.xpath("//*[@id=\"emails\"]/div/div/ul/li[2]//label")).click();
	   
      Thread.sleep(2000);	     
	   
//	   driver.findElement(By.xpath("//*[@id=\"emails\"]/div/div/div/div[3]/img")).click();
//	
//	   Thread.sleep(5000);
//	   String text2=driver.findElement(By.xpath("/html/body/div[12]//h2")).getText();
//		System.out.println(text2);
//		String exp2="Are you sure?";
//		Assert.assertEquals(text2,exp2);
//		 Thread.sleep(2000);
//		 
//		 driver.findElement(By.xpath("/html/body/div[12]/div[7]/div//button")).click();//remove
//		  Thread.sleep(5000);
//		  String text1=driver.findElement(By.xpath("/html/body/div[12]//h2")).getText();
//			System.out.println(text1);
//			String exp1="Succeed!";
//			Assert.assertEquals(text1,exp1);	
//			 Thread.sleep(2000);		  
//		   driver.findElement(By.xpath("/html/body/div[12]/div[7]/div//button")).click();
//		   Thread.sleep(2000);
	
}

*/
		
		@Test(priority=4)
public void addTexts() throws Exception {
	
	Thread.sleep(5000);
	driver.navigate().to("https://demo.fitsyn.com/leads");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
//	  JavascriptExecutor js= (JavascriptExecutor) driver;
//	   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	   
//	   WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
//	   
//	   Actions actn=new Actions (driver);
//	           actn.moveToElement(scrollArea).click().build().perform();
//	        
//	
//	// Scroll to div's most right:
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);
//	
//	Thread.sleep(5000);
//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
	  Actions actn1=new Actions (driver);
      actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[2]/div[1]/div/table/tbody/tr[1]/td[20]/a[1]/i"))).click().build().perform();
	  Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"text-msg-tab\"]")).click();
	   
//	  JavascriptExecutor js1= (JavascriptExecutor) driver;
//	   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"msg-input\"]")).sendKeys("hello");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"sent-message\"]//i")).click();
	   Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(text(),'Text message send successfully')]")).isDisplayed();
//	   String text=driver.findElement(By.xpath("//span[contains(text(),'Text message send successfully')]")).getText();
//		System.out.println(text);
//		String exp="Text message send successfully";
//		Assert.assertEquals(text,exp);			
//		 Thread.sleep(5000);
		 
//		 driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[2]/div/div[1]/div/a/i")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[20]/a[1]//i")).click();
//		 Thread.sleep(2000);
//	WebElement remove=driver.findElement(By.xpath("//*[@id=\"text-msg-tab\"]"));
//		  Actions actn2=new Actions (driver);
//           actn2.moveToElement(remove).click().build().perform();
//           Thread.sleep(5000);
          
		 
}
		@Test(priority=5)
public void textLogs() throws Exception {
	
	Thread.sleep(5000);
	driver.navigate().to("https://demo.fitsyn.com/leads");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
//	  JavascriptExecutor js= (JavascriptExecutor) driver;
//	   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	   
//	   WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
//	   
//	   Actions actn=new Actions (driver);
//	           actn.moveToElement(scrollArea).click().build().perform();
//	        
//	
//	// Scroll to div's most right:
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);
//	
//	Thread.sleep(5000);
//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
	   
	  Actions actn1=new Actions (driver);
      actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[2]/div[1]/div/table/tbody/tr[1]/td[20]/a[1]/i"))).click().build().perform();
	  Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"phone-log-tab\"]")).click();
	   Thread.sleep(5000);
}
		@Test(priority=6)
public void applicantDetails() throws Exception {
	
	Thread.sleep(5000);
	driver.navigate().to("https://demo.fitsyn.com/leads");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  JavascriptExecutor js= (JavascriptExecutor) driver;
//	   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	   
//	   WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
//	   
//	   Actions actn=new Actions (driver);
//	           actn.moveToElement(scrollArea).click().build().perform();
//	        
//	
//	// Scroll to div's most right:
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);
//	
//	Thread.sleep(5000);
//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
	  Actions actn1=new Actions (driver);
      actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[2]/div[1]/div/table/tbody/tr[1]/td[20]/a[1]/i"))).click().build().perform();
	  Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"applicant-tab\"]")).click();
	   Thread.sleep(5000);
	   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}
		@Test(priority=7)
public void searchCampaign() throws Exception {
	Thread.sleep(5000);
	driver.navigate().to("https://demo.fitsyn.com/leads");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	WebElement text=  driver.findElement(By.xpath("//*[@id=\"leads_filter_form\"]/div/div[3]/div/div/div[2]/ul/li//input"));
	  Actions actn=new Actions(driver);
	  actn.moveToElement(text).click().build().perform();	  
	  actn.moveToElement(text).sendKeys("Campaign_under_test",Keys.ENTER).build().perform();
	  
	  
	  Thread.sleep(2000);
	  WebElement text1=  driver.findElement(By.xpath("//*[@id=\"leads_filter_form\"]/div/div[4]/div/div/div[2]//ul"));
	  
	  Actions actn1=new Actions(driver);
	  actn1.moveToElement(text1).click().build().perform();	  
	  actn1.moveToElement(text1).sendKeys("New",Keys.ENTER).build().perform();
	  
	   Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"leads_filter_form\"]/div/div[7]/div/div//button")).click();
	  
	  Thread.sleep(5000);	
	
	
}
		

}









