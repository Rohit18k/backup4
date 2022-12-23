

import java.util.Locale;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;
import com.github.javafaker.Faker;

public class RailSixDCLOffers extends TestBase1{
	Random r=new Random();

	public RailSixDCLOffers() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initializationdriver();
//	}
	
	/*
	 @Test(priority=1)
		public  void subaccountSettingRailSix() throws Exception {
			
			Thread.sleep(7000);		
		WebElement sidebar=	driver.findElement(By.xpath("/html/body/nav/div[3]/div[2]/div"));
			   Actions action=new Actions(driver);
			   action.moveToElement(sidebar).click().build().perform();
			   Thread.sleep(2000);
				WebElement subaccount=	driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[30]//a"));
			   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", subaccount);
			   Thread.sleep(2000);
			   Actions action1=new Actions(driver);
			   action1.moveToElement(subaccount).click().build().perform();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[30]/ul/li[1]//a")).click();
			   Thread.sleep(2000);
			   driver.manage().window().maximize();
			   Thread.sleep(2000);
				WebElement actionbutton=	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[2]/td[8]/div/button"));	   
			   Actions action2=new Actions(driver);
			   action2.moveToElement(actionbutton).click().build().perform();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[2]/td[8]/div/div/a[2]")).click();
			   Thread.sleep(3000);
			   Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]/div/select")));
			   Thread.sleep(3000);
				select.selectByVisibleText("Rail Six");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();}
	 
	 */
	
	 @Test(priority=2)
		public void debtConsolidationLoan() throws Exception {
			Thread.sleep(5000);
			driver.navigate().to("https://ndrdemo.wazecapital.com/a2");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,200)");
			   Thread.sleep(2000);
			   Actions action=new Actions(driver);
			   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"seeYourOptions\"]"))).click().build().perform();
			   
			   Thread.sleep(1000);
			   
			   Actions actn5=new Actions(driver);
				actn5.moveToElement(driver.findElement(By.xpath("//*[@id=\"secondcontent\"]"))).click().build().perform();
				
				 Thread.sleep(1000);
				 
				 driver.findElement(By.xpath("//*[@id=\"thirdcontent\"]")).click();
				 
				 
				  String text171=driver.findElement(By.xpath("//*[@id=\"secondsec\"]/div[1]/div[2]/label")).getText();
					System.out.println(text171);
					String exp171="Please enter Zip Code";
					Assert.assertEquals(text171,exp171);
				 
				 			 
				 
				 Actions actn4=new Actions(driver);
					actn4.moveToElement(driver.findElement(By.xpath("//*[@id=\"secondsec\"]/div[1]/div[2]/input"))).click().build().perform();
					driver.findElement(By.xpath("//*[@id=\"secondsec\"]/div[1]/div[2]/input")).sendKeys("789");
					driver.findElement(By.xpath("//*[@id=\"secondsec\"]/div[1]/div[2]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"secondsec\"]/div[1]/div[2]/input")).sendKeys("78987");
					
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//*[@id=\"thirdcontent\"]")).click();
					
					
					
					
					Thread.sleep(1000);
					
					 JavascriptExecutor js2= (JavascriptExecutor) driver;
				 	   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					
				 	  Thread.sleep(2000);
				 	  
				 	 WebElement element = driver.findElement(By.xpath("//button[@id=\"sixcontent\"]"));
				 	JavascriptExecutor executor = (JavascriptExecutor)driver;
				 	executor.executeScript("arguments[0].click();", element);
				
				 	 Thread.sleep(2000);

				String text71=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[2]/div[1]/div/label[2]")).getText();
				System.out.println(text71);
				String exp71="Please enter Annual Income";
				Assert.assertEquals(text71,exp71);
				
			   try {
					  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[2]/div[1]/div/input")).click();
					  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[2]/div[1]/div/input")).sendKeys("!!@@#");
					  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[2]/div[1]/div/input")).clear();
					  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[2]/div[1]/div/input")).sendKeys("400000");
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
			   
				JavascriptExecutor js8 = (JavascriptExecutor) driver;
				   js8.executeScript("window.scrollBy(0,150)");
				   
				   Thread.sleep(1000);
				   String text=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[1]/div/label[2]")).getText();
					System.out.println(text);
					String exp="Please enter First Name";
					Assert.assertEquals(text,exp);
					
				   try {
						  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[1]/div/input")).click();
						  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[1]/div/input")).sendKeys("q");
						  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[1]/div/input")).clear();
						  
						  RandomStringUtils r=new RandomStringUtils();
						   String debts="Test"+r.randomAlphabetic(8);
						  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[1]/div/input")).sendKeys(debts);
						 }catch(Exception e) {
							 e.printStackTrace();
						 }   
				   
				     	   
				   Thread.sleep(1000);
			   String text1=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[2]/div/label[2]")).getText();
				System.out.println(text1);
				String exp1="Please enter Last Name";
				Assert.assertEquals(text1,exp1);
			   
			   try {
				   driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[2]/div/input")).click();
				   driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[2]/div/input")).sendKeys("o");
				   driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[2]/div/input")).clear();
				   
				   RandomStringUtils r=new RandomStringUtils();
				   String debts="debts"+r.randomAlphabetic(8);
				   driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[2]/div/input")).sendKeys(debts);
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
			   Thread.sleep(1000);
			   String text2=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[3]/div/label[2]")).getText();
				System.out.println(text2);
				String exp2="Please enter Date of Birth";
				Assert.assertEquals(text2,exp2);
			   try {
					  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[3]/div/input")).click();
					  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[3]/div/input")).sendKeys("12/09/2004");
					  String text21=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[3]/div/label[2]")).getText();
						System.out.println(text21);
						String exp21="You must be at least 18 years old.";
						Assert.assertEquals(text21,exp21);
						Thread.sleep(1000);
						 driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[3]/div/input")).clear();
						 driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[3]/div/input")).sendKeys("12/21/1998");
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
			   Thread.sleep(1000);
			   
			   String text11=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[4]/div/label[2]")).getText();
				System.out.println(text11);
				String exp11="Please enter Email Address";
				Assert.assertEquals(text11,exp11);
				Thread.sleep(1000);
				try {
					
					
					String email="test00"+r.nextInt(1000)+"@gmail.com";
					
					driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[4]/div/input")).click();
					driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[4]/div/input")).sendKeys("test@gmail@gmail.com");
					driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[4]/div/input")).clear();
					
					
					
			driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[4]/div/input")).sendKeys(email);}
				catch(Exception e) {
					 e.printStackTrace();
				 }
			   
				Thread.sleep(1000);
				 String text10=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[5]/div/label[2]")).getText();
					System.out.println(text10);
					String exp10="Please enter Phone Number";
					Assert.assertEquals(text10,exp10);
					
//					driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[5]/div/input")).sendKeys("aasdsddd");
//					
//					   String text101=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[5]/div/label[2]")).getText();
//						System.out.println(text101);
//						String exp101="Please enter 10 digit Phone Number";
//						Assert.assertEquals(text101,exp101);
//						driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[5]/div/input")).clear();
													
//						driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[5]/div/input")).sendKeys(String.valueOf("2345254411"));
//						driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[5]/div/input")).clear();
						Thread.sleep(1000);
						
						driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[5]/div/input")).sendKeys("\"(234) 525\"");
						driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[5]/div/input")).clear();
						
						driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[5]/div/input")).sendKeys("\"(234) 525-4411\"");
			
						Thread.sleep(1000);
			   String text3=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[6]/div/label[2]")).getText();
				System.out.println(text3);
				String exp3="Please enter SSN Number";
				Assert.assertEquals(text3,exp3);
			   try {
					  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[6]/div/input")).click();
					  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[6]/div/input")).sendKeys("786-12");
					  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[6]/div/input")).clear();
					  
					  
					  
					  
					  driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[4]/div[6]/div/input")).sendKeys("786-12-4566");
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
		
			   
			   JavascriptExecutor js10 = (JavascriptExecutor) driver;
			   js10.executeScript("window.scrollBy(0,150)");
			   
			   
			   Thread.sleep(1000);
			   String text12=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[1]/div/label[2]")).getText();
				System.out.println(text12);
				String exp12="Please enter Address";
				Assert.assertEquals(text12,exp12);
			driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[1]/div/input")).sendKeys("Washington Dc");
			

			Thread.sleep(1000);
			String text13=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[2]/div/label[2]")).getText();
			System.out.println(text13);
			String exp13="Please enter City";
			Assert.assertEquals(text13,exp13);
			driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[2]/div/input")).sendKeys("usa");

			Thread.sleep(1000);
			String text14=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[3]/div/label[2]")).getText();
			System.out.println(text14);
			String exp14="Please select State";
			Assert.assertEquals(text14,exp14);
	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[3]/div/div/button/div/div/div")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"bs-select-3-1\"]/span")).click();
	
	Thread.sleep(1000);
	String text6=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[5]/div/label[2]")).getText();
	System.out.println(text6);
	String exp6="Please select Housing Status";
	Assert.assertEquals(text6,exp6);
	
	try {
	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[5]/div/div/button/div/div/div")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"bs-select-4-2\"]/span")).click();
	}catch(Exception e) {
		 e.printStackTrace();
	 }
	
	
	
	Thread.sleep(1000);
	String text16=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[6]/div/label[2]")).getText();
	System.out.println(text16);
	String exp16="Please enter Monthly Mortgage / Rent";
	Assert.assertEquals(text16,exp16);
	
	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[6]/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[6]/div/input")).sendKeys("Aq!!@##");
	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[6]/div/input")).clear();
	

	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[6]/div/input")).sendKeys("2000");

	Thread.sleep(1000);
	String text4=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[7]/div/label[2]")).getText();
	System.out.println(text4);
	String exp4="Please enter Months at Address";
	Assert.assertEquals(text4,exp4);
	
	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[7]/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[7]/div/input")).sendKeys("#$$$Saa");
	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[7]/div/input")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[6]/div[7]/div/input")).sendKeys("950");
	
	JavascriptExecutor js5 = (JavascriptExecutor) driver;
	   js5.executeScript("window.scrollBy(0,150)");
	
		Thread.sleep(2000);
	
	   String text5=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[8]/div[1]/div/label[2]")).getText();
		System.out.println(text5);
		String exp5="Please select Job Type";
		Assert.assertEquals(text5,exp5);

	try { 
	driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[8]/div[1]/div/div/button/div/div/div")).click();
	Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id=\"bs-select-5-1\"]/span")).click();}
	catch(Exception e) {
		 e.printStackTrace();
	 }
			 
	
	Thread.sleep(1000);
				
					String text41=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[8]/div[2]/div/label[2]")).getText();
					System.out.println(text41);
					String exp41="Please select Employment Pay Frequency";
					Assert.assertEquals(text41,exp41);
					
					
					
					try { 
						driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[8]/div[2]/div/div/button/div/div/div")).click();
						Thread.sleep(1000);
					   driver.findElement(By.xpath("//*[@id=\"bs-select-6-1\"]/span")).click();}
						catch(Exception e) {
							 e.printStackTrace();
						 }
					 
					Thread.sleep(1000);
					
					JavascriptExecutor js1011 = (JavascriptExecutor) driver;
					   js1011.executeScript("window.scrollBy(0,75)");
					
					
					
				String text15=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[9]/div[1]/div/label[2]")).getText();
				System.out.println(text15);
				String exp15="Please enter Employer Name";
				Assert.assertEquals(text15,exp15);
				driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[9]/div[1]/div/input")).sendKeys("Stechsolution");
				
				Thread.sleep(2000);
				   String text17=driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[9]/div[2]/div/label[2]")).getText();
					System.out.println(text17);
					String exp17="Please enter Months at Employer";
					Assert.assertEquals(text17,exp17);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[9]/div[2]/div//input[@name='months_at_employer']")).click();
					driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[9]/div[2]/div//input[@name='months_at_employer']")).sendKeys("Hg@@#$%$");
					driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[9]/div[2]/div//input[@name='months_at_employer']")).clear();
					
					
					driver.findElement(By.xpath("//*[@id=\"fifthsec\"]/div[9]/div[2]/div//input[@name='months_at_employer']")).sendKeys("120");
				   		   
				   
				
					 WebElement element1 = driver.findElement(By.xpath("//button[@id=\"sixcontent\"]"));
					 	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
					 	executor1.executeScript("arguments[0].click();", element1);
				
				
					
				Thread.sleep(30000);
				
				
				JavascriptExecutor js101 = (JavascriptExecutor) driver;
				   js101.executeScript("window.scrollBy(0,800)");
				
				
				   driver.navigate().to("https://test.wazecapital.com/applications");
			        driver.manage().window().maximize();
			        Thread.sleep(2000);
			        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
			        Thread.sleep(2000);
			        Actions actn3=new Actions(driver);
			        actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[5]"))).click().build().perform();
			        Thread.sleep(9000);
			         driver.navigate().refresh();
			      	
			        JavascriptExecutor js2e= (JavascriptExecutor) driver;
			 	   js2e.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
	
	
	//note: tested
	
	
	
	
	
	
	
	//note: reject in what case
	 //2.which field needs to be update all the time in roder to get offers
	 
	
	
	
	
	
	
	
	
	
	
}
