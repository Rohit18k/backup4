package com.fitsyn.qa.testcases;
import java.util.Properties;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;


public class EmailTemplate extends TestBase1{


	public EmailTemplate() {
	super();
	}
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	@Test(priority=1)//pending toa dd random method
	public void createEmailtemplate() throws Exception {
		  Thread.sleep(5000);
			driver.navigate().to("https://demo.fitsyn.com/drip_logic/mail_templates/");
			driver.manage().window().maximize();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a/strong")).click();
			  Thread.sleep(5000);
			   Actions actn=new Actions(driver);
			   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[1]/div//input[contains(@name,'template_event')]"))).click().build().perform();
			   Random r=new Random();
			   String email="New Email"+r.nextInt(1000);
			   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[1]/div//input[contains(@name,'template_event')]")).sendKeys(email);
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[3]/div//input[@name='subject']")).sendKeys("test subject");
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[4]/div//textarea")).sendKeys("text HTML Body");
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[5]/div//textarea")).sendKeys("text Body");
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
			   Thread.sleep(2000);
	}
	
//	public void editEmailtemplate() throws Exception {
//		
//		Thread.sleep(5000);
//		driver.navigate().to("https://demo.fitsyn.com/drip_logic/mail_templates/");
//		  driver.manage().window().maximize();
//		  Thread.sleep(5000);
//		  driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]//a")).click();
//		  Thread.sleep(5000);
//		   Actions actn=new Actions(driver);
//		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[1]/div//input[contains(@name,'template_event')]"))).click().build().perform();
//		   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[1]/div//input[contains(@name,'template_event')]")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[1]/div//input[contains(@name,'template_event')]")).sendKeys("New Email");
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[3]/div//input[@name='subject']")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[3]/div//input[@name='subject']")).sendKeys("test subject");
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[4]/div//textarea")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[4]/div//textarea")).sendKeys("text HTML Body");
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[5]/div//textarea")).clear();
//		   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[5]/div//textarea")).sendKeys("text Body");
//		   Thread.sleep(2000);
//		   driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
//		   Thread.sleep(9000);
//		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[4]//button[@title='Active']")).click();
//		   Thread.sleep(9000);
//		   driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'Yes, inactive it')]")).click();
//		   Thread.sleep(9000);
//		   driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'OK')]")).click();
//		   Thread.sleep(9000);
//		   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[4]//button[contains(text(),'Inactive')]")).click();
//		   Thread.sleep(9000);
//		   driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'Yes, active it')]")).click();
//		   Thread.sleep(9000);
//		   driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button[contains(text(),'OK')]")).click();
//		   Thread.sleep(9000);
//		
//	}
	
}
