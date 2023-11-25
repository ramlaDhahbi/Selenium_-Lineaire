package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/select-menu";
		driver.get(url);
       WebElement dropDownList=driver.findElement(By.id("oldSelectMenu"));
       Select selectMenu = new Select(dropDownList);
       
       //Select the option by index
       //selectMenu.selectByIndex(5); 
       //Select  option by value 
       //selectMenu.selectByValue("3");
     //Select  option by text
       selectMenu.selectByVisibleText("Blue");
	}

}
