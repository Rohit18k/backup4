package com.fitsyn.qa.testcases;


import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;


public class DripLogic extends TestBase1{


	public DripLogic() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	
    @Test(priority=1)
    public void createDripLogic() throws Exception { 
    	
    	Thread.sleep(5000);//pending to test
		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[1]/strong")).click();
		  Thread.sleep(5000);
		   Actions actn=new Actions(driver);
		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"save_drip_schedular_form\"]/div[1]/div/div/div[1]/div//input"))).click().build().perform();
		   Random r=new Random();
		   String username="Test_Driplogic"+r.nextInt(1000);
		   driver.findElement(By.xpath("//*[@id=\"save_drip_schedular_form\"]/div[1]/div/div/div[1]/div//input")).sendKeys(username);
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"schedular_campaign\"]")).click();
		   Thread.sleep(5000);
		List<WebElement> lst=  driver.findElements(By.xpath("//*[@id=\"schedular_campaign\"]/option"));
		lst.get(lst.size()-1).click();
		   Thread.sleep(5000);
			LocalDate localDate = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY");
			String startdripdate=  localDate.format(formatter);
			System.out.println(startdripdate);
		   driver.findElement(By.xpath("//*[@id=\"scheduler_start_date\"]//input")).sendKeys(startdripdate);
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"save_drip_schedular_form\"]/div[1]/div/div/div[4]/div//input")).sendKeys("10");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"schedular_drip_limit\"]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"schedular_drip_limit\"]/option[2]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"drip-scheduler-submit-btn\"]")).click();
		   Thread.sleep(7000);
 }
 
    @Test(priority=2)
    public void editandAddSMSDrip() throws Exception {
    	Thread.sleep(7000);
		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/div/button")).click();//Action
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/div/div/a[3]")).click();//edit
		   Thread.sleep(7000);
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(7000); 
		   Actions actn=new Actions(driver);
		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smart_add_drip_url\"]"))).click().build().perform();
			Thread.sleep(7000);
			driver.switchTo().frame(0); 
			Thread.sleep(7000); 
			WebElement element = driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[2]/ul/li[1]//a"));//sms drip
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		   Thread.sleep(5000); 
		   driver.findElement(By.xpath("//*[@id=\"append_drip_section\"]/div/div/div[1]//a")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"sms_panel0\"]/div/div/div[1]/div//input")).sendKeys("1");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"sms_panel0\"]/div/div/div[2]/div//select")).click();
		   Thread.sleep(5000);
	List<WebElement> lst=driver.findElements(By.xpath("//*[@id=\"sms_panel0\"]/div/div/div[2]/div/select/option"));
	lst.get(lst.size()-1).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[4]/button[1]")).click();
		   Thread.sleep(5000); 
}  
//    @Test(priority=3)
//    public void editandADDIVRDrip() throws Exception {
//    	Thread.sleep(7000);
//		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
//		 driver.manage().window().maximize();
//		  Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div//button")).click();//Action
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/div/a[3]")).click();//edit
//		   Thread.sleep(7000);
//		  JavascriptExecutor js= (JavascriptExecutor) driver;
//		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		   Thread.sleep(7000);
//		   Actions actn=new Actions(driver);
//		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smart_add_drip_url\"]"))).click().build().perform();
//			Thread.sleep(7000);
//			driver.switchTo().frame(0);
//			Thread.sleep(7000);
//			WebElement element = driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[2]/ul/li[2]//a"));//ivr drip
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
//			executor.executeScript("arguments[0].click();", element);
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"append_drip_section\"]/div/div/div[1]//a")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"ivr_panel0\"]/div/div/div[1]/div//input")).sendKeys("1");
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"ivr_panel0\"]/div/div/div[2]/div//select")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"ivr_panel0\"]/div/div/div[2]/div/select/option[4]")).click();
//		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[4]//button[2]")).click();
//		   Thread.sleep(5000);
//}
/*
    public void editandADDRVMDrip() throws Exception {
    	Thread.sleep(7000);
		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div//button")).click();//Action
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/div/a[3]")).click();//edit
		   Thread.sleep(7000);
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(7000);
		   Actions actn=new Actions(driver);
		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smart_add_drip_url\"]"))).click().build().perform();
			Thread.sleep(7000);
			driver.switchTo().frame(0);
			Thread.sleep(7000);
			WebElement element = driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[2]/ul/li[3]//a"));//rvm drip
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"append_drip_section\"]/div/div/div[1]//a")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"rvm_panel0\"]/div/div/div[1]/div//input")).sendKeys("1");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"rvm_panel0\"]/div/div/div[2]/div//select")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"rvm_panel0\"]/div/div/div[2]/div/select/option[4]")).click();
		   Thread.sleep(5000);	   
		   driver.findElement(By.xpath("//*[@id=\"rvm_panel0\"]/div/div/div[4]/div/span/span[1]/span/ul/li//input")).sendKeys("9658542262");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"rvm_panel0\"]/div/div/div[4]/div/select/option[11]")).click();
		   Thread.sleep(5000);		   
		   driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[4]//button[2]")).click();
		   Thread.sleep(5000);
}	
	
    public void editandADDEmailDrip() throws Exception {
    	Thread.sleep(7000);
		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div//button")).click();//Action
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/div/a[3]")).click();//edit
		   Thread.sleep(7000);
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(7000);
		   Actions actn=new Actions(driver);
		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smart_add_drip_url\"]"))).click().build().perform();
			Thread.sleep(7000);
			driver.switchTo().frame(0);
			Thread.sleep(7000);
			WebElement element = driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[2]/ul/li[4]//a"));//email drip
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"append_drip_section\"]/div/div/div[1]//a")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"email_panel0\"]/div/div/div[1]/div//input")).sendKeys("5");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"email_panel0\"]/div/div/div[2]/div/select")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"email_panel0\"]/div/div/div[2]/div/select/option[9]")).click();
		   Thread.sleep(5000);	      
		   driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[4]//button[2]")).click();
		   Thread.sleep(5000);
}	
    public void editandPosturlDrip() throws Exception {
    	Thread.sleep(7000);
		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div//button")).click();//Action
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/div/a[3]")).click();//edit
		   Thread.sleep(7000);
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(7000);
		   Actions actn=new Actions(driver);
		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smart_add_drip_url\"]"))).click().build().perform();
			Thread.sleep(7000);
			driver.switchTo().frame(0);
			Thread.sleep(7000);
			WebElement element = driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[2]/ul/li[5]//a"));//email drip
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"append_drip_section\"]/div/div/div[1]//a")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"post_out_panel0\"]/div/div/div[1]/div//input")).sendKeys("1");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"post_out_panel0\"]/div/div/div[2]/div//input")).sendKeys("https://demo.fitsyn.com/api/lead/60dacc1b4109700024c91843");
		   Thread.sleep(5000);	      
		   driver.findElement(By.xpath("//*[@id=\"post_out_panel0\"]/div/div/div[3]/div//select")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"post_out_panel0\"]/div/div/div[3]/div/select/option[3]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[4]//button[2]")).click();
		   Thread.sleep(5000);
}	
    public void addDripfornextday() throws Exception {
    	Thread.sleep(7000);
		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div//button")).click();//Action
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/div/a[3]")).click();//edit
		   Thread.sleep(7000);
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(7000);
		//   driver.findElement(By.xpath("//*[@id=\"drip_day_index\"]")).sendKeys("2");
		   Actions actn1=new Actions(driver);
		   actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"smart_day-add\"]"))).click().build().perform();   
		   Thread.sleep(7000);
		   Actions actn=new Actions(driver);
		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smart_add_drip_url\"]"))).click().build().perform();
			Thread.sleep(7000);
			driver.switchTo().frame(0);
			Thread.sleep(7000);
			WebElement element = driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[2]/ul/li[2]//a"));//email drip
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"append_drip_section\"]/div/div/div[1]//a")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"ivr_panel0\"]/div/div/div[1]/div//input")).sendKeys("1100");
		   Thread.sleep(5000);	      
		   driver.findElement(By.xpath("//*[@id=\"ivr_panel0\"]/div/div/div[2]/div//select")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"ivr_panel0\"]/div/div/div[2]/div/select/option[5]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[4]//button[2]")).click();
		   Thread.sleep(5000);
}
*/
    
//    @Test(priority=3)
//	public void clickEditbutton() throws Exception {
//		Thread.sleep(7000);
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
//		Thread.sleep(2000);
//		 Actions actn=new Actions(driver);
//		   actn.moveToElement(driver.findElement(By.xpath("//button[@id=\"drip-scheduler-submit-btn\"]"))).click().build().perform();
//			Thread.sleep(7000);  
//	} 
//    
    
    @Test(priority=4)
	public void startdrip() throws Exception {
		Thread.sleep(7000);
		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		  Actions actn=new Actions(driver); 
		  actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]//a"))).click().build().perform();
			Thread.sleep(7000);
			driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button")).click();
			Thread.sleep(7000);
//			driver.findElement(By.xpath("/html/body/div[10]//div[@class='sa-button-container']/div[@class='sa-confirm-button-container']//button")).click();
//			Thread.sleep(7000);
		Thread.sleep(7000);
//		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
//		 driver.manage().window().maximize();
//		  Thread.sleep(5000);
		  Actions actn2=new Actions(driver);
		  actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/div/button"))).click().build().perform();
			Thread.sleep(7000);
			 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/div/div/a[1]")).click();//view
			 Thread.sleep(5000);
			 JavascriptExecutor js= (JavascriptExecutor) driver;
			   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(15000);
			 driver.navigate().refresh();
			 Thread.sleep(15000);
			 JavascriptExecutor js1= (JavascriptExecutor) driver;
			   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(7000);
			String text1=driver.findElement(By.xpath("//*[@id=\"block_0\"]/div/div/div/div/div[3]/div[1]/span[1]")).getText();
			System.out.println(text1);
	String text=driver.findElement(By.xpath("//*[@id=\"block_0\"]/div/div/div/div/div[3]/div[1]/span[2]")).getText();
	System.out.println(text);
	String text2=driver.findElement(By.xpath("//*[@id=\"block_0\"]/div/div/div/div/div[3]/div[2]/span[1]")).getText();
	System.out.println(text2);
String text3=driver.findElement(By.xpath("//*[@id=\"block_0\"]/div/div/div/div/div[3]/div[2]/span[2]")).getText();
System.out.println(text3);

		
	}
    /*
	public void copydrip() throws Exception {
		Thread.sleep(7000);
		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		  Actions actn=new Actions(driver);
		  actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div//button"))).click().build().perform();
			Thread.sleep(7000);
			 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/div/a[2]")).click();
			 Thread.sleep(7000);
			 driver.switchTo().frame(0);	
			 Thread.sleep(7000);
			 driver.findElement(By.xpath("//*[@id=\"copy_drip_logic_scheduler_form\"]/div[1]/div[2]/div//input")).sendKeys("test_copy");//copy
			 Thread.sleep(7000);
			 driver.findElement(By.xpath("/html/body/div/div/section/div/form/div[2]/button[2]")).click();
	}
	public void removedrip() throws Exception {
		Thread.sleep(7000);
		driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		  Actions actn=new Actions(driver);
		  actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div//button"))).click().build().perform();
			Thread.sleep(7000);
			 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[7]/div/div/a[4]")).click();
			 Thread.sleep(7000);
			 driver.findElement(By.xpath("//html/body/div[10]/div[7]/div/button")).click();
			 Thread.sleep(7000);
			 driver.findElement(By.xpath("//html/body/div[10]/div[7]/div/button")).click();
		
	}
public void sortingdata() throws Exception {
		
		Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[1]/a")).click();//name
		List<WebElement> elemntlist1=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[1]"));
		List<String>orignallist1=elemntlist1.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(orignallist1);
		
		List<String>sortedlist1=orignallist1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist1);
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		List<WebElement> elemntlist2=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[2]"));//date
		List<String>orignallist2=elemntlist2.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(orignallist2);
		
		List<String>sortedlist2=orignallist2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist2);
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		List<WebElement> elemntlist5=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[3]"));//Attributes
		List<String>orignallist5=elemntlist5.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(orignallist5);
		
		List<String>sortedlist5=orignallist5.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist5);
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[4]/a")).click();//status
		List<WebElement> elemntlist6=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[4]"));
		List<String>orignallist6=elemntlist6.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(orignallist6);
		
		List<String>sortedlist6=orignallist6.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist6);
		Thread.sleep(5000);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[4]/a")).click();//status
		List<WebElement> elemntlist7=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]"));
		List<String>orignallist7=elemntlist7.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(orignallist7);
		
		List<String>sortedlist7=orignallist7.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist7);
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[4]/a")).click();//status
		List<WebElement> elemntlist8=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[6]"));
		List<String>orignallist8=elemntlist8.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(orignallist8);
		
		List<String>sortedlist8=orignallist8.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist8);
		Thread.sleep(5000);
		
	}
	*/
}
