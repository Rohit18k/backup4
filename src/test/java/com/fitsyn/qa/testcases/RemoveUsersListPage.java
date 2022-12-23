package com.fitsyn.qa.testcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class RemoveUsersListPage extends TestBase1{
	Random r=new Random();

	public RemoveUsersListPage() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	 @Test(priority=1)
	 public void removeuser() throws Exception {
		 	  Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actn3=new Actions(driver);
		actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div//button"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[8]/div/div/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click(); }
}
