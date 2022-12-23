

import java.util.Locale;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;
import com.github.javafaker.Faker;

public class RailSixCreateApplicationPublicForm extends TestBase1{
	Random r=new Random();

	public RailSixCreateApplicationPublicForm() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
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
			public void publicForm() throws Exception {
				Thread.sleep(5000); 
				driver.navigate().to("https://test1.wazecapital.com/rail_six.html?vendor_id=60be31dc457c420008444b80");
				driver.manage().window().maximize();

				JavascriptExecutor js = (JavascriptExecutor) driver;
				   js.executeScript("window.scrollBy(0,1400)");
				   Thread.sleep(5000);
				   Actions action=new Actions(driver);
				   action.moveToElement(driver.findElement(By.xpath("//button[@id=\"submit-btn\"] "))).click().build().perform();
				   
				   
				   Thread.sleep(2000);
	
			
					String text=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[1]/div/label")).getText();
					System.out.println(text);
					String exp="Please enter First Name";
					Assert.assertEquals(text,exp);
					
				   try {
						  driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[1]/div/input[1]")).click();
						  RandomStringUtils r=new RandomStringUtils();
						   String publicform="Testing"+r.randomAlphabetic(8);
						  driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[1]/div/input[1]")).sendKeys(publicform);
						 }catch(Exception e) {
							 e.printStackTrace();
						 }
				   String text1=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/label")).getText();
					System.out.println(text1);
					String exp1="Please enter Last Name";
					Assert.assertEquals(text1,exp1);
				   
				   try {
					   driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/input")).click();
					   
					   
					   RandomStringUtils r=new RandomStringUtils();
					   String publicform="publicform"+r.randomAlphabetic(8);
					   driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/input")).sendKeys(publicform);
						 }catch(Exception e) {
							 e.printStackTrace();
						 }
				   String text2=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[3]/div/label")).getText();
					System.out.println(text2);
					String exp2="Please enter Date of Birth";
					Assert.assertEquals(text2,exp2);
				   try {
						  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).click();
						  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/09/2004");
						  String text21=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[3]/div/label")).getText();
							System.out.println(text21);
							String exp21="You must be at least 18 years old!";
							Assert.assertEquals(text21,exp21);
							Thread.sleep(1000);
							 driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).clear();
						  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/21/1998");
						 }catch(Exception e) {
							 e.printStackTrace();
						 }
				   String text3=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[4]/div/label")).getText();
					System.out.println(text3);
					String exp3="Please enter Social Security Number";
					Assert.assertEquals(text3,exp3);
				   try {
						  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).click();

						  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).sendKeys("567-12-4565");
						 }catch(Exception e) {
							 e.printStackTrace();
						 }
					
						String text4=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/label")).getText();
						System.out.println(text4);
						String exp4="Please enter Estimated Monthly Income";
						Assert.assertEquals(text4,exp4);
						driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/input")).sendKeys("assssddddf");
						
						String text41=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/label")).getText();
						System.out.println(text41);
						String exp41="Please enter only numbers";
						Assert.assertEquals(text41,exp41);
						driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/input")).clear();
						driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/input")).sendKeys("45000");
					
					JavascriptExecutor js4 = (JavascriptExecutor) driver;	
					   js4.executeScript("window.scrollBy(0,20)");
					   
					   String text10=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/label")).getText();
						System.out.println(text10);
						String exp10="Please enter Cell Phone Number";
						Assert.assertEquals(text10,exp10);
						
						driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/input")).sendKeys("aasdsddd");
						
						   String text101=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/label")).getText();
							System.out.println(text101);
							String exp101="Please enter only numbers";
							Assert.assertEquals(text101,exp101);
							driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/input")).clear();
														
//							Faker faker = new Faker(new Locale("en-IND"));
//							String num=	faker.number().digits(10);
							driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/input")).sendKeys("2345254411");
					
			
					String text11=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[9]/div/label")).getText();
					System.out.println(text11);
					String exp11="Please enter Email";
					Assert.assertEquals(text11,exp11);
					Thread.sleep(1000);
					try {
						
						
						String email="autotest"+r.nextInt(1000)+"@gmail.com";
				driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[9]/div/input")).sendKeys(email);}
					catch(Exception e) {
						 e.printStackTrace();
					 }
					   
					JavascriptExecutor js5 = (JavascriptExecutor) driver;
					   js5.executeScript("window.scrollBy(0,50)");
					   
					   String text12=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[10]/div/label")).getText();
						System.out.println(text12);
						String exp12="Please enter Address";
						Assert.assertEquals(text12,exp12);
					driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[10]/div/input")).sendKeys("Washington Dc");
					

					
					String text13=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[11]/div/label")).getText();
					System.out.println(text13);
					String exp13="Please enter City";
					Assert.assertEquals(text13,exp13);
					driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[11]/div/input")).sendKeys("usa");
	
					   
					String text14=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[12]/div/label")).getText();
					System.out.println(text14);
					String exp14="Please select State";
					Assert.assertEquals(text14,exp14);
			driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[12]/div/div/button/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[12]/div/div/div/ul/li[6]/a/span[1]")).click();
			
					
					String text15=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[13]/div/label")).getText();
					System.out.println(text15);
					String exp15="Please enter Zip Code";
					Assert.assertEquals(text15,exp15);
					driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[13]/div/input")).sendKeys("78567");
					
					JavascriptExecutor js6 = (JavascriptExecutor) driver;
					   js6.executeScript("window.scrollBy(0,90)");
					   
					   
					   String text17=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[15]/div/label")).getText();
						System.out.println(text17);
						String exp17="Please enter Loan Amount";
						Assert.assertEquals(text17,exp17);
						driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[15]/div/input")).sendKeys("!@!@@##");
						String text171=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[15]/div/label")).getText();
						System.out.println(text171);
						String exp171="Please enter only number";
						Assert.assertEquals(text171,exp171);
						driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[15]/div/input")).clear();
						driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[15]/div/input")).sendKeys("20000");
					   		   
					   
					
					String text16=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[16]/div/label")).getText();
					System.out.println(text16);
					String exp16="Please enter Monthly Rent";
					Assert.assertEquals(text16,exp16);
		
					driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[16]/div/input")).sendKeys("3000");
			
					
					
				
					   String text5=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[18]/div/label")).getText();
						System.out.println(text5);
						String exp5="Please select Job Type";
						Assert.assertEquals(text5,exp5);
			
					try { 
					driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[18]/div/div/button/span[1]")).click();
					Thread.sleep(1000);
			        driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[18]/div/div/div/ul/li[1]/a/span[1]")).click();}
					catch(Exception e) {
						 e.printStackTrace();
					 }
					String text6=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[19]/div/label")).getText();
					System.out.println(text6);
					String exp6="Please select Housing Status";
					Assert.assertEquals(text6,exp6);
					
					try {
					driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[19]/div/div/button/span[1]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[19]/div/div/div/ul/li[3]/a/span[1]")).click();
					}catch(Exception e) {
						 e.printStackTrace();
					 }
					
//					JavascriptExecutor js3 = (JavascriptExecutor) driver;
//					   js3.executeScript("window.scrollBy(0,50)");
//					   
//					   
//					   String text7=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[22]/div/label")).getText();
//						System.out.println(text7);
//						String exp7="Please enter Debt Amount";
//						Assert.assertEquals(text7,exp7);
//					
//						driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[22]/div/input")).sendKeys("5000");
//						
						
//						  String text8=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[22]/div/label")).getText();
//							System.out.println(text8);
//							String exp8="Please enter cust_5";
//							Assert.assertEquals(text8,exp8);
//								
//					    driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[1]/div/div/div/div/div/div[22]/div/input")).sendKeys("5678765467");
//							
//						
						JavascriptExecutor js56 = (JavascriptExecutor) driver;
						   js56.executeScript("window.scrollBy(0,70)");
						   
						   
						   String text7=driver.findElement(By.xpath("//*[@id=\"custom_fields\"]/div[2]/div[3]/div/label")).getText();
							System.out.println(text7);
							String exp7="Please enter app_phn";
							Assert.assertEquals(text7,exp7);
							driver.findElement(By.xpath("//*[@id=\"custom_fields\"]/div[2]/div[3]/div/input")).click();
						
						
							driver.findElement(By.xpath("//*[@id=\"custom_fields\"]/div[2]/div[3]/div/input")).sendKeys("9452145874");
						   
						   Thread.sleep(2000);
		
				WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div/div[2]/div/div/input"));
				WebElement submit= driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")); 
				
				Actions actn1=new Actions(driver);
				actn1.moveToElement(checkbox).click().build().perform();
				  Actions actn2=new Actions(driver);
					actn2.moveToElement(submit).click().build().perform();
					Thread.sleep(12000);
					
					  JavascriptExecutor js21= (JavascriptExecutor) driver;
				 	   js21.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					
				 	  Thread.sleep(9000);
			        driver.navigate().to("https://test.wazecapital.com/applications");
			        driver.manage().window().maximize();
			        Thread.sleep(2000);
			        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
			        Thread.sleep(2000);
			        Actions actn3=new Actions(driver);
			        actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[5]"))).click().build().perform();
			        Thread.sleep(9000);
			         driver.navigate().refresh();
			      	
			        JavascriptExecutor js2= (JavascriptExecutor) driver;
			 	   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			}
	 
	 
	 
	//note: tesed with 2345254411
	 
	 
	 

}
