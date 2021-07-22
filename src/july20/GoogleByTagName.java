package july20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleByTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver goog=new ChromeDriver();
		goog.manage().window().maximize();
		goog.get("https://www.google.com/");
		goog.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		List<WebElement> links = goog.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
			
		}
		
	}

}
