package august12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.GoogleSearch;

public class GoogleStest {
	WebDriver goog;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		goog = new ChromeDriver();
		goog.manage().window().maximize();
		goog.get("https://www.google.com/");
		goog.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void next() throws InterruptedException {
		GoogleSearch gs = new GoogleSearch(goog);
		gs.sendText("java");
		gs.scrollhig(goog);
		gs.clicknext();
	}

}
