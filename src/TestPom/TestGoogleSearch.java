package TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.GoogleSearch;

public class TestGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver goog = new ChromeDriver();
		goog.manage().window().maximize();
		goog.get("https://www.google.com/");
		goog.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		GoogleSearch gs = new GoogleSearch(goog);
		gs.sendText("java");
		Thread.sleep(2000);
		goog.navigate().back();
		gs.sendText("Testng");
		Thread.sleep(2000);
		
	}

}
