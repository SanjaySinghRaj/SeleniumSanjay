package july22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver blue=new ChromeDriver();
		blue.manage().window().maximize();
		blue.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		blue.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings",Keys.ENTER);
		Thread.sleep(1000);
		blue.findElement(By.xpath("//img[@alt='The Felicita Top Open Ring']")).click();
		Set<String> rings = blue.getWindowHandles();
		for (String ring : rings) {
			blue.switchTo().window(ring);
			Thread.sleep(1000);
			
		}
		blue.findElement(By.xpath("//input[@id='buy-now']")).click();
		Thread.sleep(1000);
		WebElement error = blue.findElement(By.xpath("//div[@class='formErrorContent']"));
		System.out.println(error.getText());
		Thread.sleep(3000);
		blue.quit();
	}

}
/*
 url https://www.bluestone.com/
 search //input[@id='search_query_top_elastic_search']
 rings //img[@alt='The Felicita Top Open Ring']
 buynow //input[@id='buy-now']
 error //div[@class='formErrorContent']
 
*/