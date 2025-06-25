package DynamicBrawser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class dynamic {
	@Test
	public void dybrawser() {
		String str="ED";
		if(str.equals("CD")) {
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://google.com");
			driver.manage().window().maximize();
			System.out.println("Title of the page:"+driver.getTitle());
		}
		else if(str.equals("ED")) {
			EdgeDriver driver=new EdgeDriver();
			driver.get("https://instagram.com");
			driver.manage().window().maximize();
			System.out.println("title of the page is:"+driver.getTitle());
			driver.close();
		}
		
	}

}
