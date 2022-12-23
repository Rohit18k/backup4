package com.fitsyn.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.HttpClientBuilder;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;

public class Slacktest {

	private static String urlSlackWebHook = "https://hooks.slack.com/services/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"; 
	private static String channelName = "testt"; 
	private static String botUserOAuthAccessToken = "xoxb-2370188801314-2370542697731-OtTx3Jz5K5RZcALblPhlB6uC"; 
	
	
	public void sendTestExecutionStatusToSlack(String message) throws Exception {
		try { StringBuilder messageBuider = new StringBuilder(); 
		messageBuider.append(message); 
		Payload payload = Payload.builder().channel(channelName).text(messageBuider.toString()).build(); 
		WebhookResponse webhookResponse = Slack.getInstance().send(urlSlackWebHook, payload);
		webhookResponse.getMessage(); }
		catch (IOException e){ 
			System.out.println("Unexpected Error! WebHook:" + urlSlackWebHook); } 	}
		
		
		
		
	public void sendTestExecutionReportToSlack(String testReportPath) throws Exception {
	
	 String url = "https://slack.com/api/files.upload?token=" + botUserOAuthAccessToken + "&channels=" + channelName + ""; 
	try { 
		HttpClient httpclient = HttpClientBuilder.create().build(); 
		HttpPost httppost = new HttpPost(url); 
		MultipartEntityBuilder builder = MultipartEntityBuilder.create(); 
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE); 
		FileBody fileBody = new FileBody(new File(testReportPath)); 
		builder.addPart("file", fileBody); 
		httppost.setEntity(builder.build()); 
		HttpResponse response = null; 
		response = httpclient.execute(httppost); 
		HttpEntity result = response.getEntity(); 
		System.out.println(result.toString()); } 
	catch (Exception e) { 
		e.printStackTrace(); }
	}
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	

