package com.fitsyn.qa.testcases;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;
import com.github.javafaker.Faker;

public class RVMCallerID extends TestBase1{


	public RVMCallerID() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		setIntialization();
//	}
	
    @Test(priority=1)
	public void createCallerID() throws Exception {
		
		  Thread.sleep(5000);
			driver.navigate().to("https://demo.fitsyn.com/rvm/caller_id");
			 driver.manage().window().maximize();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/a/strong")).click();
			  Thread.sleep(5000);
			   Actions actn=new Actions(driver);
			   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"add_rvm-caller_id_form\"]/div[1]/div/div//input"))).click().build().perform();
				Faker faker = new Faker();
			String num=	faker.number().digits(10);
			   driver.findElement(By.xpath("//*[@id=\"add_rvm-caller_id_form\"]/div[1]/div/div//input")).sendKeys(num);
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"add-rvm-caller-id-btn\"]")).click();
			   Thread.sleep(2000);
	}
//	public void activeAndinactive() throws Exception {
//		
//		Thread.sleep(5000);
//		driver.navigate().to("https://demo.fitsyn.com/rvm/caller_id");
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
//		
//		
//		
//	}
}
