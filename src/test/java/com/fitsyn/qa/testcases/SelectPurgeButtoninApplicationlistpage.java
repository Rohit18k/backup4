package com.fitsyn.qa.testcases;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class SelectPurgeButtoninApplicationlistpage extends TestBase1{
	Random r=new Random();

	public SelectPurgeButtoninApplicationlistpage() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	
    @Test(priority=1)
public void purgebutton() throws Exception {
	Thread.sleep(5000);
	 driver.switchTo().newWindow(WindowType.TAB);
	  driver.navigate().to("https://demo.fitsyn.com/applications");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"show_application\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[1]/label/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[2]/td[1]/label/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"delete_application\"]")).click();

	
	
}

    @Test(priority=2)
	public void statusStageMap() throws Exception {
		Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/statuses/system");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/nav/div/a/strong")).click();
		Thread.sleep(9000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[1]/div/div[1]/input[1]"))).click();
		String status="teststatus"+r.nextInt(1000);
		actn.sendKeys(status).build().perform();
		Actions actn1=new Actions(driver);
		actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"add-status-btn\"]"))).click().build().perform();
//		Thread.sleep(2000);
//		try {
//		String act=driver.findElement(By.xpath("/html/body/div[9]/span[3]")).getText(); 
//		System.out.println(act);
//		Assert.assertEquals(act,"Status successfully added");}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/statuses/stages/system");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[2]/strong")).click();
		Thread.sleep(9000);
		Actions actn2=new Actions(driver);
	actn2.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[1]/div/div[1]/input[1]"))).doubleClick();
	String stage="teststage"+r.nextInt(1000);
	actn2.sendKeys(stage).build().perform();
	
	Actions actn3=new Actions(driver);
	actn3.moveToElement(driver.findElement(By.xpath("//*[@id=\"add-stage-btn\"]"))).click().build().perform();
//	try{Thread.sleep(3000);
//	String act1=driver.findElement(By.xpath("/html/body/div[11]/span[3]")).getText(); 
//	System.out.println(act1);
//	Assert.assertEquals(act1,"Stage successfully added");}
//	catch(Exception e) {
//		e.printStackTrace();
//	}
	Thread.sleep(12000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div/div/div/table/tbody/tr[1]/td[3]/div/a")).click();
		Thread.sleep(9000);
		Actions actn4=new Actions(driver);
		actn4.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/form/div[1]/div/div/div[1]/div/div/input"))).click().build().perform();
		Thread.sleep(1000);
		List<WebElement>lt=	driver.findElements(By.xpath("//input[@id=(//label[@class='align-middle']/@for)]"));
		lt.get(lt.size()-1).click();
			Thread.sleep(1000);
		Actions actn5=new Actions(driver);
		actn5.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/form/div[2]/button[2]"))).click().build().perform();
		Thread.sleep(3000);
//		try {
//		String act2=driver.findElement(By.xpath("/html/body/div[11]/span[3]")).getText(); 
//		System.out.println(act2);
//		Assert.assertEquals(act2,"Status mapping updated.");}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
	
		Thread.sleep(5000);
		driver.navigate().to("https://demo.fitsyn.com/applications");
		driver.manage().window().maximize();//
		Thread.sleep(5000);
		JavascriptExecutor js5= (JavascriptExecutor) driver;
		   js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   
		   WebElement scrollArea1 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]"));
		   
		   Actions actn9=new Actions (driver);
		           actn9.moveToElement(scrollArea1).click().build().perform();
		        
		
		// Scroll to div's most right:
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea1);
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
		Thread.sleep(5000); 
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div/div/section/div/div[3]/div/div[2]/table/tbody/tr[1]/td[12]/a")).click();
		Thread.sleep(5000);
		Actions actn12=new Actions(driver); 
		actn12.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[1]/div/div/select"))).click().build().perform();
		Thread.sleep(5000);
	List<WebElement> lst=driver.findElements(By.xpath("//*[@id=\"stage_status\"]/option"));
	lst.get(lst.size()-1).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		JavascriptExecutor js6= (JavascriptExecutor) driver;
		   js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   
		   WebElement scrollArea2 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]"));
		   
		   Actions actn10=new Actions (driver);
		           actn10.moveToElement(scrollArea2).click().build().perform();
		        
		
		// Scroll to div's most right:
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea2);
		
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
		Thread.sleep(5000);
	
	String stagetext=driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/tbody/tr[1]/td[12]/a")).getText();
	System.out.println(stagetext);
	//Assert.assertEquals(stagetext,"Teststatus");

	}
    
    /*
    @Test(priority=3)
	public void sortcolumn() throws Exception {
	
	Thread.sleep(5000);
	  driver.navigate().to("https://demo.fitsyn.com/applications");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[4]/a")).click();//name
	List<WebElement> elemntlist=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[4]"));
	List<String>orignallist=elemntlist.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist);
	
	List<String>sortedlist=orignallist.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist);
	Thread.sleep(5000);

	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[2]/a")).click();//created
	List<WebElement> elemntlist1=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[2]"));
	List<String>orignallist1=elemntlist1.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist1);
	
	List<String>sortedlist1=orignallist1.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist1);
	Thread.sleep(5000);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[3]")).click();//loan amount
	List<WebElement> elemntlist2=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[3]"));//clientID
	List<String>orignallist2=elemntlist2.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist2);
	
	List<String>sortedlist2=orignallist2.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist2);
	Thread.sleep(5000);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[5]/a")).click();//email
	List<WebElement> elemntlist4=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[5]"));
	List<String>orignallist4=elemntlist4.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist4);
	
	List<String>sortedlist4=orignallist4.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist4);
	Thread.sleep(5000);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[6]")).click();//email
	List<WebElement> elemntlist5=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[6]"));//mobile
	List<String>orignallist5=elemntlist5.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist5);
	
	List<String>sortedlist5=orignallist5.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist5);
	Thread.sleep(5000);
	
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[7]/a")).click();//loan amount
	List<WebElement> elemntlist6=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[7]"));
	List<String>orignallist6=elemntlist6.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist6);
	
	List<String>sortedlist6=orignallist6.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist6);
	Thread.sleep(5000);
	
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[8]")).click();//loan amount
	List<WebElement> elemntlist7=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[8]"));//maximum approved
	List<String>orignallist7=elemntlist7.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist7);
	
	List<String>sortedlist7=orignallist7.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist7);
	Thread.sleep(5000);
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[9]/a")).click();//source
	List<WebElement> elemntlist8=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[9]"));
	List<String>orignallist8=elemntlist8.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist8);
	
	List<String>sortedlist8=orignallist8.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist8);
	Thread.sleep(5000);	
	
	
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[10]")).click();//loan amount
	List<WebElement> elemntlist9=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[10]"));//sub account
	List<String>orignallist9=elemntlist9.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist9);
	
	List<String>sortedlist9=orignallist9.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist9);
	Thread.sleep(10000);	
	
	   JavascriptExecutor js4= (JavascriptExecutor) driver;
	   js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   
	   WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]"));
	   
	   Actions actn=new Actions (driver);
	           actn.moveToElement(scrollArea).click().build().perform();
	        
	
	// Scroll to div's most right:
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea);
	
	Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[11]/a")).click();//status
	List<WebElement> elemntlist11=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[11]"));
	List<String>orignallist11=elemntlist11.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist11);
	
	List<String>sortedlist11=orignallist11.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist11);
	Thread.sleep(5000);	
	
	  JavascriptExecutor js41= (JavascriptExecutor) driver;
	   js41.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   
	   WebElement scrollArea1 = driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]"));
	   
	   Actions actn1=new Actions (driver);
	           actn1.moveToElement(scrollArea1).click().build().perform();
	        
	
	// Scroll to div's most right:
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", scrollArea1);
	
	Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[12]")).click();//loan amount
	List<WebElement> elemntlist12=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[12]"));//stage status
	List<String>orignallist12=elemntlist12.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist12);
	
	List<String>sortedlist12=orignallist12.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist12);
	Thread.sleep(5000);	
	
	
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"table_content\"]/div[2]/table/thead/tr/th[13]")).click();//loan amount
	List<WebElement> elemntlist13=driver.findElements(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr/td[13]"));//submitted Buy
	List<String>orignallist13=elemntlist13.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(orignallist13);
	
	List<String>sortedlist13=orignallist13.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist13);
	Thread.sleep(5000);	
	
	
	
	
	
	
	}
	
	
	*/
	
	

	
	
	
	
		
	}












