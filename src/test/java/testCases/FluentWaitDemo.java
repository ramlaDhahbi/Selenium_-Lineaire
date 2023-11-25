package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.NoSuchElementException;

public class FluentWaitDemo {

	public static void main(String[] args) {

		// Open chrome Browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// Open nopCommerce application
		driver.get("https://demoqa.com/buttons");

		// instantiate action class
		Actions action = new Actions(driver);

		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)) // max time
				.pollingEvery(Duration.ofSeconds(1)) // interval
				.ignoring(NoSuchElementException.class);

		WebElement btnRightclick = wait.until(ExpectedConditions.elementToBeClickable(By.id("rightClickBtn")));

		action.contextClick(btnRightclick).perform();
		System.out.println("Button is right clicked");
		String messageRightClick = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals(messageRightClick, "You have done a right click");
		driver.quit();

}
}
