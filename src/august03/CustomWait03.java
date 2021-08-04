package august03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait03 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver cust = new ChromeDriver();
		cust.manage().window().maximize();
		cust.get("file:///D:/java%20programs/selenium/src/file3.html");
		cust.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait we = new WebDriverWait(cust, 10);
		we.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver cust) {
				
				return cust.findElement(By.xpath("//input[@id='otherBtn']")).isEnabled();
			}
			
		});
		cust.findElement(By.xpath("//input[@id='otherBtn']")).click();

	}

}
