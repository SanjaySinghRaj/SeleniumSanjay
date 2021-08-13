package august12;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver demo;
	
	@BeforeMethod
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.get("https://www.google.com/");
		Thread.sleep(2000);
		Reporter.log("BeforeMethod", true);
		
	}
	@AfterMethod
	public void close() {
		demo.close();
		Reporter.log("AfterMethod", true);
	}
	@Test
	public void tc_01() throws InterruptedException {
		
		demo.findElement(By.xpath("//input[@name='q']")).sendKeys("java",Keys.ENTER);
		Reporter.log("Hello01", true);
		
	}
	@Test
	public void tc_02() throws InterruptedException {
		
		demo.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium",Keys.ENTER);
		Reporter.log("Hello02", true);
		
	}

}
