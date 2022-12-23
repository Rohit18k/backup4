package com.fitsyn.qa.multipletestcases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class DripLogicRVM extends TestBase1{


	public DripLogicRVM() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
	
	  @Test(priority=1)
	    public void createRVMDripLogic() throws Exception { 
	    	
	    	Thread.sleep(5000);//pending to test
			driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
			 driver.manage().window().maximize();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/nav/div/div[2]/a[1]/strong")).click();
			  Thread.sleep(5000);
			   Actions actn=new Actions(driver);
			   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"save_drip_schedular_form\"]/div[1]/div/div/div[1]/div//input"))).click().build().perform();
			   Random r=new Random();
			   String username="Test_Driplogic"+r.nextInt(1000);
			   driver.findElement(By.xpath("//*[@id=\"save_drip_schedular_form\"]/div[1]/div/div/div[1]/div//input")).sendKeys(username);
			   Thread.sleep(5000);
			   driver.findElement(By.xpath("//*[@id=\"schedular_campaign\"]")).click();
			   Thread.sleep(5000);
			List<WebElement> lst=  driver.findElements(By.xpath("//*[@id=\"schedular_campaign\"]/option"));
			lst.get(lst.size()-1).click();
			   Thread.sleep(5000);
				LocalDate localDate = LocalDate.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY");
				String startdripdate=  localDate.format(formatter);
				System.out.println(startdripdate);
			   driver.findElement(By.xpath("//*[@id=\"scheduler_start_date\"]//input")).sendKeys(startdripdate);
			   Thread.sleep(5000);
			   driver.findElement(By.xpath("//*[@id=\"save_drip_schedular_form\"]/div[1]/div/div/div[4]/div//input")).sendKeys("10");
			   Thread.sleep(5000);
			   driver.findElement(By.xpath("//*[@id=\"schedular_drip_limit\"]")).click();
			   Thread.sleep(5000);
			   driver.findElement(By.xpath("//*[@id=\"schedular_drip_limit\"]/option[2]")).click();
			   Thread.sleep(5000);
			   driver.findElement(By.xpath("//*[@id=\"drip-scheduler-submit-btn\"]")).click();
			   Thread.sleep(7000);
	 }
	
	
	  @Test(priority=2)
	    public void editandAddRVMDrip() throws Exception {
	    	Thread.sleep(7000);
			driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
			 driver.manage().window().maximize();
			  Thread.sleep(5000);
			   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/div//button")).click();//Action
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/div/div/a[3]")).click();//edit
			   Thread.sleep(7000);
			  JavascriptExecutor js= (JavascriptExecutor) driver;
			   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			   Thread.sleep(7000);
			   Actions actn=new Actions(driver);
			   actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"smart_add_drip_url\"]"))).click().build().perform();
				Thread.sleep(7000);
				driver.switchTo().frame(0);
				Thread.sleep(7000); 
				WebElement element = driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[2]/ul/li[3]/a"));//rvm drip
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", element);
			   Thread.sleep(5000); 
			   driver.findElement(By.xpath("//*[@id=\"append_drip_section\"]/div/div/div[1]//a")).click();
			   Thread.sleep(5000);  
			   driver.findElement(By.xpath("//*[@id=\"rvm_panel0\"]/div/div/div[1]/div/input")).sendKeys("5");
			   Thread.sleep(5000); 
			   driver.findElement(By.xpath("//*[@id=\"rvm_panel0\"]/div/div/div[2]/div/select")).click();
			   Thread.sleep(5000);
		List<WebElement> lst=driver.findElements(By.xpath("//*[@id=\"rvm_panel0\"]/div/div/div[2]/div/select/option"));
		lst.get(lst.size()-1).click();
			   Thread.sleep(5000);
			   driver.findElement(By.xpath("//*[@id=\"rvm_panel0\"]/div/div/div[4]/div/span/span[1]/span/ul/li/input")).sendKeys("2345254411");
			   Thread.sleep(5000); 		   
			   driver.findElement(By.xpath("//*[@id=\"rvm_panel0\"]/div/div/div[4]/div/select/option[6]")).click();   
				  Thread.sleep(5000);
			   driver.findElement(By.xpath("//*[@id=\"scheduled-drip-container\"]/div[4]/button[1]")).click();
			   Thread.sleep(5000); 
	} 
	

	
//	  @Test(priority=3)
//		public void clickEditbutton() throws Exception {
//			Thread.sleep(7000);
//			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)");
//			Thread.sleep(2000);
//			 Actions actn=new Actions(driver);
//			   actn.moveToElement(driver.findElement(By.xpath("//button[@id=\"drip-scheduler-submit-btn\"]"))).click().build().perform();
//				Thread.sleep(7000);
//				
//		} 
	 
	    @Test(priority=4)
		public void startRVMdrip() throws Exception {
			Thread.sleep(7000);
			driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
			 driver.manage().window().maximize();
			  Thread.sleep(5000);
			  Actions actn=new Actions(driver);
			  actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]//a"))).click().build().perform();
				Thread.sleep(7000);
				driver.findElement(By.xpath("/html/body/div[10]/div[7]/div//button")).click();
				Thread.sleep(7000);
//				driver.findElement(By.xpath("/html/body/div[10]//div[@class='sa-button-container']/div[@class='sa-confirm-button-container']//button")).click();
//				Thread.sleep(7000);
			Thread.sleep(7000);
//			driver.navigate().to("https://demo.fitsyn.com/drip_logic/");
//			 driver.manage().window().maximize();
//			  Thread.sleep(5000);
			  Actions actn2=new Actions(driver);
			  actn2.moveToElement(driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/div//button"))).click().build().perform();
				Thread.sleep(7000);
				 driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/div/div/a[1]")).click();//view
				 Thread.sleep(5000);
				 JavascriptExecutor js= (JavascriptExecutor) driver;
				   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				   Thread.sleep(15000);
				 driver.navigate().refresh();
				 Thread.sleep(15000);
				 JavascriptExecutor js1= (JavascriptExecutor) driver;
				   js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				   Thread.sleep(7000);
				String text1=driver.findElement(By.xpath("//*[@id=\"block_0\"]/div/div/div/div/div[3]/div[1]/span[1]")).getText();
				System.out.println(text1);
		String text=driver.findElement(By.xpath("//*[@id=\"block_0\"]/div/div/div/div/div[3]/div[1]/span[2]")).getText();
		System.out.println(text);
		String text2=driver.findElement(By.xpath("//*[@id=\"block_0\"]/div/div/div/div/div[3]/div[2]/span[1]")).getText();
		System.out.println(text2);
	String text3=driver.findElement(By.xpath("//*[@id=\"block_0\"]/div/div/div/div/div[3]/div[2]/span[2]")).getText();
	System.out.println(text3);
		
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
