package linksvalid;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statuscode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="https://www.fb.com/";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		int resp_code=0;
		try {
			
			resp_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("responce code is:"+resp_code);
	}

}
