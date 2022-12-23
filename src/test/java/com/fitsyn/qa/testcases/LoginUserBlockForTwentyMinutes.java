package com.fitsyn.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class LoginUserBlockForTwentyMinutes extends TestBase1{

	public LoginUserBlockForTwentyMinutes() {
		super();
		}

	@BeforeTest
	public void openBrowser() throws Exception {
		setIntialization();
	}

	
	@Test(priority=1)
	public void loginApp2() throws Exception {
		for (int i = 0; i < 21; i++) {
		Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]/input")).sendKeys("admin@uat.com");
	driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("fitsyn@wcgg");//action
	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div/label/span[1]/input")).click();//action
	driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();//action}
}

	
	}
	
	
	@Test(priority=2)
	public void loginApp3() throws Exception {
		Thread.sleep(60000);
	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]/input")).sendKeys("admin@uat.com");
	driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("fitsyn@wcg");//action
	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div/label/span[1]/input")).click();//action
	driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();//action}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
