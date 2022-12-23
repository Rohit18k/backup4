package com.fitsyn.qa.testcases;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class ActionDropdownInApplicationNewListPage extends TestBase1{


	public ActionDropdownInApplicationNewListPage() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
    @Test(priority=1)
     public void  ActiondropdownmenuOptions() throws Exception {
    	 
    	 Thread.sleep(7000);
    	// driver.switchTo().newWindow(WindowType.TAB);
         driver.navigate().to("https://demo.fitsyn.com/applications/new");
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         Thread.sleep(5000);
         Actions actn= new Actions(driver);
       actn.moveToElement( driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label"))).click().build().perform();
       Thread.sleep(5000);
       JavascriptExecutor js= (JavascriptExecutor) driver;
	   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   
 WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
	   
	   Actions actn1=new Actions (driver);
	           actn1.moveToElement(scrollArea).click().build().perform();
	        
	
	// Scroll to div's most right:
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);
	
	Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/button")).click();//action
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/div/a[1]")).click();//submit
	 Thread.sleep(5000);
  	  driver.manage().window().maximize();
  	JavascriptExecutor js8 = (JavascriptExecutor) driver;
		   js8.executeScript("window.scrollBy(0,120)");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/div/a[1]")).click();
		   Thread.sleep(5000);
		   JavascriptExecutor js811= (JavascriptExecutor) driver;
		   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Actions action=new Actions(driver);
		   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();

	 
//		Thread.sleep(7000);
//		driver.navigate().to("https://demo.fitsyn.com/vendors");
//			driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/a")).click();
//			Thread.sleep(9000);
//			driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[4]/ul/li[1]//a[@href='/vendors']")).click();	
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("admin@site.com");
//		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//button[@value='submit']")).click();
//	
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div//button[@class='btn btn-default btn-sm dropdown-toggle']")).click();
//		Thread.sleep(7000);
//		
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/div/a[@href='/vendors/settings/5db2cadd07492e00180353d3']")).click();
//	
//		Thread.sleep(3000);
//		
//		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
//		select.selectByValue("monevo");
//		driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
		
     Thread.sleep(7000);
     driver.navigate().to("https://demo.fitsyn.com/applications/new");
     driver.manage().window().maximize();
     Thread.sleep(5000);
     Actions actn2= new Actions(driver);
   actn2.moveToElement( driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label"))).click().build().perform();
     JavascriptExecutor js2= (JavascriptExecutor) driver;
	   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   
WebElement scrollArea2 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
	   
	   Actions actn3=new Actions (driver);
	           actn3.moveToElement(scrollArea2).click().build().perform();
	        
	
	// Scroll to div's most right:
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea2);
	
	Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/button")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/div/a[2]")).click(); //run
	
	 String text1=driver.findElement(By.xpath("/html/body/div[11]/h2")).getText();//alert are you sure
	 System.out.println(text1);
	// Assert.assertEquals(text1,"Are you sure?");
	        Thread.sleep(5000);
	        Actions actn4=new Actions(driver);
	actn4.moveToElement(driver.findElement(By.xpath("/html/body/div[11]/div[7]/div/button"))).click().build().perform();	   
		   Thread.sleep(10000);

		String text=driver.findElement(By.xpath("/html/body/div[11]/h2")).getText();//succed alert
		System.out.println(text);
	//	 Assert.assertEquals(text,"Succeed!");//pending
		   Actions actn5=new Actions(driver);
			actn5.moveToElement(driver.findElement(By.xpath("/html/body/div[11]/div[7]/div/button"))).click().build().perform();
		   Thread.sleep(7000);
		     driver.navigate().to("https://demo.fitsyn.com/applications/new");
		     driver.manage().window().maximize();
		     Thread.sleep(5000);
		     Actions actn6= new Actions(driver);
		   actn6.moveToElement( driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label"))).click().build().perform();
		   
		     JavascriptExecutor js3= (JavascriptExecutor) driver;
			   js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   
		WebElement scrollArea3 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
			   
			   Actions actn7=new Actions (driver);
			           actn7.moveToElement(scrollArea3).click().build().perform();
			        
			
			// Scroll to div's most right:
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea3);
			
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/div/a[3]")).click();//view status
			 Thread.sleep(7000);	
//	        
//		     String text2= driver.findElement(By.xpath("//*[@id=\"status_history_content\"]/tr[1]/td[2]")).getText();//application sent to applicant
//		     System.out.println(text2);
//		     Assert.assertEquals(text2,"Offers available");//pendinf to test
//		     String text3= driver.findElement(By.xpath("//*[@id=\"status_history_content\"]/tr[2]/td[2]")).getText();//offer available
//		     System.out.println(text3);
//		     Assert.assertEquals(text3,"Offers available");//pending to test
		        	
		        	 Actions actn8=new Actions(driver);
						actn8.moveToElement(driver.findElement(By.xpath("//*[@id=\"view_status_history\"]/div/div/div[3]/button"))).click().build().perform();//close button

						   Thread.sleep(7000);
						     driver.navigate().to("https://demo.fitsyn.com/applications/new");
						     driver.manage().window().maximize();
						     Thread.sleep(5000);
						     Actions actn9= new Actions(driver);
						   actn9.moveToElement( driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label"))).click().build().perform();
						   
						     JavascriptExecutor js4= (JavascriptExecutor) driver;
							   js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
							   
						WebElement scrollArea4 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
							   
							   Actions actn10=new Actions (driver);
							           actn10.moveToElement(scrollArea4).click().build().perform();
							        
							
							// Scroll to div's most right:
							((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea4);
							
							Thread.sleep(5000);
							((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
							
							Thread.sleep(5000);
							
							driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/button")).click();
						        Thread.sleep(5000);
				        	driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/div/a[5]")).click();//copy url
				        	try {
				        	 String text5= driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
				          System.out.println(text5);
			          //     Assert.assertEquals(text5,"Offer URL successfully copied");
				          }
				        	catch(Exception e) {
				        		e.printStackTrace();
				        	}
				        	   Thread.sleep(15000);
							     driver.navigate().to("https://demo.fitsyn.com/applications/new");
							     driver.manage().window().maximize();
							     Thread.sleep(5000);
							     Actions actn11= new Actions(driver);
							   actn11.moveToElement( driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label"))).click().build().perform();
							   
							     JavascriptExecutor js5= (JavascriptExecutor) driver;
								   js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
								   
							WebElement scrollArea5 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
								   
								   Actions actn12=new Actions (driver);
								           actn12.moveToElement(scrollArea5).click().build().perform();
								        
								
								// Scroll to div's most right:
								((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea5);
								
								Thread.sleep(5000);
								((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
								
								Thread.sleep(5000);
								
								driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/button")).click();
							        Thread.sleep(5000);
					        	driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/div/a[6]")).click();//view application histo
                  		        	   Thread.sleep(5000);
					               String text4= driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/div[1]/strong")).getText();
					               System.out.println(text4);
					               Assert.assertEquals(text4,"Application History");//pending to test
					                	
					               JavascriptExecutor js6= (JavascriptExecutor) driver;
					        	   js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	 
					        	   Thread.sleep(7000);
								     driver.navigate().to("https://demo.fitsyn.com/applications/new");
								     driver.manage().window().maximize();
								     Thread.sleep(5000);
								     Actions actn13= new Actions(driver);
								   actn13.moveToElement( driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label"))).click().build().perform();
								   
								     JavascriptExecutor js7= (JavascriptExecutor) driver;
									   js7.executeScript("window.scrollTo(0, document.body.scrollHeight)");
									   
								WebElement scrollArea6 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
									   
									   Actions actn14=new Actions (driver);
									           actn14.moveToElement(scrollArea6).click().build().perform();
									        
									
									// Scroll to div's most right:
									((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea6);
									
									Thread.sleep(5000);
									((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
									
									Thread.sleep(5000);
									
									driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/button")).click();
								        Thread.sleep(5000);
    	 
								        driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/div/a[7]")).click();//reassign user
								        Thread.sleep(5000);
								        Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"assign_user_select_box\"]")));
								        Thread.sleep(5000);
								        slt.selectByVisibleText("lisa hydon (Representative)");
								        driver.findElement(By.xpath("//*[@id=\"assign-user-btn\"]")).click();//assign
//								        try {
//								        Thread.sleep(5000);
//								      String actual=  driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
//								      System.out.println(actual);
//								      String expeected="User successfully re-assigned to application";
//								      Assert.assertEquals(actual, expeected);}
//								        catch(Exception e){
//								     	   e.printStackTrace();
//								        }
    	 /*
								        Thread.sleep(7000);
									     driver.navigate().to("https://demo.fitsyn.com/applications/new");
									     driver.manage().window().maximize();
									     Thread.sleep(5000);
									     Actions actn15= new Actions(driver);
									   actn15.moveToElement( driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label"))).click().build().perform();
									   
									     JavascriptExecutor js8= (JavascriptExecutor) driver;
										   js8.executeScript("window.scrollTo(0, document.body.scrollHeight)");
										   
									WebElement scrollArea7 = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[2]/div"));
										   
										   Actions actn16=new Actions (driver);
										           actn16.moveToElement(scrollArea7).click().build().perform();
										        
										
										// Scroll to div's most right:
										((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea7);
										
										Thread.sleep(5000);
										((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
										
										Thread.sleep(5000);
										
										driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/button")).click();
									        Thread.sleep(5000);
									        driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/div/a[8]")).click();//application detail
									        Thread.sleep(5000);
									        JavascriptExecutor js9= (JavascriptExecutor) driver;
									 	   js9.executeScript("window.scrollTo(0, document.body.scrollHeight)");
									 	   */
       								        Thread.sleep(7000);
										     driver.navigate().to("https://demo.fitsyn.com/applications/new");
										     driver.manage().window().maximize();
										     Thread.sleep(5000);
										     Actions actn17= new Actions(driver);
										   actn17.moveToElement( driver.findElement(By.xpath("//*[@id=\"accordion_0\"]/td/label"))).click().build().perform();
										   
										     JavascriptExecutor js10= (JavascriptExecutor) driver;
											   js10.executeScript("window.scrollTo(0, document.body.scrollHeight)");
											   
										WebElement scrollArea8 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
											   
											   Actions actn18=new Actions (driver);
											           actn18.moveToElement(scrollArea8).click().build().perform();
											        
											
											// Scroll to div's most right:
											((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea8);
											
											Thread.sleep(5000);
											((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
											
											Thread.sleep(5000);
											
											driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/button")).click();
										        Thread.sleep(5000);
										        driver.findElement(By.xpath("//*[@id=\"collapseOne_0\"]/table/tbody/tr[1]/td[14]/div/div/a[4]")).click();//view offers
										        Thread.sleep(15000);
    	 
    	 
    	 
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
