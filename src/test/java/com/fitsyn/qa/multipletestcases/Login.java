package com.fitsyn.qa.multipletestcases;


import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.degreezen.qa.ExtentReportListners.CustomListner;
import com.degreezen.qa.base.Base;
import com.degreezen.qa.base.TestBase1;

public class Login extends TestBase1{
	WebDriver driver;
	
	public Login() {
	super();
	}
	
	
	@BeforeTest
	public void openBrowser() throws Exception {
	driver=setIntialization();
	}
	
	
	

	@Test
	public void loginApp() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"login-section\"]/div[2]/input")).sendKeys("admin@uat.com"); //note: xpath for login changed
		driver.findElement(By.xpath("//*[@id=\"validation-passwordd\"]")).sendKeys("fitsyn@wcg");//action
		driver.findElement(By.xpath("//*[@id=\"login-section\"]/div[4]/div/label/span[1]/input")).click();//action
		driver.findElement(By.xpath("//*[@id=\"sign-in-requestt\"]")).click();//action}
	//driver.close();
}}

