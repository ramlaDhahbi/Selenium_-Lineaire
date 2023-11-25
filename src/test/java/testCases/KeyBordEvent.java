package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBordEvent {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url ="https://demoqa.com/text-box" ;
		driver.get(url);
	    driver.manage().window().maximize();
	    WebElement fullName = driver.findElement(By.id("userName"));
	    WebElement email = driver.findElement(By.id("userEmail"));
	    WebElement currentAdress = driver.findElement(By.id("currentAddress"));
	    WebElement paramentAdress = driver.findElement(By.id("permanentAddress"));
	    
	    fullName.sendKeys("Ramla");
	    email.sendKeys("ramla.dhahbi@gmail.fr");
	    currentAdress.sendKeys("8 ahmed Tlili Ezzahra");
	    currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		paramentAdress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
		//javascript executer click on button submit
		
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btnSubmit);
		
		//driver.quit();
	    
	    
	    
	    

	}

}
