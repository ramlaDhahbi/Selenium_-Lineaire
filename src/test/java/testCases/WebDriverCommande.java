package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebDriverCommande {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		String titlePage=driver.getTitle();
		int titleLength= titlePage.length();
		System.out.println("Title of the page is:" +titlePage);
		System.out.println("Menth of the title is:" +titleLength);
		
		String actualUrl =driver.getCurrentUrl();
		
		if(actualUrl.equals(url))
		{
			
		System.out.println("Verification successufl yhe correct URL is opened");
		}else {
			
			System.out.println("Verification failed an inccorect Url is poened");
		}
            System.out.println("Actual URL is:" +actualUrl);
            System.out.println("Expected URL is:" +url);
            
            String sourcePage =driver.getPageSource() ;
            int lenghtSourcePage=sourcePage.length();
            System.out.println("lenght" +lenghtSourcePage);
            driver.quit();
            
	}

}
