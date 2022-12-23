package com.fitsyn.qa.testcases;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class DownloadCSVInApplicationNewListpage extends TestBase1{


	public DownloadCSVInApplicationNewListpage() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
    @Test(priority=1)
	public void downloadCSV() throws Exception {
	Thread.sleep(7000);
    driver.navigate().to("https://demo.fitsyn.com/applications/new");
    driver.manage().window().maximize();
    Thread.sleep(7000);
    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[2]/div[3]/div/div/button")).click();
    Thread.sleep(10000);
    driver.navigate().to("https://demo.fitsyn.com/reports/report_request");
    
    Thread.sleep(180000);
    driver.navigate().refresh();
    driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/a/i")).click();
    Thread.sleep(7000);
	

	
	
	
}
}