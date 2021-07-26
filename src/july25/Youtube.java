package july25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver yout=new ChromeDriver();
		yout.manage().window().maximize();
		yout.get("https://www.youtube.com/");
		WebElement search = yout.findElement(By.id("search"));
		search.sendKeys("java");
		WebElement enter = yout.findElement(By.id("search-icon-legacy"));
		enter.click();
		Thread.sleep(2000);
		List<WebElement> links = yout.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
			
		}

	}

}
