package com.fitsyn.qa.testcases;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class ForgotPassword extends TestBase1{
	Random r=new Random();

	public ForgotPassword() {
	super();}

	
	@BeforeTest
	public void openBrowser() throws Exception {
		setIntialization();
	}


	@Test(priority=1)
	public void forgotPasswordLink() throws Exception {
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(2000);
			Actions actn1=new Actions(driver);
			actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[5]/a"))).click().build().perform();
			Thread.sleep(2000);
			Actions actn2=new Actions(driver);
			actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"forgot_password_form\"]/div[1]/input"))).click().build().perform();
			driver.findElement(By.xpath("//*[@id=\"forgot_password_form\"]/div[1]/input")).sendKeys("hema123@getnada.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"forgot_password_form\"]/div[2]/button")).click();
			Thread.sleep(5000);
			String pwdtext1= driver.findElement(By.xpath("/html/body/div[2]/span[3]")).getText();	
			Assert.assertEquals(pwdtext1,"Our administrative will respond you soon and send an email with reset password link.");
				Thread.sleep(2000);
				  driver.navigate().to("https://demo.fitsyn.com");
				  driver.get("https://demo.fitsyn.com");
				driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]/input")).sendKeys("admin@uat.com");
				driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("fitsyn@wcg");
				driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div/label/span[1]/input")).click();
				driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();
				     Thread.sleep(2000);
				     driver.navigate().to("https://demo.fitsyn.com/requests/");
				     driver.manage().window().maximize();
				     Thread.sleep(2000);
				     Actions actn3=new Actions(driver);
				     actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/button"))).click().build().perform();
				     Thread.sleep(2000);
				     Actions actn4=new Actions(driver);
				     actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/div/a[1]"))).click().build().perform();
				     Thread.sleep(3000);
				     Actions actn5=new Actions(driver);
				     actn5.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
				     Thread.sleep(3000);
				     Actions actn6=new Actions(driver);
				     actn6.moveToElement(driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"))).click().build().perform();
				     Thread.sleep(3000);
				     Actions actn15=new Actions(driver);
				     actn15.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div/a/div/span"))).click().build().perform();
				     Thread.sleep(2000);
				     Actions actn16=new Actions(driver);
				     actn16.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div/div/a[5]"))).click().build().perform();
				     Thread.sleep(2000);
				     driver.navigate().to("https://getnada.com/");
				     driver.navigate().refresh();
				     Thread.sleep(3000);
				     Actions actn9=new Actions(driver);
				     actn9.moveToElement(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/nav/div/div/ul[1]/li[1]/button"))).click().build().perform();
				     Thread.sleep(3000);
				     Actions actn10=new Actions(driver);
				     actn10.moveToElement(driver.findElement(By.xpath("//*[@id=\"grid-first-name\"]"))).click().build().perform();
				     driver.findElement(By.xpath("//*[@id=\"grid-first-name\"]")).clear();
				     driver.findElement(By.xpath("//*[@id=\"grid-first-name\"]")).sendKeys("hema123");
				     Thread.sleep(2000);
				    Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/nav/div[2]/div/div/div/form/div/div[2]/select")));
				    Thread.sleep(2000);
				    slt.selectByValue("getnada.com");
				     Thread.sleep(2000);
				     driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/nav/div[2]/div/div/div/form/button")).click();
				     driver.navigate().refresh();
				   	JavascriptExecutor js8 = (JavascriptExecutor) driver;
					   js8.executeScript("window.scrollBy(0,120)");
					   Thread.sleep(3000);
					   Actions actn7=new Actions(driver);
					     actn7.moveToElement(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div/div[1]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/a"))).click().build().perform();					   
					     Thread.sleep(3000);
					     driver.navigate().refresh();	
					     Thread.sleep(2000);
					     driver.navigate().refresh();	
					     
							   try {
						  driver.switchTo().frame(0);
					     Actions actn8=new Actions(driver);
					     actn8.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Reset Password')]"))).click().build().perform();
					     }
							   catch(Exception e) {
								   e.printStackTrace();
							   }
					     driver.navigate().refresh();
					 String url= driver.getCurrentUrl();
					 System.out.println(url);
					 driver.navigate().to(url);
					     /*
						  JavascriptExecutor js34= (JavascriptExecutor) driver;
						   js34.executeScript("window.scrollTo(0, document.body.scrollHeight)");
						   */
					     /*
					     Actions actn11=new Actions(driver);
					     actn11.moveToElement(driver.findElement(By.xpath("//form[@id=\"reset_password_form\"]/div[3]/button"))).click().build().perform();
					     Thread.sleep(1000);
					     String text=driver.findElement(By.xpath("//*[@id=\"reset_password_form\"]/div[1]/label[2]")).getText();
							Assert.assertEquals(text,"Please enter password");	
							  Thread.sleep(1000);
							  */
					     Actions actn12=new Actions(driver);
					     actn12.moveToElement(driver.findElement(By.xpath("//*[@id=\"reset_password_form\"]/div[1]/label"))).click().build().perform();
			String pwdtext= driver.findElement(By.xpath("//*[@id=\"reset_password_form\"]/div[1]/label")).getText();
			System.out.println(pwdtext);
			/*
					     actn12.moveToElement(driver.findElement(By.xpath("//*[@id=\"password\"]"))).click().build().perform();
					     driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
					     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mohini@123");
					     /*
					     Thread.sleep(1000);
					     String text1=driver.findElement(By.xpath("//*[@id=\"reset_password_form\"]/div[2]/label[2]")).getText();
							Assert.assertEquals(text1,"Please enter confirm password");	
							  Thread.sleep(1000);
							  Actions actn13=new Actions(driver);
							     actn13.moveToElement(driver.findElement(By.xpath("//*[@id=\"reset_password_form\"]/div[2]/input"))).click().build().perform();
							     driver.findElement(By.xpath("//*[@id=\"reset_password_form\"]/div[2]/input")).clear();
							     driver.findElement(By.xpath("//*[@id=\"reset_password_form\"]/div[2]/input")).sendKeys("Mohini@123");
							     Thread.sleep(1000);
							     driver.findElement(By.xpath("//*[@id=\"reset_password_form\"]/div[3]/button")).click();
							     Thread.sleep(5000);
							     String text2=driver.findElement(By.xpath("/html/body/div[2]/span[3]")).getText();
									Assert.assertEquals(text2,"Password update successfully");	
									 Thread.sleep(5000);
									 driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]/input")).sendKeys("hema123@getnada.com");
										driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("Mohini@123");
										driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div/label/span[1]/input")).click();
										driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();
										 Thread.sleep(9000);
										 Actions actn14=new Actions(driver);
									     actn14.moveToElement(driver.findElement(By.xpath("//*[@id=\"confirm_ip_form\"]/div[1]/div[2]/div[1]/label/span"))).click().build().perform();
									     Thread.sleep(1000);
									     driver.findElement(By.xpath("//*[@id=\"submit-confirm_ip-btn\"]")).click();
									     Thread.sleep(1000);
									     */
									 
	}
	
	
	
}
