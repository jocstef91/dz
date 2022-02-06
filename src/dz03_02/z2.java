package dz03_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.navigate().to("https://www.wikipedia.org/");
		
		List<WebElement> jezici = driver.findElements(By.xpath("//*[@class='central-featured']//a"));
		
		for (int i = 0; i < jezici.size(); i++) {
			js.executeScript("window.open(arguments[0])", jezici.get(i));
		}
		

	}

}
