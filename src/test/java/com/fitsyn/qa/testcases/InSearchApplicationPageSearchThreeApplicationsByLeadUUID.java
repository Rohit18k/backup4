package com.fitsyn.qa.testcases;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.degreezen.qa.base.TestBase1;

public class InSearchApplicationPageSearchThreeApplicationsByLeadUUID extends TestBase1{


	public InSearchApplicationPageSearchThreeApplicationsByLeadUUID() {
	super();
	}
	
//	@BeforeTest
//	public void openBrowser() throws Exception {
//		initialization();
//	}
	
    @Test(priority=1)
     public void uuidFirstapp() throws Exception {                       
    	 Thread.sleep(5000);
    	 driver.navigate().to("https://demo.fitsyn.com/applications/search");
    	 driver.manage().window().maximize();
    	 Thread.sleep(5000);
    	 Actions actn=new Actions(driver);
    	 actn.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[1]/input"))).click().build().perform();
    	 driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("995be879-4ed7-434f-b694-daf56c270bf5");
         driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
         Thread.sleep(7000);
       String text1=  driver.findElement(By.xpath("//*[@id=\"name\"]")).getText();
       System.out.println(text1);
       Assert.assertEquals(text1,"Rail One");
       String text2= driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
       System.out.println(text2);
       Assert.assertEquals(text2,"My Company");
       String text3= driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[2]/div/div[3]/div/strong")).getText();
         System.out.println(text3);
         Assert.assertEquals(text3,"mock+265@evenfinancial.com");
         String text4= driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[2]/div/div[4]/div/strong")).getText();
         System.out.println(text4);
         Assert.assertEquals(text4,"Approved");
         Thread.sleep(5000);
    	 Actions actn1=new Actions(driver);
    	 actn1.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[1]/input"))).click().build().perform();
    	 driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[1]/input")).clear();
    	 driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("813249ec-4860-49b3-b5ae-96e4f477218a");
         driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
         Thread.sleep(7000);
       String text5=  driver.findElement(By.xpath("//*[@id=\"name\"]")).getText();
       System.out.println(text5);
       Assert.assertEquals(text5,"Jofra Archer");
       String text6= driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
       System.out.println(text6);
       Assert.assertEquals(text6,"My Company");
       String text7= driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[2]/div/div[3]/div/strong")).getText();
         System.out.println(text7);
         Assert.assertEquals(text7,"ankur@fitsyn.com");
         String text8= driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[2]/div/div[4]/div/strong")).getText();
         System.out.println(text8);
         Assert.assertEquals(text8,"Rejected");
    	 
         Thread.sleep(5000);
    	 Actions actn2=new Actions(driver);
    	 actn2.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[1]/input"))).click().build().perform();
    	 driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[1]/input")).clear();
    	 driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("5d768f16-153e-4fed-90ba-caad986221ca");
         driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[1]/form/div/div[2]/button")).click();
         Thread.sleep(7000);
       String text9=  driver.findElement(By.xpath("//*[@id=\"name\"]")).getText();
       System.out.println(text9);
       Assert.assertEquals(text9,"Harshal Gibbs");
       String text10= driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
       System.out.println(text10);
       Assert.assertEquals(text10,"My Company");
       String text11= driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[2]/div/div[3]/div/strong")).getText();
         System.out.println(text11);
         Assert.assertEquals(text11,"mock+265@evenfinancial.com");
         String text12= driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/section/div/div[2]/div/div[4]/div/strong")).getText();
         System.out.println(text12);
         Assert.assertEquals(text12,"Approved");
    	 
    	 
    	 
    	 
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
