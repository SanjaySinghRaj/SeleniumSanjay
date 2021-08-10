package august10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver goog = new ChromeDriver();
		goog.manage().window().maximize();
		goog.get("https://www.google.com/");
		goog.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement se = goog.findElement(By.xpath("//input[@name='q']"));
		se.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		goog.navigate().back();
		se.sendKeys("tastng",Keys.ENTER);
		

	}

}
