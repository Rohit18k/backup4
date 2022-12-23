package com.fitsyn.qa.testcases;
import java.util.Random;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;


public class SMSTemplate extends TestBase1{


	public SMSTemplate() {
	super();
	}
	
//@BeforeTest
//	public void openBrowser() throws Exception {
//	setIntialization();
//	}
	
	@Test(priority=2)
	public void createSMStemplate() throws Exception {
		  Thread.sleep(5000);
			driver.navigate().to("https://demo.fitsyn.com/drip_logic/sms_templates/");
			driver.manage().window().maximize();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a/strong")).click();
			  Thread.sleep(5000);
			   Actions actn=new Actions(driver);
			   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"template_name\"]"))).click().build().perform();
			   Random r=new Random();
			   String username="SMS_Test"+r.nextInt(1000);
			   driver.findElement(By.xpath("//*[@id=\"template_name\"]")).sendKeys(username);
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"template_body\"]")).sendKeys("Hello [[first_name]] [[last_name]],you will be contacted by [[mobile]] or [[email]]");
			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[4]/div//textarea")).sendKeys("text HTML Body");
//			   Thread.sleep(2000);
//			   driver.findElement(By.xpath("//*[@id=\"mail_template_form_validation\"]/div[1]/div[5]/div//textarea")).sendKeys("text Body");
//			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"add-sms-template-btn\"]")).click();
			   Thread.sleep(2000);
	}
}