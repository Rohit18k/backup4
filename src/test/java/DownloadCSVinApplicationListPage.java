

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class DownloadCSVinApplicationListPage extends TestBase1{

	Random r=new Random();
	
	public DownloadCSVinApplicationListPage() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}

	
	  @Test(priority=1)
		public void downloadCSVinApplicationListPage() throws Exception {
		Thread.sleep(7000);
		 driver.switchTo().newWindow(WindowType.TAB); 
	   driver.navigate().to("https://test.wazecapital.com/applications");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"ajax_content\"]/div[1]/div/div/div/section/div/div[2]/form/div[1]/div[9]/button")).click();
	    Thread.sleep(50000); 
	    driver.navigate().to("https://test.wazecapital.com/reports/report_request");
	    
	    Thread.sleep(180000);
	    driver.navigate().refresh();
	    Thread.sleep(70000);
	    driver.findElement(By.xpath("//*[@id=\"table_content\"]/div/table/tbody/tr[1]/td[6]/a/i")).click();
	    Thread.sleep(7000);
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
