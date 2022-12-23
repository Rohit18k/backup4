


import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;


public class Login extends TestBase1{


	public Login() {
	super();
	}
	
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization();
	}
	
	
	

	@Test
	public void loginApp() throws Exception {
		Thread.sleep(2000);
		  Actions action=new Actions(driver);
		   action.moveToElement(driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]"))).click().build().perform();
		   
		   driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]")).sendKeys("kevin@mario.com");
		driver.findElement(By.xpath("//input[@id=\"mat-input-1\"]")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/button")).click();
		Thread.sleep(2000);
		
		 Actions action1=new Actions(driver);
		   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-clock-in-popup/div/div[2]/button/span"))).click().build().perform();
		
//		  Actions action1=new Actions(driver);
//		   action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-clock-in-popup/div/div[2]/button/span"))).click().build().perform();
//		
		
		
}}

