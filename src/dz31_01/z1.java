package dz31_01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
		
		for (int i = 1; i <= 5; i++) {
			
			driver.findElement(By.xpath("//div[@class='col-md-12']/div/button")).click();
			
			System.out.println("Element je obrisan");
		}
		
		boolean elementPostoji;
		
		try {
			WebElement e = driver.findElement(By.xpath("//div[@class='col-md-12']/div/button"));
			elementPostoji = true;
		} catch (Exception e2) {
			elementPostoji = false;
		}
		
		if (elementPostoji) {
			System.out.println("ELement postoji");
		} else {
			System.out.println("Element ne postoji.");
		}
		
		

	}

}
