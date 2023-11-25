package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.NoSuchElementException;

public class FluentWaitExample {

	public static void main(String[] args) {
	      
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.example.com");

	        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	                .withTimeout(Duration.ofSeconds(30))
	                .pollingEvery(Duration.ofSeconds(5))
	                .ignoring(NoSuchElementException.class);

	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myElement")));

	        element.click();

	        driver.quit();
	    }
}
