package com.fitsyn.qa.testcases;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class ActionsDropdownInApplicationListPage extends TestBase1{


	public ActionsDropdownInApplicationListPage() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
//	
    @Test(priority=1)
        public void handleActionDropdownmenuoptionsInApplicationListPage() throws Exception {
        	
        Thread.sleep(7000);
        driver.navigate().to("https://demo.fitsyn.com/applications");
        driver.manage().window().maximize();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
        Thread.sleep(5000);
        	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[1]")).click();//submit button
        	 Thread.sleep(5000);
       	  driver.manage().window().maximize();
       	JavascriptExecutor js8 = (JavascriptExecutor) driver;
			   js8.executeScript("window.scrollBy(0,120)");
//			   Thread.sleep(5000);
//			   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[7]/label/span")).click();
			   Thread.sleep(5000);
			   JavascriptExecutor js811= (JavascriptExecutor) driver;
			   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Actions action=new Actions(driver);
			   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();

			   
			   Thread.sleep(7000);
//			   driver.navigate().to("https://demo.fitsyn.com/vendors");
//			   		   
//			   Thread.sleep(3000);
//				driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("admin@site.com");
//			driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[1]/form/div/div[3]//button[@value='submit']")).click();
//		
//			driver.manage().window().maximize();
//			Thread.sleep(7000);
//			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div//button[@class='btn btn-default btn-sm dropdown-toggle']")).click();
//			Thread.sleep(7000);
//			driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]/div/div/a[@href='/vendors/settings/5db2cadd07492e00180353d3']")).click();
//		
//			Thread.sleep(3000);
//			
//			Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
//			select.selectByValue("monevo");
//			driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();
//			Thread.sleep(7000);
		        driver.navigate().to("https://demo.fitsyn.com/applications");
		        driver.manage().window().maximize();
		        Thread.sleep(7000);
		        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[2]")).click();//Run button=first check which application using for run.if railtwo then do setting for railtwo
		        
		 String text1=driver.findElement(By.xpath("/html/body/div[11]/h2")).getText();//alert are you sure
		 System.out.println(text1);
		// Assert.assertEquals(text1,"Are you sure?");
		        Thread.sleep(5000);
		        Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("/html/body/div[11]/div[7]/div/button"))).click().build().perform();	   
			   Thread.sleep(10000);

			String text=driver.findElement(By.xpath("/html/body/div[11]/h2")).getText();//succed alert
			System.out.println(text);
			// Assert.assertEquals(text,"Succeed!");//pending
			   Actions actn1=new Actions(driver);
				actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[11]/div[7]/div/button"))).click().build().perform();
				
			   Thread.sleep(7000);
		        driver.navigate().to("https://demo.fitsyn.com/applications");
		        driver.manage().window().maximize();	  
		        Thread.sleep(7000);
		        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
		        Thread.sleep(5000);
        	
        	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[3]")).click();//view status
        	 Thread.sleep(7000);	
    // String text2= driver.findElement(By.xpath("/html/body/div[4]/div/div[8]/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]")).getText();//application sent to applicant
   //  System.out.println(text2);
 //    Assert.assertEquals(text2,"Offers available");//pendinf to test
//     String text3= driver.findElement(By.xpath("/html/body/div[4]/div/div[8]/div/div/div[2]/div/div/table/tbody/tr[2]/td[2]")).getText();//offer available
//     System.out.println(text3);
//     Assert.assertEquals(text3,"Offers available");//pending to test
        	
        	 Actions actn2=new Actions(driver);
				actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"view_status_history\"]/div/div/div[3]/button"))).click().build().perform();//close button

			   Thread.sleep(10000);
		        driver.navigate().to("https://demo.fitsyn.com/applications");
		        driver.manage().window().maximize();
		        Thread.sleep(7000);
		        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();//copy url
		        Thread.sleep(5000);
        	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[5]")).click();
        	try {
        	 String text5= driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
          System.out.println(text5);}
        	catch(Exception e) {
        		e.printStackTrace();
        	}
    	
        	Thread.sleep(7000);
	        driver.navigate().to("https://demo.fitsyn.com/applications");
	        driver.manage().window().maximize();
	        Thread.sleep(7000);
	        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
	        Thread.sleep(7000);
	        Actions actn3=new Actions(driver);
	        actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[6]"))).click().build().perform();
	     //   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[6]")).click();//view app history
	        Thread.sleep(5000);
       String text4= driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/div[1]/strong")).getText();
       System.out.println(text4);
       Assert.assertEquals(text4,"Application History");//pending to test
        	
       JavascriptExecutor js2= (JavascriptExecutor) driver;
	   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   
	   Thread.sleep(7000);
       driver.navigate().to("https://demo.fitsyn.com/applications");
       driver.manage().window().maximize();
       Thread.sleep(7000);
       driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[7]")).click();//reassign user
       Thread.sleep(5000);
       Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"assign_user_select_box\"]")));
       Thread.sleep(5000);
       slt.selectByVisibleText("lisa hydon (Representative)");
       driver.findElement(By.xpath("//*[@id=\"assign-user-btn\"]")).click();//assign
//       try {
//       Thread.sleep(5000);
//     String actual=  driver.findElement(By.xpath("/html/body/div[10]/span[3]")).getText();
//     System.out.println(actual);
//     String expeected="User successfully re-assigned to application";//if assignned for first time "user successfully assigned",if second time then "user successfully re-assigned"
//     Assert.assertEquals(actual,expeected);}
//       catch(Exception e){
//    	   e.printStackTrace();
//       }
// 
//       Thread.sleep(7000);
//       driver.navigate().to("https://demo.fitsyn.com/applications");
//       driver.manage().window().maximize();
//       Thread.sleep(7000);
//       driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
//       Thread.sleep(5000);
//       driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[8]")).click();//application detail-in ui not present"
//       Thread.sleep(5000);
//       JavascriptExecutor js4= (JavascriptExecutor) driver;
//	   js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       
       
       
	   Thread.sleep(15000);
       driver.navigate().to("https://demo.fitsyn.com/applications");
       driver.manage().window().maximize();
       Thread.sleep(7000);
       driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[4]")).click();//view offers
       Thread.sleep(15000);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
        	
        	
        }
}
