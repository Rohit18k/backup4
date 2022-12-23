package com.degreezen.qa.base;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestBase1 {
	
	public static  WebDriver driver;
 public static Properties pro;

public  static void initialization() throws Exception {
	File src=new File("./src/main/java/com/fitsyn/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	ChromeOptions options = new ChromeOptions(); 
	options.addArguments("--incognito");
//	options.addArguments("--headless"); 
//	options.addArguments("window-size=1920,1080");
	System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
	driver = new ChromeDriver(options);
	  driver.get(pro.getProperty("url"));
			Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"login-section\"]/div[1]/input")).sendKeys("admin@uat.com"); 
		driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("fitsyn@wcg");
		driver.findElement(By.xpath("//*[@id=\"login-section\"]/div[3]/div/label/span[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();//action}
	}





public  static void initialization1() throws Exception {
	File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
	driver=new ChromeDriver();
	  driver.get("https://degreezen.demoserver.biz");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="DegreeZen - Home";
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println("Page title is : " + driver.getTitle());
	}


public  static void initialization2() throws Exception {
	File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
	driver=new ChromeDriver();
	  driver.get("https://degreezen.demoserver.biz/v1");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="DegreeZen - Home";
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println("Page title is : " + driver.getTitle());
	}


public  static void initialization3() throws Exception {
	File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
	driver=new ChromeDriver();
	  driver.get(pro.getProperty("version2url"));
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="DegreeZen - Home";
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println("Page title is : " + driver.getTitle());
	}




public  static void initialization4() throws Exception {
	File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
	driver=new ChromeDriver();
	  driver.get(pro.getProperty("version3url"));
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="DegreeZen - Home";
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println("Page title is : " + driver.getTitle());
	}



public  static void initialization5() throws Exception {
	File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
	driver=new ChromeDriver();
	  driver.get(pro.getProperty("version5url"));
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="DegreeZen - Home";
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println("Page title is : " + driver.getTitle());
	}


public  static void initialization6() throws Exception {
	File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
	driver=new ChromeDriver();
	  driver.get(pro.getProperty("version4url"));
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="DegreeZen - Home";
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println("Page title is : " + driver.getTitle());
	}

public  static void initialization7() throws Exception {
	File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
	driver=new ChromeDriver();
	  driver.get(pro.getProperty("version6url"));
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="DegreeZen - Home";
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println("Page title is : " + driver.getTitle());
	}



public  static void initialization8() throws Exception {
	File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
	driver=new ChromeDriver();
	  driver.get(pro.getProperty("version7url"));
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="DegreeZen - Home";
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println("Page title is : " + driver.getTitle());
	}



public  static void initialization9() throws Exception {
	File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
	driver=new ChromeDriver();
	 driver.get(pro.getProperty("version8url"));
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  String actualTitle=driver.getTitle();
	  String expectedTitle="DegreeZen - Home";
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println("Page title is : " + driver.getTitle());
	}


public static WebDriver setIntialization() throws Exception {
	File src=new File("./src/main/java/com/fitsyn/qa/config/config.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new  Properties();
	pro=new Properties();
	pro.load(fis);
String filepath="C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\CSVFile";  
HashMap<String,Object> chromepref=new HashMap<String,Object>();
chromepref.put("profile.default_content_setting.popups",0);
chromepref.put("download.default_directory",filepath);
ChromeOptions options=new ChromeOptions();
options.setExperimentalOption("prefs",chromepref);
System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
 driver=new ChromeDriver(options);
driver.get("https://demo.fitsyn.com");
return driver;
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]/input")).sendKeys("admin@uat.com");
//driver.findElement(By.xpath("//*[@id=\"validation-password\"]")).sendKeys("fitsyn@wcg");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div/label/span[1]/input")).click();
//driver.findElement(By.xpath("//*[@id=\"sign-in-request\"]")).click();
}



/*
public static void screenshot() throws Exception {
    File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File destination=  new File("C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\Screenshots"+".png");
    FileHandler.copy(file,destination);
    Reporter.log("<br><img src='"+destination +"' height = '400'  width='400'/><br>");
  //  FileHandler.copy(file, new File("C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\Screenshots"+".png"));
   // Reporter.log("<br><img src='"+ +"'");

}


public static String takeScreenShot(String screenShotName) throws IOException {
    
    //create a string variable which will be unique always
    String df = new SimpleDateFormat("yyyyMMddhhss").format(new Date());
    
    //create object variable of TakeScreenshot class  
    TakesScreenshot ts = (TakesScreenshot)driver;
    
    //create File object variable which holds the screen shot reference 
    File source = ts.getScreenshotAs(OutputType.FILE);
    
    //store the screen shot path in path variable. Here we are storing the screenshots under screenshots folder 
    String path = System.getProperty("user.dir") + "/test-output/screenshots/" + screenShotName + df + ".png";
    
    //create another File object variable which points(refer) to the above stored path variable
    File destination = new File(path);
    
    //use FileUtils class method to save the screen shot at desired path
    FileHandler.copy(source, destination);
    
    //return the path where the screen shot is saved 
    return path;
    
   
    
    
}

*/

public static WebDriver initializeDiver1() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe"); 
	driver = new ChromeDriver();
	return driver;


}

public static String getScreenshotPath(String TestCaseName, WebDriver driver) throws Exception {
	//WebDriver driver1 = new ChromeDriver();
	 File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
   String despath=System.getProperty("user.dir")+"/Reports/"+TestCaseName+".png";
	   File file= new File(despath); 
	    FileUtils.copyFile(source,file);
	  byte[] imagebytes=  IOUtils.toByteArray(new FileInputStream(despath));
	 return Base64.getEncoder().encodeToString(imagebytes);
	 
	// return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		
		
}





//public static String getScreenshotPath(String TestCaseName) throws Exception {
//	 File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//   String despath=System.getProperty("user.dir")+"/Reports/"+TestCaseName+".png";
//	   File file= new File(despath); 
//	    FileUtils.copyFile(source,file);
//	  byte[] imagebytes=  IOUtils.toByteArray(new FileInputStream(despath));
//	 return Base64.getEncoder().encodeToString(imagebytes);
//	 
//	// return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
//		
//		
//}

//public static void SendEmail() throws EmailException {
//	System.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
//		Email email = new SimpleEmail();
//		email.setHostName("smtp.googlemail.com");
//		email.setSmtpPort(465);
//		email.setAuthenticator(new DefaultAuthenticator("hemasahoo123@gmail.com", "Mohini@12345678"));
//		email.setSSLOnConnect(true);
//		email.setFrom("hemasahoo123@gmail.com");
//		email.setSubject("TestMail");
//		email.setMsg("This is a test mail ... :-)");
//		email.addTo("hemasahoo123@gmail.com");
//		email.send();
//		System.out.println("email sent");
//}
//
//




}







