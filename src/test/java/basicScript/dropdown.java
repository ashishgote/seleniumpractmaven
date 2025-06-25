package basicScript;

import java.time.Duration;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown {
	@Test
	public void log() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		int res_code=0;
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select d=new Select(day);
		d.selectByIndex(4);
		String url=driver.getCurrentUrl();
		
		System.out.println("Selected day:"+d.getFirstSelectedOption().getText());
		try {
			res_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println("current url is"+url);
			System.out.println("Page validation:"+res_code);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
