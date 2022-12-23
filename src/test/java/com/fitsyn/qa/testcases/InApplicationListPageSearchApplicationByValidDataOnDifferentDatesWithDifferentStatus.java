package com.fitsyn.qa.testcases;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class InApplicationListPageSearchApplicationByValidDataOnDifferentDatesWithDifferentStatus extends TestBase1{


	public InApplicationListPageSearchApplicationByValidDataOnDifferentDatesWithDifferentStatus() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
    @Test(priority=1)
   public void applicationListPageSearchApplicationByValidDataOnDifferentDatesWithDifferentStatus() throws Exception {
	   
	   Thread.sleep(7000);
	 //  driver.get("https://demo.fitsyn.com/applications");
		driver.navigate().to("https://demo.fitsyn.com/applications");
		driver.manage().window().maximize();
	     
		Thread.sleep(7000);
		//offer avaible
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("John Shoy");
		
		Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
		Thread.sleep(5000);
		       slt.selectByVisibleText("My Company");
//		       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
//		       
//		  
//		       
//		       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[2]/td[1]")).click();//4 july
//		       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[2]/td[1]")).click();
//
//		       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
		       
		       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
		       
		       Thread.sleep(5000);
			    while(true){	  
			  String mon=driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();

		if(mon.equalsIgnoreCase("Jul 2021")){
			break;}
		else {
			driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]/span")).click();
			 Thread.sleep(5000);
		}
	}
		       
			       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[2]/td[1]")).click();//4 july
			       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[2]/td[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
				Thread.sleep(5000);
    Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
		   	Thread.sleep(5000);
		   	slt1.selectByVisibleText("Offers Available");
		   	
		   	Thread.sleep(2000);
		   	Select slt16= new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/select")));
			Thread.sleep(2000);
			slt16.selectByVisibleText("Brooks A West(Representative)");
			
		 	Thread.sleep(2000);
		   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[6]/button")).click();
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[7]/a")).click();
			  Thread.sleep(5000);
			  
	 
		// //not submmited  	  
			     driver.navigate().refresh();
			 
			    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("Test");
				
				Select slt2=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
				       slt2.selectByVisibleText("My Company");
				
				       //driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
				       
//				       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
//				       
//				       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[6]")).click();
//				       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[6]")).click();
//				       
//				       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
				       
				       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
				       
				       Thread.sleep(5000);
					    while(true){	  
					  String mon=driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();

				if(mon.equalsIgnoreCase("Jun 2021")){
					break;}
				else {
					driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]/span")).click();
					 Thread.sleep(5000);
				}
			}
					      
			driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[2]/td[6]")).click();
			driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[2]/td[6]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
			Thread.sleep(5000);
	       
				       Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
				   	Thread.sleep(5000);
				   	slt3.selectByValue("not_submitted");
				   	
				 	Thread.sleep(2000);
				   	Select slt17= new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/select")));
					Thread.sleep(2000);
					slt17.selectByVisibleText("Brooks A West(Representative)");
					
				 	Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[6]/button")).click();
				   	
				   	Thread.sleep(5000);
				   	
				   	
			//rejected
				    driver.navigate().refresh();
				    
				    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
				   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("John Doe");
					
					Select slt5=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
					       slt5.selectByVisibleText("My Company");
					
//					       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
//					       
//					       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
//					       
//					       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[3]")).click();
//					       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[3]")).click();
//					       
//					       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
					       
					       
					       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
					       
					       Thread.sleep(5000);
						    while(true){	  
						  String mon=driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();

					if(mon.equalsIgnoreCase("Feb 2021")){
						break;}
					else {
						driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]/span")).click();
						 Thread.sleep(5000);
					}
				}
						      
				driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[1]/td[5]")).click();//4 feb
				driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[1]/td[5]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
				Thread.sleep(5000);
		       
					       
					       Select slt4=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
					   	Thread.sleep(5000);
					   	slt4.selectByValue("rejected");
					   	Thread.sleep(2000);
					   	Select slt18= new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/select")));
						Thread.sleep(2000);
						slt18.selectByVisibleText("Brooks A West(Representative)");
						
					 	Thread.sleep(2000);
					   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[6]/button")).click();
						Thread.sleep(5000);
					
				//no offers	   	
				   	
				   	
					   	driver.navigate().refresh();
					    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
					   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("Denie Dan");
						
						Select slt6=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
						       slt6.selectByVisibleText("My Company");
						
//						       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
//						       
//						       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
//						       
//						       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[3]")).click();
//						       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[3]")).click();
//						       
//						       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
						       
						       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
						       
						       Thread.sleep(5000);
							    while(true){	  
							  String mon=driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();

						if(mon.equalsIgnoreCase("Feb 2021")){
							break;}
						else {
							driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]/span")).click();
							 Thread.sleep(5000);
						}
					}
							      
					driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[1]/td[5]")).click();//4 feb
					driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[1]/td[5]")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
					Thread.sleep(5000);

					Select slt7=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
						   	Thread.sleep(5000);
						   	slt7.selectByValue("no_offers");
						 	Thread.sleep(2000);
						   	Select slt19= new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/select")));
							Thread.sleep(2000);
							slt19.selectByVisibleText("Brooks A West(Representative)");
						 	Thread.sleep(2000);
							driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[6]/button")).click();
							Thread.sleep(5000);
							
						   	
				//   	looking for an offer
				   	
							driver.navigate().refresh();
							
							  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
						  // 	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("8569854589");
							
							Select slt9=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
							       slt9.selectByVisibleText("My Company");
							
//							       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
//							       
//							       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
//							       
//							       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[6]")).click();
//							       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[3]/td[6]")).click();
//							       
//							       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
							       /*
							       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
							       
							       Thread.sleep(5000);
								    while(true){	  
								  String mon=driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();

							if(mon.equalsIgnoreCase("Jun 2021")){
								break;}
							else {
								driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]/span")).click();
								 Thread.sleep(5000);
							}
						}
								      
						driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[2]/td[6]")).click();
						driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[2]/td[6]")).click();
						Thread.sleep(5000);
						driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
						*/
						Thread.sleep(5000);
							   						       
							       
							       Select slt8=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
							   	Thread.sleep(5000);
							   	slt8.selectByValue("looking_for_loan_offer");
							   	
							   	Thread.sleep(2000);
							   	Select slt21= new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/select")));
								Thread.sleep(2000);
								slt21.selectByVisibleText("Fiona Rodgers(Manager)");
								Thread.sleep(2000);
								driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[6]/button")).click();
								Thread.sleep(5000);
								  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[7]/a")).click();
								  Thread.sleep(5000);
								
								
								 //  	pending_funding-> no result
									
							   	
								   	driver.navigate().refresh();
								   	
								    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
								   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("modeltesting871a@yopmail.com");
									
									Select slt12=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
									       slt12.selectByVisibleText("My Company");
									       
//									       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
//									       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
//									       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
//									       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
//									       
//									       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
									       
									       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
									       
										       
//										       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[5]/td[3]")).click();//27 july
//										       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[5]/td[3]")).click();
//
//										       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
										       
										       
										       Thread.sleep(5000);
											    while(true){	 
											  String mon=driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();

										if(mon.equalsIgnoreCase("Jul 2021")){
											break;}
										else {
											driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]/span")).click();
											 Thread.sleep(5000);
										}
									}
											      
											    driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[5]/td[3]")).click();//27 july
											       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[5]/td[3]")).click();
									Thread.sleep(5000);
									driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
									Thread.sleep(5000);
										       	       
									       Select slt13=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
									   	Thread.sleep(5000);
									   	slt13.selectByValue("pending_funding"); 
									   	
									   	Thread.sleep(2000);
									   	Select slt22= new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/select")));
										Thread.sleep(2000);
										slt22.selectByVisibleText("Fiona Rodgers(Manager)");
									   	
									 	Thread.sleep(2000);
										driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[6]/button")).click();
										Thread.sleep(5000);
										
			  //application sent to applicant->no result
									
										driver.navigate().refresh();
									   	
										  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
									   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("janice magee");
										
										Select slt14=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
										       slt14.selectByVisibleText("My Company");
										       
//										       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
//										       driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]")).click();
//										       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
//										       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[1]/table/tbody/tr[5]/td[3]")).click();
//										       
//										       driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
										       
										       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
										       
										       Thread.sleep(5000);
											    while(true){	 
											  String mon=driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();

										if(mon.equalsIgnoreCase("Dec 2020")){
											break;}
										else {
											driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]/span")).click();
											 Thread.sleep(5000);
										}
									}
											      
									driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[1]/td[4]")).click();//2 dec
									driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[1]/td[4]")).click();
									Thread.sleep(5000);
									driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
									Thread.sleep(5000);
										       
										       
										       Select slt15=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
										   	Thread.sleep(5000);
										   	slt15.selectByValue("application_sent_to_applicant"); 
										   	Thread.sleep(2000);
										   	Select slt23= new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/select")));
											Thread.sleep(2000);
											slt23.selectByVisibleText("Brooks A West(Representative)");
										   	Thread.sleep(2000);
											driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[6]/button")).click();
											Thread.sleep(5000);	
										
											//funded
											driver.navigate().refresh();
											
											  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).clear();
										   	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[1]/input")).sendKeys("Ankit Sharma");
											
											Select slt10=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[2]/form/div/div[2]/select")));
											       slt10.selectByVisibleText("My Company");
											
											       driver.findElement(By.xpath("//*[@id=\"date_range\"]")).click();
											       
											       Thread.sleep(5000);
												    while(true){	  
												  String mon=driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();

											if(mon.equalsIgnoreCase("Dec 2019")){
												break;}
											else {
												driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/thead/tr[1]/th[1]/span")).click();
												 Thread.sleep(5000);
											}
										}
												      
										driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[3]/td[2]")).click();//9 dec
										driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/table/tbody/tr[3]/td[2]")).click();
										Thread.sleep(5000);
										driver.findElement(By.xpath("/html/body/div[9]/div[4]/button[2]")).click();
										Thread.sleep(5000);
											       
											       Select slt11=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[4]/select")));
											   	Thread.sleep(5000);
											   	slt11.selectByValue("funded"); 	
											   	Thread.sleep(2000);
											   	Select slt24= new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[5]/select")));
												Thread.sleep(2000);
												slt24.selectByVisibleText("Brooks A West(Representative)");
											 	Thread.sleep(2000);
												driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div/div[6]/button")).click();
												Thread.sleep(5000);
												driver.close();
    
    }
	
    
			  
    
	
	
	
	
	
	
	
	
	
}
