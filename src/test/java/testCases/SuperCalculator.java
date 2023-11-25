package testCases;


import java.time.Duration;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperCalculator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://juliemr.github.io/protractor-demo/";
		driver.get(url);
		driver.manage().window().maximize();
		
		String firstNumber="5";
		String secondNumber="6" ;

		WebElement firstNumberFieled = driver.findElement(By.xpath("//input[@ng-model='first']"));
		WebElement secondNumberFieled = driver.findElement(By.xpath("//input[@ng-model='second']"));
		WebElement btnGo = driver.findElement(By.id("gobutton"));
		firstNumberFieled.sendKeys(firstNumber);
		secondNumberFieled.sendKeys(secondNumber);
		btnGo.click();

		WebElement result=driver.findElement(By.tagName("h2"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    Pattern pattern= Pattern.compile("\\d+");
	    wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
	    System.out.println("The result is:" +result.getText());

		

		driver.quit();
	}

}
