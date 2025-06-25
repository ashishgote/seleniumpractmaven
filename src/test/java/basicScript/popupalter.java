package basicScript;

import java.time.Duration;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popupalter {
	@Test
	public void alterpop() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		int res_code=0;
		try {
			res_code=Request.Get("https://demo.automationtesting.in/Alerts.html").execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println(driver.getCurrentUrl()+"current url is");
			System.out.println(res_code+"status code of web page is");
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		Thread.sleep(5000);
		Alert a1=driver.switchTo().alert();
		a1.accept();
	}

}
