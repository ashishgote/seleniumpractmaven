package printlinksinthepage;

import java.time.Duration;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popup {
	@Test
	public void popup() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button")).click();
		Alert a1=driver.switchTo().alert();
		a1.accept();
		int res_code=0;
		try {
			res_code=Request.Get("https://vinothqaacademy.com/alert-and-popup/").execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println(res_code);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
