

import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

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

public class RailSixInitiateApplicationwithoptinRun extends TestBase1{
	Random r=new Random();

	public RailSixInitiateApplicationwithoptinRun() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}
	
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
		   Thread.sleep(2000);
		   Select select=new Select(driver.findElement(By.xpath("//*[@id=\"vendor_settings_form_validation\"]/div[2]/div[2]//select[@name='default_public_form']")));
		   Thread.sleep(2000);
			select.selectByVisibleText("Rail Six");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();}

	*/
	
	 @Test(priority=2) 	
public void createRailsixApplicationwithoptinRun() throws Exception {
		 Thread.sleep(5000);
		 
		  Actions action6=new Actions(driver);
		   action6.moveToElement( driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[8]"))).click().build().perform();
		   
		   Thread.sleep(5000);
		   try {
		   driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[8]/ul/li[3]/a")).click();}
		   catch(Exception e){
			   e.printStackTrace();
		   }
		   Thread.sleep(5000);
	   driver.manage().window().maximize();
	      JavascriptExecutor js34 = (JavascriptExecutor) driver;
		   js34.executeScript("window.scrollBy(0,1200)");
		   Thread.sleep(2000);
		   Actions action=new Actions(driver);
		   action.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
		   
			String text=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[1]/div/label[2]")).getText();
			System.out.println(text);
			String exp="Please enter First Name";
			Assert.assertEquals(text,exp);
			
		   try {
				  driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[1]/div/input[1]")).click();
				   RandomStringUtils r=new RandomStringUtils();
				   String withoptin="Rail"+r.randomAlphabetic(8);
			     driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[1]/div/input[1]")).sendKeys(withoptin);
				 }catch(Exception e) {
					 e.printStackTrace();
				 }
		   String text1=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[2]/div/label[2]")).getText();
			System.out.println(text1);
			String exp1="Please enter Last Name";
			Assert.assertEquals(text1,exp1);
		   
		   try {
			   driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[2]/div/input")).click();
			   
			   RandomStringUtils r=new RandomStringUtils();
			   String withoptin="Sixwithoptin"+r.randomAlphabetic(8);
			   
			   driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[2]/div/input")).sendKeys(withoptin);
				 }catch(Exception e) {
					 e.printStackTrace();
				 }
		   String text2=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[3]/div/label[2]")).getText();
			System.out.println(text2);
			String exp2="Please enter Birth date";
			Assert.assertEquals(text2,exp2); 
		   try {
				  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).click();
				  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/09/2004");
				  String text21=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[3]/div/label[2]")).getText();
					System.out.println(text21);
					String exp21="You must be at least 18 years old!";
					Assert.assertEquals(text21,exp21);
				
					 driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).clear();
				  driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/21/1998");
				 }catch(Exception e) {
					 e.printStackTrace();
				 }
		   String text3=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[4]/div/label[2]")).getText();
			System.out.println(text3);
			String exp3="Please enter Social Security Number";
			Assert.assertEquals(text3,exp3);
		   try {
				  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).click();
				  driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).sendKeys("123-65-3421");
				 }catch(Exception e) {
					 e.printStackTrace();
				 } 
		
				String text4=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[5]/div/label[2]")).getText();
				System.out.println(text4);
				String exp4="Please enter Monthly Income";
				Assert.assertEquals(text4,exp4);
				driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[5]/div/input")).sendKeys("assssddddf");
				
				String text41=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[5]/div/label[2]")).getText();
				System.out.println(text41);
				String exp41="Please enter only numbers";
				Assert.assertEquals(text41,exp41);
				driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[5]/div/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[1]/div[5]/div/input")).sendKeys("45000");
			
			JavascriptExecutor js4 = (JavascriptExecutor) driver;	
			   js4.executeScript("window.scrollBy(0,20)");
			   
			   Thread.sleep(1000);
			   String text10=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[1]/div/label[2]")).getText();
				System.out.println(text10);
				String exp10="Please enter Cell Phone Number";
				Assert.assertEquals(text10,exp10);
				
				driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[1]/div/input")).sendKeys("aasdsddd");
				
				   String text101=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[1]/div/label[2]")).getText();
					System.out.println(text101);
					String exp101="Please enter digits only";
					Assert.assertEquals(text101,exp101);
					driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[1]/div/input")).clear();
										
					Faker faker = new Faker(new Locale("en-IND"));
					String num=	faker.number().digits(10);

						String pattern="^(\\+91[\\-\\s]?)?[0]?(91)?[9]\\d{9}$";
						 if (Pattern.compile(pattern).matcher(num).matches()) {
						        System.out.println("yes");
						    } else {
						        System.out.println("no");
						    } 
					driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[1]/div/input")).sendKeys(num);
			
	
			String text11=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[2]/div/label[2]")).getText();
			System.out.println(text11);
			String exp11="Please enter Email";
			Assert.assertEquals(text11,exp11);
		
			try {
				
				
				String email="aut_test"+r.nextInt(1000)+"@gmail.com";
				
		driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[2]/div/input")).sendKeys(email);}
			catch(Exception e) {
				 e.printStackTrace();
			 }
			   
			   
			   String text12=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[3]/div/label[2]")).getText();
				System.out.println(text12);
				String exp12="Please enter Address";
				Assert.assertEquals(text12,exp12);
			driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[3]/div/input")).sendKeys("Washington Dc");
			
			String text13=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[4]/div/label[2]")).getText();
			System.out.println(text13);
			String exp13="Please enter City";
			Assert.assertEquals(text13,exp13);
			driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[4]/div/input")).sendKeys("USA");
			

			String text14=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[5]/div/label[2]")).getText();
			System.out.println(text14);
			String exp14="Please select State";
			Assert.assertEquals(text14,exp14);
			Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[5]/div/select")));
			 Thread.sleep(1000);
			slt2.selectByIndex(2);
	
			
			String text15=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[6]/div/label[2]")).getText();
			System.out.println(text15);
			String exp15="Please enter Zip Code";
			Assert.assertEquals(text15,exp15);
			driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[2]/div[6]/div/input")).sendKeys("78767");
			
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			   js6.executeScript("window.scrollBy(0,50)");
			
			   Thread.sleep(1000);
			String text17=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[3]/div[1]/div/label[2]")).getText();
			System.out.println(text17);
			String exp17="Please enter Amount Financed";
			Assert.assertEquals(text17,exp17);
			driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[3]/div[1]/div/input")).sendKeys("!@!@@##");
			
			String text171=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[3]/div[1]/div/label[2]")).getText();
			System.out.println(text171);
			String exp171="Please enter only numbers";
			Assert.assertEquals(text171,exp171);
			driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[3]/div[1]/div/input")).clear();
			driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[3]/div[1]/div/input")).sendKeys("10000");
			
			
			 String text8=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[3]/div[2]/div/label[2]")).getText();
				System.out.println(text8);
				String exp8="Please enter Monthly Mortgage / Monthly Rent";
				Assert.assertEquals(text8,exp8);
								
			
			driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[3]/div[2]/div/input")).sendKeys("4000");
			
			
			
			   String text5=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[4]/div[1]/div/label[2]")).getText();
				System.out.println(text5);
				String exp5="Please select Job Type";
				Assert.assertEquals(text5,exp5);
				
			try {
			Select slt45=new Select(driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[4]/div[1]/div/select")));
			 Thread.sleep(1000);
			slt45.selectByIndex(2);}catch(Exception e) {
				 e.printStackTrace();
			 }

			 String text6=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[4]/div[2]/div/label[2]")).getText();
				System.out.println(text6);
				String exp6="Please select Housing Status";
				Assert.assertEquals(text6,exp6);
				
				Select slt6=new Select(driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[4]/div[2]/div/select")));
				 Thread.sleep(1000);
				slt6.selectByValue("rent");
							
				JavascriptExecutor js61 = (JavascriptExecutor) driver;
				   js61.executeScript("window.scrollBy(0,50)");
			
				
				   String text7=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[5]/div[3]/div/label[2]")).getText();
					System.out.println(text7);
					String exp7="Please enter new_applicant_optional_phn";
					Assert.assertEquals(text7,exp7);								
				
					driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[5]/div[3]/div/input")).sendKeys("9452345844");
				
//				   String text81=driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[5]/div[2]/div/label[2]")).getText();
//					System.out.println(text81);
//					String exp81="Please enter Debt Amount";
//					Assert.assertEquals(text81,exp81);
//									
//				
//				driver.findElement(By.xpath("//*[@id=\"liberty_application_form\"]/div[5]/div[2]/div/input")).sendKeys("500");
//				
				
			
				try {
				Thread.sleep(2000);
				JavascriptExecutor js811= (JavascriptExecutor) driver;
				   js811.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				   
				   Thread.sleep(2000);
				   Actions action1=new Actions(driver);
				   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"send_sms\"]"))).click().build().perform();
				   
				   driver.findElement(By.cssSelector("#submit-btn")).click();}
				catch(Exception e) {
					e.printStackTrace();
				}
				   
		Thread.sleep(9000);
        driver.navigate().to("https://test.wazecapital.com/applications");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
        Thread.sleep(2000); 
        Actions actn3=new Actions(driver);
        actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[2]"))).click().build().perform();
        Thread.sleep(2000); 
    	Actions actn=new Actions(driver); 
    	actn.moveToElement(driver.findElement(By.xpath("/html/body/div[17]/div[7]/div/button"))).click().build().perform();
    	  Thread.sleep(5000); 
    		Actions actn1=new Actions(driver);
        	actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[17]/div[7]/div/button"))).click().build().perform();
        	 Thread.sleep(9000);
     		
    	 	 driver.navigate().refresh();
        
          	
            JavascriptExecutor js2= (JavascriptExecutor) driver;
     	   js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        	
        	
    	
	
		//note: tested
}

}
