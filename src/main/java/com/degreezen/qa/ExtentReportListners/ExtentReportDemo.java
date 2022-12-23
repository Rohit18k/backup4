package com.degreezen.qa.ExtentReportListners;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.degreezen.qa.base.Base;
import com.degreezen.qa.base.TestBase1;

public class ExtentReportDemo extends Base{
	WebDriver driver;
	
	
@Test
public void initialDemo() {
	//ExtentTest test= extent.createTest("Initial Demo");
	 driver= initializeDiver1();
	  driver.get("https://demo.fitsyn.com");
	  System.out.println(driver.getTitle());
	  Assert.assertTrue(false);
	  driver.close();
	 // test.fail("Result do not match");
	 // extent.flush();
}
}
