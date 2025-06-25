package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FirstclassMaven {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://fb.com");
		cd.manage().window().maximize();
		System.out.println("Title of the webpage is:"+ cd.getTitle());
		cd.quit();
		
		EdgeDriver ed=new EdgeDriver();
		ed.get("https://google.com");
		ed.manage().window().maximize();
		System.out.println("Title of the webpage is:"+ed.getTitle());
		System.out.println(ed.getPageSource());
		ed.quit();
		
		
		

	}

}
