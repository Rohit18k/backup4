package com.fitsyn.qa.multipletestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class Dialer extends TestBase1{


	public Dialer() {
	super();
	}
	
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}

	
	@Test(priority=1)
	public void searchManager() throws Exception {
		Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(3000); 
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]//input"))).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("Pr Zala (manager)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/a")).click();
	 }
	
	
	@Test(priority=2) 
	public void Dialer() throws Exception {
		Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/leads");
		driver.manage().window().maximize();
		Thread.sleep(3000); 
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/div/div[3]/div[2]/h5/strong/a"))).click().build().perform();
		Thread.sleep(3000); 
		Actions actn2=new Actions(driver);
		actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"userCampaign\"]"))).click().build().perform();
		Thread.sleep(3000); 
	List<WebElement> lst=	driver.findElements(By.xpath("//*[@id=\"userCampaign\"]/option"));
	lst.get(lst.size()-1).click();
//		Actions actn4=new Actions(driver);
//		actn4.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[5]/div/form/div/select/option[2]"))).click().build().perform();	
		Thread.sleep(3000); 
		Actions actn3=new Actions(driver);
		actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[2]/ul/li[4]/button"))).click().build().perform();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[2]/ul/li[11]/button")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[2]/ul/li[8]/button")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[2]/ul/li[6]/button")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[2]/ul/li[5]")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[2]/ul/li[7]/button")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[2]/ul/li[7]/button")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[2]/ul/li[1]/button")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[2]/ul/li[6]/button")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[2]/ul/li[1]/button")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"dialpad\"]/div/div/div[3]/ul/li[2]/button")).click();
		Thread.sleep(10000); 
		Actions actn4=new Actions(driver);
		actn4.moveToElement(driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div/div/div/div[1]/div[1]/button[2]/i"))).click().build().perform();
		Thread.sleep(2000); 
			driver.findElement(By.xpath("//*[@id=\"dialer-applicant-btn\"]")).click();
			Thread.sleep(2000); 
			 JavascriptExecutor js= (JavascriptExecutor) driver;
			   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(2000); 
			   driver.findElement(By.xpath("//*[@id=\"dialer-phone-log-btn\"]")).click();
			   Thread.sleep(2000); 
			   driver.findElement(By.xpath("//*[@id=\"dialer-text-msg-btn\"]")).click();
			   Thread.sleep(2000); 
				Actions actn5=new Actions(driver);
				actn5.moveToElement(driver.findElement(By.xpath("//*[@id=\"msg-input\"]"))).click().build().perform();
				driver.findElement(By.xpath("//*[@id=\"msg-input\"]")).sendKeys("Hello");
				   Thread.sleep(2000); 
				   driver.findElement(By.xpath("//*[@id=\"sent-message\"]//i")).click();
//				   Thread.sleep(9000); 
//				   driver.findElement(By.xpath("//*[@id=\"dialer-email-btn\"]")).click();
////				   Thread.sleep(2000); 
////				   driver.findElement(By.xpath("//*[@id=\"emails\"]/div/div/ul")).click();
//				   Thread.sleep(5000); 
//				   JavascriptExecutor js82 = (JavascriptExecutor) driver;
//				   js82.executeScript("window.scrollBy(0,-4000)");
//				   Thread.sleep(2000); 
//					Actions actn7=new Actions(driver);
//					actn7.moveToElement(driver.findElement(By.xpath("//*[@id=\"emails\"]/div/div/div/div[2]//img"))).click().build().perform();
//					  Thread.sleep(2000); 
//			
//				   driver.findElement(By.xpath("//*[@id=\"mail_subject\"]")).sendKeys("About u");
//				   
//				   Thread.sleep(2000);
//				   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//				   
//				   driver.switchTo().frame(0);
//				   Thread.sleep(2000);
//				   driver.findElement(By.xpath("/html/body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Hello,How are you?");
//				   
//				   
//				   driver.switchTo().defaultContent();
//				   Thread.sleep(2000);
//				   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//				   Thread.sleep(2000);
//				   
//				   driver.findElement(By.xpath("//*[@id=\"mail_attachments\"]")).sendKeys("C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\Imagefiles\\the-new-york-public-library-w8uU35aGU6A-unsplash.jpg");
//				   Thread.sleep(2000);
//				   
//				   driver.findElement(By.xpath("//*[@id=\"send-compose-mail\"]")).click();
//				   
//				   Thread.sleep(22000);	  
//			   
//				   driver.findElement(By.xpath("//*[@id=\"dialer-comment-btn\"]")).click();
//				   Thread.sleep(2000);
//					Actions actn6=new Actions(driver);
//					actn6.moveToElement(driver.findElement(By.xpath("//*[@id=\"comment-input\"]"))).click().build().perform();
//					driver.findElement(By.xpath("//*[@id=\"comment-input\"]")).sendKeys("Hi");
//					   Thread.sleep(2000);
//					   driver.findElement(By.xpath("//*[@id=\"add-comment\"]//i")).click();
//					   Thread.sleep(2000);
					 driver.close();
				
			   
	 }
	
	
	
	
	
	
	
	
	
	
}
