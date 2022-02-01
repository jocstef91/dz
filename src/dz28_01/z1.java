package dz28_01;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z1 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner s = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");
		
		List<WebElement> zvezda = driver.findElements(By.xpath("//*[contains(@id,'rating')]/button"));
		
		System.out.println("Unesite br *:");
		int br = (s.nextInt()-1);
		
		zvezda.get(br).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
