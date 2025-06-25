package printlinksinthepage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alertboxes {
	@Test
	public void boxes() throws InterruptedException {
		WebDriver driver= new ChromeDriver();;
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(5000);
		al.accept();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section[3]/div/div[2]/div/div/div/center/button")).click();
		Alert bl=driver.switchTo().alert();
		Thread.sleep(5000);
		bl.dismiss();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section[3]/div/div[3]/div/div/div/center/button")).click();
		Alert cl=driver.switchTo().alert();
		cl.accept();
	}

}
