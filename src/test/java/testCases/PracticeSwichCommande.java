package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwichCommande {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.guru99.com/test/guru99home/";
		driver.get(url);
		driver.switchTo().frame("a077aa5e");
		driver.manage().window().maximize();
		WebElement iframebtn = driver.findElement(By.xpath("html/body/a/img"));
		System.out.println("we are swich to the Iframe");
		iframebtn.click();
		System.out.println("we are done");
	}

}
