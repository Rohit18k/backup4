package com.fitsyn.qa.testcases;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class NewListPageSearchApplicationByValidDataOnDifferentDatesWithDifferntStatus extends TestBase1{


	public NewListPageSearchApplicationByValidDataOnDifferentDatesWithDifferntStatus() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
    @Test(priority=1)
   public void searchVailddataDifferentFilters() throws Exception {
	   Thread.sleep(5000);
		
		driver.navigate().to("https://demo.fitsyn.com/applications/new");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//offer avaible
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("John Shoy");
	
		Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
		Thread.sleep(5000);
		       slt.selectByValue("5db2cadd07492e00180353d3");
		
		       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
		       
		       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
		       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[4]/td[3]")).click();//22june
		       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[4]/td[3]")).click();
		       
		       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
		       
		       Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
		   	Thread.sleep(5000);
		   	slt1.selectByVisibleText("Offers Available");
			Thread.sleep(2000);
		   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
		   	
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label")).click();
			  Thread.sleep(5000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				   js.executeScript("window.scrollBy(0,400)");
			  Thread.sleep(5000);
		// //not submmited  	  
			     driver.navigate().refresh();
			     JavascriptExecutor js8 = (JavascriptExecutor) driver;
				   js8.executeScript("window.scrollBy(0,-250)");
				   Thread.sleep(5000);
			    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");
				
				Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
				Thread.sleep(9000);
				slt2.selectByVisibleText("My Company");
				Thread.sleep(9000);
				       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
				       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
				       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[4]/td[3]")).click();
				       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[4]/td[3]")).click();
				       
				       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
				       
				       Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
				   	Thread.sleep(5000);
				   	slt3.selectByValue("not_submitted");
					Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
				   	Thread.sleep(5000);
					  driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label")).click();
					  
						JavascriptExecutor js1 = (JavascriptExecutor) driver;
						   js1.executeScript("window.scrollBy(0,400)");
						   Thread.sleep(5000);
			//rejected
				    driver.navigate().refresh();
				    JavascriptExecutor js9 = (JavascriptExecutor) driver;
					   js9.executeScript("window.scrollBy(0,-250)");
					   Thread.sleep(5000);

				    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
				   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Danielle Kork");
					
					Select slt5=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
					Thread.sleep(9000);
					slt5.selectByVisibleText("My Company");
					
					       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
					       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
					       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[3]")).click();
					       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[3]")).click();
					       
					       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
					       
					       Select slt4=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
					   	Thread.sleep(5000);
					   	slt4.selectByValue("rejected");
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
						Thread.sleep(5000);
						  driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label")).click();
						  
							JavascriptExecutor js2 = (JavascriptExecutor) driver;
							   js2.executeScript("window.scrollBy(0,400)");
						Thread.sleep(5000);
				//no offers	   	
				   	
				   	
					   	driver.navigate().refresh();
					   	JavascriptExecutor js10 = (JavascriptExecutor) driver;
						   js10.executeScript("window.scrollBy(0,-250)");
						   Thread.sleep(5000);

					    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
					   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Linda Mathew");
						////*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select
						Select slt6=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
						Thread.sleep(10000);
						slt6.selectByVisibleText("My Company");
						
						       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
						       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
						       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[2]/td[5]")).click();
						       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[2]/td[5]")).click();
						       
						       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
						       
						       Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
						   	Thread.sleep(5000);
						   	slt7.selectByValue("no_offers");
						   	Thread.sleep(2000);
							driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
							Thread.sleep(5000);
							  driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label")).click();
							  
								JavascriptExecutor js3 = (JavascriptExecutor) driver;
								   js3.executeScript("window.scrollBy(0,400)");
							Thread.sleep(5000);
						   	
//				//   	looking for an offer -no data 
//				   	
							driver.navigate().refresh();
							JavascriptExecutor js11 = (JavascriptExecutor) driver;
							   js11.executeScript("window.scrollBy(0,-250)");
							   Thread.sleep(5000);

							  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
						   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jofra Archer");
							
							Select slt9=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
							Thread.sleep(10000);
							slt9.selectByVisibleText("My Company");
							
							       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
							       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
							       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
							       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[5]")).click();
							       
							       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
							       
							       Select slt8=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
							   	Thread.sleep(5000);
							   	slt8.selectByValue("looking_for_loan_offer");
							 	Thread.sleep(2000);
								driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
								Thread.sleep(5000);
								  driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label")).click();
								  
									JavascriptExecutor js4 = (JavascriptExecutor) driver;
									   js4.executeScript("window.scrollBy(0,400)");
								Thread.sleep(5000);
			   	
				   //funded-no data
								/*
								driver.navigate().refresh();
								JavascriptExecutor js12 = (JavascriptExecutor) driver;
								   js12.executeScript("window.scrollBy(0,-250)");
								   Thread.sleep(5000);

								  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
							   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jason Moment");
								
								Select slt10=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
								Thread.sleep(10000);
								slt10.selectByVisibleText("My Company");
								
								       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
								       Thread.sleep(5000);
									    while(true){	  
									  String mon=driver.findElement(By.xpath("/html[1]/body[1]/div[9]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText();

								if(mon.equalsIgnoreCase("Dec 2020")){
									break;}
								else {
									driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]/span")).click();
									 Thread.sleep(5000);
								}
							}
									      
							driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[5]/td[5]")).click();
							driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[5]/td[5]")).click();
							Thread.sleep(5000);
							driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
							Thread.sleep(5000);
								       
								       Select slt11=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
								   	Thread.sleep(5000);
								   	slt11.selectByValue("funded"); 	
									Thread.sleep(2000);
									driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
									Thread.sleep(5000);
									  driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label")).click();
									  
									JavascriptExecutor js5 = (JavascriptExecutor) driver;
										   js5.executeScript("window.scrollBy(0,100)");
									Thread.sleep(5000);
									*/
								 //  	pending_funding
						   	
								   	driver.navigate().refresh();
								   	JavascriptExecutor js13 = (JavascriptExecutor) driver;
									   js13.executeScript("window.scrollBy(0,-250)");
									   Thread.sleep(5000);

								    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
								   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Linda Venda");
									
									Select slt12=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
									Thread.sleep(5000);
									slt12.selectByVisibleText("My Company");
									
									       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
									       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
									       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
									       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
									       
									       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
									       
									       Select slt13=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
									   	Thread.sleep(5000);
									   	slt13.selectByValue("pending_funding");
										Thread.sleep(2000);
										driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
										Thread.sleep(5000);
										  driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label")).click();
										  
											JavascriptExecutor js6 = (JavascriptExecutor) driver;
											   js6.executeScript("window.scrollBy(0,400)");
										Thread.sleep(5000);
			  //application sent to applicant
										driver.navigate().refresh();
										
										JavascriptExecutor js14 = (JavascriptExecutor) driver;
										   js14.executeScript("window.scrollBy(0,-250)");
										   Thread.sleep(5000);

										  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
									   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Linda Venda");
										
										Select slt14=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
										Thread.sleep(5000); 
										slt14.selectByVisibleText("My Company");
										
										       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
										       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
										       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
										       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
										       
										       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
										       
										       Select slt15=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
										   	Thread.sleep(5000);
										   	slt15.selectByValue("application_sent_to_applicant"); 
											Thread.sleep(2000);
											driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
											Thread.sleep(5000);
											  driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label")).click();
											  
												JavascriptExecutor js7 = (JavascriptExecutor) driver;
												   js7.executeScript("window.scrollBy(0,400)");
                                           	   Thread.sleep(5000);
                                           	   
               								driver.navigate().refresh();//funded
               								JavascriptExecutor js12 = (JavascriptExecutor) driver;
               								   js12.executeScript("window.scrollBy(0,-250)");
               								   Thread.sleep(5000);

               								  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).clear();
               							   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[1]/div/div/input")).sendKeys("Jason Moment");
               								
               								Select slt10=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[2]/div/div/select")));
               								Thread.sleep(10000);
               								slt10.selectByVisibleText("My Company");
               								
               								       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
               								       Thread.sleep(5000);
               									    while(true){	  
               									  String mon=driver.findElement(By.xpath("/html[1]/body[1]/div[9]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText();

               								if(mon.equalsIgnoreCase("Dec 2020")){
               									break;}
               								else {
               									driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]/span")).click();
               									 Thread.sleep(5000);
               								}
               							}
               									      
               							driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[5]/td[5]")).click();
               							driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[5]/td[5]")).click();
               							Thread.sleep(5000);
               							driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
               							Thread.sleep(5000);
               								       
               								       Select slt11=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[1]/div[4]/div/div/select")));
               								   	Thread.sleep(5000);
               								   	slt11.selectByValue("funded"); 	
               									Thread.sleep(2000);
               									driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div[1]/form/div[2]/div[1]/div/div/button")).click();
               									Thread.sleep(5000);
               									  driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label")).click();
               									  
               									JavascriptExecutor js5 = (JavascriptExecutor) driver;
               										   js5.executeScript("window.scrollBy(0,100)");
               									Thread.sleep(5000);
               									
	   
   }
}
