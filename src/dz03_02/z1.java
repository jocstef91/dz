package dz03_02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.navigate().to("https://www.google.rs");
		
		WebElement putanja = driver.findElement(By.tagName("body"));
		
		js.executeScript("arguments[0].style='background: black'", putanja);
	}

}
