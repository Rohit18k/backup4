package com.degreezenv3.qa.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.degreezen.qa.base.TestBase1;

public class ArtAndDesignProgramForm extends TestBase1{


	public ArtAndDesignProgramForm() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization4();
	}
	
	  @Test(priority=1)
	     public void  artDesignForm() throws Exception {
		  
		  Thread.sleep(5000);
	         
		  File src=new File("./src/main/java/com/degreezen/qa/config/config.properties");
	     	FileInputStream fis=new FileInputStream(src);
	     	Properties pro=new  Properties();
	     	pro=new Properties();
	     	pro.load(fis);
	     	
	         Actions actn= new Actions(driver);
	       actn.moveToElement(driver.findElement(By.xpath("//a[@class='comman-btn btn-white mt-5']"))).click().build().perform();
	       
	       
	       Thread.sleep(1000);
	       
	       
	       
	       driver.findElement(By.xpath("//*[@id=\"start2\"]")).click();
	       
	       
	       
	  	 JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,800)");
	 
	       WebDriverWait wait = new WebDriverWait(driver, 10);
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[1]/div/div[2]/div/input"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	       
	     
		
			 JavascriptExecutor j = (JavascriptExecutor) driver;
		      j.executeScript("window.scrollBy(0,-800)");
		      
		      
		      
		      String text4=driver.findElement(By.xpath("//*[@id=\"firstname-error\"]")).getText();
				System.out.println(text4);
				String exp4="Please Enter First Name.";
				Assert.assertEquals(text4,exp4);
			 
				 driver.findElement(By.xpath("//input[@id='firstname']")).click();
				 
				
				 driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("!!!123");
				 
				 
				 String text41=driver.findElement(By.xpath("//*[@id=\"firstname-error\"]")).getText();
					System.out.println(text41);
					String exp41="Please Enter Only Alphabets.";
					Assert.assertEquals(text41,exp41);
				 
				 
				
					 driver.findElement(By.xpath("//input[@id='firstname']")).clear();
					 
					 driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(pro.getProperty("firstname3"));
	      
	      
			 String text5=driver.findElement(By.xpath("//*[@id=\"lastname-error\"]")).getText();
				System.out.println(text5);
				String exp5="Please Enter Last Name.";
				Assert.assertEquals(text5,exp5);
			 
			 
			 
			 driver.findElement(By.xpath("//*[@id=\"lastname\"]")).click();
			 				 
			 
			 driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("!!@@89767");
			 
			 
			 
			 
			 String text51=driver.findElement(By.xpath("//*[@id=\"lastname-error\"]")).getText();
				System.out.println(text51);
				String exp51="Please Enter Only Alphabets.";
				Assert.assertEquals(text51,exp51);
			 
			 
			 
				driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
			      
			 
			 
				driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(pro.getProperty("lastname3"));
	      
				Thread.sleep(1000);
				
				String text514=driver.findElement(By.xpath("//*[@id=\"gender-error\"]")).getText();
				System.out.println(text514);
				String exp514="Please Select Gender.";
				Assert.assertEquals(text514,exp514);
				
				
				
				driver.findElement(By.xpath("//*[@id=\"female\"]")).click();	
				
              		Thread.sleep(1000);
				
				 String text63=driver.findElement(By.xpath("//*[@id=\"day-error\"]")).getText();
					System.out.println(text63);
					String exp63="Please Select Valid Date.";
					Assert.assertEquals(text63,exp63);
				 
				
				
				 driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
				 
				 Select slt21=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
				 slt21.selectByValue(pro.getProperty("year3"));
			
			
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id=\"month\"]")).click();
			 
			 Select slt31=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
			slt31.selectByValue(pro.getProperty("month3"));
		 
        Thread.sleep(1000);
        
        WebElement source_dropdown=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"day\"]"))));
        Select source = new Select(source_dropdown);
        source.selectByIndex(10);
        
			 
			 /*
        String text631=driver.findElement(By.xpath("//*[@id=\"day-error\"]")).getText();
			System.out.println(text631);
			String exp631="Please Select Age Between 13 - 82 Years.";
			Assert.assertEquals(text631,exp631);
			 
			 
			 
			driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
				 
				 Select slt212=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
				 slt212.selectByValue("1985");
			 
			 
			 
				 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("//*[@id=\"month\"]")).click();
				 
				 Select slt312=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
				slt312.selectByValue("6");
			 
            Thread.sleep(1000);
            
            WebElement source_dropdown1=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"day\"]"))));
            Select source1 = new Select(source_dropdown1);
            source1.selectByIndex(10);
			 
	
				*/
				
				
			 Thread.sleep(1000);
			 
			 String text6=driver.findElement(By.xpath("//*[@id=\"address-error\"]")).getText();
				System.out.println(text6);
				String exp6="Please Enter Address.";
				Assert.assertEquals(text6,exp6);
			 
			 
				 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(pro.getProperty("address3"));
				
				 
Thread.sleep(1000);

String text61=driver.findElement(By.xpath("//*[@id=\"city-error\"]")).getText();
System.out.println(text61);
String exp61="Please Enter City.";
Assert.assertEquals(text61,exp61);



driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("!@@123");


String text68=driver.findElement(By.xpath("//*[@id=\"city-error\"]")).getText();
System.out.println(text68);
String exp68="Please Enter Only Alphabets.";
Assert.assertEquals(text68,exp68);



driver.findElement(By.xpath("//*[@id=\"city\"]")).clear();

		 
				 driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(pro.getProperty("city3"));
				 
				 
				 
				 String text43=driver.findElement(By.xpath("//*[@id=\"state-error\"]")).getText();
				 System.out.println(text43);
				 String exp43="Please Select State.";
				 Assert.assertEquals(text43,exp43);


				 
			     WebElement source_dropdown13=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"state\"]"))));
	 				Select source13 = new Select(source_dropdown13);
                    source13.selectByVisibleText(pro.getProperty("state3"));
	 				

				 Thread.sleep(1000);
				 
				 

				 String text2=driver.findElement(By.xpath("//*[@id=\"zip_code-error\"]")).getText();
					System.out.println(text2);
					String exp2="Please Enter ZipCode.";
					Assert.assertEquals(text2,exp2);
					
					driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("785");

				 String text11=driver.findElement(By.xpath("//*[@id=\"zip_code-error\"]")).getText();
					System.out.println(text11);
					String exp11="Only 5 Digit Zip Allowed.";
					Assert.assertEquals(text11,exp11);
					
					driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).clear();
				 
					
					driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("00000");
					
					String text111=driver.findElement(By.xpath("//*[@id=\"zip_code-error\"]")).getText();
					System.out.println(text111);
					String exp111="Please Enter Valid Zip Code.";
					Assert.assertEquals(text111,exp111);
					
					driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).clear();
											
					
					driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys(pro.getProperty("zipcode3"));
				 
				 
				 String text7=driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText();
					System.out.println(text7);
					String exp7="Please Enter Email.";
					Assert.assertEquals(text7,exp7);
				
					 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com@gamil.com");
					 
					 
					 
					 String text13=driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText();
						System.out.println(text13);
						String exp13="Please Enter Valid Email.";
						Assert.assertEquals(text13,exp13);
					 
						 driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
						 
						 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(pro.getProperty("email3"));
					
					 Thread.sleep(1000);
					 
					 String text8=driver.findElement(By.xpath("//*[@id=\"phone_number-error\"]")).getText();
						System.out.println(text8);
						String exp8="Please Enter Phone Number.";
						Assert.assertEquals(text8,exp8);
					 
						 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("8562");
						
						
						 String text14=driver.findElement(By.xpath("//*[@id=\"phone_number-error\"]")).getText();
							System.out.println(text14);
							String exp14="Please Enter 10 Digit Phone Number.";
							Assert.assertEquals(text14,exp14);
						 
							 driver.findElement(By.xpath("//input[@id='phone_number']")).clear();
							
							 
							 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("0000000000");
							 
							 
							 String text141=driver.findElement(By.xpath("//*[@id=\"phone_number-error\"]")).getText();
								System.out.println(text141);
								String exp141="Please Enter Valid Phone Number.";
								Assert.assertEquals(text141,exp141);
							 
							 
								 driver.findElement(By.xpath("//input[@id='phone_number']")).clear();
							 
							 
			 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys(pro.getProperty("phonenumber3"));
			 
		  
			 WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-group form-check custom-check-box']//input[@id='security_number_check']"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element5);
		  
			 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[1]/div/div[2]/div/input"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		  
			 
			 
			 Thread.sleep(3000);
			 
			 
			 driver.findElement(By.xpath("//*[@id=\"online1\"]")).click();
			 
		 driver.findElement(By.xpath("//*[@id=\"flexRadioDefault2\"]")).click();
			
			 
			 WebElement element13 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[2]/div/div[2]/div/input[1]"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element13);
			 
			 String text321=driver.findElement(By.xpath("//*[@id=\"military_dependent_specific-error\"]")).getText();
				System.out.println(text321);
				String exp321="Please Select Associated With Military.";
				Assert.assertEquals(text321,exp321);
			 
				Thread.sleep(1000);
				 
				   WebElement source_dropdown2=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"military_dependent_specific\"]"))));
                Select source3 = new Select(source_dropdown2);
                source3.selectByValue(pro.getProperty("military3"));

	
		  
			 WebElement element3112 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[2]/div/div[2]/div/input[1]"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element3112);
		  
		  
		     Thread.sleep(3000);
		      
		      
		      js.executeScript("window.scrollBy(0,800)");
				 
				 WebElement element312 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[3]/div/div[2]/div/input[1]"))); 
					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element312);
					
					  j.executeScript("window.scrollBy(0,-800)");
		
					 
					  String text3=driver.findElement(By.xpath("//*[@id=\"program-error\"]")).getText();
						System.out.println(text3);
						String exp3="Please Select Program.";
						Assert.assertEquals(text3,exp3);
					 
						 WebElement element18 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pro.getProperty("artprogram3")))); 
						 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element18);
		      
		      
						 js.executeScript("window.scrollBy(0,800)");
					      
					      
					      
						 WebElement element31121 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[3]/div/div[2]/div/input[1]"))); 
						 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element31121);
		  
						 
						    Thread.sleep(3000);
						    
						    WebElement element213 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[4]/div/div[2]/div/input[1]"))); 
							 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element213);
						    
						    String text32=driver.findElement(By.xpath(pro.getProperty("subjecterror3"))).getText();
							System.out.println(text32);
							String exp32="Please Select A Subject.";
							Assert.assertEquals(text32,exp32);
						 
					      
						    WebElement element211 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pro.getProperty("subject31")))); 
							 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element211);
		      
		      
							 WebElement element2111 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pro.getProperty("subject32")))); 
							 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2111);
							 
							 
						 
							 WebElement element2123 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[4]/div/div[2]/div/input[1]"))); 
										 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2123);
						 
										 Thread.sleep(5000);
										 
									       js.executeScript("window.scrollBy(0,800)");
									 
											 WebElement element33 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[5]/div/div[2]/div/input[1]"))); 
											 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element33);
									       
											  j.executeScript("window.scrollBy(0,-800)");
										
											 String text1=driver.findElement(By.xpath("//*[@id=\"level_of_education-error\"]")).getText();
												System.out.println(text1);
												String exp1="Please Select Level Of Education.";
												Assert.assertEquals(text1,exp1);
												
												
										      
										      driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")).click();
										       
										  	Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")));
										  	slt.selectByValue(pro.getProperty("levelofeducation3"));
										      
										    js.executeScript("window.scrollBy(0,800)");
										  	
										      
										    WebElement element11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[5]/div/div[2]/div/input[1]"))); 
											 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element11);
											
											
											 j.executeScript("window.scrollBy(0,-800)");
										  	
										  	
										  	String text21=driver.findElement(By.xpath("//*[@id=\"academic_level-error\"]")).getText();
											System.out.println(text21);
											String exp21="Please Select Academic Level.";
											Assert.assertEquals(text21,exp21);
										      
										  	 driver.findElement(By.xpath("//*[@id=\"academic_level\"]")).click();
										 	
											 Select slt1=new Select( driver.findElement(By.xpath("//*[@id=\"academic_level\"]")));
												slt1.selectByValue(pro.getProperty("academiclevel3"));
										      
										      
												  js.executeScript("window.scrollBy(0,800)");
												  
												Thread.sleep(1000);
												
												  WebElement element112 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[5]/div/div[2]/div/input[1]"))); 
													 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element112);
													
												
													 j.executeScript("window.scrollBy(0,-800)");
													 
													 
														
													 String text311=driver.findElement(By.xpath("//*[@id=\"high_school_gpa-error\"]")).getText();
														System.out.println(text311);
														String exp311="Please Enter Highschool Gpa.";
														Assert.assertEquals(text311,exp311);
													 
													 
													 
														 driver.findElement(By.xpath("//*[@id=\"high_school_gpa\"]")).sendKeys(pro.getProperty("highschoolGPA3"));
													 
									      
													 String text31=driver.findElement(By.xpath("//*[@id=\"degree-error\"]")).getText();
														System.out.println(text31);
														String exp31="Please Select Degree.";
														Assert.assertEquals(text31,exp31);
													 
													
													 driver.findElement(By.xpath("//*[@id=\"degree\"]")).click();
													
													 Select slt2=new Select(driver.findElement(By.xpath("//select[@id='degree']")));
														slt2.selectByValue(pro.getProperty("degree3"));
		  
														  WebElement element132 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[5]/div/div[2]/div/input[1]"))); 
															 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element132);
										      
										      
		  /*
	         Thread.sleep(5000);
	         

	         Actions actn= new Actions(driver);
	       actn.moveToElement(driver.findElement(By.xpath("//a[@class='comman-btn btn-white mt-5']"))).click().build().perform();
	       
	  	 JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,800)");
	 
	       WebDriverWait wait = new WebDriverWait(driver, 10);
			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[1]/div/div[2]/div/input"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	       
	     
		
			 JavascriptExecutor j = (JavascriptExecutor) driver;
		      j.executeScript("window.scrollBy(0,-800)");
		      
		      String text1=driver.findElement(By.xpath("//*[@id=\"level_of_education-error\"]")).getText();
				System.out.println(text1);
				String exp1="Please Select Level of Education.";
				Assert.assertEquals(text1,exp1);
				
				
		      
		      driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")).click();
		       
		  	Select slt=new Select(driver.findElement(By.xpath("//*[@id=\"level_of_education\"]")));
		  	slt.selectByValue("Some College");
		      
		    js.executeScript("window.scrollBy(0,800)");
		  	
		      
		    WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[1]/div/div[2]/div/input"))); 
			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
			
			
			 j.executeScript("window.scrollBy(0,-800)");
		  	
		  	
		  	String text21=driver.findElement(By.xpath("//*[@id=\"academic_level-error\"]")).getText();
			System.out.println(text21);
			String exp21="Please Select Academic Level.";
			Assert.assertEquals(text21,exp21);
		      
		  	 driver.findElement(By.xpath("//*[@id=\"academic_level\"]")).click();
		 	
			 Select slt1=new Select( driver.findElement(By.xpath("//*[@id=\"academic_level\"]")));
				slt1.selectByValue("2018");
		      
		      
				  js.executeScript("window.scrollBy(0,800)");
				  
				Thread.sleep(1000);
				
				  WebElement element11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[1]/div/div[2]/div/input"))); 
					 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element11);
					
				
					 j.executeScript("window.scrollBy(0,-800)");
					 
					 
		      
					 String text31=driver.findElement(By.xpath("//*[@id=\"degree-error\"]")).getText();
						System.out.println(text31);
						String exp31="Please Select Degree.";
						Assert.assertEquals(text31,exp31);
					 
					
					 driver.findElement(By.xpath("//*[@id=\"degree\"]")).click();
					
					 Select slt2=new Select(driver.findElement(By.xpath("//select[@id='degree']")));
						slt2.selectByValue("Bachelors");
				
	      
						 Thread.sleep(1000);
						 
						 

						 String text2=driver.findElement(By.xpath("//*[@id=\"zip_code-error\"]")).getText();
							System.out.println(text2);
							String exp2="Please Enter ZipCode.";
							Assert.assertEquals(text2,exp2);
							
							driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("785");

						 String text11=driver.findElement(By.xpath("//*[@id=\"zip_code-error\"]")).getText();
							System.out.println(text11);
							String exp11="Only 5 Digit Zip Allowed.";
							Assert.assertEquals(text11,exp11);
							
							driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).clear();
						 
							
							driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("00000");
							
							String text111=driver.findElement(By.xpath("//*[@id=\"zip_code-error\"]")).getText();
							System.out.println(text111);
							String exp111="Please enter valid zip code.";
							Assert.assertEquals(text111,exp111);
							
							driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).clear();
													
							
							driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("78535");
					 
		      
		      
							
							  WebElement element12 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[1]/div/div[2]/div/input"))); 
								 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element12);
						
						
					
								 Thread.sleep(2000);
								 
								 
								  js.executeScript("window.scrollBy(0,800)");
								 
								 WebElement element3112 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[2]/div/div[2]/div/input[1]"))); 
									 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element3112);
									
									  j.executeScript("window.scrollBy(0,-800)");
						
									 
									  String text3=driver.findElement(By.xpath("//*[@id=\"program-error\"]")).getText();
										System.out.println(text3);
										String exp3="Please Select Program.";
										Assert.assertEquals(text3,exp3);
									 
										
										 WebElement element18 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"art\"]"))); 
										 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element18);
										
									 
										 WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"architecture\"]"))); 
										 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2);
										
									 
										 WebElement element34 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[2]/div/div[2]/div/input[1]"))); 
										 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element34);
										
										 
										 
										 js.executeScript("window.scrollBy(0,800)");
										 
								 
										 WebElement element232 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[3]/div/div[2]/div/input[1]"))); 
										 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element232);
										
										 j.executeScript("window.scrollBy(0,-800)");
										 
										 
										 
										 String text4=driver.findElement(By.xpath("//*[@id=\"firstname-error\"]")).getText();
											System.out.println(text4);
											String exp4="Please Enter First Name.";
											Assert.assertEquals(text4,exp4);
										 
											 driver.findElement(By.xpath("//input[@id='firstname']")).click();
											 
											
											 driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("!!!123");
											 
											 
											 String text41=driver.findElement(By.xpath("//*[@id=\"firstname-error\"]")).getText();
												System.out.println(text41);
												String exp41="Please enter only alphabets.";
												Assert.assertEquals(text41,exp41);
											 
											 
											
												 driver.findElement(By.xpath("//input[@id='firstname']")).clear();
												 
												 driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Test");
								      
								      
										 String text5=driver.findElement(By.xpath("//*[@id=\"lastname-error\"]")).getText();
											System.out.println(text5);
											String exp5="Please Enter Last Name.";
											Assert.assertEquals(text5,exp5);
										 
										 
										 
										 driver.findElement(By.xpath("//*[@id=\"lastname\"]")).click();
										 				 
										 
										 driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("!!@@89767");
										 
										 
										 
										 
										 String text51=driver.findElement(By.xpath("//*[@id=\"lastname-error\"]")).getText();
											System.out.println(text51);
											String exp51="Please enter only alphabets.";
											Assert.assertEquals(text51,exp51);
										 
										 
										 
											driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
										      
										 
										 
											driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Ronit");
								      
								      
										 Thread.sleep(1000);
										 
										 String text6=driver.findElement(By.xpath("//*[@id=\"address-error\"]")).getText();
											System.out.println(text6);
											String exp6="Please Enter Address.";
											Assert.assertEquals(text6,exp6);
										 
										 
											 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("71 ST. NICHOLAS DRIVE");
											
											 
											 
											 String text7=driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText();
												System.out.println(text7);
												String exp7="Please Enter Your Email.";
												Assert.assertEquals(text7,exp7);
											
												 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com@gamil.com");
												 
												 
												 
												 String text13=driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText();
													System.out.println(text13);
													String exp13="Please Enter Valid Email.";
													Assert.assertEquals(text13,exp13);
												 
													 driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
													 
													 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com");
												
												 Thread.sleep(1000);
												 
												 String text8=driver.findElement(By.xpath("//*[@id=\"phone_number-error\"]")).getText();
													System.out.println(text8);
													String exp8="Please Enter Phone Number.";
													Assert.assertEquals(text8,exp8);
												 
													 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("8562");
													
													
													 String text14=driver.findElement(By.xpath("//*[@id=\"phone_number-error\"]")).getText();
														System.out.println(text14);
														String exp14="Please Enter 10 Digit Phone Number.";
														Assert.assertEquals(text14,exp14);
													 
														 driver.findElement(By.xpath("//input[@id='phone_number']")).clear();
														
														 
														 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("0000000000");
														 
														 
														 String text141=driver.findElement(By.xpath("//*[@id=\"phone_number-error\"]")).getText();
															System.out.println(text141);
															String exp141="Please enter valid phone number.";
															Assert.assertEquals(text141,exp141);
														 
														 
															 driver.findElement(By.xpath("//input[@id='phone_number']")).clear();
														 
														 
										 driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("8562345875");
										 
								      
										 
										 
										 String text9=driver.findElement(By.xpath("//*[@id=\"security_number_check-error\"]")).getText();
											System.out.println(text9);
											String exp9="Please check the agreement.";
											Assert.assertEquals(text9,exp9);
											
											
											
											 WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-group form-check custom-check-box']//input[@id='security_number_check']"))); 
											 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element5);
										 
										 
										 
										 
										 
											 WebElement element212 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msform\"]/fieldset[3]/div/div[2]/div/input[1]"))); 
											 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element212);
										 
										 
										 
				*/						 
									 
					
}}
