package com.smartcookie;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class registrationpage {
	@Test
	public void openurl() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smartcookie.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("url is:"+driver.getCurrentUrl());
		
		//for click on register button
		driver.findElement(By.xpath("/html/body/header/div/div/div/nav/div/div[2]/div/ul/li[7]/a")).click();
		System.out.println("Get first current url is:"+driver.getCurrentUrl());
		
		//select user type dropdown
	//	WebElement student=driver.findElement(By.id("user_type"));
	//	Select s=new Select(student);
	//	Thread.sleep(5000);
	//	s.selectByIndex(2);
		
		//for enter the full name
		driver.findElement(By.id("name")).sendKeys("Ashish Gote");
		//for the email address
		driver.findElement(By.id("email")).sendKeys("ashugote04@gmail.com");
		//for the select dropdown for country code
		WebElement countrycode=driver.findElement(By.id("cc"));
		Select c=new Select(countrycode);
		c.selectByIndex(0);
		System.out.println("Selected value frome the country code dropdown"+c.getFirstSelectedOption().getText());
		//enter the mobile no
		driver.findElement(By.id("phone")).sendKeys("7798475017");
		//for the select state like dropdown
		WebElement state=driver.findElement(By.id("format_state"));
		Select s=new Select(state);
		s.selectByIndex(1);
		//for enter the state vlaue
		driver.findElement(By.id("state")).sendKeys("Maharashtra");
		//for select the city dropdown
		WebElement city=driver.findElement(By.id("format_city"));
		Select cit=new Select(city);
		cit.selectByIndex(1);
		//for enter the value for the city
		driver.findElement(By.id("city")).sendKeys("pune");
		//enter the School Id
		driver.findElement(By.id("school_id")).sendKeys("COTP");
		//click on validate
		driver.findElement(By.id("schooldetails")).click();
		//select dropdown for the school name
		driver.findElement(By.xpath("//*[@id=\"select2-select_college_name-container\"]")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
		//click on submit button
		driver.findElement(By.name("submit")).click();
		
		
		
		
		
		
		
		
		
		
		//driver.close();
		
	}
	
	

	

}
