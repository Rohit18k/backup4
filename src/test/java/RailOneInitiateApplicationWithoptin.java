

import java.util.Random;

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

public class RailOneInitiateApplicationWithoptin extends TestBase1{

	Random r=new Random();
	
	public RailOneInitiateApplicationWithoptin() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}

	/*
	 @Test(priority=1)
		public  void subaccountSettingRailOne() throws Exception {
			
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
			   Thread.sleep(2000);
			   Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
			   Thread.sleep(2000);
				select.selectByVisibleText("Rail One");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();}
	*/
	
	 @Test(priority=2) 	
	 public void createApplicationRailOnewithoptinprocess() throws Exception {
		  Thread.sleep(5000);	 
	 	   driver.navigate().to("https://test.wazecapital.com/applications/initiate");
	 	   driver.manage().window().maximize();
	 	      JavascriptExecutor js34 = (JavascriptExecutor) driver;
	 		   js34.executeScript("window.scrollBy(0,1200)");
	 		   Thread.sleep(5000);
	 		   Actions action=new Actions(driver); 
	 		   action.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
	 	
	 		  Thread.sleep(2000);
	 			String text=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/label[2]")).getText();
	 			System.out.println(text);
	 			String exp="Please enter First Name";
	 			Assert.assertEquals(text,exp);
	 			
	 		   try { 
	 				  driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).click();
	 			     driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[1]/div/input[1]")).sendKeys("Elizabeth");
	 				 }catch(Exception e) {
	 					 e.printStackTrace();
	 				 }
	 		   String text1=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/label[2]")).getText();
	 			System.out.println(text1);
	 			String exp1="Please enter Last Name";
	 			Assert.assertEquals(text1,exp1);
	 		   
	 		   try {
	 			   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).click();
	 			   driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[2]/div/input")).sendKeys("rai");
	 				 }catch(Exception e) {
	 					 e.printStackTrace();
	 				 }
	 		   String text2=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[3]/div/label[2]")).getText();
	 			System.out.println(text2);
	 			String exp2="Please enter Birth date";
	 			Assert.assertEquals(text2,exp2);
	 		   try { 	Thread.sleep(1000);
	 				  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).click();
	 				  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/09/2004");
	 				  String text21=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[3]/div/label[2]")).getText();
	 					System.out.println(text21);
	 					String exp21="You must be at least 18 years old!";
	 					Assert.assertEquals(text21,exp21);
	 					Thread.sleep(1000);
	 					 driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).clear();
	 				  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/21/1998");
	 				 }catch(Exception e) {
	 					 e.printStackTrace();
	 				 }
	 		   String text3=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[4]/div/label[2]")).getText();
	 			System.out.println(text3);
	 			String exp3="Please enter Social Security Number";
	 			Assert.assertEquals(text3,exp3);
	 		   try {
	 				  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).click();
	 				  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).sendKeys("678-98-9898");
	 				 }catch(Exception e) {
	 					 e.printStackTrace();
	 				 }
	 			 Thread.sleep(1000);
	 				String text4=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/label[2]")).getText();
	 				System.out.println(text4);
	 				String exp4="Please enter Estimated Annual Income";
	 				Assert.assertEquals(text4,exp4);
	 				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).sendKeys("assssddddf");
	 				
	 				String text41=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/label[2]")).getText();
	 				System.out.println(text41);
	 				String exp41="Please enter only numbers";
	 				Assert.assertEquals(text41,exp41);
	 				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).clear();
	 			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[1]/div[5]/div/input")).sendKeys("1200000");
	 			
	 			JavascriptExecutor js4 = (JavascriptExecutor) driver;	
	 			   js4.executeScript("window.scrollBy(0,20)");

	 			   String text10=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/label[2]")).getText();
	 				System.out.println(text10);
	 				String exp10="Please enter Cell Phone Number";
	 				Assert.assertEquals(text10,exp10);
	 				
	 				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).sendKeys("aasdsddd");
	 				
	 				   String text101=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/label[2]")).getText();
	 					System.out.println(text101);
	 					String exp101="Please enter digits only";
	 					Assert.assertEquals(text101,exp101);
	 					driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).clear();
	 			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[1]/div/input")).sendKeys("8569854589");
	 			
	 			 Thread.sleep(1000); 
	 			String text11=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/label[2]")).getText();
	 			System.out.println(text11);
	 			String exp11="Please enter Email";
	 			Assert.assertEquals(text11,exp11);
	 			Thread.sleep(1000);
	 			try {
	 				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/input")).sendKeys("mock+265@gmail@evenfinancial.com");
	 				driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/input")).clear();
	 		driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[2]/div/input")).sendKeys("mock+265@evenfinancial.com");}
	 			catch(Exception e) {
	 				 e.printStackTrace();
	 			 }
	 			   
	 			JavascriptExecutor js5 = (JavascriptExecutor) driver;
	 			   js5.executeScript("window.scrollBy(0,50)");
	 			
	 			   String text12=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/label[2]")).getText();
	 				System.out.println(text12);
	 				String exp12="Please enter Address";
	 				Assert.assertEquals(text12,exp12);
	 			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[3]/div/input")).sendKeys("Washington Dc");
	 			
	 			String text13=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/label[2]")).getText();
	 			System.out.println(text13);
	 			String exp13="Please enter City";
	 			Assert.assertEquals(text13,exp13);
	 			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[4]/div/input")).sendKeys("Indore");
	 			

	 			String text14=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[5]/div/label[2]")).getText();
	 			System.out.println(text14);
	 			String exp14="Please select State";
	 			Assert.assertEquals(text14,exp14);
	 			Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[5]/div/select")));
	 			slt2.selectByIndex(2);
	 			Thread.sleep(2000);
	 			
	 			String text15=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[6]/div/label[2]")).getText();
	 			System.out.println(text15);
	 			String exp15="Please enter Zipcode";
	 			Assert.assertEquals(text15,exp15);
	 			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[2]/div[6]/div/input")).sendKeys("12345");
	 			JavascriptExecutor js6 = (JavascriptExecutor) driver;
	 			   js6.executeScript("window.scrollBy(0,50)");
	 			
	 			String text16=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[1]/div/label[2]")).getText();
	 			System.out.println(text16);
	 			String exp16="Please select Loan Purpose";
	 			Assert.assertEquals(text16,exp16);
	 			Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[1]/div/select")));
	 			slt3.selectByIndex(2);
	 			String text17=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/label[2]")).getText();
	 			System.out.println(text17);
	 			String exp17="Please enter Amount Financed";
	 			Assert.assertEquals(text17,exp17);
	 			driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/input")).sendKeys("!@!@@##");
	 			String text171=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[3]/div[2]/div/label[2]")).getText();
	 			System.out.println(text171);
	 			String exp171="Please enter only numbers";
	 			Assert.assertEquals(text171,exp171);
	 			driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).clear();
	 			driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("1000000");
	 			driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).clear();
	 			driver.findElement(By.xpath("//input[@placeholder='EX: 10000']")).sendKeys("100000");
	 			
	 			
	 			   String text5=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[1]/div/label[2]")).getText();
	 				System.out.println(text5);
	 				String exp5="Please select Job Type";
	 				Assert.assertEquals(text5,exp5);
	 				
	 			try {
	 			Select slt45=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[1]/div/select")));
	 			slt45.selectByIndex(2);}catch(Exception e) {
	 				 e.printStackTrace();
	 			 }
	 			String text6=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[2]/div/label[2]")).getText();
	 			System.out.println(text6);
	 			String exp6="Please select Employment Pay Frequency";
	 			Assert.assertEquals(text6,exp6);
	 			
	 			try {
	 			Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[2]/div/select")));
	 			slt1.selectByIndex(2);	
	 			}catch(Exception e) {
	 				 e.printStackTrace();
	 			 }
	 			
	 			JavascriptExecutor js3 = (JavascriptExecutor) driver;
	 			   js3.executeScript("window.scrollBy(0,50)");
	 			   
	 			  String text7=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[3]/div/label[2]")).getText();
		 			System.out.println(text7);
		 			String exp7="Please select Estimated Credit Score";
		 			Assert.assertEquals(text7,exp7);
	 			   
	 			   
	 			   
	 				Select slt5=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[3]/div/select")));
	 				slt5.selectByValue("excellent");
	 				
	 				
	 				  String text8=driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[4]/div/label[2]")).getText();
			 			System.out.println(text8);
			 			String exp8="Please select Housing Status";
			 			Assert.assertEquals(text8,exp8);

	 				Select slt6=new Select(driver.findElement(By.xpath("//*[@id=\"application_form\"]/div[4]/div[4]/div/select")));
	 				slt6.selectByValue("rent");
	 				
	 				
	 				JavascriptExecutor js8 = (JavascriptExecutor) driver;
					   js8.executeScript("window.scrollBy(0,30)");
					driver.findElement(By.xpath("//*[@id=\"send_sms\"]")).click();
	 				
	 				
	 				
	 				try {
	 				Thread.sleep(2000);
	 				JavascriptExecutor js811= (JavascriptExecutor) driver;
	 				   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 		driver.findElement(By.cssSelector("#submit-btn")).click();}
	 				catch(Exception e) {
	 					e.printStackTrace();
	 				}
	 				   
	 				 Thread.sleep(12000);
	 				   
	 				 Actions action5=new Actions(driver);
	 				action5.moveToElement(driver.findElement(By.xpath("//*[@id=\"sms_history\"]/div/div/div[3]/button"))).click().build().perform();
	 				
	 				   
	 					 String url=driver.findElement(By.xpath("//*[@id=\"short_url\"]")).getText();
	 					 System.out.println(url);
	 					 String newurl="https://"+ url;
	 					 driver.switchTo().newWindow(WindowType.TAB);
	 					 driver.get(newurl);
	 					 
	 					 Thread.sleep(15000);
	 						 JavascriptExecutor js82 = (JavascriptExecutor) driver;
	 						   js82.executeScript("window.scrollBy(0,3000)");
	 						  WebElement element = driver.findElement(By.xpath("//*[@id=\"monevo_confirm_form\"]/div/div[1]/div/div/div/div/div/div[30]/div[2]/input"));
	 							WebElement el4=   driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/form/div/div[2]/button"));
	 							Thread.sleep(5000);
	 			Actions builder=new Actions(driver);
	 			builder.moveToElement(element).click().build().perform();
	 			Thread.sleep(3000);
	 	      driver.findElement(By.xpath("//*[@id=\"monevo_confirm_form\"]/div/div[1]/div/div/div/div/div/div[30]/div[4]/input")).click();
	 		
	 			Actions builder1=new Actions(driver);
	 			builder1.moveToElement(el4).click().build().perform(); 
	 			Thread.sleep(15000);
	 			Thread.sleep(7000);
	 	
	 }
	
	
	
	
	//note: need to ask with rakesh sir about railone optin form coz it is not applied to the railone
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
