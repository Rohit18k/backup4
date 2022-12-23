package com.degreezen.qa.ExtentReportListners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.IClass;
import org.testng.IReporter;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport implements IReporter{
	public  ExtentReports extent;
	public  ExtentTest logger;
	public  WebDriver driver;
	 
	 
	 @BeforeTest
	 public void startReport(){
	 //ExtentReports(String filePath,Boolean replaceExisting) 
	 //filepath - path of the file, in .htm or .html format - path where your report needs to generate. 
	 //replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
	 //True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
	 //False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
	 extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/ExtentReport.html", true);
	 //extent.addSystemInfo("Environment","Environment Name")
	 extent
	                .addSystemInfo("Host Name", "Automation")
	                .addSystemInfo("Environment", "Testing")
	                .addSystemInfo("User Name", "Hema Sahoo");
	                //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
	                //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
	                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	 }
	 
	        //This method is to capture the screenshot and return the path of the screenshot.
	 
	 public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception {
	 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 TakesScreenshot ts = (TakesScreenshot) driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
	 String destination = System.getProperty("user.dir") + "/Screenshots/"+screenshotName+dateName+".jpg";
	 File finalDestination = new File(destination);
	 FileHandler.copy(source, finalDestination);
	 return destination;
	 }
	 
	 @Test
	 public void passTest(){
	 //extent.startTest("TestCaseName", "Description")
	 //TestCaseName – Name of the test
	 //Description – Description of the test
	 //Starting test
	 logger = extent.startTest("passTest");
	 Assert.assertTrue(true);
	 //To generate the log when the test case is passed
	 logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	 }
	 
//	 @Test
//	 public void failTest(){
//	                //My intention is to fail this method
//	                //If this method fails, then it goes to the @AfterMethod and calls the getScreenshot method and captures a screenshot and place it in the extent reports
//	 logger = extent.startTest("failTest");
//	 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://demo.fitsyn.com");
//	 String currentURL = driver.getCurrentUrl();
//	 Assert.assertEquals(currentURL, "NoTitle");
//	 logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
//	 }
//	
//	 @Test
//	 public void skipTest(){
//	 logger = extent.startTest("skipTest");
//	 throw new SkipException("Skipping - This is not ready for testing ");
//	 }
	 
	 @AfterMethod
	 public void getResult(ITestResult result) throws Exception{
	 if(result.getStatus() == ITestResult.FAILURE){
	 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
	 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
	                        String screenshotPath = ExtentReport.getScreenhot(driver,result.getMethod().getMethodName());
	 //To add it in the extent report 
	 logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
	 }else if(result.getStatus() == ITestResult.SKIP){
	 logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
	 }
	 // ending test
	 //endTest(logger) : It ends the current test and prepares to create HTML report
	 extent.endTest(logger);
	 }
	 
	 @AfterTest
	 public void endReport(){
	
	                extent.flush();
	                extent.close();
	    }

	

	
	}
