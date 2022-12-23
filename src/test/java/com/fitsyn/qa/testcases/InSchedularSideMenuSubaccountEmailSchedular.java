package com.fitsyn.qa.testcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class InSchedularSideMenuSubaccountEmailSchedular extends TestBase1{

	Random r=new Random();
	
	public InSchedularSideMenuSubaccountEmailSchedular() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	@Test(priority=1)
	public void addSchedular() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/scheduler");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a/strong"))).click().build().perform();
		 	  Thread.sleep(2000);
		 	 JavascriptExecutor js1= (JavascriptExecutor) driver;
			   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(2000);
			   Actions actn1=new Actions(driver);
			actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");
			 Thread.sleep(2000);	 	  		 	  
		 	 Actions actn2=new Actions(driver);
				actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_days\"]"))).click().build().perform();
				driver.findElement(By.xpath("//*[@id=\"scheduler_days\"]")).sendKeys("1");
				 Thread.sleep(2000);
				 JavascriptExecutor js2= (JavascriptExecutor) driver;
				   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				   Thread.sleep(2000);
				   Actions actn3=new Actions(driver);
				actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-900)");
				Thread.sleep(1000);
				String subject=driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[3]/div/label[2]")).getText();
				Assert.assertEquals(subject,"Please enter subject");
				Thread.sleep(1000);				
				 Actions actn4=new Actions(driver);
					actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[3]/div/input"))).click().build().perform();
				driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[3]/div/input")).sendKeys("regarding new added subaccount user");
				 Thread.sleep(2000);
				 driver.switchTo().frame(0);
				 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("new subaccount user added to the list");	
				 driver.switchTo().defaultContent();
				 Thread.sleep(1000);
		 JavascriptExecutor js3= (JavascriptExecutor) driver;
				   js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				   Thread.sleep(1000);
				String textbody=driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[5]/div/label[2]")).getText();
				Assert.assertEquals(textbody,"Please enter text body");
					Thread.sleep(1000);
					 Actions actn5=new Actions(driver);
						actn5.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[5]/div/textarea"))).click().build().perform();
				driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[5]/div/textarea")).sendKeys("new subaccount user added to the list");
				Thread.sleep(1000);
				 Actions actn6=new Actions(driver);
					actn6.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
					Thread.sleep(4000);
					String schedular=driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
					Assert.assertEquals(schedular,"Scheduler successfully created");}
	

	@Test(priority=2)
	public void editSchedular() throws Exception {
		 Thread.sleep(2000);
			driver.navigate().to("https://demo.fitsyn.com/scheduler");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[4]/a"))).click().build().perform();
		 	  Thread.sleep(2000);
		 	 Actions actn2=new Actions(driver);
				actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_days\"]"))).click().build().perform();
				driver.findElement(By.xpath("//*[@id=\"scheduler_days\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"scheduler_days\"]")).sendKeys("2");
				 Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[3]/div/input")).click();
					driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[3]/div/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[3]/div/input")).sendKeys("new feature added to the list");
					 Thread.sleep(2000);
					 driver.switchTo().frame(0);
					 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).click();		
					 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).clear();		
					 driver.findElement(By.xpath("/html/body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")).sendKeys("new feature added to the list");		
					 driver.switchTo().defaultContent();
					  Thread.sleep(1000);
					 JavascriptExecutor js3= (JavascriptExecutor) driver;
					   js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					   Thread.sleep(1000);
					   Actions actn5=new Actions(driver);
						actn5.moveToElement(driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[5]/div/textarea"))).click().build().perform();
						driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[5]/div/textarea")).clear();
						driver.findElement(By.xpath("//*[@id=\"scheduler_form_validation\"]/div[1]/div[5]/div/textarea")).sendKeys("new feature added to the list");
						Thread.sleep(1000);
						 Actions actn6=new Actions(driver);
							actn6.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
							Thread.sleep(2000);
							driver.navigate().refresh();
							}
	
	
	 @Test(priority=3)
	 public void removeSchedular() throws Exception {
		 Thread.sleep(2000);
		 driver.navigate().to("https://demo.fitsyn.com/scheduler");	
			driver.manage().window().maximize();
			Thread.sleep(2000);
			  Actions action=new Actions(driver);
		 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[4]/button"))).click().build().perform();
		 	 Thread.sleep(2000);
		 	Actions action3=new Actions(driver);
		 	   action3.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
	String text=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
	Assert.assertEquals(text,"Are you sure?");
	
	 Thread.sleep(2000);	
		 	 Actions action1=new Actions(driver);
		 	   action1.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
		 	   
		 	  Thread.sleep(2000);	 	  
		 	 Actions action4=new Actions(driver);
		 	   action4.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/h2"))).click().build().perform();	 	   
	String text1=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
	Assert.assertEquals(text1,"Removed!");
	
	 Thread.sleep(2000);
		 	  
		 	 Actions action2=new Actions(driver);
		 	   action2.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
		 	  Thread.sleep(2000);
		 	  driver.navigate().refresh();}
	
	
	
	
	
	
	
}
