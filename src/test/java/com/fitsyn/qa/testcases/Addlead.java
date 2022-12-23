package com.fitsyn.qa.testcases;




import java.util.List;

import java.util.Properties;
import java.util.Random;
import java.util.stream.Collectors;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;


public class Addlead  extends TestBase1{

	public Addlead() {
		super();
		}
	
	
//		@BeforeTest
//		public void openBrowser() throws Exception {
//			initialization();
//		}
		
	
//	@Test(priority=1)
//	public void systemSettingPage() throws Exception {
//		
//		Thread.sleep(5000);
//		driver.navigate().to("https://demo.fitsyn.com/settings/");
//		  driver.manage().window().maximize();
//		  JavascriptExecutor js= (JavascriptExecutor) driver;
//		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		  Thread.sleep(5000);
//		  Actions actn=new Actions(driver);
//		   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smtp_form_validation\"]/div[6]/div[37]/div/label[2]/span"))).click().build().perform();
//		   Thread.sleep(5000);
//		   Actions actn1=new Actions(driver);
//		   actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"submit-btn\"]"))).click().build().perform();
//		
//		
//	}
	
	
	
	@Test(priority=1)
public void addfirstlead() throws Exception {
	
	Thread.sleep(5000);
	driver.navigate().to("https://demo.fitsyn.com/leads");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"leads_filter_form\"]/div/div[10]/div/div//a")).click();
	  Thread.sleep(5000);
	   Actions actn=new Actions(driver);
	   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"form_campaign_div\"]/div//select"))).click().build().perform();
	   Thread.sleep(5000);
	List<WebElement>lst=  driver.findElements(By.xpath("//*[@id=\"form_campaign_div\"]/div/select/option"));
	lst.get(lst.size()-1).click();
	   Thread.sleep(2000);
	   
	   RandomStringUtils r=new RandomStringUtils();
	   String firstlead="Test"+r.randomAlphabetic(8);
	   driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys(firstlead);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("sophia");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/21/1998");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).sendKeys("678-98-9898");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"annual_gross_income\"]")).sendKeys("1200000");
	   Thread.sleep(2000);
	   JavascriptExecutor js = (JavascriptExecutor) driver;	
	   js.executeScript("window.scrollBy(0,80)");
	   
	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys(String.valueOf("4086577161"));
	     
	     Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("wcg.number@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Washington Dc");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("usa");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[4]/div[3]/div//select")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[4]/div[3]/div/select/option[46]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("12345");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"loan_purpose\"]/option[16]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div[1]/div/div[2]/div//input")).sendKeys("100000");
	   Thread.sleep(2000);
	   JavascriptExecutor js1 = (JavascriptExecutor) driver;	
	   js1.executeScript("window.scrollBy(0,80)");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"employment_status\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"employment_status\"]/option[5]")).click();
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"employer_name\"]")).sendKeys("Tech Solution");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"employment_pay_frequency\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"employment_pay_frequency\"]/option[5]")).click();
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"months_at_employer\"]")).sendKeys("24");
	   Thread.sleep(2000);
	   JavascriptExecutor js2 = (JavascriptExecutor) driver;	
	   js2.executeScript("window.scrollBy(0,100)");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"months_at_address\"]")).sendKeys("65");
//	   Thread.sleep(5000);
//	   driver.findElement(By.xpath("//*[@id=\"monthly_rent\"]")).sendKeys("6000");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"self_reported_credit_score\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"self_reported_credit_score\"]/option[2]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"housing_type\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"housing_type\"]/option[4]")).click();
	   Thread.sleep(5000);
	   JavascriptExecutor js3 = (JavascriptExecutor) driver;	
	   js3.executeScript("window.scrollBy(0,-200)");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"save_application_btn\"]/span")).click();
	   Thread.sleep(2000);
}
	@Test(priority=2)
public void addsecondlead() throws Exception {
	
	Thread.sleep(5000);
	driver.navigate().to("https://demo.fitsyn.com/leads");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"leads_filter_form\"]/div/div[10]/div/div//a")).click();
	  Thread.sleep(5000);	  
	  Thread.sleep(5000);
	   Actions actn=new Actions(driver);
	   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"form_campaign_div\"]/div//select"))).click().build().perform();
	   Thread.sleep(5000);
	List<WebElement>lst=  driver.findElements(By.xpath("//*[@id=\"form_campaign_div\"]/div/select/option"));
	lst.get(lst.size()-1).click();
	   Thread.sleep(2000);	   
	   RandomStringUtils r=new RandomStringUtils();
	   String firstlead1="Test"+r.randomAlphabetic(8);
	   driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys(firstlead1);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Emma");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("12/21/1998");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"ssn_number\"]")).sendKeys("678-98-9898");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"annual_gross_income\"]")).sendKeys("1200000");
	   Thread.sleep(2000);
	   JavascriptExecutor js = (JavascriptExecutor) driver;	
	   js.executeScript("window.scrollBy(0,80)");
	   
	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys(String.valueOf("4086577161"));
	     
	     Thread.sleep(2000);//wcg.number@gmail.com
	   driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("wcg.number@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Washington Dc");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("usa");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[4]/div[3]/div//select")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div[4]/div[3]/div/select/option[46]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("12345");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"loan_purpose\"]/option[16]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div[1]/div/div[2]/div//input")).sendKeys("100000");
	   Thread.sleep(2000);
	   JavascriptExecutor js1 = (JavascriptExecutor) driver;	
	   js1.executeScript("window.scrollBy(0,80)");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"employment_status\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"employment_status\"]/option[5]")).click();
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"employer_name\"]")).sendKeys("Tech Solution");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"employment_pay_frequency\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"employment_pay_frequency\"]/option[5]")).click();
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"months_at_employer\"]")).sendKeys("24");
	   Thread.sleep(2000);
	   JavascriptExecutor js2 = (JavascriptExecutor) driver;	
	   js2.executeScript("window.scrollBy(0,100)");
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//*[@id=\"months_at_address\"]")).sendKeys("65");
//	   Thread.sleep(5000);
//	   driver.findElement(By.xpath("//*[@id=\"monthly_rent\"]")).sendKeys("6000");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"self_reported_credit_score\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"self_reported_credit_score\"]/option[2]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"housing_type\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"housing_type\"]/option[4]")).click();
	   Thread.sleep(5000);
	   JavascriptExecutor js3 = (JavascriptExecutor) driver;	
	   js3.executeScript("window.scrollBy(0,-200)");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"save_application_btn\"]/span")).click();
	   Thread.sleep(2000);
}

	/*

	@Test(priority=4)
public void sortcolumn() throws Exception {
	
	Thread.sleep(5000);
	  driver.navigate().to("https://demo.fitsyn.com/leads");
	driver.manage().window().maximize();
	Thread.sleep(5000); 
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[1]/a")).click();//contact
	List<WebElement> elemntlist=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[1]"));
	List<String>orignallist=elemntlist.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist);
	
	List<String>sortedlist=orignallist.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist);
	Thread.sleep(5000);
	

	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[2]/a")).click();//campaign
	List<WebElement> elemntlist1=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[2]"));
	List<String>orignallist1=elemntlist1.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist1);
	
	List<String>sortedlist1=orignallist1.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist1);
	Thread.sleep(5000);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[3]/a")).click();//status
	List<WebElement> elemntlist2=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[3]"));
	List<String>orignallist2=elemntlist2.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist2);
	
	List<String>sortedlist2=orignallist2.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist2);
	Thread.sleep(5000);
	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[4]/a")).click();//date created
//	List<WebElement> elemntlist4=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[4]"));
//	List<String>orignallist4=elemntlist4.stream().map(s->s.getText()).collect(Collectors.toList());
//	System.out.println(orignallist4);
//	
//	List<String>sortedlist4=orignallist4.stream().sorted().collect(Collectors.toList());
//	System.out.println(sortedlist4);
//	Thread.sleep(5000);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[5]/a")).click();//AssignedAgent
	List<WebElement> elemntlist5=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]"));
	List<String>orignallist5=elemntlist5.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist5);
	
	List<String>sortedlist5=orignallist5.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist5);
	Thread.sleep(5000);
	
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[7]/a")).click();//loan amount
	List<WebElement> elemntlist6=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[7]"));
	List<String>orignallist6=elemntlist6.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist6);
	
	List<String>sortedlist6=orignallist6.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist6);
	Thread.sleep(5000);

//	Thread.sleep(10000);	
//	
//	   JavascriptExecutor js4= (JavascriptExecutor) driver;
//	   js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	   
//	   WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
//	   
//	   Actions actn=new Actions (driver);
//	           actn.moveToElement(scrollArea).click().build().perform();
//	        
//	
//	// Scroll to div's most right:
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);
//	
//	Thread.sleep(5000);
//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
	
	Thread.sleep(5000);
	Actions actn1=new Actions (driver);
	actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[11]/a"))).click().build().perform();
	List<WebElement> elemntlist11=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[11]"));//email
	List<String>orignallist11=elemntlist11.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist11);
	
	List<String>sortedlist11=orignallist11.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist11);
	Thread.sleep(5000);	
	
	
	/*
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[13]/a")).click();//housing type
	List<WebElement> elemntlist12=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[13]"));
	List<String>orignallist12=elemntlist12.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist12);
	
	List<String>sortedlist12=orignallist12.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist12);
	Thread.sleep(5000);	
	
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[14]/a")).click();//monthly rent
	List<WebElement> elemntlist13=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[14]"));
	List<String>orignallist13=elemntlist13.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist13);
	
	List<String>sortedlist13=orignallist13.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist13);
	Thread.sleep(5000);	
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[15]/a")).click();//loan purpose
	List<WebElement> elemntlist7=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[15]"));
	List<String>orignallist7=elemntlist7.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist7);
	
	List<String>sortedlist7=orignallist7.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist7);
	Thread.sleep(5000);
	Thread.sleep(10000);	
	
	   JavascriptExecutor js5= (JavascriptExecutor) driver;
	   js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   
	   WebElement scrollArea1 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div"));
	   
	   Actions actn2=new Actions (driver);
	           actn2.moveToElement(scrollArea1).click().build().perform();
	        
	
	// Scroll to div's most right:
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea1);
	
	Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[17]/a")).click();//employment status
	List<WebElement> elemntlist8=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[17]"));
	List<String>orignallist8=elemntlist8.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist8);
	
	List<String>sortedlist8=orignallist8.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist8);
	Thread.sleep(5000);	
	
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[18]/a")).click();//status
//	List<WebElement> elemntlist9=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[18]"));//sub account
//	List<String>orignallist9=elemntlist9.stream().map(s->s.getText()).collect(Collectors.toList());
//	System.out.println(orignallist9);
//	
//	List<String>sortedlist9=orignallist9.stream().sorted().collect(Collectors.toList());
//	System.out.println(sortedlist9);
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[19]/a")).click();//phone number
	List<WebElement> elemntlist14=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[19]"));
	List<String>orignallist14=elemntlist14.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist14);
	
	List<String>sortedlist14=orignallist14.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist14);
	Thread.sleep(5000);	
	
	
	}

	*/
	
	@Test(priority=3)
public void reAssignLeads() throws Exception {
	Thread.sleep(5000);
	  driver.navigate().to("https://demo.fitsyn.com/leads");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[5]//a")).click();//status
	Thread.sleep(2000); 
	Actions actn =new Actions(driver);
	actn.moveToElement(driver.findElement(By.xpath("//select[@id=\"assign_lead_select_box\"]"))).click().build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"assign_lead_select_box\"]/option[3]")).click();//status
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"assign-lead-btn\"]")).click();//status
	Thread.sleep(2000);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/thead/tr/th[20]/a//i")).click();//genraldetailscolumn
	Thread.sleep(2000);////*[@id="accordionOne"]/div/span/i[2]
	driver.findElement(By.xpath("//*[@id=\"accordionOne\"]/div/span/i[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[3]/div/div[2]/div/div[1]/div[2]/div/div/label[3]/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"accordionOne\"]/div/span/i[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"accordionTwo\"]/div/span/i[1]")).click();//leaddetails
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[3]/div/div[2]/div/div[2]/div[2]/div/div/label[2]/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"accordionTwo\"]/div/span/i[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"accordionFour\"]/div/span/i[1]")).click();//addressdetails
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[3]/div/div[2]/div/div[4]/div[2]/div/div/label[1]/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"accordionFour\"]/div/span/i[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"detailOne\"]/div/span/i[1]")).click();//applicationdetails
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div/section/div/div[3]/div/div[2]/div/div[5]/div[2]/div/div/label[3]/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"detailOne\"]/div/span/i[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/section/div/div[3]/div/div[1]/div[1]/a//i")).click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
}
	
	 @Test(priority=5)
		public void downloadCSVLeadList() throws Exception {
		Thread.sleep(7000);
	    driver.navigate().to("https://demo.fitsyn.com/leads");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"leads_filter_form\"]/div/div[8]/div/div/a")).click();
	    Thread.sleep(50000);
	    driver.navigate().to("https://demo.fitsyn.com/reports/report_request");
	    
	    Thread.sleep(180000);
	    driver.navigate().refresh();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/a/i")).click();
	    Thread.sleep(7000);
		
		
		
	  
		
		
	}
	 
	
}
	
	
	
	

	

