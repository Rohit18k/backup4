package com.degreezen.qa.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class CheckFooterLinks extends TestBase1{


	public CheckFooterLinks() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization1();
	}
	
	  @Test(priority=1)
	     public void  links() throws Exception {
	         Thread.sleep(5000);
	         String homePage = "https://degreezen.demoserver.biz";
	         String url = "";
	         HttpURLConnection huc = null;
	         int respCode = 200;
	         driver.get(homePage);

	         List<WebElement> links = driver.findElements(By.tagName("a"));

	         Iterator<WebElement> it = links.iterator();

	         while(it.hasNext()){

	         url = it.next().getAttribute("href");

	         System.out.println(url);

	         if(url == null || url.isEmpty()){
	         System.out.println("URL is either not configured for anchor tag or it is empty");
	         continue;
	         }

	         if(!url.startsWith(homePage)){
	         System.out.println("URL belongs to another domain, skipping it.");
	         continue;
	         }

	         try {
	         huc = (HttpURLConnection)(new URL(url).openConnection());

	         huc.setRequestMethod("HEAD");

	         huc.connect();

	         respCode = huc.getResponseCode();

	         if(respCode >= 400){
	         System.out.println(url+" is a broken link");
	         }
	         else{
	         System.out.println(url+" is a valid link");
	         }

	         } catch (MalformedURLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	         } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	         }
	         }
	         
	         
	         
	         
	  }
	         
	         
	         
}
