package com.degreezen.qa.ExtentReportListners;

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
import org.testng.ITestListener;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;

public class ExtenetReportTestng implements ITestListener{
	
	private static String urlSlackWebHook = "https://hooks.slack.com/services/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"; 
	private static String channelName = "testt"; 
	private static String botUserOAuthAccessToken = "xoxb-2370188801314-2358016761383-GTB0G1ZfuZdHrpVO3M72guZe"; 

	
	
	public void sendTestExecutionStatusToSlack(String message) throws Exception {
		try {
		StringBuilder messageBuider = new StringBuilder();
		messageBuider.append(message);
		@SuppressWarnings("deprecation")
		Payload payload = Payload.builder().channel(channelName).text(messageBuider.toString()).build();

		WebhookResponse webhookResponse = Slack.getInstance().send(urlSlackWebHook, payload);
		webhookResponse.getMessage();
		} catch (IOException e) {
		System.out.println("Unexpected Error! WebHook:" + "urlSlackWebHook");
		}
		}
	
	
	
	
	
	
	public void sendTestExecutionReportToSlack(String testReportPath) throws Exception {
		String url = "https://slack.com/api/files.upload?token="+ botUserOAuthAccessToken + "&channels = " + channelName + "";
		try {
		HttpClient httpclient = HttpClientBuilder.create().disableContentCompression().build();
		HttpPost httppost = new HttpPost(url);
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		FileBody fileBody = new FileBody(new File(testReportPath));
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		builder.addPart("file", fileBody);
		builder.addTextBody("channels", channelName);
		builder.addTextBody("token", botUserOAuthAccessToken);
		httppost.setEntity(builder.build());
		HttpResponse response = null;
		response = httpclient.execute(httppost);
		HttpEntity result = response.getEntity();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	
	
	
	

}
