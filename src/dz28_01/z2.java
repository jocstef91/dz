package dz28_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class z2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		
		for(int i=0; i<100; i++) {
		driver.findElement(By.xpath("//*[contains(@class,'btn')]")).click();
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Stefan");
		driver.findElement(By.xpath("//*[@id='department']")).sendKeys("Stefan");
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("0641231231");
		driver.findElement(By.xpath("//a[@class='add'][contains(@style,'inline')]")).click();
		
		
		}
		
		driver.close();
	}
}

