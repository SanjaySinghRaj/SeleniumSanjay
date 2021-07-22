package july21;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver flip = new ChromeDriver();
		flip.manage().window().maximize();
		flip.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		flip.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(1000);
		flip.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone 11",Keys.ENTER);
		Thread.sleep(4000);
		flip.findElement(By.xpath("//img[@alt='APPLE iPhone 11 (Black, 64 GB)']")).click();
		Thread.sleep(5000);
		Set<String> tabs = flip.getWindowHandles();
		for (String tab : tabs) {
			flip.switchTo().window(tab);
			Thread.sleep(2000);
			
		}
		flip.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		

	}

}
