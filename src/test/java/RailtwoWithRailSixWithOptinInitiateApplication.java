

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

public class RailtwoWithRailSixWithOptinInitiateApplication extends TestBase1{

	Random r=new Random();
	
	public RailtwoWithRailSixWithOptinInitiateApplication() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}

	/*
	
	 @Test(priority=1)
		public  void subaccountSettingRailTwoRailSix() throws Exception {
			
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
				select.selectByVisibleText("Rail Two");
				 Thread.sleep(2000);
				 
				 driver.findElement(By.xpath("//*[@id=\"submitToRailSixBlock\"]/div/label[2]/span")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"submit-btn\"]")).click();}
	
	
	*/
	
	 @Test(priority=2) 	
	 public void createRailtwoRailsixrwithoptinApplication() throws Exception {
			 
			 Thread.sleep(5000);
			 
			  Actions action6=new Actions(driver);
			   action6.moveToElement( driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[8]/a"))).click().build().perform();
			   
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("/html/body/nav/div[3]/ul/li[8]/ul/li[3]/a")).click();
			   Thread.sleep(5000);
		   driver.manage().window().maximize();
		      JavascriptExecutor js34 = (JavascriptExecutor) driver;
			   js34.executeScript("window.scrollBy(0,1200)");
			   Thread.sleep(2000);
			   Actions action=new Actions(driver);
			   action.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
			 
			
			   String text100=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[1]/div/label[2]")).getText();
		 		System.out.println(text100);
		 		String exp100="Please enter first name";
		 		Assert.assertEquals(text100,exp100);
		 		
		 	   try {
		 		   Thread.sleep(1000);
		 			  driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[1]/div/input[1]")).click();
		 			  RandomStringUtils r=new RandomStringUtils();
					   String withoutoptin="Railtwo"+r.randomAlphabetic(8);
		 			  
		 		     driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[1]/div/input[1]")).sendKeys(withoutoptin);
		 			 }catch(Exception e) {
		 				 e.printStackTrace();
		 			 }
		 	  
		 	   String text1=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[2]/div/label[2]")).getText();
		 		System.out.println(text1);
		 		String exp1="Please enter last name";
		 		Assert.assertEquals(text1,exp1);
		 	   
		 	   try {
		 		  Thread.sleep(1000);
		 		   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[2]/div/input")).click();
		 		  RandomStringUtils r=new RandomStringUtils();
				   String withoutoptin="Railsix"+r.randomAlphabetic(8);
		 		   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[2]/div/input")).sendKeys(withoutoptin);
		 			 }catch(Exception e) {
		 				 e.printStackTrace();
		 			 }
		 	   String text2=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[3]/div/label[2]")).getText();
		 		System.out.println(text2);
		 		String exp2="Please enter birth date";
		 		Assert.assertEquals(text2,exp2);
		 	   try {
		 			  driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
		 			  driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("12/09/2004");
		 			  String text21=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[3]/div/label[2]")).getText();
		 				System.out.println(text21);
		 				String exp21="You must be at least 18 years old.";
		 				Assert.assertEquals(text21,exp21);
		 				Thread.sleep(1000);
		 				 driver.findElement(By.xpath("//*[@id=\"dob\"]")).clear();
		 				 driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("12/21/1998");
		 			 }catch(Exception e) {
		 				 e.printStackTrace();
		 			 }
		 	   String text3=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[4]/div/label[2]")).getText();
		 		System.out.println(text3);
		 		String exp3="Please enter social security number";
		 		Assert.assertEquals(text3,exp3);
		 	   try {Thread.sleep(1000);
		 			  driver.findElement(By.xpath("//*[@id=\"social_security_number\"]")).click();
		 			  driver.findElement(By.xpath("//*[@id=\"social_security_number\"]")).sendKeys("636-81-5674");
		 			 }catch(Exception e) {
		 				 e.printStackTrace();
		 			 }
		 		
		 			String text4=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[5]/div/label[2]")).getText();
		 			System.out.println(text4);
		 			String exp4="Please enter estimated annual income";
		 			Assert.assertEquals(text4,exp4);
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[5]/div/input")).sendKeys("assssddddf");
		 			
		 			String text41=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[5]/div/label[2]")).getText();
		 			System.out.println(text41);
		 			String exp41="Please enter only digits.";
		 			Assert.assertEquals(text41,exp41);
		 			Thread.sleep(1000);
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[5]/div/input")).clear();
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[5]/div/input")).sendKeys("900000");
		 		
		 		JavascriptExecutor js4 = (JavascriptExecutor) driver;	
		 		   js4.executeScript("window.scrollBy(0,20)");
		 		   
		 		   String text5=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[1]/div/label[2]")).getText();
		 			System.out.println(text5);
		 			String exp5="Select Job Type";
		 			Assert.assertEquals(text5,exp5);
		 			
		 		try {
		 		Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[1]/div/select")));
		 		Thread.sleep(2000);
		 		slt.selectByIndex(1);}catch(Exception e) {
		 			 e.printStackTrace();
		 		 }
		 		String text6=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[2]/div/label[2]")).getText();
		 		System.out.println(text6);
		 		String exp6="Choose Pay Frequency";
		 		Assert.assertEquals(text6,exp6);
		 		
		 		try {
		 		Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[2]/div/select")));
		 		Thread.sleep(2000);
		 		slt1.selectByIndex(1);	
		 		}catch(Exception e) {
		 			 e.printStackTrace();
		 		 }
		 
		 		String text7=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[4]/div/label[2]")).getText();
		 		System.out.println(text7);
		 		String exp7="Please enter employer name";
		 		Assert.assertEquals(text7,exp7);
		 		try {
		 			Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[4]/div/input")).sendKeys("Northout solutions");}
		 		catch(Exception e) {
		 			 e.printStackTrace();
		 		 }
		 		 
		 		String text8=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[5]/div/label[2]")).getText();
		 		System.out.println(text8);
		 		String exp8="Please enter months at employer";
		 		Assert.assertEquals(text8,exp8);
		 		
		 		try {
		 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[5]/div/input")).sendKeys("FDSGFH");
		 		String text81=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[5]/div/label[2]")).getText();
		 		System.out.println(text81);
		 		String exp81="Please enter only digits.";
		 		Assert.assertEquals(text81,exp81);
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[5]/div/input")).clear();
		 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[2]/div[5]/div/input")).sendKeys("120");}
		 		catch(Exception e) {
		 			 e.printStackTrace();
		 		 }
		 		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 		   js2.executeScript("window.scrollBy(0,50)");
		 		   
		 		   String text10=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[1]/div/label[2]")).getText();
		 			System.out.println(text10);
		 			String exp10="Please enter Cell Phone";
		 			Assert.assertEquals(text10,exp10);
		 			
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[1]/div/input")).sendKeys("aasdsddd");
		 			
		 			   String text101=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[1]/div/label[2]")).getText();
		 				System.out.println(text101);
		 				String exp101="Please enter only digits.";
		 				Assert.assertEquals(text101,exp101);
		 				Thread.sleep(1000);
		 				driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[1]/div/input")).clear();
//		 				Faker faker = new Faker(new Locale("en-IND"));
//						String num=	faker.number().digits(10);
		 				driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[1]/div/input")).sendKeys("2345254411");
		 		

		 		String text11=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div/label[2]")).getText();
		 		System.out.println(text11);
		 		String exp11="Please enter Email";
		 		Assert.assertEquals(text11,exp11);
		 		
		 		try {
		 			Thread.sleep(1000);
		 			String email="railtwosix"+r.nextInt(1000)+"@gmail.com";
		 	driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div/input")).sendKeys(email);}
		 		catch(Exception e) {
		 			 e.printStackTrace();
		 		 }
		 		Thread.sleep(2000);
		 		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		 		   js5.executeScript("window.scrollBy(0,50)");
		 		   
		 		   String text12=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[3]/div/label[2]")).getText();
		 			System.out.println(text12);
		 			String exp12="Please enter address";
		 			Assert.assertEquals(text12,exp12);
		 			Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[3]/div/input")).sendKeys("US");
		 		
		 		String text13=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[4]/div/label[2]")).getText();
		 		System.out.println(text13);
		 		String exp13="Please enter city";
		 		Assert.assertEquals(text13,exp13);
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[4]/div/input")).sendKeys("Florida");
		 		
		 
		 		String text14=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[5]/div/label[2]")).getText();
		 		System.out.println(text14);
		 		String exp14="Select State";
		 		Assert.assertEquals(text14,exp14);
		 		Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[5]/div/select")));
		 		Thread.sleep(2000);
		 		slt2.selectByIndex(1);
		 		Thread.sleep(2000);
		 		
		 		String text15=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[6]/div/label[2]")).getText();
		 		System.out.println(text15);
		 		String exp15="Please enter zip code";
		 		Assert.assertEquals(text15,exp15);
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[6]/div/input")).sendKeys("51123");
		 		
		 		String text16=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[4]/div[1]/div/label[2]")).getText();
		 		System.out.println(text16);
		 		String exp16="Choose Loan Purpose";
		 		Assert.assertEquals(text16,exp16);
		 		Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[4]/div[1]/div/select")));
		 		Thread.sleep(2000);
		 		slt3.selectByIndex(1);
		 		
		 		String text17=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[4]/div[2]/div/label[2]")).getText();
		 		System.out.println(text17);
		 		String exp17="Please enter amount financed";
		 		Assert.assertEquals(text17,exp17);
		 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[4]/div[2]/div/input")).sendKeys("!@!@@##");
		 		String text171=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[4]/div[2]/div/label[2]")).getText();
		 		System.out.println(text171);
		 		String exp171="Please enter only digits.";
		 		Assert.assertEquals(text171,exp171);
		 		Thread.sleep(1000);
		 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[4]/div[2]/div/input")).clear();
		 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[4]/div[2]/div/input")).sendKeys("100000");
		 		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		 		   js3.executeScript("window.scrollBy(0,50)");
		 		   
		 			driver.findElement(By.xpath("//input[@id='co_app']")).click();
		 			Thread.sleep(1000);
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[5]/div[3]/div/input")).sendKeys("testing");
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[5]/div[4]/div/input")).sendKeys("twooffer");
		 			Thread.sleep(1000);
		 			driver.findElement(By.xpath("//*[@id=\"co_app_dob\"]")).sendKeys("12/21/1998");
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[5]/div[6]/div/input")).sendKeys("Dc states");
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[5]/div[7]/div/input")).sendKeys("Florida");
		 			Select slt4=new Select(driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[5]/div[8]/div/select")));
		 			Thread.sleep(2000);
		 			slt4.selectByIndex(1);
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[5]/div[9]/div/input")).sendKeys("45136");
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[5]/div[10]/div/input")).sendKeys("400000");
		 			
		 			String text172=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[1]/div/label[2]")).getText();
		 			System.out.println(text172);
		 			String exp172="Please enter months at current address";
		 			Assert.assertEquals(text172,exp172);
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[1]/div/input")).sendKeys("&%$$$%%");
		 			String text173=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[1]/div/label[2]")).getText();
			 		System.out.println(text173);
			 		String exp173="Please enter only digits.";
			 		Assert.assertEquals(text173,exp173);
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[1]/div/input")).clear();
			 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[1]/div/input")).sendKeys("600");
			 		
			 		
			 		
			 		String text1721=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[2]/div/label[2]")).getText();
		 			System.out.println(text1721);
		 			String exp1721="Please enter Monthly Mortgage / Monthly Rent";
		 			Assert.assertEquals(text1721,exp1721);
		 			driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[2]/div/input")).sendKeys("&%$$$%%");
		 			String text1731=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[2]/div/label[2]")).getText();
			 		System.out.println(text1731);
			 		String exp1731="Please enter only numbers";
			 		Assert.assertEquals(text1731,exp1731);
			 		Thread.sleep(1000);
			 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[2]/div/input")).clear();
			 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[2]/div/input")).sendKeys("2000");
			 		
			 		
		 	
		 			String text161=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[3]/div/label[2]")).getText();
			 		System.out.println(text161);
			 		String exp161="Choose Estimated Credit Score";
			 		Assert.assertEquals(text161,exp161);
			 		Select slt5=new Select(driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[3]/div/select")));
			 		Thread.sleep(2000);
		 			slt5.selectByValue("4");
		 			
		 			
		 			String text1611=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[4]/div/label[2]")).getText();
			 		System.out.println(text1611);
			 		String exp1611="Choose Applicant Housing Status";
			 		Assert.assertEquals(text1611,exp1611);
			 		Select slt6=new Select(driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[6]/div[4]/div/select")));
			 		Thread.sleep(2000);
		 			slt6.selectByValue("1");
		 			
//		 			String text131=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[7]/div[2]/label[2]")).getText();
//			 		System.out.println(text131);
//			 		String exp131="Please enter Debt Amount";
//			 		Assert.assertEquals(text131,exp131);
//			 		Thread.sleep(1000);
//			 		driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[7]/div[2]/input")).sendKeys("800");
		 			
			 		
     JavascriptExecutor js21= (JavascriptExecutor) driver;
	   js21.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   Thread.sleep(2000);
	   Actions action11=new Actions(driver);
	   action11.moveToElement(driver.findElement(By.xpath("//*[@id=\"send_sms\"]"))).click().build().perform();
	   Thread.sleep(1000);
	   Actions action1=new Actions(driver);
	   action1.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();
	 
	   Thread.sleep(9000);
	   try {
	  WebElement closebutton=  driver.findElement(By.xpath("//*[@id=\"sms_history\"]/div/div/div[3]/button"));
	  
	   if (closebutton.isDisplayed()) {
		   closebutton.click();
		   Thread.sleep(5000);
		   String url=driver.findElement(By.xpath("//*[@id=\"short_url\"]")).getText();
			 System.out.println(url);
			 String newurl="https://"+ url;
			 driver.switchTo().newWindow(WindowType.TAB);
			 driver.get(newurl); 
	   }}
	   catch(Exception e ) {
		  e.printStackTrace();
	   }
	
	   try {
	   Thread.sleep(5000);
	   String url=driver.findElement(By.xpath("//*[@id=\"short_url\"]")).getText();
		 System.out.println(url);
		 String newurl="https://"+ url;
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get(newurl);
	   
	   }
	   catch(Exception e ) {
			  e.printStackTrace();
		   }
	   
		 Thread.sleep(15000);
		 
		 JavascriptExecutor js82 = (JavascriptExecutor) driver;
		   js82.executeScript("window.scrollBy(0,2200)");
		   Thread.sleep(2000); 
			   WebElement element = driver.findElement(By.xpath("/html/body/div[5]/div[1]/form/div[6]/div[2]/div/input"));
			WebElement el4=   driver.findElement(By.xpath("//*[@id=\"submit-btn2\"]"));
Actions builder=new Actions(driver);
builder.moveToElement(element).click().build().perform();


Actions builder1=new Actions(driver);
builder1.moveToElement(el4).click().build().perform();

Thread.sleep(20000);
driver.navigate().refresh();

JavascriptExecutor js211= (JavascriptExecutor) driver;
js211.executeScript("window.scrollTo(0, document.body.scrollHeight)");

Thread.sleep(5000);
driver.navigate().to("https://test.wazecapital.com/applications");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/button")).click();
Thread.sleep(2000);
Actions actn3=new Actions(driver);
actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[16]/div/div/a[1]"))).click().build().perform();
	


try {
	   Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[1]/div/input[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[1]/div/input[1]")).clear();
		  RandomStringUtils r=new RandomStringUtils();
		   String withoutoptin="Railtwo"+r.randomAlphabetic(8);
		  
	     driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[1]/div/input[1]")).sendKeys(withoutoptin);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }

try {
	  Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[2]/div/input")).click();
	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[2]/div/input")).clear();
	  RandomStringUtils r=new RandomStringUtils();
	   String withoutoptin="Railsix"+r.randomAlphabetic(8);
	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div[2]/div/input")).sendKeys(withoutoptin);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }


String email="resubmitsixoptin"+r.nextInt(1000)+"@gmail.com";
driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div/input")).click();
driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div/input")).clear();
driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[3]/div[2]/div/input")).sendKeys(email);


JavascriptExecutor js215= (JavascriptExecutor) driver;
js215.executeScript("window.scrollTo(0, document.body.scrollHeight)");
Thread.sleep(2000);
Actions action111=new Actions(driver);
action111.moveToElement(driver.findElement(By.xpath("//*[@id=\"send_sms\"]"))).click().build().perform();
Thread.sleep(1000);
Actions action145=new Actions(driver);
action145.moveToElement(driver.findElement(By.cssSelector("#submit-btn"))).click().build().perform();

Thread.sleep(9000);
try {
WebElement closebutton=  driver.findElement(By.xpath("//*[@id=\"sms_history\"]/div/div/div[3]/button"));

if (closebutton.isDisplayed()) {
	   closebutton.click();
	   Thread.sleep(5000);
	   String url=driver.findElement(By.xpath("//*[@id=\"short_url\"]")).getText();
		 System.out.println(url);
		 String newurl="https://"+ url;
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get(newurl); 
}}
catch(Exception e ) {
	  e.printStackTrace();
}

try {
Thread.sleep(5000);
String url=driver.findElement(By.xpath("//*[@id=\"short_url\"]")).getText();
	 System.out.println(url);
	 String newurl="https://"+ url;
	 driver.switchTo().newWindow(WindowType.TAB);
	 driver.get(newurl);

}
catch(Exception e ) {
		  e.printStackTrace();
	   }

	 Thread.sleep(15000);
	 
	 JavascriptExecutor js821 = (JavascriptExecutor) driver;
	   js821.executeScript("window.scrollBy(0,2200)");
	   Thread.sleep(2000); 
		   WebElement element1 = driver.findElement(By.xpath("/html/body/div[5]/div[1]/form/div[6]/div[2]/div/input"));
		WebElement el41=   driver.findElement(By.xpath("//*[@id=\"submit-btn2\"]"));
Actions builder12=new Actions(driver);
builder12.moveToElement(element1).click().build().perform();


Actions builder13=new Actions(driver);
builder13.moveToElement(el41).click().build().perform();

Thread.sleep(20000);
driver.navigate().refresh();

JavascriptExecutor js2114= (JavascriptExecutor) driver;
js2114.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	
	 }
	
	//note: need to run with resubmit optin //pending to test
}
	
	

