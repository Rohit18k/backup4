package com.fitsyn.qa.testcases;
import java.util.Properties;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;


public class RVMTemplate extends TestBase1{


	public RVMTemplate() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}
	
	
    @Test(priority=1)
    public void createRVMTemplate() throws Exception {
    	Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/rvm/template");
		 driver.manage().window().maximize();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a/strong")).click();
		  Thread.sleep(5000);
		   Actions actn=new Actions(driver);
		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_rvm_template_form\"]/div[1]/div[1]/div//input"))).click().build().perform();
		   Random r=new Random();
		   String username="Test_RVM"+r.nextInt(1000);
		   driver.findElement(By.xpath("//*[@id=\"add_rvm_template_form\"]/div[1]/div[1]/div//input")).sendKeys(username);
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"upload_template\"]")).sendKeys("C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\RVMFile\\file_example_MP3_700KB.mp3");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"add-rvm-template-btn\"]")).click();
		   Thread.sleep(20000);
    }
//    public void activeAndInactive() throws Exception {
//    	Thread.sleep(5000);
//		driver.navigate().to("https://demo.fitsyn.com/rvm/template");
//		 driver.manage().window().maximize();
//			 Thread.sleep(7000);
//			 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[2]//button")).click();//InActive
//			 Thread.sleep(7000);
//			 driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'Yes, inactive it')]")).click();
//			   Thread.sleep(7000);
//			 driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'OK')]")).click();
//			 Thread.sleep(9000);
//			 Actions actn2=new Actions(driver);
//			 actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[2]//button"))).click().build().perform();
//			 Thread.sleep(7000);
//			 driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'Yes, active it')]")).click();
//			   Thread.sleep(7000);
//			 driver.findElement(By.xpath("/html/body/div[10]/div[7]//button[contains(text(),'OK')]")).click();		 
//			  Thread.sleep(7000);
//    }
//    
//    public void remove() throws Exception {
//    	
//    	Thread.sleep(5000);
//		  driver.navigate().to("https://demo.fitsyn.com/rvm/template");
//		  Thread.sleep(5000);
//		 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]/a")).click();
//		  Thread.sleep(5000);
//			driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button")).click();
//			 Thread.sleep(5000);
//			 driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'OK')]")).click();
//			 Thread.sleep(5000);
//    	
//    	
//    	
//    	
//    }
    
    
    
    
    
    
    
    
    
    
    
    
}
