package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VrifyColor1 {

		
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver ();
			String url="https://demoqa.com/buttons";
			driver.get(url);
			driver.manage().window().maximize();

			String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");
			Color color1 = Color.fromString(color);
					//fromString(color);
			String actualColor = color1.asHex();
			Assert.assertEquals("#007bff", actualColor);
			System.out.println("The background color of the button is : " + actualColor) ;
			driver.quit();
				
		}

		
		
		

	}


