package basicScript;

import java.time.Duration;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class fbselect {
	@Test
	public void fb() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int res_code;
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		WebElement eleme=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select s=new Select(eleme);
		s.selectByIndex(4);
		System.out.println(s.getFirstSelectedOption().getText());
		
		try {
			res_code=Request.Get("https://fb.com").execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println(res_code);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		driver.close();
		
	}
	
	@Test
	public void alt() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(5000);
		Alert al=driver.switchTo().alert();
		al.accept();
	}
}
