package com.degreezen.qa.ExtentReportListners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.degreezen.qa.base.TestBase1;
import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public  class ExtentReportListner  implements IReporter{
		private ExtentReports extent;


	
		public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
				String outputDirectory) {
			extent = new ExtentReports(outputDirectory + File.separator
					+ "Extent.html", true);
			for (ISuite suite : suites) {
				Map<String, ISuiteResult> result = suite.getResults();

				for (ISuiteResult r : result.values()) {
					ITestContext context = r.getTestContext();

					buildTestNodes(context.getPassedTests(), LogStatus.PASS);
					buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
					buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
				}
			}

			extent.flush();
			extent.close();
		}

		private void buildTestNodes(IResultMap tests, LogStatus status) {
			ExtentTest test;

			if (tests.size() > 0) {
				for (ITestResult result : tests.getAllResults()) {
					test = extent.startTest(result.getMethod().getMethodName());

					test.setStartedTime(getTime(result.getStartMillis()));
					test.setEndedTime(getTime(result.getEndMillis()));

					for (String group : result.getMethod().getGroups())
						test.assignCategory(group);

					if (result.getThrowable() != null) {
						test.log(status, result.getThrowable());
					} else {
						test.log(status, "Test " + status.toString().toLowerCase()
								+ "ed");
					}

					extent.endTest(test);
				}
			}
		}

		private Date getTime(long millis) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(millis);
			return calendar.getTime();
		}

		
		 

		
		
		
		
		 
	}

