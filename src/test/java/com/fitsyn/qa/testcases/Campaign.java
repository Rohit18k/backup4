package com.fitsyn.qa.testcases;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;


public class Campaign extends TestBase1{

Random r=new Random();

	public Campaign() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}

	@Test(priority=1)
	public void createUser() throws Exception {
		Thread.sleep(4000);
		  driver.navigate().to("https://demo.fitsyn.com/users");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions actn=new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[3]"))).click().build().perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[1]/div/input")).click();
		String username="test"+r.nextInt(1000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[1]/div/input")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[2]/div/input")).sendKeys("team");
		Thread.sleep(3000);
		String email="test"+r.nextInt(1000)+"@uat.com";
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[3]/div/input")).sendKeys(email);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[4]/div/input")).sendKeys("6783359526");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mohini@12345678");	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[6]/div/input")).sendKeys("Mohini@12345678");
		Thread.sleep(3000);
		Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[7]/div/select")));
		Thread.sleep(3000);
		slt.selectByVisibleText("Representative");
		Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[1]/div[13]/div/select")));
		Thread.sleep(3000);
		slt1.selectByVisibleText("Chris Brows");
	    JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(3000);
		   Actions actn1=new Actions(driver);
		actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div/div/div/div/section/div/div/form/div[2]/button[1]"))).click().build().perform();
}
	
	
	@Test(priority=2)
	public void buyNumbercreateAgentGroup() throws Exception {
		Thread.sleep(2000);
//		  driver.navigate().to("https://demo.fitsyn.com/number/call");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		 JavascriptExecutor js= (JavascriptExecutor) driver;
//		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		   Thread.sleep(5000);
//		Actions actn=new Actions(driver);
//		actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[10]/td[5]/a/i"))).click().build().perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[10]/td[5]/button/i")).click();
//		Thread.sleep(2000);
//	List<WebElement>lst=driver.findElements(By.xpath("//*[@id=\"assign_user_select_box\"]/option"));
//	lst.get(lst.size()-1).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"assign-user-btn\"]")).click();
//		Thread.sleep(1000);
		driver.navigate().to("https://demo.fitsyn.com/agent_groups/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a/strong")).click();
		Thread.sleep(3000);
		 Actions actn2=new Actions(driver);
		actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"createAgentForm\"]/div[1]/div/div[1]/div/input"))).click().build().perform();
	String group="TestAgentsGroup"+	r.nextInt(1000);
		driver.findElement(By.xpath("//*[@id=\"createAgentForm\"]/div[1]/div/div[1]/div/input")).sendKeys(group);
		Thread.sleep(2000);
	List<WebElement>lt=	driver.findElements(By.xpath("//input[@id=(//label[@class='align-middle']/@for)]"));
	lt.get(1).click();
	lt.get(lt.size()-1).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createGroupBtn\"]")).click();
	}
	
	@Test(priority=3)
	public void createCampaign() throws Exception {		
		Thread.sleep(2000);
		  driver.navigate().to("https://demo.fitsyn.com/campaigns/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/a/strong")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[1]/div/div/input")).click();
		String campaign="testtingCampaign"+	r.nextInt(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[1]/div/div/input")).sendKeys(campaign);
		Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[2]/div[2]/div/span/span[1]/span/ul/li/input")).click();	
		Thread.sleep(3000);
	List<WebElement> lstt=driver.findElements(By.xpath("//*[@id=\"select2-inbound_number-results\"]/li"));
	Thread.sleep(2000);
	lstt.get(0).click();
	//lstt.get(1).click();
	//lstt.get(lstt.size()-1).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[3]/div/select")).click();
		Thread.sleep(1000);
		List<WebElement> lstt1=	driver.findElements(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[3]/div/select/option"));
		lstt1.get(lstt1.size()-1).click();  
	Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"text\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[7]/div/textarea")).sendKeys("agent available");	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"scheduler\"]")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[1]/div/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[1]/div/input")).click();
		Thread.sleep(1000);
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY");
		String startdate=  localDate.format(formatter);
		System.out.println(startdate);
		WebElement webl=	driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[1]/div/input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].value='';", webl);
		  webl.sendKeys(startdate);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[2]/div/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[2]/div/input")).click();
		Thread.sleep(2000);			
		WebElement webl1=	driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[2]/div/input"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		  js1.executeScript("arguments[0].value='0500AM';", webl1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[3]/div/input")).clear();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[3]/div/input")).click();
		Thread.sleep(2000);
		  LocalDate localDate1 = LocalDate.now();
		  LocalDate tomorrow = localDate1.plusDays(1);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd-YYYY");
		String enddate=  tomorrow.format(formatter1);
		System.out.println(enddate);
		WebElement webl2=	driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[3]/div/input"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		  js2.executeScript("arguments[0].value='';", webl2);
		  webl2.sendKeys(enddate);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[4]/div/input")).clear();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[4]/div/input")).click();
		Thread.sleep(2000);
		WebElement webl3=driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[4]/div/input"));
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		  js3.executeScript("arguments[0].value='0900AM';", webl3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[6]/div/select")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignForm\"]/div[1]/div[3]/div[11]/div/div[6]/div/select/option[3]")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"createCampaignBtn\"]")).click();	
		
	}
	

@Test(priority=4)	
public void uploadLeadsCampaignPage() throws Exception {
	Thread.sleep(2000);
	  driver.navigate().to("https://demo.fitsyn.com/campaigns/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"assign_lead\"]/div/table/tbody/tr[1]/td[8]/div/button")).click();	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"assign_lead\"]/div/table/tbody/tr[1]/td[8]/div/div/a[2]")).click();	
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id=\"upload_csv_file\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"upload_csv_file\"]")).sendKeys("C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\ReadExcelData\\userlist.csv");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"upload_csv_lead_btn\"]")).click();	
	Thread.sleep(3000);
	Actions actn=new Actions(driver);
	actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[1]/td[3]/select"))).click().build().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[1]/td[3]/select/option[2]")).click();
//	Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[1]/td[3]/select")));
//	Thread.sleep(1000);
//	slt.selectByVisibleText("First Name");
	Thread.sleep(1000);
	Select slt1=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[2]/td[3]/select")));
	Thread.sleep(1000);
	slt1.selectByVisibleText("Last Name");
	Thread.sleep(1000);
	Select slt2=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[3]/td[3]/select")));
	Thread.sleep(1000);
	slt2.selectByVisibleText("Mobile");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[3]/td[4]/label/span")).click();
	Thread.sleep(1000);
	Select slt3=new Select(driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[4]/td[3]/select")));
	Thread.sleep(1000);
	slt3.selectByVisibleText("Email");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"mapping_table\"]/tr[4]/td[5]/label/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"mapping_table_footer\"]/td[1]/label/span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"field-mapping-submit-btn\"]")).click();
}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

