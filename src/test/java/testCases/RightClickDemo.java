package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {

		// Open chrome Browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// Open nopCommerce application
		driver.get("https://demoqa.com/buttons");

		// instantiate action class
		Actions action = new Actions(driver);
		
		WebElement btnRightclick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(btnRightclick).perform();
		System.out.println("Button is right clicked");
		String messageRightClick = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals(messageRightClick, "You have done a right click");
		driver.quit();


	}

}
