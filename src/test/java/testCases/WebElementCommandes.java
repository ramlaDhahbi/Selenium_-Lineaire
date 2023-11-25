package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		 WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 WebElement btnLogin =driver.findElement(By.xpath("//button[@type='submit']"));
		 
		 userName.clear();
		 userName.sendKeys("Admin");
		 
		 password.clear();
		 password.sendKeys("admin123");
		 
		// btnLogin.click();
		 
		 String attvalue = userName.getAttribute("name");
		 System.out.println("the attribue value is :" +attvalue) ;
		 
		 Dimension dimensions = password.getSize();
		 System.out.println("hight : " +dimensions.height);
		 System.out.println("Widht : " +dimensions.width);
		 
		 //userName locator
		 Point point = userName.getLocation();
		 System.out.println("x coordinate is : " +point.x);
		 System.out.println("y coordinate is : " +point.y);
		 
		 
		 //verifier si l'element afficher vrai /faux
		 boolean res1 =btnLogin.isDisplayed();
		 System.out.println(res1);
		 
		 //verifier si l'element activer vrai /faux
		 boolean res2 = btnLogin.isEnabled();
		 
		 System.out.println(res2);
		 
		 
		 
		 //verifier si l'element existe vrai /faux
		 List<WebElement> login= driver.findElements(By.xpath("//button[@type='submit']"));
		 if(login.size()!=0)
		 {
			System.out.println("Element is Exist"); 
			 
		 }else {
			 
			 System.out.println("Element does not Exist");
		 }
		 
		 

	}

}
