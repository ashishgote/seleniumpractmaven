package com.Practice;

import java.net.Authenticator.RequestorType;
import java.time.Duration;
import java.util.List;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popup {
	@Test
	public void popupok() throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int resp_code=0;
		String pageurl;
		try {
			resp_code=Request.Get("https://vinothqaacademy.com/alert-and-popup/").execute().returnResponse().getStatusLine().getStatusCode();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("url is: "+resp_code);
		
		
		if(resp_code==200) {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button")).click();
		Thread.sleep(5000);
		Alert al=driver.switchTo().alert();
		al.accept();
		}
		else {
			System.out.println("link is in valid");
		}
		
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			String url=links.get(i).getAttribute("href");
			int res_code=0;
			
			try {
				 res_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();

				
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(res_code==200) {
				System.out.println("print is valid:"+url);
				System.out.println();
				
			}	
		}
	}

}
