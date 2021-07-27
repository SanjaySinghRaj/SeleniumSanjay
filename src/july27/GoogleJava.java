package july27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleJava {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("https://www.google.com/");
		Thread.sleep(2000);
		demo.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> se = demo.findElements(By.xpath("//ul[@role='listbox']/li"));
		for (WebElement sea : se) {
			System.out.println(sea.getText());

		}
		Thread.sleep(2000);
		se.get(2).click();

		demo.close();

	}
}
