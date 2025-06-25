package printlinksinthepage;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon {
	@Test
	public void amazonlinks() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/l/976442031/?_encoding=UTF8&ref_=ohlhssju25_ur_pc&pd_rd_w=BUnOx&content-id=amzn1.sym.93fe091b-a94e-4cce-bacb-6342b5799cd7&pf_rd_p=93fe091b-a94e-4cce-bacb-6342b5799cd7&pf_rd_r=VQK2EZ87XG5W584S99ZR&pd_rd_wg=IwPuP&pd_rd_r=5f1e9b5a-9ff8-4fc6-acfc-f21bcaf3a5ff");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement>links=driver.findElements(By.tagName("h2"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
		}
		
		
		
		driver.close();
	}

}
