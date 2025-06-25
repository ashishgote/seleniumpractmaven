package DynamicBrawser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NumberofElements {
	@Test
	public void elements() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement>ele=driver.findElements(By.tagName("a"));
		
		System.out.println("number elements:"+ele.size());
		for(int i=1; i<=ele.size();i++) {
			System.out.println(ele.get(i).getText());
		}
	}

}
