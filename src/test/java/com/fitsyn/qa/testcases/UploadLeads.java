package com.fitsyn.qa.testcases;
import java.io.File;
import java.util.List;


import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;


public class UploadLeads extends TestBase1{


	public UploadLeads() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	@Test(priority=1)
	public void uploadLead() throws Exception {
		Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/campaigns/leads/upload");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"campaign\"]")).click();	 
		  Thread.sleep(3000);
List<WebElement>lst=driver.findElements(By.xpath("//*[@id=\"campaign\"]/option"));//remeber last campaign is rvm -do not use it for testing
lst.get(lst.size()-1).click();
	  Thread.sleep(2000); 
	  File file = new File("./ReadExcelData/userlist.csv");
	  driver.findElement(By.xpath("//*[@id=\"upload_csv_file\"]")).sendKeys(file.getAbsolutePath());
			//driver.findElement(By.xpath("//*[@id=\"upload_csv_file\"]")).sendKeys("C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\ReadExcelData\\userlist.csv");//action
			 driver.findElement(By.xpath("//*[@id=\"upload_csv_lead_btn\"]")).click();
			  Thread.sleep(2000);
			  Thread.sleep(5000);
			 
				 Actions actn4=new Actions(driver);
				   actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[1]/td[3]/select"))).click().build().perform();
				   
				 Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[1]/td[3]/select")));
			  	   Thread.sleep(2000);
			  	         slt3.selectByVisibleText("First Name");
			  	       Thread.sleep(2000);
			  		 Select slt4=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[2]/td[3]/select")));
			  		 Thread.sleep(2000);
			  	  	         slt4.selectByVisibleText("Last Name");
			  	  	     Thread.sleep(2000);
				  		 Select slt5=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[3]/td[3]/select")));
				  		 Thread.sleep(2000);
				  	  	         slt5.selectByVisibleText("Mobile");
				  	  	     driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[3]/td[4]/label/span")).click();
				  	  	 Thread.sleep(2000);
					  		 Select slt6=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[4]/td[3]/select")));
					  		 Thread.sleep(2000);
					  	  	         slt6.selectByVisibleText("Email");
					  	  	     driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[4]/td[5]/label/span")).click();
					  	  	 Thread.sleep(2000);
					  	  	 driver.findElement(By.xpath("//*[@id=\"mapping_table_footer\"]/td[1]/label/span")).click();
					  	   Thread.sleep(2000);
					  	 driver.findElement(By.xpath("//*[@id=\"field-mapping-submit-btn\"]")).click();
			//		  	 Thread.sleep(5000);
					  	 Thread.sleep(2000);
			 
		
	}
	
	@Test(priority=2)
		public void uplodedFiles() throws Exception {
		 Thread.sleep(5000);
		  driver.navigate().to("https://demo.fitsyn.com/campaigns/leads/files");
			driver.manage().window().maximize();
			 Thread.sleep(5000);
		  WebElement campaign=  driver.findElement(By.xpath("//*[@id=\"campaign_id\"]")); 
		  Thread.sleep(3000);
		  Actions actn=new Actions(driver);
		  actn.moveToElement(campaign).click().build().perform();
		  Thread.sleep(3000);
	List<WebElement> lst= driver.findElements(By.xpath("//*[@id=\"campaign_id\"]/option"));
	lst.get(lst.size()-1).click();
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[1]/form/div/div[2]//button")).click();
			 Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div[1]/form/div/div[3]//a")).click();//action
}
	@Test(priority=3)
	public void sortColumns() throws Exception {		
			Thread.sleep(5000);
			  driver.navigate().to("https://demo.fitsyn.com/campaigns/leads/files");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			List<WebElement> elemntlist=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[1]"));
			List<String>orignallist=elemntlist.stream().map(s->s.getText()).collect(Collectors.toList());
			System.out.println(orignallist);
			
			List<String>sortedlist=orignallist.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedlist);
			Thread.sleep(5000);
			

			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[2]/a")).click();//created
			List<WebElement> elemntlist1=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[2]"));
			List<String>orignallist1=elemntlist1.stream().map(s->s.getText()).collect(Collectors.toList());
			System.out.println(orignallist1);
			
			List<String>sortedlist1=orignallist1.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedlist1);
			Thread.sleep(5000);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[3]/a")).click();//created
			List<WebElement> elemntlist2=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[3]"));//clientID
			List<String>orignallist2=elemntlist2.stream().map(s->s.getText()).collect(Collectors.toList());
			System.out.println(orignallist2);
			
			List<String>sortedlist2=orignallist2.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedlist2);
			Thread.sleep(5000);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[4]/a")).click();//email
			List<WebElement> elemntlist4=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[4]"));
			List<String>orignallist4=elemntlist4.stream().map(s->s.getText()).collect(Collectors.toList());
			System.out.println(orignallist4);
			
			List<String>sortedlist4=orignallist4.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedlist4);
			Thread.sleep(5000);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[5]/a")).click();//email
			List<WebElement> elemntlist5=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]"));//mobile
			List<String>orignallist5=elemntlist5.stream().map(s->s.getText()).collect(Collectors.toList());
			System.out.println(orignallist5);
			
			List<String>sortedlist5=orignallist5.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedlist5);
			Thread.sleep(5000);
			
			
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[6]/a")).click();//loan amount
			List<WebElement> elemntlist6=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[6]"));
			List<String>orignallist6=elemntlist6.stream().map(s->s.getText()).collect(Collectors.toList());
			System.out.println(orignallist6);
			
			List<String>sortedlist6=orignallist6.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedlist6);
			Thread.sleep(5000);
			
			Thread.sleep(5000);
			Actions actn1=new Actions (driver);
			actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[7]/a"))).click().build().perform();
			List<WebElement> elemntlist11=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[7]"));
			List<String>orignallist11=elemntlist11.stream().map(s->s.getText()).collect(Collectors.toList());
			System.out.println(orignallist11);
			
			List<String>sortedlist11=orignallist11.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedlist11);
			Thread.sleep(5000);	
			
			
			
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[8]/a")).click();//status
			List<WebElement> elemntlist12=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]"));//stage status
			List<String>orignallist12=elemntlist12.stream().map(s->s.getText()).collect(Collectors.toList());
			System.out.println(orignallist12);
			
			List<String>sortedlist12=orignallist12.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedlist12);
			Thread.sleep(5000);	
			
			
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[9]/a")).click();//status
			List<WebElement> elemntlist13=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[9]"));//submitted Buy
			List<String>orignallist13=elemntlist13.stream().map(s->s.getText()).collect(Collectors.toList());
			System.out.println(orignallist13);
			
			List<String>sortedlist13=orignallist13.stream().sorted().collect(Collectors.toList());
			System.out.println(sortedlist13);
			Thread.sleep(5000);	
			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/nav/div/div[2]/a[1]/strong//i")).click();//action
		String actual=	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/h5//strong")).getText();
		String expet="CSV File List";
		Assert.assertEquals(actual, expet);
	}
		
			
			
			
			
			
			
			
		
		
		
		
	
		
		
		
		
		
		
		
	}


