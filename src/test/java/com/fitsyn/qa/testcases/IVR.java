package com.fitsyn.qa.testcases;
import java.util.List;

import java.util.Properties;
import java.util.Random;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;



public class IVR extends TestBase1{


	public IVR() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization(); 
//	}
	
    @Test(priority=1)
	public void createIVR() throws Exception {
		
		Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/ivr/");
		driver.manage().window().maximize();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a//button[@class='btn btn-info btn-sm']")).click();
		  Thread.sleep(5000);
		   Actions actn=new Actions(driver);
		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"name\"]"))).click().build().perform();
		   Random r=new Random();
		   String username="IVR_Testing"+r.nextInt(1000);
		   driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(username);
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"ivr_text\"]")).sendKeys("press 1 to call transfer to representative,press 2 to call back");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"input_timeout\"]")).sendKeys("5");
		   Thread.sleep(2000);
		   JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,70)");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[1]/div//select")).click();
		   Thread.sleep(7000);
		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[1]/div/select/option[3]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[2]/div//select")).click();
		   Thread.sleep(7000);
		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[2]/div/select/option[2]")).click();
		   Thread.sleep(5000); 
		   driver.findElement(By.xpath("//*[@id=\"actionCallTransfer_1\"]/div/input")).sendKeys(String.valueOf("4086577161"));
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[5]/div//input[@placeholder='Enter text which will play after action']")).sendKeys("call transferred to the representative");
		   Thread.sleep(5000);
		   Actions actn1=new Actions(driver);
		   actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"addInputMapping\"]"))).click().build().perform();
		   JavascriptExecutor js1= (JavascriptExecutor) driver;
		   js1.executeScript("window.scrollBy(0,300)");
		   Thread.sleep(5000);////*[@id="mapping_2"]/div[1]/div/select
		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[1]/div//select")).click();
		   Thread.sleep(7000);
		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[1]/div/select/option[4]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[2]/div//select")).click();
		   Thread.sleep(7000);
		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[2]/div/select/option[4]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[6]/div//input[@placeholder='Enter text which will play after action']")).sendKeys("Representative will shortly call you back");
		   Thread.sleep(5000);
//		   Actions actn2=new Actions(driver);
//		   actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"addInputMapping\"]"))).click().build().perform();
//		   JavascriptExecutor js2= (JavascriptExecutor) driver;
//		   js2.executeScript("window.scrollBy(0,300)");
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_3\"]/div[1]/div//select")).click();
//		   Thread.sleep(7000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_3\"]/div[1]/div/select/option[5]")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_3\"]/div[2]/div//select")).click();
//		   Thread.sleep(7000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_3\"]/div[2]/div/select/option[3]")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"actionSendSms_3\"]/div//select")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"actionSendSms_3\"]/div/select/option[4]")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_3\"]/div[6]/div//input[@placeholder='Enter text which will play after action']")).sendKeys("SMS send on your mobile number");
//		   Thread.sleep(5000);
		   JavascriptExecutor js3= (JavascriptExecutor) driver;
		   js3.executeScript("window.scrollBy(0,300)");
		   
		   Thread.sleep(5000);
		   Actions actn3=new Actions(driver);
		   actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"invalid_text\"]"))).click().build().perform();
		   driver.findElement(By.xpath("//*[@id=\"invalid_text\"]")).sendKeys("invalid input");
		   Thread.sleep(5000);
		   Actions actn4=new Actions(driver);
		   actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"no_response_text\"]"))).click().build().perform();
		   driver.findElement(By.xpath("//*[@id=\"no_response_text\"]")).sendKeys("no respone");
		   
			 JavascriptExecutor js4= (JavascriptExecutor) driver;
			   js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   
		   Thread.sleep(5000);
		   Actions actn5=new Actions(driver);
		   actn5.moveToElement(driver.findElement(By.xpath("//button[@id=\"add-ivr-btn\"]"))).click().build().perform();
		   Thread.sleep(5000);
	}
	
//	public void editAndremoveIVR() throws Exception {
//		
//		Thread.sleep(5000);
//		driver.navigate().to("https://demo.fitsyn.com/ivr/");
//		driver.manage().window().maximize();
//		  Thread.sleep(5000);
//		  driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div//button")).click();
//		  Thread.sleep(5000);
//		   Actions actn=new Actions(driver);
//		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/div/a[1]"))).click().build().perform();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
//		   driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("IVR_Testing");
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//*[@id=\"ivr_text\"]")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"ivr_text\"]")).sendKeys("press 4 to call back, press 5 to call transfer");
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//*[@id=\"input_timeout\"]")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"input_timeout\"]")).sendKeys("5");
//		   Thread.sleep(2000);
//		   JavascriptExecutor js= (JavascriptExecutor) driver;
//		   js.executeScript("window.scrollBy(0,70)");
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[1]/div//select")).click();
//		   Thread.sleep(7000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[1]/div/select/option[6]")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[2]/div//select")).click();
//		   Thread.sleep(7000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[2]/div/select/option[4]")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[5]/div//input[@placeholder='Enter text which will play after action']")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"mapping_1\"]/div[5]/div//input[@placeholder='Enter text which will play after action']")).sendKeys("Representative will shortly call you back");
//		   JavascriptExecutor js1= (JavascriptExecutor) driver;
//		   js1.executeScript("window.scrollBy(0,300)");
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[1]/div//select")).click();
//		   Thread.sleep(7000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[1]/div/select/option[7]")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[2]/div//select")).click();
//		   Thread.sleep(7000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[2]/div/select/option[2]")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"actionCallTransfer_2\"]/div//input")).sendKeys("4086577161");
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[5]/div//input")).click();
//		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[5]/div//input")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"mapping_2\"]/div[5]/div//input")).sendKeys("call transferred to the representative");
//		   Thread.sleep(5000);
//		   JavascriptExecutor js3= (JavascriptExecutor) driver;
//		   js3.executeScript("window.scrollBy(0,600)");
//		   
//		   Thread.sleep(5000);
//		   Actions actn3=new Actions(driver);
//		   actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"invalid_text\"]"))).click().build().perform();
//		   driver.findElement(By.xpath("//*[@id=\"invalid_text\"]")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"invalid_text\"]")).sendKeys("invalid input");
//		   Thread.sleep(5000);
//		   Actions actn4=new Actions(driver);
//		   actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"no_response_text\"]"))).click().build().perform();
//		   driver.findElement(By.xpath("//*[@id=\"no_response_text\"]")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"no_response_text\"]")).sendKeys("no respone");
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"add-ivr-btn\"]")).click();
//		   Thread.sleep(5000);
//	}
//	public void remove() throws Exception {
//		Thread.sleep(5000);
//		driver.navigate().to("https://demo.fitsyn.com/ivr/");
//		driver.manage().window().maximize();	
//		 Thread.sleep(5000);
//		  driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div//button")).click();
//		  Thread.sleep(5000);
//		   Actions actn1=new Actions(driver);
//		   actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/div/div/a[2]"))).click().build().perform();
//		   Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button")).click();
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'OK')]")).click();
//		 Thread.sleep(5000);	
//	}
//	
//	public void activeInactive() throws Exception {
//		 Thread.sleep(5000);
//		 driver.navigate().to("https://demo.fitsyn.com/ivr/");
//			driver.manage().window().maximize();	
//			 Thread.sleep(5000);
//		
//			 Thread.sleep(9000);
//			   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[4]//button[@title='Active']")).click();
//			   Thread.sleep(9000);
//			   driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'Yes, inactive it')]")).click();
//			   Thread.sleep(9000);
//			   driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'OK')]")).click();
//			   Thread.sleep(9000);
//			   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[4]//button[contains(text(),'Inactive')]")).click();
//			   Thread.sleep(9000);
//			   driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'Yes, active it')]")).click();
//			   Thread.sleep(9000);
//			   driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'OK')]")).click();
//			   Thread.sleep(9000);			
//		
//	}
//	
//public void sortingdata() throws Exception {
//		
//		Thread.sleep(5000);
//		  driver.navigate().to("https://demo.fitsyn.com/ivr/");
//		  driver.manage().window().maximize();
//		  Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[1]/a")).click();//name
//		List<WebElement> elemntlist1=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[1]"));
//		List<String>orignallist1=elemntlist1.stream().map(s->s.getText()).collect(Collectors.toList());
//		System.out.println(orignallist1);
//		
//		List<String>sortedlist1=orignallist1.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedlist1);
//		Thread.sleep(5000);
//		
//		Thread.sleep(5000);
//		List<WebElement> elemntlist2=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[2]"));//date
//		List<String>orignallist2=elemntlist2.stream().map(s->s.getText()).collect(Collectors.toList());
//		System.out.println(orignallist2);
//		
//		List<String>sortedlist2=orignallist2.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedlist2);
//		Thread.sleep(5000);
//		
//		Thread.sleep(5000);
//		List<WebElement> elemntlist5=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[3]"));//Attributes
//		List<String>orignallist5=elemntlist5.stream().map(s->s.getText()).collect(Collectors.toList());
//		System.out.println(orignallist5);
//		
//		List<String>sortedlist5=orignallist5.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedlist5);
//		Thread.sleep(5000);
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[4]/a")).click();//status
//		List<WebElement> elemntlist6=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[4]"));
//		List<String>orignallist6=elemntlist6.stream().map(s->s.getText()).collect(Collectors.toList());
//		System.out.println(orignallist6);
//		
//		List<String>sortedlist6=orignallist6.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedlist6);
//		Thread.sleep(5000);
//		
//	}
//	
//	public void search() throws Exception {
//		 Thread.sleep(5000);
//		 driver.navigate().to("https://demo.fitsyn.com/ivr/");
//			driver.manage().window().maximize();	
//			 Thread.sleep(5000);
//			   driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[1]/form/div/div[1]//input")).sendKeys("test_IVR");
//			   Thread.sleep(5000);
//			   driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[1]/form/div/div[2]//button")).click();
//			   Thread.sleep(5000);
//			   driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[1]/form/div/div[3]//a")).click();
//			   Thread.sleep(5000);
//	}
	
	
	
	
	
	
	
}
