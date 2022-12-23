package com.fitsyn.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class PublicFormInvalidJointApplication extends TestBase1{
	//pending to test

		public PublicFormInvalidJointApplication() {
		super();
		}
		
//		@BeforeTest
//		public void openBrowser() throws Exception {
//			initialization();
//		}

		@Test(priority=2)
		public void fillForm() throws Exception {
			Thread.sleep(7000);
			driver.navigate().to("https://loanenroll.demoserver.biz/index.html?vendor_id=5db2cadd07492e00180353d3");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
	        
	              JavascriptExecutor js = (JavascriptExecutor) driver;
	 	   js.executeScript("window.scrollBy(0,3500)");
	 	   Thread.sleep(5000);
	 	   Actions action=new Actions(driver);
	 	   action.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
	 	   
	         String actual1=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/label")).getText();
	         String exp1="Please enter Anual Income";
	         Assert.assertEquals(actual1, exp1);
	         
	         driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/input")).sendKeys("@@!###$#");
	         
	         String actual2=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/label")).getText();
	         String exp2="Please enter only numbers";
	         Assert.assertEquals(actual2, exp2);
	         
	         driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/input")).clear();
	         
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[2]/div/input")).sendKeys("800000");
	       
	       String actual3=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[3]/div/label")).getText();
	       String exp3="Please enter Loan Amount";
	       Assert.assertEquals(actual3, exp3);
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[3]/div/input")).sendKeys("1000000");
	       
	       String actual33=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[3]/div/label")).getText();
	       String exp33="Please enter amount less than or eaqual to 100000";
	       Assert.assertEquals(actual33, exp33);
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[3]/div/input")).clear();
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[3]/div/input")).sendKeys("100000");
	       
	       JavascriptExecutor js11 = (JavascriptExecutor) driver;
		   js11.executeScript("window.scrollBy(0,50)");
		   
		   String actual4=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[4]/div/label")).getText();
	       String exp4="Please Choose Loan Purpose";
	       Assert.assertEquals(actual4, exp4);
	    
		   
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[4]/div/div/button/span[1]")).click();
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[4]/div/div/div/ul/li[3]/a/span[1]")).click();
	    
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[5]/div/div/button/span[1]")).click();
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[5]/div/div/div/ul/li[1]/a/span[1]")).click();
	       
	       String actual5=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[7]/div/label")).getText();
	       String exp5="Please enter First Name";
	       Assert.assertEquals(actual5, exp5);
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[7]/div/input[1]")).sendKeys("12233333344");
	       
	       String actual6=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[7]/div/label")).getText();
	       String exp6="Please enter only alphabets";
	       Assert.assertEquals(actual6, exp6);
	       
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[7]/div/input[1]")).clear();
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[7]/div/input[1]")).sendKeys("Marisol");
	       
	       
	       String actual7=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/label")).getText();
	       String exp7="Please enter Last Name";
	       Assert.assertEquals(actual7, exp7);
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/input")).sendKeys("12233333344");
	       
	       String actual66=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[8]/div/label")).getText();
	       String exp66="Please enter only alphabets";
	       Assert.assertEquals(actual66, exp66);
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/input")).clear();
	    
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[8]/div/input")).sendKeys("Testcase");
	       
	       String actual8=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[9]/div/label")).getText();
	       String exp8="Please enter Birth Date";
	       Assert.assertEquals(actual8, exp8);
	       
	       driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("12/21/2004");
	       
	       String actual9=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[9]/div/label")).getText();
	       String exp9="You must be at least 18 years old!";
	       Assert.assertEquals(actual9, exp9);
	       
	       driver.findElement(By.xpath("//*[@id=\"dob\"]")).clear();
	       driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("12/21/1998");
	       Thread.sleep(5000);
	       
	       String actual10=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[10]/div/label")).getText();
	       String exp10="Please enter Email Address";
	       Assert.assertEquals(actual10, exp10);
	       
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[10]/div/input")).sendKeys("test@gmail@gmail.com");
	       
	       String actual99=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[10]/div/label")).getText();
	       String exp99="Please enter valid Email";
	       Assert.assertEquals(actual99, exp99);
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[10]/div/input")).clear();
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[10]/div/input")).sendKeys("mock+265@evenfinancial.com");
	       
	       String actual11=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[11]/div/label")).getText();
	       String exp11="Please enter Mobile Number";
	       Assert.assertEquals(actual11, exp11);
	       
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[11]/div/input")).sendKeys("$$$$$$$");
	       
	       String actual90=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[11]/div/label")).getText();
	       String exp90="Please enter only numbers";
	       Assert.assertEquals(actual90, exp90);
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[11]/div/input")).clear();
	       
	       driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[11]/div/input")).sendKeys("8569854589");
	       
	       String actual12=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[12]/div/label")).getText();
	       String exp12="Please enter Social Security Number";
	       Assert.assertEquals(actual12, exp12);
	       
	       driver.findElement(By.xpath("//*[@id=\"social_security_number\"]")).sendKeys("000000001");
	       
	       
	       JavascriptExecutor js12 = (JavascriptExecutor) driver;
	   	   js12.executeScript("window.scrollBy(0,60)");
	   	   
	   	  String actual13=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[14]/div/label")).getText();
	      String exp13="Please enter Address";
	      Assert.assertEquals(actual13, exp13);
	    
	   	  driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[14]/div/input")).sendKeys("220 Locust Ave");
	   	
	   	  
	   	  
	   	  
	   	  String actual14=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[15]/div/label")).getText();
	      String exp14="Please enter City";
	      Assert.assertEquals(actual14, exp14);
	   	  
	    
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[15]/div/input")).sendKeys("Metairie");

	  	  
		  String actual15=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[16]/div/label")).getText();
	      String exp15="Please Choose State";
	      Assert.assertEquals(actual15, exp15);
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[16]/div/div/button/span[1]")).click();
	 	  Thread.sleep(3000);
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[16]/div/div/div/ul/li[28]/a/span[1]")).click();
	   	   
	   	 String actual16=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[17]/div/label")).getText();
	     String exp16="Please enter Zip Code";
	     Assert.assertEquals(actual16, exp16);
	   	   
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[17]/div/input")).sendKeys("65088");
	   	Thread.sleep(3000);
	   	
	    String actual17=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[18]/div/label")).getText();
	    String exp17="Please Select Residence Type";
	    Assert.assertEquals(actual17, exp17);
	    
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[18]/div/div/button/span[1]")).click();
	   	Thread.sleep(3000);
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[18]/div/div/div/ul/li[2]/a/span[1]")).click();
	   	   
	   	 String actual18=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[19]/div/label")).getText();
	     String exp18="Please enter Monthly Rent";
	     Assert.assertEquals(actual18, exp18);
	   	   
	   	   
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[19]/div/input")).sendKeys("4000");
	   	   
	    	 String actual19=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[20]/div/label")).getText();
	         String exp19="Please enter Month at Address";
	         Assert.assertEquals(actual19, exp19);
	   	   
	   	   
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[20]/div/input")).sendKeys("56");
	   	   

	       JavascriptExecutor js13 = (JavascriptExecutor) driver;
	   	   js13.executeScript("window.scrollBy(0,80)");
	   	   
	  	 String actual20=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[22]/div/label")).getText();
	     String exp20="Please Choose Job Type";
	     Assert.assertEquals(actual20, exp20);
	   	    
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[22]/div/div/button/span[1]")).click();
	   	Thread.sleep(3000);
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[22]/div/div/div/ul/li[5]/a/span[1]")).click();
	   	   
	   	String actual21=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[23]/div/label")).getText();
	    String exp21="Please Choose Employment Pay Frequency";
	    Assert.assertEquals(actual21, exp21);
	  	    
	   	   
	   	   
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[23]/div/div/button/span[1]")).click();
	     	Thread.sleep(3000);
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[23]/div/div/div/ul/li[2]/a/span[1]")).click();
	   	   
	   	String actual22=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[25]/div/label")).getText();
	    String exp22="Please enter Employer Name";
	    Assert.assertEquals(actual22, exp22);
	   	   
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[25]/div/input")).sendKeys("SoftwareTech");
	   	   
	   	String actual23=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[26]/div/label")).getText();
	    String exp23="Please enter Month at Employer";
	    Assert.assertEquals(actual23, exp23);
	   	   
	   	   driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[26]/div/input")).sendKeys("12");
	   	   
	   	   
	   	 JavascriptExecutor js16 = (JavascriptExecutor) driver;
	 	   js16.executeScript("window.scrollBy(0,50)");
	 	   
	 	   driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/form/div/div[1]/div/div/div/div/div/div[28]/ul/li/div[1]/div/div/input")).click();
	 	   
	 	   driver.findElement(By.xpath("//*[@id=\"insertDetails\"]/div[2]/div/input")).sendKeys("cindrella");
	 	   driver.findElement(By.xpath("//*[@id=\"insertDetails\"]/div[3]/div/input")).sendKeys("Test");
	 	  Thread.sleep(3000);
	 	   driver.findElement(By.xpath("//*[@id=\"co_app_dob\"]")).sendKeys("12/21/1998");
	 	  driver.findElement(By.xpath("//*[@id=\"insertDetails\"]/div[5]/div/input")).sendKeys("000000002");
	 	   
	 	   driver.findElement(By.xpath("//*[@id=\"insertDetails\"]/div[6]/div/input")).sendKeys("71 ST. NICHOLAS DRIV");	   
	 	  Thread.sleep(3000);
	 	  driver.findElement(By.xpath("//*[@id=\"insertDetails\"]/div[7]/div/input")).sendKeys("NORTH POLE");

	 	  driver.findElement(By.xpath("//*[@id=\"insertDetails\"]/div[8]/div/div/button/span[1]")).click();
	 	 Thread.sleep(3000);
	 	 driver.findElement(By.xpath("//*[@id=\"insertDetails\"]/div[8]/div/div/div/ul/li[3]/a/span[1]")).click();
	 	 
	 	 driver.findElement(By.xpath("//*[@id=\"insertDetails\"]/div[9]/div/input")).sendKeys("99705");
	 	Thread.sleep(3000);
	 	driver.findElement(By.xpath("//*[@id=\"insertDetails\"]/div[10]/div/input")).sendKeys("100000");
	 	
		 JavascriptExecutor js17 = (JavascriptExecutor) driver;
		   js17.executeScript("window.scrollBy(0,30)");
		   
			String actual24=driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[30]/div/div[2]/label")).getText();
		    String exp24="This field is required.";
		    Assert.assertEquals(actual24, exp24);
	 	
	 	driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div/div[1]/div/div/div/div/div/div[30]/div/div[2]/input")).click();
	 	
	 driver.findElement(By.xpath("//*[@id=\"new_application_form\"]/div[1]/div/div/div/div/div/div/div[30]/div/div[3]/input")).click();

	 	
	 	 JavascriptExecutor js18 = (JavascriptExecutor) driver;
		   js18.executeScript("window.scrollBy(0,30)");
		
		   Actions action1=new Actions(driver);
	 	   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
	 	   
	 	   
	  	  Thread.sleep(9000);
	  	  
	    	 Thread.sleep(7000);
	     driver.navigate().to("https://demo.fitsyn.com/applications");
	     driver.manage().window().maximize();
	     Thread.sleep(7000);
	     driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/button")).click();
	     Thread.sleep(7000);
	     Actions actn3=new Actions(driver);
	     actn3.moveToElement( driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[16]/div/div/a[6]"))).click().build().perform();
	     Thread.sleep(60000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
	     Actions actn4=new Actions(driver);
	        actn4.moveToElement( driver.findElement(By.xpath("//*[@id=\"creditReport\"]/div"))).click().build().perform();
	        Thread.sleep(5000);
	        Actions actn5=new Actions(driver);
	        actn5.moveToElement( driver.findElement(By.xpath("//*[@id=\"creditCardContainer\"]/div/div/div[1]/div/div/label[2]/span"))).click().build().perform();
	        Thread.sleep(5000);
	   	
	        JavascriptExecutor js82 = (JavascriptExecutor) driver;
			   js82.executeScript("window.scrollBy(0,100)");
	 }
}
